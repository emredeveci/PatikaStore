import java.util.*;

public class PatikaStore {
    private List<Brand> brands;
    private List<Product> notebookProducts;
    private List<Product> cellphoneProducts;
    private Scanner scanner;
    private int notebookIdCounter;
    private int cellphoneIdCounter;

    public PatikaStore() {
        brands = new ArrayList<>();
        notebookProducts = new ArrayList<>();
        cellphoneProducts = new ArrayList<>();
        scanner = new Scanner(System.in);
        notebookIdCounter = 1;
        cellphoneIdCounter = 1;

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

    public void addNotebook(Scanner scanner) {
        System.out.println("Please enter the necessary product information for your entry: ");
        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();
        Brand brand = null;

        while (brand == null) {
            System.out.println("Enter brand name: ");
            String brandName = scanner.nextLine();
            for (Brand b : brands) {
                if (b.getName().equalsIgnoreCase(brandName)) {
                    brand = b;
                    break;
                }
                if (brand == null) {
                    System.out.println("Invalid brand name. Please try again.");
                }
            }
        }

        System.out.println("Storage");
        int storage = scanner.nextInt();
        System.out.print("Screen size: ");
        int screenSize = scanner.nextInt();
        System.out.print("RAM: ");
        int ram = scanner.nextInt();
        System.out.print("Unit price: ");
        double unitPrice = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Discount rate: ");
        double discountRate = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Stock quantity: ");
        int stock = scanner.nextInt();
        scanner.nextLine();

        Product product = new Notebook(notebookIdCounter++, unitPrice, discountRate, stock, productName, brand, ram, storage, screenSize);
        notebookProducts.add(product);
    }

    public void addCellphone(Scanner scanner) {

        System.out.println("Please enter the necessary product information for your entry: ");
        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();
        Brand brand = null;

        while (brand == null) {
            System.out.println("Brand name: ");
            String brandName = scanner.nextLine();
            for (Brand b : brands) {
                if (b.getName().equalsIgnoreCase(brandName)) {
                    brand = b;
                    break;
                }
            }
            if (brand == null) {
                System.out.println("Invalid brand name. Please try again.");
                return;
            }
        }

        System.out.print("Storage: ");
        int storage = scanner.nextInt();
        System.out.print("Screen size: ");
        int screenSize = scanner.nextInt();
        System.out.print("Battery capacity: ");
        int batteryCapacity = scanner.nextInt();
        System.out.print("RAM: ");
        int ram = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Color: ");
        String color = scanner.nextLine();
        System.out.print("Unit price: ");
        double unitPrice = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Discount rate: ");
        double discountRate = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Stock quantity: ");
        int stock = scanner.nextInt();
        scanner.nextLine();

        Product product = new CellPhone(cellphoneIdCounter++, unitPrice, discountRate, stock, productName, brand, storage, screenSize, batteryCapacity, ram, color);
        cellphoneProducts.add(product);
    }
}


