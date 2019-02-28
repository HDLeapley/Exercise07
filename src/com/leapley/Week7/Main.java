package com.leapley.Week7;

/*
Hudson Leapley 2/26/2019
Write a program that includes a class representing contact information
for a person including their name and email address. This class should
include a method for displaying the contact's name and email address.
The program should also include a class for business contacts that extends
the contact class and stores the contact's phone number. The business
contact class should override the base class's method that displays the
name and email address so that it displays the phone number in addition
to the name and email address. Create instances of both classes to
demonstrate functionality.
 */

public class Main {

    public static void main(String[] args) {
	Contact contact = new Contact("Hudson","hudson.d.leapley@gmail.com"); //create normal contact
	contact.display();
	BusinessContact bContact = new BusinessContact("Ethan","ethan@gmail.com","6149998888"); //create business contact
	bContact.display();
    }
}

class Contact {
    private String name;
    private String email;

    public Contact(){}
    public Contact(String name, String email) { //Constructor for contact
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void display(){
        System.out.println("Name: " + getName() +"\n" +
                "Email: " + getEmail());
    }

}

class BusinessContact extends Contact{
    private String phoneNumber;

    public BusinessContact(String name, String email, String phoneNumber) { //Constructor for business contact
        super(name, email);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override //Overrides display method to display phone number as well.
    public void display(){
        System.out.println("Name: " + getName() +"\n" +
                "Email: " + getEmail() +"\n" +
                "Phone Number: " + getPhoneNumber());
    }
}

