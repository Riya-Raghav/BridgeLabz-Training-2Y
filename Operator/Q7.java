class Patient {
    static String hospitalName = "City Hospital";
    String name, ailment;
    final int patientID;

    Patient(String name, int patientID, String ailment) {
        this.name = name;
        this.patientID = patientID;
        this.ailment = ailment;
    }

    static void getTotalPatients(int count) {
        System.out.println("Total Patients: " + count);
    }

    void display() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName + ", Name: " + name + ", ID: " + patientID + ", Ailment: " + ailment);
        }
    }

    public static void main(String[] args) {
        Patient p1 = new Patient("Riya", 201, "Fever");
        Patient p2 = new Patient("Aman", 202, "Cold");
        p1.display();
        p2.display();
        getTotalPatients(2);
    }
}
