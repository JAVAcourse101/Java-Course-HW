package Task_2;

public class GSM {
	String model = "";
	private boolean hasSimCard = false;
	private String simMobileNumber = "";
	double outgoingCallsduration = 0;
	double incomingCallsduration = 0;
	Call lastIncomingCall;
	Call lastOutgoingCall;

	public String getSimMobileNumber() {
		return simMobileNumber;
	}

	void insertSimCard(String simMobileNumber) {
		boolean allNumbers = true;
		for (int i = 0; i < simMobileNumber.length(); i++) {
			if (simMobileNumber.charAt(i) > '9'
					|| simMobileNumber.charAt(i) < '0') {
				allNumbers = false;
			}
		}
		if (allNumbers == true && simMobileNumber.startsWith("08")
				&& simMobileNumber.length() == 10) {
			this.simMobileNumber = simMobileNumber;
			this.hasSimCard = true;
		} else {
			System.out.println("Not valid number");
		}
	}

	void removeSimCadr() {
		this.hasSimCard = false;
		this.simMobileNumber = "";
	}

	void call(GSM reciever, double duration) {
		if (duration < 0) {
			System.out.println("Please enter a valid duration of the call!");
			return;
		}
		
		if (this.hasSimCard == false && reciever.hasSimCard == false) {
			System.out.println("The caller and the receiver have no SIM cards");
			return;
		}
		if (this.hasSimCard == false) {
			System.out.println("The caller has no SIM card");
			return;
		}
		if (reciever.hasSimCard == false) {
			System.out.println("The receiver has no SIM card");
			return;
		}
		
		if (this.simMobileNumber.equals(reciever.simMobileNumber)) {
			System.out
					.println("The caller and receiver have the same number, call not allowed!");
			return;
		}

		Call calling = new Call();
		calling.duration = duration;
		calling.caller = this;
		calling.receiver = reciever;

		this.lastOutgoingCall = calling;
		
		this.outgoingCallsduration += duration;

		reciever.lastIncomingCall = calling;
		reciever.incomingCallsduration += duration;
	}

	double getSumForCall() {
		if (this.outgoingCallsduration != 0) {
//			System.out.println("Sum of all outgoing calls: "+this.outgoingCallsduration);
			return  Math.round(this.outgoingCallsduration
					* this.lastOutgoingCall.priceForMinute* 10000000.0) / 10000000.0;
		} else {
			System.out.println("There are no outgoing calls made");
			return 0;
		}

	}

	
	void printForTheLastOutgoingCall(){
		if(this.lastOutgoingCall!=null){
			System.out.println("Info about last outgoing call:");
		System.out.println("Duration: "+this.lastOutgoingCall.duration);
		System.out.println("Receiver number: "+this.lastOutgoingCall.receiver.getSimMobileNumber());
		System.out.println("My number: "+this.getSimMobileNumber());
		System.out.println("Price per minutes in euro: "+this.lastOutgoingCall.priceForMinute);
		}
		else{
			System.out.println("There is no last outgoing Call");
		}
		
	}
	void printForTheLastIncomingCall(){
		if(this.lastIncomingCall!=null){
			System.out.println("Info about last incoming call:");
		System.out.println("Duration: "+this.lastIncomingCall.duration);
		System.out.println("Caller number: "+this.lastIncomingCall.caller.getSimMobileNumber());
		System.out.println("My number: "+this.getSimMobileNumber());
		System.out.println("Price per minutes in euro: "+this.lastIncomingCall.priceForMinute);
		}
		else{
			System.out.println("There is no last incoming Call");
		}
		
	}
}
