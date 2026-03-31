package week3.university information.java;
public class Department {

    import java.util.ArrayList;

public class Department {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        
        students.add(new Student("Brigid Mwangi", 225458, "DBIT"));
        students.add(new Student("John Doe", 123456, "IT"));

        
        for (Student s : students) {
            s.displayInfo();
            System.out.println();
        }

        Lecturer lecturer = new Lecturer("Kelvin Ouma", 301, 80000);
        lecturer.displayInfo();
    }
}
