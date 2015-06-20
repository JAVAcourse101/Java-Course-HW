
package TreeGraph;

public class BinaryTree<T> {

    public static class BinaryTreeNode<T>
    {
        private T value;
        private boolean hasParent;
        private BinaryTreeNode<T> leftChild;
        private BinaryTreeNode<T> rightChild;
        
        public BinaryTreeNode(T value,
                BinaryTreeNode<T> leftChild,
                BinaryTreeNode<T> rightChild)
        {
            if (value == null) {
                throw new IllegalArgumentException(
                    "Cannot insert null value!");
            }
           
            this.value = value;
            this.leftChild = leftChild;
            this.rightChild = rightChild;
        }

        public BinaryTreeNode(T value)
        {
            this(value, null, null);
        }
       
        public T getValue() {
            return this.value;
        }
       
        public void setValue(T value) {
            this.value = value;
        }
       
        public BinaryTreeNode<T> getLeftChild() {
            return this.leftChild;
        }
       
        public void setLeftChild(BinaryTreeNode<T> value) {
            if (value == null || value.hasParent) {
                throw new IllegalArgumentException();
            }
           
            value.hasParent = true;
            this.leftChild = value;
        }
       
        public BinaryTreeNode<T> getRightChild() {
            return this.rightChild;
        }
       
        public void setRightChild(BinaryTreeNode<T> value) {
            if (value == null || value.hasParent) {
                throw new IllegalArgumentException();
            }
           
            value.hasParent = true;
            this.rightChild = value;
        }
        
    }
   
    private BinaryTreeNode<T> root;
    
    public BinaryTree(T value, BinaryTree<T> leftChild,
            BinaryTree<T> rightChild) {
        if (value == null) {
            throw new IllegalArgumentException();
        }
       
        BinaryTreeNode<T> leftChildNode =
            leftChild != null ? leftChild.root : null;
        BinaryTreeNode<T> rightChildNode =
            rightChild != null ? rightChild.root : null;
        this.root = new BinaryTreeNode<T>(
            value, leftChildNode, rightChildNode);
    }
   
    public BinaryTree(T value) {
        this(value, null, null);
    }
 
    public BinaryTreeNode<T> getRoot()
    {
        return this.root;
    }
   
    public BinaryTreeNode<T> getLeftChildNode()
    {
        if (this.root != null)
        {
            return this.root.getLeftChild();
        }
       
        return null;
    }
   

    public BinaryTreeNode<T> getRightChildNode()
    {
        if (this.root != null)
        {
            return this.root.getRightChild();
        }
       
        return null;
    }
   
    private void printPreOrder(BinaryTreeNode<T> root) {
      if (root == null) {
          return;
      }     
        printPreOrder(root.getLeftChild());
        printPreOrder(root.getRightChild());
    }
   
    public void printPreOrder() {
      printPreOrder(this.root);
      System.out.println();
    }
    
    private BinaryTreeNode<T> find(T value) {
        BinaryTreeNode<T> node = this.root;
       
        while (node != null) {
            int compareTo = value.compareTo(node.value);
            if (compareTo < 0) {
                node = node.leftChild;
            } else if (compareTo > 0) {
                node = node.rightChild;
            } else {
                break;
            }
        }
       
        return node;
    }
    
}