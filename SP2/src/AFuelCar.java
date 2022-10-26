public abstract class AFuelCar extends ACar{

    protected String fuelType;
    protected int kmPrLitre;

    public AFuelCar(String regnr, String make, String model, int numberOfDoors, String fuelType, int kmPrLitre){
        super(regnr, make, model, numberOfDoors);
        this.fuelType = fuelType;
        this.kmPrLitre = kmPrLitre;
    }

    public abstract String getFuelType();
    public abstract int getKmPrLitre();

    @Override
    public String toString(){
        return super.toString() + "It runs on " + fuelType + " and goes " + kmPrLitre + " km. pr. liter.\n";
    }

}
