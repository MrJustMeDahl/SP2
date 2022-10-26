public class ElectricCar extends ACar{

    private int batteryCapacity;
    private int maxRange;
    private int registrationFee;
    private int WhPrKm;

    public ElectricCar(String regnr, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange){
        super(regnr, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
        this.WhPrKm = (batteryCapacity/maxRange);
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public int getMaxRangeKm() {
        return maxRange;
    }

    public int getWhPrKm(){
        return WhPrKm;
    }

    public int getRegistrationFee(){
        int kmPrLitre = (int) (100/(WhPrKm/91.25));
        if(kmPrLitre < 50 && kmPrLitre >= 20){
            registrationFee = 330;
        } else if(kmPrLitre < 20 && kmPrLitre >= 15){
            registrationFee = 1050;
        } else if(kmPrLitre < 15 && kmPrLitre >= 10){
            registrationFee = 2340;
        } else if(kmPrLitre < 10 && kmPrLitre >= 5){
            registrationFee = 5500;
        } else if(kmPrLitre < 5){
            registrationFee = 10470;
        }

        return registrationFee;
    }

    @Override
    public String toString(){
        return super.toString() + "It has a battery capacity of: " + batteryCapacity + " watts,\n" +
                "with a max range of: " + maxRange + "km. per charge.\n";
    }
}
