public class Notebook extends Product {

    private Integer ram;
    private Integer storage;
    private Integer screenSize;

    public Notebook(int id, double unitPrice, double discountRate, int stock, String productName, Brand brand, Integer ram, Integer storage, Integer screenSize) {
        super(id, unitPrice, discountRate, stock, productName, brand);
        this.ram = ram;
        this.storage = storage;
        this.screenSize = screenSize;
    }

    @Override
    public void listProperties() {
        System.out.println("Notebooks");
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
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
}
