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
        if(this.head == null){
            this.head = new Node(value);  
            numNodes++;
        }       
        else if(value <= this.head.getValue()){
            this.addAtHead(value);
        }
//        else if(value == this.head.getValue()){
//            Node temp = this.head;
//            this.head = new Node(value);
//            this.head.setLink(temp);
//        }
        else if(this.head.getValue() < value){           
            Node temp = this.head;
            Node last = this.head;
            Node aux = temp.getLink();
            Node aux2 = new Node(value);
            while(last.getLink() != null){
                last = last.getLink();
            }
            if(last.getValue() < value){
                last.setLink(new Node(value));
                numNodes++;
            }else{
                while(aux != null){
                    if(temp.getValue()< value && aux.getValue() >= value){
                        aux2.setLink(aux);
                        temp.setLink(aux2);
                        numNodes++;
                        break;
                    }
                    temp = temp.getLink();
                    aux = aux.getLink();
                }
            }
            
        }
//        this.printList();
    }                        
                      
    public void addAtHead(int dat){
	Node temp = this.head;
        Node aux = new Node(dat);

	aux.setLink(temp);
        this.head = aux;
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
    
    public void deleteRep(){
        int counter=0;
       Node temp = this.head;       
       Node aux = temp.getLink();
       
       if(temp.getLink() != null){
           while(aux != null)
           {    
               if(aux.getLink() == null && temp.getValue() == aux.getValue())
               {
                   temp.setLink(null);
                   numNodes--;
                   break;
               }
               if(temp.getValue() == aux.getValue()){
                   System.out.println("flag");
                   temp.setLink(aux.getLink());
                   numNodes--;
                   
               }
               temp = temp.getLink();
               aux = temp.getLink();
           }
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
