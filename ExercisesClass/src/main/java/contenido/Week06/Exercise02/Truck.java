package contenido.Week06.Exercise02;

public class Truck extends Vehicle {
    private double weigth;
    private double loadCapacity;

    public Truck(String licenseNumber, double weigth, double loadCapacity) {
        super(licenseNumber);
        this.weigth = weigth;
        this.loadCapacity = loadCapacity;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
