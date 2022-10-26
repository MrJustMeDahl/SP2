public abstract class ACar implements Car{

    protected String registrationNumber;
    protected final String make;
    protected final String model;
    protected final int numberOfDoors;

    public ACar(String regnr, String make, String model, int numberOfDoors){
        this.registrationNumber = regnr;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public String toString(){
        return "\nThis car's registration number is: " + registrationNumber + ".\n" +
                "It's a " + make + model + "," +
                "with " + numberOfDoors + " doors.\n";
    }
}
