import java.util.*;

public class PhoneBook {
    HashMap<String, HashSet<String>> phoneMap;

    public PhoneBook() {
        this.phoneMap = new HashMap<String, HashSet<String>>();
    }

    public void add(String name, String phone) {
        HashSet<String> phoneSet = phoneMap.getOrDefault(name,  new HashSet<>());
        phoneSet.add(phone);
        phoneMap.put(name, phoneSet);
    }

    public void findString(String name) {
        phoneMap.entrySet().stream()
                .filter(n -> n.getKey().equals(name))
                .forEach(n -> System.out.println(n));
    }

    public static void main(String[] args) {
        PhoneBook PhoneBook = new PhoneBook();

        PhoneBook.add("Алексей", "+7(917)1234567");
        PhoneBook.add("Николай", "+7(917)2456785");
        PhoneBook.add("Анна", "+7(917)5477789");
        PhoneBook.add("Анна", "+7(965)2768850");
        PhoneBook.add("Петр", "+7(965)3678350");
        PhoneBook.add("Агафья", "+7(347)2354670");

        PhoneBook.findString("Анна");
        PhoneBook.findString("Алексей");
    }
}