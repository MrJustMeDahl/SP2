public class DieselCar extends AFuelCar{

    private boolean particleFilter;
    private int registrationFee;

    public DieselCar(String regnr, String make, String model, int numberOfDoors, String fuelType, int kmPrLitre, boolean particleFilter){
        super(regnr, make, model, numberOfDoors, fuelType, kmPrLitre);
        this.particleFilter = particleFilter;
    }

    public String getFuelType() {
        return this.fuelType;
    }

    public int getKmPrLitre() {
        return this.kmPrLitre;
    }

    public boolean hasParticleFilter(){
        return particleFilter;
    }

    public int getRegistrationFee(){
        int kmPrLitre = this.getKmPrLitre();
        int extraFee = 0;
        int particleFilterFee = 0;
        if(kmPrLitre < 50 && kmPrLitre >= 20){
            extraFee = 130;
            registrationFee = 330;
        } else if(kmPrLitre < 20 && kmPrLitre >= 15){
            extraFee = 1390;
            registrationFee = 1050;
        } else if(kmPrLitre < 15 && kmPrLitre >= 10){
            extraFee = 1850;
            registrationFee = 2340;
        } else if(kmPrLitre < 10 && kmPrLitre >= 5){
            extraFee = 2770;
            registrationFee = 5500;
        } else if(kmPrLitre < 5){
            extraFee = 15260;
            registrationFee = 10470;
        }

        if(!particleFilter){
            particleFilterFee = 1000;
        }
        return registrationFee + extraFee + particleFilterFee;
    }



    @Override
    public String toString(){
        if(particleFilter){
            return super.toString() + "The car is equipped with a particle filter.\n";
        }
        return super.toString();
    }
}
