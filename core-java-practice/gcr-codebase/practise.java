class Student {
    static int students = 0;
    String name;

    Student(String name) {
        this.name = name;
        students++;
    }
}

public class practise {
    public static void main(String[] args) {
        Student s1 = new Student("akshay");
        Student s2 = new Student("sachin");
        Student s3 = new Student("rohit");
        Student s4 = new Student("virat");

        System.out.println(Student.students);
    }
}