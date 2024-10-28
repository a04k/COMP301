import java.util.ArrayList;

public class CarTest {
    private ArrayList<Car> cars;
    
    public CarTest() {
        cars = new ArrayList<>();
    }
    
    public void addCar(Car car) {
        cars.add(car);
    }
    
    public void replaceBMWX5WithX6() {
        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            if (car.getCarName().equals("BMW") && car.getCarModel().equals("X5")) {
                cars.set(i, new Car("X6", "BMW", car.getCarPrice(), 
                    car.getYearOfProduction()));
            }
        }
    }
    
    public void removeOldToyotas() {
        cars.removeIf(car -> car.getCarName().equals("TOYOTA") && 
            car.getYearOfProduction() <= 2012);
    }
    
    public void displayAllCars() {
        for (Car car : cars) System.out.println(car);
    }
}