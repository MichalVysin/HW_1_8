package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Contact> contactList = new ArrayList<>();
        Contact contact1 = new Contact("Josef", "Mlatil", "733 555 874", Group.WORK);
        Contact contact2 = new Contact("Natt", "", "787 487 521", Group.FAMILY);
        Contact contact3 = new Contact("Pavlina", "Stedra", "775 487 251", Group.OTHER);
        Contact contact4 = new Contact("Mama", "", "777 745 364", Group.FAMILY);
        Contact contact5 = new Contact("Pavel", "Bily", "737 222 699", Group.WORK);
        Contact contact6 = new Contact("Pavel", "Cerny", "605 888 777", Group.WORK);
        Contact contact7 = new Contact("Eliska", "Rovna", "602 874 777", Group.OTHER);

        contactList.add(contact1);
        contactList.add(contact2);
        contactList.add(contact3);
        contactList.add(contact4);
        contactList.add(contact5);
        contactList.add(contact6);
        contactList.add(contact7);

        String expression = "";

        while (true) {
            System.out.print("Hledat: ");
            Scanner scanner = new Scanner(System.in);
            expression = scanner.nextLine();
            showContact(findContact(expression, contactList));
        }
    }

    public static List<Contact> findContact(String expression, List<Contact> contactList) {
        List<Contact> filteredContact = new ArrayList<>();

        for (Contact c : contactList) {
            if (!expression.equals("")) {
                if (expression.equals("vse")){
                    filteredContact.add(c);
                }
                if (c.getName().toLowerCase().contains(expression.toLowerCase()) ||
                        c.getSurname().toLowerCase().contains(expression.toLowerCase()) ||
                        c.getPhoneNumber().toLowerCase().contains(expression.toLowerCase()) ||
                        c.getGroup().getDescription().toLowerCase().contains(expression.toLowerCase())) {

                    filteredContact.add(c);
                }
            }

        }
        return filteredContact;

    }

    public static void showContact(List<Contact> filteredContacts) {

        for (Contact c : filteredContacts) {
            System.out.println(c.getName() + "\t" + c.getSurname() + "\n" +
                    c.getPhoneNumber() + "\n" +
                    c.getGroup().getDescription() + "\n" +
                    "_____________________"
            );
        }

    }
}
