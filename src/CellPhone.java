public class CellPhone extends Product{

    private String memory;
    private String screenSize;
    private String batteryCapacity;
    private String ram;
    private String color;

    public CellPhone(int id, double unitPrice, double discountRate, int stock, String productName, Brand brand, String memory, String screenSize, String batteryCapacity, String ram, String color) {
        super(id, unitPrice, discountRate, stock, productName, brand);
        this.memory = memory;
        this.screenSize = screenSize;
        this.batteryCapacity = batteryCapacity;
        this.ram = ram;
        this.color = color;
    }

    @Override
    public void listProperties() {
        System.out.println("Cellphones");
    }
}
