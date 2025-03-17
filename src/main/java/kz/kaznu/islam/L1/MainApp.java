package kz.kaznu.islam.L1;


public class MainApp {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Andrey Drobyshev", "8 707 565 88 88");
        phoneBook.add("Andrey Drobyshev", "8 775 987 65 43");
        phoneBook.add("Iliona Roulin", "3 333 333 33 33");

        System.out.println(phoneBook.find("Andrey Drobyshev"));
        System.out.println(phoneBook.find("Yevgeni Panosenkov"));
        System.out.println(phoneBook.find("Iliona Roulin"));
        System.out.println(phoneBook.containsPhoneNumber("8 707 565 88 88"));
        System.out.println(phoneBook.containsPhoneNumber("8 777 555 55 55"));

    }


}
