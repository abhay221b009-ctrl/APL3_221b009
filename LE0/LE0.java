public class Main {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);

         
        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " * " + i + " = " + x * i);
        }

         
        Car c1 = new Car();
        c1.setName("Pajero");
        c1.setSpeed(120);
        c1.setMileage(12);

        System.out.println("Car Name: " + c1.getName());
        int speed = c1.getSpeed();
        if (speed == 0) {
            System.out.println("Overspeeding");
        } else {
            System.out.println("Car Speed: " + speed + " km/h");
        }
        System.out.println("Car Mileage: " + c1.getMileage() + " km/l");
    }
}

class Car {
    private String carName;
    private int carSpeed;
    private int carMileage;

    public void setName(String name) {
        this.carName = name;
    }

    public void setSpeed(int speed) {
         
        if (speed > 120) {
            System.out.println("Warning: Overspeeding! Speed set to 0.");
            this.carSpeed = 0;
        } else {
            this.carSpeed = speed;
        }
    }

    public void setMileage(int mileage) {
        this.carMileage = mileage;
    }

    public String getName() {
        return carName;
    }

    public int getSpeed() {
        return carSpeed;
    }

    public int getMileage() {
        return carMileage;
    }
}
