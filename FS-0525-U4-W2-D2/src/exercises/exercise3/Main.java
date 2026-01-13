package exercises.exercise3;

public class Main {
    public static void main(String[] args) {
        Contact andrea = new Contact("Andrea", 3245768944L);
        Contact roberto = new Contact("Roberto", 3282375413L);
        Contact carlo = new Contact("Carlo", 3772536106L);
        Contact pierluigi = new Contact("Pierluigi", 3772536107L);
        PhoneBook.addToPhoneBook(andrea);
        PhoneBook.addToPhoneBook(roberto);
        PhoneBook.addToPhoneBook(carlo);
        PhoneBook.addToPhoneBook(pierluigi);
        PhoneBook.getAllContacts();
    }

}
