import java.util.*;

public class PatikaStore {
    private List<Brand> brands;
    private List<Product> products;
    private Scanner scanner;
    private int uniqueIdCounter;

    public PatikaStore() {
        brands = new ArrayList<>();
        products = new ArrayList<>();
        scanner = new Scanner(System.in);
        uniqueIdCounter = 9;

        brands.add(new Brand(1, "Samsung"));
        brands.add(new Brand(2, "Lenovo"));
        brands.add(new Brand(3, "Apple"));
        brands.add(new Brand(4, "Huawei"));
        brands.add(new Brand(5, "Casper"));
        brands.add(new Brand(6, "Asus"));
        brands.add(new Brand(7, "HP"));
        brands.add(new Brand(8, "Xiaomi"));
        brands.add(new Brand(9, "Monster"));
    }

    public void addProduct(){
        System.out.println("Enter 1 for Cell Phones, 2 for Notebooks");
        int selection = scanner.nextInt();

        if(selection == 1) {
            int id = uniqueIdCounter++;

        }
    }
}

