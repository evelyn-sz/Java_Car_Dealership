public class Car {
    private EngineType engineType;
    private double price;
    private String colour;
    private String tyres;

    public Car(EngineType engineType, double price, String colour, String tyres) {
        this.engineType = engineType;
        this.price = price;
        this.colour = colour;
        this.tyres = tyres;
    }

    public EngineType getEngineType() {
        return engineType;
    }
    
    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public String getTyres() {
        return tyres;
    }
}
