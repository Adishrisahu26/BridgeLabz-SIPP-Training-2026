import java.util.*;

public class AttendanceTracker {
    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        map.put("Java", new ArrayList<>());
        map.put("Python", new ArrayList<>());

        addStudent(map,"Java","Adishri");
        addStudent(map,"Java","Rahul");
        addStudent(map,"Java","Adishri");
        addStudent(map,"Python","Priya");

        for(String subject:map.keySet()){
            System.out.println(subject+" : "+map.get(subject));
            System.out.println("Total = "+map.get(subject).size());
        }
    }

    static void addStudent(HashMap<String,ArrayList<String>> map,
                           String subject,String student){

        ArrayList<String> list=map.get(subject);

        if(!list.contains(student))
            list.add(student);
        else
            System.out.println(student+" already marked in "+subject);
    }
}