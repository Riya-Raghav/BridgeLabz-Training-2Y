class Vehicle {
    static double registrationFee = 5000.0;
    String ownerName, vehicleType;
    final int registrationNumber;

    Vehicle(String ownerName, String vehicleType, int registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    void display() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + ownerName + ", Type: " + vehicleType + ", Reg No: " + registrationNumber + ", Fee: " + registrationFee);
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Riya", "Car", 5001);
        Vehicle v2 = new Vehicle("Aman", "Bike", 5002);
        v1.display();
        v2.display();
        updateRegistrationFee(6000);
        v1.display();
    }
}
