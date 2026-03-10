public class Main {
    public static void main(String[] args) {

        Department dept = new Department("IT Department");
        dept.showDepartment();

        System.out.println();

        Student student = new Student(
                "Brigid Mwangi",
                "225458",
                "DBIT"
        );

        Lecturer lecturer = new Lecturer(
                "Kelvin Ouma",
                "L001",
                85000
        );

        student.displayInfo();
        System.out.println();

        lecturer.displayInfo();
        System.out.println("Monthly Pay: " + lecturer.calculatePay());
    }
}
    
}
