public class Main {
    public static void main(String[] args) {
        FleetOfCars fleet = new FleetOfCars();

        Car car1 = new GasolinCar("DKAL59012", "Peugeot", "208 GTI", 5, "Gasolin 95", 18);
        Car car2 = new DieselCar("DKBJ69069", "Volkswagen", "Transporter", 4, "Diesel", 8, true);
        Car car3 = new ElectricCar("DKUP10269", "Tesla", "Model S", 5, 99000, 600);

        fleet.addCar(car1);
        fleet.addCar(car2);
        fleet.addCar(car3);

        System.out.println(fleet);
        System.out.println("The total registration fee is: " + fleet.getTotalRegistrationFeeForFleet());
    }
}