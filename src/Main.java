import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PatikaStore patikaStore = new PatikaStore();
        Scanner scanner = new Scanner(System.in);

        boolean inProgress = true;

        while(inProgress){

            System.out.println("==== PatikaStore Inventory Management System ====");
            System.out.println("\nSelect an action:");
            System.out.println("1. Browse Notebook related actions");
            System.out.println("2. Browse Cell phone related actions");
            System.out.println("3. List all brands");
            System.out.println("4. Quit");

            int selection = scanner.nextInt();
            scanner.nextLine();

            switch(selection){
                case 1:
                    notebookActionHandler(patikaStore, scanner);
                    break;
                case 2:
                    cellphoneActionHandler(patikaStore, scanner);
                    break;
                case 3:
                    patikaStore.listBrands();
                    break;
                case 4:
                    inProgress = false;
                    System.out.println("Goodbye...");
                    break;
                default:
                    System.out.println("You have made an invalid selection. Please try again.");
            }
        }
        scanner.close();
    }

    private static void notebookActionHandler(PatikaStore patikaStore, Scanner scanner){

        boolean inProgress = true;

        while (inProgress){
            PatikaStore.printHeading("Notebook Actions");
            System.out.println("1. Add a notebook");
            System.out.println("2. List all notebooks");
            System.out.println("3. Remove a notebook entry");
            System.out.println("4. Go back");

            int selection = scanner.nextInt();
            scanner.nextLine();

            switch(selection){
                case 1:
                    patikaStore.addNotebook();
                    break;
                case 2:
                    patikaStore.listNotebooks();
                    break;
                case 3:
                    patikaStore.removeNotebookEntry();
                    break;
                case 4:
                    inProgress = false;
                    break;
                default:
                    System.out.println("You have made an invalid selection. Please try again.");
            }
        }
    }

    private static void cellphoneActionHandler(PatikaStore patikaStore, Scanner scanner){

        boolean inProgress = true;

        while(inProgress){
            PatikaStore.printHeading("Cell Phone Actions");
            System.out.println("1. Add a cellphone");
            System.out.println("2. List all cellphones");
            System.out.println("3. Remove a cellphone entry");
            System.out.println("4. Go back");

            int selection = scanner.nextInt();
            scanner.nextLine();

            switch(selection){
                case 1:
                    patikaStore.addCellphone();
                    break;
                case 2:
                    patikaStore.listCellphones();
                    break;
                case 3:
                    patikaStore.removeCellphoneEntry();
                    break;
                case 4:
                    inProgress = false;
                    break;
                default:
                    System.out.println("You have made an invalid selection. Please try again.");
            }
        }
    }
}