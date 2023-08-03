package Company;

import skeleton.CarSkeleton;

public class GasPowerdeCar extends CarSkeleton {


    private double avgKmPerLitre;
    private int cylinders;

    public GasPowerdeCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }
}
