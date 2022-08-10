public class Car {
    private String color;
    private String model;
    private int power;
    private int curSpeed;

    public Car() {
        curSpeed = 0;
    }

    public Car(String color, String model, int power) {
        this.color = color; //Car.color=color
        this.model = model;
        this.power = power;
        //this쓴 이유: 그냥 명시적으로. public Car 대신. this=해당 클래스. (pointer때 중요)
    }

    public void setColor(String color){
        this.color = color;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setPower(int power){
        this.power = power;
    }
    public void go() {
        if (power < 200) {
            curSpeed += 10;
        } else if (power >= 200) {
            curSpeed += 20;
        }
        System.out.printf("Accelerate %s,Current Speed %d\n", model, curSpeed);
    }

    public void stop() {
        curSpeed = 0;
    }
}

