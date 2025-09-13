class Employee {
    static String companyName = "Infosys";
    String name, designation;
    final int id;

    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
    }

    static void displayTotalEmployees(int count) {
        System.out.println("Total Employees: " + count);
    }

    void display() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName + ", Name: " + name + ", ID: " + id + ", Designation: " + designation);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Riya", 1, "Developer");
        Employee e2 = new Employee("Aman", 2, "Manager");
        e1.display();
        e2.display();
        displayTotalEmployees(2);
    }
}
