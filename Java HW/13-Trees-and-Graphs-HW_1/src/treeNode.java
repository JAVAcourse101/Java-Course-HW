import java.util.LinkedList;
import java.util.List;


public class treeNode<T> {

    T data;
    treeNode<T> parent;
    List<treeNode<T>> children;

    public treeNode(T data) {
        this.data = data;
        this.children = new LinkedList<treeNode<T>>();
    }

    public treeNode<T> addChild(T child) {
    	treeNode<T> childNode = new treeNode<T>(child);
        childNode.parent = this;
        this.children.add(childNode);
        return childNode;
    }
    
    public void print(treeNode<T> node, int depth){
    	for (int i = 0; i < depth; i++) {
    	  	System.out.print("\t");	
		}
    	System.out.println(node.data);
    	depth++;

    	for (int i = 0; i < node.children.size(); i++) {
			print(node.children.get(i), depth);
		}
    }
}
