import java.util.*;

class Contact implements Comparable<Contact> {
    String name, phone, email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public int compareTo(Contact c) {
        return name.compareTo(c.name);
    }

    public String toString() {
        return name + " " + phone + " " + email;
    }
}

class ContactsApp {
    public static void main(String[] args) {

        ArrayList<Contact> list = new ArrayList<>();
        HashMap<String, Contact> map = new HashMap<>();
        HashSet<String> phones = new HashSet<>();

        Contact c1 = new Contact("Adishri","111","a@gmail.com");
        Contact c2 = new Contact("Rahul","222","r@gmail.com");

        if(phones.add(c1.phone)){
            list.add(c1);
            map.put(c1.name,c1);
        }

        if(phones.add(c2.phone)){
            list.add(c2);
            map.put(c2.name,c2);
        }

        System.out.println("Search:");
        System.out.println(map.get("Rahul"));

        map.remove("Rahul");
        list.removeIf(x->x.name.equals("Rahul"));
        phones.remove("222");

        Collections.sort(list);

        System.out.println("Contacts:");
        for(Contact c:list)
            System.out.println(c);
    }
}