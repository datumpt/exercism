public class CarsAssemble {

    int BASE_CARS = 221;    
    public double productionRatePerHour(int speed) {
        int BASE_PER_SPEED = BASE_CARS * speed;
        if (speed <= 4) {
            return BASE_PER_SPEED;
        } else if (speed <= 8) {
            return BASE_PER_SPEED*0.9;
        } else if (speed == 9) {
            return BASE_PER_SPEED*0.8;
        } else {
            return BASE_PER_SPEED*0.77;
        }
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed)/60;
        
    }
}
