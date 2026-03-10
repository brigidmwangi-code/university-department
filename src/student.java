public class Student extends Person {

    private String course;

    public Student(String name, String id, String course) {
        super(name, id);   // calling parent constructor
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public void displayInfo() {
        System.out.println("Student Name: " + getName());
        System.out.println("Student ID: " + getId());
