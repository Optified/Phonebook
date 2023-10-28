import java.util.LinkedList;

public class Node{
    private String firstName;
    private String lastName;
    private String city;
    private String number;
    private String address;
    public Node next;

    public Node(String firstName, String lastName, String city, String number, String address, Node next){
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.number = number;
        this.address = address;
        this.next = next;
    }
    public Node(){
        next = null;

    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getCity(){
        return city;
    }
    public String getNumber(){
        return number;
    }
    public String getAddress(){
        return address;
    }
    public Node getNext(){
        return next;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setNumber(String number){
        this.number = number;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setNext(Node next){
        this.next = next;
    }

    public String toString(){
        return "Name: " + firstName + " " + lastName + ", " + "City: " + city + ", " + "Number: " + number + ", " + "Address: " + address;
    }
}