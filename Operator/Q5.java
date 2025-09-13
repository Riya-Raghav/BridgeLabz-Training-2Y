class Student {
    static String universityName = "GLA University";
    String name, grade;
    final int rollNumber;

    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    static void displayTotalStudents(int count) {
        System.out.println("Total Students: " + count);
    }

    void display() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName + ", Name: " + name + ", Roll: " + rollNumber + ", Grade: " + grade);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Riya", 101, "A");
        Student s2 = new Student("Aman", 102, "B");
        s1.display();
        s2.display();
        displayTotalStudents(2);
    }
}
