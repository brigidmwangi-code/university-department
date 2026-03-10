package week3.university information.java;
public class Department {

    private String departmentName;

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public void showDepartment() {
        System.out.println("Department: " + departmentName);
    }
}
