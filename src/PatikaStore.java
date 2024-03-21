import java.util.*;

public class PatikaStore {
    private List<Brand> brands;
    private List<Product> notebookProducts;
    private List<Product> cellphoneProducts;
    private static Scanner scanner;
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

    public void addNotebook() {
        System.out.println("Please enter the necessary product information for your entry: ");
        Brand brand = null;

        while (brand == null) {
            System.out.println("Enter brand name: ");
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

        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();
        System.out.print("Storage (in GB): ");
        int storage = scanner.nextInt();
        System.out.print("Screen size (in inches): ");
        int screenSize = scanner.nextInt();
        System.out.print("RAM (in GB): ");
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

    public void addCellphone() {

        System.out.println("Please enter the necessary product information for your entry: ");
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

        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();
        System.out.print("Storage (in GB): ");
        int storage = scanner.nextInt();
        System.out.print("Screen size (in inches): ");
        int screenSize = scanner.nextInt();
        System.out.print("Battery capacity (mAh): ");
        int batteryCapacity = scanner.nextInt();
        System.out.print("RAM (in GB): ");
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

    public void listNotebooks() {
        PatikaStore.printHeading("List of Notebooks");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("| #  | ID | Product                      | Price     | Brand     | Storage  | Screen Size     | RAM |");
        System.out.println("----------------------------------------------------------------------------------------------------");
        boolean notebooksFound = false;
        int index = 1;
        for (Product product : notebookProducts) {
            Notebook notebook = (Notebook) product;

            System.out.format("| %-3d| %-2d | %-30s | %-9.2fTL | %-9s | %-9d | %-9d | %-12d |\n",
                    index + 1, notebook.getId(), notebook.getProductName(), notebook.getUnitPrice(), notebook.getBrand().getName(),
                    notebook.getStorage(), notebook.getScreenSize(), notebook.getRam());
            notebooksFound = true;
        }

        if (!notebooksFound) {
            System.out.println("There are currently no notebooks in the database.");
        }
    }

    public void listCellphones() {
        PatikaStore.printHeading("List of Cell Phones");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        System.out.println("| #  | ID | Product Name                 | Price     | Brand     | Storage  | Screen Size  | Battery | RAM | Color     |");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        boolean cellphonesFound = false;
        int index = 1;
        for (Product product : cellphoneProducts) {
            CellPhone cellphone = (CellPhone) product;
            System.out.format("| %-3d| %-2d | %-30s | %-9.2f TL | %-9s | %-9d | %-12d | %-8d | %-4d | %-10s |\n",
                    index++, cellphone.getId(), cellphone.getProductName(), cellphone.getUnitPrice(), cellphone.getBrand().getName(),
                    cellphone.getStorage(), cellphone.getScreenSize(), cellphone.getBatteryCapacity(), cellphone.getRam(), cellphone.getColor());

            cellphonesFound = true;
        }
        if (!cellphonesFound) {
            System.out.println("There are currently no cell phones in the database.");
        }
    }

    public void listBrands() {
        Collections.sort(brands);
        PatikaStore.printHeading("Brands");
        for (Brand brand : brands) {
            System.out.println(brand.getName());
        }
    }

    public void removeNotebookEntry() {
        System.out.print("Enter the ID of the product you want to remove: ");
        int id = scanner.nextInt();
        boolean removed = false;
        Iterator<Product> iterator = notebookProducts.iterator();
        while (iterator.hasNext()) {
            Product notebook = iterator.next();
            if (notebook.getId() == id) {
                iterator.remove();
                removed = true;
                break;
            }
        }
        if (removed) {
            System.out.println("The product has been removed successfully.");
        } else {
            System.out.println("There is no product with that ID.");
        }
    }

    public void removeCellphoneEntry() {
        System.out.print("Enter the ID of the product you want to remove: ");
        int id = scanner.nextInt();
        boolean removed = false;
        Iterator<Product> iterator = cellphoneProducts.iterator();
        while (iterator.hasNext()) {
            Product cellphone = iterator.next();
            if (cellphone.getId() == id) {
                iterator.remove();
                removed = true;
                break;
            }
        }
        if (removed) {
            System.out.println("The product has been removed successfully.");
        } else {
            System.out.println("There is no product with that ID.");
        }
    }

    //helper methods

    //print a separator with length n
    public static void printSeparator(int n){
        for(int i = 0; i < n; i++){
            System.out.print("-");
        }
        System.out.println();
    }

    //print a heading
    public static void printHeading(String title){
        printSeparator(20);
        System.out.println(title);
        printSeparator(20);
    }
}


