public class BNode {

    public BNode leftBNode,  rightBNode; // the nodes
    public AnyClass anyClass; //the AnyClass objext

    public BNode(AnyClass anyClass ) {//constructor
        this.anyClass= anyClass;
        this.leftBNode = null;
        this.rightBNode = null;
    }

    public void show() {
        //calls the show method of the AnyClass
        System.out.print(anyClass.show());
    }
}