package web.model;

public class Car {
    String model;
    int mileage;
    int age;

    public Car() {
    }

    public Car(String model, int mileage, int age) {
        this.model = model;
        this.mileage = mileage;
        this.age = age;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", mileage=" + mileage +
                ", age=" + age +
                '}';
    }
}
