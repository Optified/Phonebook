import java.util.Scanner;

public class PhonebookManager{

        public Node head;
        private int listLength;

    public PhonebookManager(){
        head = null;
    }
    public void add(){
        String[] list = new String[5];
        Node newNode = new Node();

        Scanner hello = new Scanner(System.in);
        String input;

        System.out.println("Please input a First Name:");
        input = hello.next();
        newNode.setFirstName(input);
        
        System.out.println("Please input a Last Name:");
        input = hello.next();
        newNode.setLastName(input);

        System.out.println("Please enter a City:");
        input = hello.next();
        newNode.setCity(input);

        System.out.println("Please enter a Number:");
        input = hello.next();
        newNode.setNumber(input);

        System.out.println("Please enter an Address:");
        input = hello.next();
        newNode.setAddress(input);

        if(head == null){
            head = newNode;
            listLength++;
        }
        else{
            head.next = newNode;
            listLength++;
        }
        
    }
    public void print(){
        Node temp = head;
        for(int i = 0; i < listLength; i++){
            System.out.println(temp);
            temp = head.getNext();
        }
    }
    public void delete(int index){
        if((index - 1) == 0){
            head = head.getNext();
        }
        else{
            Node current = head;
            for(int i = 0; i < index - 1; i++){
                current = current.getNext();
            }
            current.getNext();   
            current = current.getNext().getNext();
        }
        listLength--;
    }


        public int countNodes(Node head){
        int count = 1;
        Node current = head;
        while(current.next != null){
            current = current.next;
            count++;
        }
        return count;
    }
}