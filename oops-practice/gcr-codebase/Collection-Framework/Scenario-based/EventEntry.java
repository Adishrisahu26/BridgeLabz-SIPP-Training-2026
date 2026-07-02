import java.util.*;

public class EventEntry {
    public static void main(String[] args) {

        HashSet<String> participants = new HashSet<>();

        participants.add("a@gmail.com");
        participants.add("b@gmail.com");

        if(!participants.add("a@gmail.com"))
            System.out.println("Duplicate Registration");

        System.out.println("Participants:");
        for(String p:participants)
            System.out.println(p);

        System.out.println("Total = "+participants.size());
    }
}