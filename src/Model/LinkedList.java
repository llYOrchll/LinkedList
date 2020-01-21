package Model;

public class LinkedList{
    //Class variables for the Linked List
    private Node head;
    private int numNodes;

    public LinkedList() {
        this.head = null;
        this.numNodes = 0;
    }
	        	    

    public void addOrder(int value){
 
            
    }         
         
    public void addAtHead(int dat){
	Node temp = this.head;
	this.head = new Node(dat);
	this.head.setLink(temp);
	this.numNodes++;
    }
	
    public void addAtTail(int value){ 
        
        if(this.isEmpty()){
            this.head = new Node(value);
            this.numNodes++;
        } 
        else {
            Node temp = this.head;
            while(temp.getLink() != null){
                temp = temp.getLink();
            }
            temp.setLink(new Node(value));
            this.numNodes++;
        }
}
	
		
    public void printList(){
	System.out.println("Number of elements:"+ this.getSize());
	Node temp = this.head;
	while(temp != null){
            System.out.println(temp.getValue());
            temp = temp.getLink();
        }
    }
	
    public int getSize(){   
	return this.numNodes;
    }
    
    public boolean isEmpty(){
        if(this.head == null)
            return true;
        else     
            return false;
    }
	
        
}
