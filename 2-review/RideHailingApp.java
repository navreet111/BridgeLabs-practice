interface IGPS {
    void getCurrentLocation();
    void updateLocation(String location);
}

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

   
    abstract double calculateFare(double distance);

    
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate Per Km: " + ratePerKm);
    }
}


class Car extends Vehicle implements IGPS {

    private String currentLocation;

    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    double calculateFare(double distance) {
        return distance * getRatePerKm() + 50;
    }

    @Override
    public void getCurrentLocation() {
        System.out.println("Car Location: " + currentLocation);
    }

    @Override
    public void updateLocation(String location) {
        currentLocation = location;
    }
}


class Bike extends Vehicle implements IGPS {

    private String currentLocation;

    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    double calculateFare(double distance) {
        return distance * getRatePerKm() + 20;
    }

    @Override
    public void getCurrentLocation() {
        System.out.println("Bike Location: " + currentLocation);
    }

    @Override
    public void updateLocation(String location) {
        currentLocation = location;
    }
}


class Auto extends Vehicle implements IGPS {

    private String currentLocation;

    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    double calculateFare(double distance) {
        return distance * getRatePerKm() + 30;
    }

    @Override
    public void getCurrentLocation() {
        System.out.println("Auto Location: " + currentLocation);
    }

    @Override
    public void updateLocation(String location) {
        currentLocation = location;
    }
}


public class RideHailingApp {

    
    public static void processRide(Vehicle vehicle, double distance) {

        vehicle.getVehicleDetails();

        double fare = vehicle.calculateFare(distance);

        System.out.println("Distance: " + distance + " km");
        System.out.println("Fare: " + fare);

        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        Vehicle car = new Car("C101", "Rahul", 15);
        Vehicle bike = new Bike("B201", "Aman", 8);
        Vehicle auto = new Auto("A301", "Suresh", 10);

        processRide(car, 12);
        processRide(bike, 12);
        processRide(auto, 12);

       
        IGPS gpsCar = (IGPS) car;

        gpsCar.updateLocation("Delhi");
        gpsCar.getCurrentLocation();
    }
}