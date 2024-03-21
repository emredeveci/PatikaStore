public class CellPhone extends Product{

    private Integer storage;
    private Integer screenSize;
    private Integer batteryCapacity;
    private Integer ram;
    private String color;

    public CellPhone(int id, double unitPrice, double discountRate, int stock, String productName, Brand brand, Integer storage, Integer screenSize, Integer batteryCapacity, Integer ram, String color) {
        super(id, unitPrice, discountRate, stock, productName, brand);
        this.storage = storage;
        this.screenSize = screenSize;
        this.batteryCapacity = batteryCapacity;
        this.ram = ram;
        this.color = color;
    }

    @Override
    public void listProperties() {
        System.out.println("Cellphones");
    }

    public Integer getStorage() {
        return storage;
    }

    public void setStorage(Integer storage) {
        this.storage = storage;
    }

    public Integer getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(Integer screenSize) {
        this.screenSize = screenSize;
    }

    public Integer getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(Integer batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
