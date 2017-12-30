package breadth.first.search;

import java.util.ArrayList;

/**
 *
 * @author maher
 * Node class , binary tree structure
 */
public class Node {
    // access is public to make the code clear
    Node leftChild;
    Node rightChild;
    String nodeName;
    //Each node is directly connected to it's child nodes , with nodeName name (A,B...)
    public Node(String nodeName,Node leftChild,Node rightChild){
        this.nodeName = nodeName;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
    //ArrayList containing Node's children
    public ArrayList<Node> getChilden(){
        ArrayList<Node> children = new ArrayList<>();
        if(this.leftChild != null){
            children.add(this.leftChild);
        }
        if(this.rightChild != null){
            children.add(this.rightChild);
        }
        return children;
    }
    
    
}
