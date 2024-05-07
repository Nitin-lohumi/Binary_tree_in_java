import java.util.*;
public class BST {
    public static class Node{    
        int data;    
        Node left;    
        Node right;    
        public Node(int data){        
            this.data = data;    
            this.left = null;    
            this.right = null;    
            }   

            void show(){
                System.out.println(data);
                System.out.println(left);
                System.out.println(right);
            } 
        } 
        public Node root;

        public BST(){    
            root = null;   
        }  
        public int factorial(int num) {    
            int fact = 1;    
            if(num == 0)    
                return 1;    
            else {    
                while(num > 1) {    
                    fact = fact * num;    
                    num--;    
                }    
                return fact;    
            }    
        }    
        public int numOfBST(int key) {    
            int catalanNumber = factorial(2 * key)/(factorial(key + 1) * factorial(key));    
            return catalanNumber;    
        }   
        public static void main(String[] args) {   
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in); 
            System.out.println("Enter the key number in Binary tree search");
            int key= sc.nextInt();
            BST bt = new BST();       
            System.out.println("Total number of possible Binary Search Trees with given key: " + bt.numOfBST(key));   
             BST.Node n = new Node(10);
             n.show();

             BST.Node n1 = new Node(121);
             n1.show();
          }    

}