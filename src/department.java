package week3.university information.java;
public class Department {

    import java.util.ArrayList;

public class Department {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Brigid Mwangi", 225458, "DBIT"));
        students.add(new Student("John Doe", 123456, "IT"));

        // SAVE to file
        FileHandler.saveStudents(students);

        // LOAD from file
        ArrayList<Student> loadedStudents = FileHandler.loadStudents();

        System.out.println("\nLoaded Students:");
        for (Student s : loadedStudents) {
            s.displayInfo();
            System.out.println();
        }
    }
}
