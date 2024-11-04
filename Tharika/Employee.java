public class Employee {
    private int employeeID;
    private String employeeName;
    private String department;
    public Employee(int employeeID, String employeeName, String department) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.department = department;
    }
    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public boolean search(int id) {
        return this.employeeID == id;
    }
    
    public boolean search(String name) {
        return this.employeeName.equals(name);
    }
    
    public boolean search(String department, boolean isDepartmentSearch) {
        return this.department.equals(department);
    }
}
public static void main(String[] args) {
    Employee employee1 = new Employee(1, "John Doe", "Sales");
    Employee employee2 = new Employee(2, "Jane Smith", "Marketing");
    if (employee1.search(1)) {
        System.out.println("Employee found!");
    } else {
        System.out.println("Employee not found!");
    }
    if (employee2.search("Jane Smith")) {
        System.out.println("Employee found!");
    } else {
        System.out.println("Employee not found!");
    }
    if (employee1.search("Sales", true)) {
        System.out.println("Employee found!");
    } else {
        System.out.println("Employee not found!");
    }
}

