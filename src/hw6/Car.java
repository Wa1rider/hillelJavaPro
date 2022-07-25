package hw6;

public class Car implements Comparable {
    private String brand;
    private int maxSpeed;

    public Car(String model, int speed) {
        this.brand = model;
        this.maxSpeed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "model='" + brand + '\'' +
                ", speed=" + maxSpeed;
    }

    @Override
    public int compareTo(Object o) {
        if (maxSpeed < ((Car) o).maxSpeed) {
            return -1;
        } else if (maxSpeed > ((Car) o).maxSpeed) {
            return 1;
        } else {
            return 0;
        }
    }
}
