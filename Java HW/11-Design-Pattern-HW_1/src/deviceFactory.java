public class deviceFactory {
	
	 public device getDevice(String devType, String model, String brand){
		 
	 if(devType == null){
		 return null;
	 }
	 
	 if(devType.equalsIgnoreCase("phone")){
		 return new phone(brand,model);
	 }
	 
	 else if(devType.equalsIgnoreCase("tablet")){
		 return new tablet(brand,model);
	 }
	 
	 else if(devType.equalsIgnoreCase("laptop")){
		 return new laptop(brand,model);
	 }
	 
	 	return null;
	 }
}