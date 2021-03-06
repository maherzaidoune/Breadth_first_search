package breadth.first.search;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author maher
 */

/**
 * ♥ RRDL ♥
 */
public class BreadthFirstSearch {
    
    Node startNode;
    Node goalNode;
    ArrayList<Node> done;
    
    public BreadthFirstSearch(Node startNode,Node goalNode){
        this.startNode = startNode;
        this.goalNode = goalNode;
    }
    
    //searching ...
    public boolean search(){
        if (this.startNode.equals(this.goalNode)) {
            System.out.println("Goal is just the start Node");
            return true;
        }
        Queue<Node> fifo = new LinkedList<>();
        done = new ArrayList<>();
        fifo.add(startNode);
        while(!fifo.isEmpty()){
            Node current = fifo.remove();
            if (current.equals(this.goalNode)) {
                printDone();
               // System.out.println(goalNode);
                return true;
            }else{
                if (current.getChilden().isEmpty())
                    return false;
                else
                    fifo.addAll(current.getChilden());
                }
            done.add(current);
            
        }
        return false;
    }
    public void printDone(){
        int steps = 0;
        for(Node n : done){
            System.out.println(++steps + " : " +n.nodeName);
            
        }
    }

    
    public static void main(String[] args) {
        
        // Testing ..
        // Binary tree , A,B,C,D,E,F,G 
        Node I = new Node("I",null,null);
        Node H = new Node("H",null,null);
        Node E = new Node("E",null,null);
        Node F = new Node("F",null,null);
        Node G = new Node("G",null,null);
        Node D = new Node("D",H,I);
        Node C = new Node("C",F,G);
        Node B = new Node("B",D,E);
        Node A = new Node("A",B,C);
        
        BreadthFirstSearch rrdl = new BreadthFirstSearch(A,E);
        if(rrdl.search()){
            System.out.println("success");
        }else{
            System.out.println("nope");
        }

    }
    
}
