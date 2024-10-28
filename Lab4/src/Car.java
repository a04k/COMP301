public class Car {
    private String carModel;
    private String carName;
    private float carPrice;
    private int yearOfProduction;
    
    public Car(String model, String name, float price, int year) {
        this.carModel = model;
        this.carName = name;
        this.carPrice = price;
        this.yearOfProduction = year;
    }
    
    public String getCarModel() { return carModel; }
    public String getCarName() { return carName; }
    public float getCarPrice() { return carPrice; }
    public int getYearOfProduction() { return yearOfProduction; }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Car)) return false;
        Car car = (Car) obj;
        return carModel.equals(car.carModel) && carName.equals(car.carName);
    }
    
    @Override
    public String toString() {
        return String.format("%s %s (L.E%.2f) - %d", 
            carName, carModel, carPrice, yearOfProduction);
    }
}