public enum EngineType {
    PETROL("Petrol"),
    DIESEL("Diesel"),
    ELECTRIC("Electric"),
    HYBRID("Hybrid");

    private final String name;

    EngineType(String name) {
        this.name = name;
    }

    public String getEngineName() {
        return name;
    }
}
