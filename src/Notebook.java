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
}
