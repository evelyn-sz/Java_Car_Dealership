import java.util.ArrayList;

public class Customer {

    private double money;
    private ArrayList<Car> carCollection;

    public Customer(double money) {
        this.money = money;
        this.carCollection = new ArrayList<>();
    }

    public double getMoney() {
        return this.money;
    }

    public int getNumberOfOwnedCars() {
        return this.carCollection.size();
    }
}
