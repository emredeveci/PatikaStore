public class Notebook extends Product {

    private String ram;
    private String storage;
    private String screenSize;

    public Notebook(int id, double unitPrice, double discountRate, int stock, String productName, Brand brand, String ram, String storage, String screenSize) {
        super(id, unitPrice, discountRate, stock, productName, brand);
        this.ram = ram;
        this.storage = storage;
        this.screenSize = screenSize;
    }

    @Override
    public void listProperties() {
        System.out.println("Notebooks");
    }
}
