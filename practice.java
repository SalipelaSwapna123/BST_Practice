class Node{
    int value;
    Node right;
    Node left;
    Node root;
    public Node(int value){
        this.value = value;
        right = null;
        left = null;
    }
}
public class Bstpractice {
    public Node root;
    public void insert(int value){
        if(root==null){
            root = new Node(value);
            return ;
        }
         Node current = root;
         Node parent = null;
         while(current!=null){
            parent = current;
            if(value<current.value){
                current = current.left;
            }
            else if(value>current.value){
                current = current.right;
            }
            else{
                return ;
            }
         }
         Node newnode = new Node(value);
         if (value < parent.value) {
            parent.left = newnode;
        } else {
            parent.right = newnode;
        }

    }   
}
