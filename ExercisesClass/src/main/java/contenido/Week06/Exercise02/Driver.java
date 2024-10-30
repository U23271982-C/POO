package contenido.Week06.Exercise02;

import java.util.ArrayList;

public class Driver extends Employee {
    private String lisenceNumber;
    private ArrayList<Vehicle> vehicles;

    public Driver(String lastName, String name, String DNI,
                  String address, String lisenceNumber) {
        super(lastName, name, DNI, address);
        this.lisenceNumber = lisenceNumber;
        vehicles = new ArrayList<>();
    }

    public String getLisenceNumber() {
        return lisenceNumber;
    }

    public void setLisenceNumber(String lisenceNumber) {
        this.lisenceNumber = lisenceNumber;
    }

    public void addNewVehicle(Vehicle newVehicle){
        vehicles.add(newVehicle);
    }
}
