package exercises.exercise3;

import java.util.HashMap;

public abstract class PhoneBook {
    private static final HashMap<String, Long> contactsList = new HashMap<>();

    public static void addToPhoneBook(Contact contact) {
        String name = contact.getName();
        Long phoneNumber = contact.getPhoneNumber();
        contactsList.put(name, phoneNumber);
    }

    public static void removeFromPhoneBook(String name) {
        contactsList.remove(name);
    }

    //public Contact getByPhone(Long phoneNumber){
    //}

    public static void getByName(String name) {
        System.out.println("Eccoti il contatto di" + name + contactsList.get(name));
    }

    public static void getAllContacts() {
        System.out.println(contactsList.toString());
    }
}
