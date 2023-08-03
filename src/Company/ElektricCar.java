package Company;

import skeleton.CarSkeleton;

public class ElektricCar extends CarSkeleton {

    private double avgKmPerCharge;
    private int batterySize;
    public ElektricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }
}
