import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PatikaStore techStore = new PatikaStore();
        Scanner scanner = new Scanner(System.in);

        boolean inProgress = true;

        while(inProgress){
            System.out.println("==== PatikaStore Inventory Management System ====");
            System.out.println("\nSelect an action:");
            System.out.println("1. Browse Notebook related actions");
            System.out.println("2. Browse Cellphone related actions");
            System.out.println("3. List all brands");
            System.out.println("4. Quit");

            int selection = scanner.nextInt();
            scanner.nextLine();

            switch(selection){
                case 1:

            }
        }
    }

    private static void notebookActionHandler(PatikaStore patikaStore, Scanner scanner){
        boolean inProgress = true;
        while (inProgress){
            System.out.println("\nNotebook related actions:");
            System.out.println("1. Add a notebook");
            System.out.println("2. List all notebooks");
            System.out.println("3. Remove a notebook entry");
            System.out.println("4. Go back");

            int selection = scanner.nextInt();
            scanner.nextLine();

            switch(selection){
                case 1:

            }
        }
    }
}