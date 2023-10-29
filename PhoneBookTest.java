import java.util.LinkedList;
import java.util.Scanner;

public class PhoneBookTest {
    public static void main(String[] args){
        
        PhonebookManager phonebook = new PhonebookManager();
        /* Node headA = new Node();
            Node headB = new Node();
            headA.next = nodeB;
         */
        /*Node nodeA = new Node();
        Node nodeB = new Node();
        nodeA.next = nodeB;*/

        //firstName, lastName, City, Number, Address)

        System.out.println("You are currently looking through the phonebook.");
        boolean isDone = false;
        int i = -1;

        do{
        printIntro();
        i = choice(i, phonebook);
        if(i == -2){
            isDone = true;
        }

        }while(isDone == false);

        
    }
    public static int choice(int i, PhonebookManager phonebook){
        int test = i;
        Scanner input = new Scanner(System.in);
        String choice = input.next();
        choice = choice.toLowerCase();

        int intChoice;

        switch(choice){
            case "A": //add
            case "a": phonebook.add();
            test = 0;
            break;

            case "D": //delete
            case "d": if(test == -1){
                System.out.println("The phonebook is empty. There are no contacts to delete.");
            }
            else{
                System.out.println("Which entry would you like to delete?");
                intChoice = input.nextInt();
                phonebook.delete(intChoice);
            }
            break;

            case "E": //edit
            case "e": if(test == -1){
                System.out.println("The phonebook is empty. There are no contacts to edit.");
            }
            else{
                System.out.println("Please input which contact # you want to edit: ");
                intChoice = input.nextInt();
                System.out.println("Please input which field you want to edit:\n1: First name\n2: Last Name\n3: City\n4: Number: \n5: Address\n6: Quit");
                int choiceTwo = input.nextInt();

                System.out.println("What is your input into this contact?");
                choice = input.next();
                phonebook.edit(intChoice, choiceTwo, choice);
            }
            break;

            case "P": //print
            case "p": if(test == -1){
                System.out.println("The phonebook is empty. There are no contacts to print.");
            }
            phonebook.print();
            break;

            case "Q": //quit
            case "q": test = -2;
            break;
        }
        if(!choice.equals("a") && !choice.equals("d") && !choice.equals("e") && !choice.equals("p") && !choice.equals("q")){
            System.out.println("Invalid input. Please input a proper input.");
        }
        return test;
    }
    public static void printIntro(){
        System.out.println("What would you like to do?\nInput the following commands to interact with the phonebook.\n");
        System.out.println("A: Add a contact to the phonebook");
        System.out.println("D: Delete a contact from the phonebook");
        System.out.println("E: Edit a contact from the phonebook");
        System.out.println("P: Print the current contacts within the phonebook");
        System.out.println("Q: Quit from viewing the phonebook");
    }
}
