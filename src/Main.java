import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static ArrayList<Item> itemsWarehouse = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static void customerMenu() {
        System.out.println("""
                    MENU' CUSTOMER:
                    1) Carrello
                    2) Catalogo
                    3) logout
                    seleziona una opzione inserendo il suo numero:
                """);

        while (true) {
            switch (inputInt()) {
                case 1:
                    cartMenu();
                case 2:
                    menuCatalogue();
                case 3:
                    Login.readString();
                default:
                    System.out.println("Valore non valido, riprova.");
            }
        }
    }
  
  public static void menuCatalogue() {

        System.out.println("""
                Catalogo
                1) Seleziona un articolo
                2) Filtra
                0) Torna al Menù customer
                Seleziona una opzione inserendo il suo numero:""");

        int inputInt = inputInt();
        switch (inputInt) {
            case 1:

                int answerInput;
                do {
                    Item.shortPrint(itemsWarehouse);
                    System.out.println("Per selezionare un articolo da questa lista digita 1 oppure digita 0 per tornare indietro");
                    answerInput = inputInt();

                    if (answerInput == 1) {
                        addItemCart();
                    } else if (answerInput == 0) {
                        menuCatalogue();
                    } else {
                        System.err.println("Input errato, riprova. (Digita 1 per confermare la selezione o 0 per tornare indietro");
                    }
                } while (answerInput != 1 && answerInput != 0);

                break;
            case 2:
                ArrayList<Item> itemsFiltered = new ArrayList<>(itemsWarehouse);
                filter(itemsFiltered);
                break;
            case 0:
                customerMenu();
                break;
            default:
                menuCatalogue();
                break;
        }
    }

    public static ArrayList<Item> filter(ArrayList<Item> itemsFiltered) {

        System.out.println("""
                Filtro di ricerca
                1) Tipo di dispositivo
                2) Modello
                3) Produttore
                4) Prezzo di vendita
                5) Range di prezzo
                6) Seleziona un articolo dai risultati della ricerca
                7) Resetta filtro ricerca e torna al Menù catalogo
                0) Torna al Menù catalogo
                Scegli la caratteristica in base alla quale vuoi filtrare la ricerca inserendo il numero corrispondente:""");

        int inputInt = inputInt();
        switch (inputInt) {
            case 1:
                System.out.println("Inserire il tipo di dispositivo");
                String deviceType = scanner.next();
                itemsFiltered = Warehouse.searchByDeviceType(itemsFiltered, deviceType);
                filter(itemsFiltered);
                break;
            case 2:
                System.out.println("Inserire il modello del dispositivo");
                String deviceModel = scanner.next();
                itemsFiltered = Warehouse.searchByModel(itemsFiltered, deviceModel);
                filter(itemsFiltered);
                break;
            case 3:
                System.out.println("Inserire il produttore del dispositivo");
                String manufacturer = scanner.next();
                itemsFiltered = Warehouse.searchByManufacturer(itemsFiltered, manufacturer);
                filter(itemsFiltered);
                break;
            case 4:
                System.out.println("Inserire il prezzo del dispositivo");
                float sellingPrice = inputFloat();
                itemsFiltered = Warehouse.searchByPrice(itemsFiltered, sellingPrice);
                filter(itemsFiltered);
                break;
            case 5:
                System.out.println("Inserire la soglia minima del range di prezzo");
                float minBound = inputFloat();
                System.out.println("Inserire la soglia massima del range di prezzo");
                float maxBound = inputFloat();
                itemsFiltered = Warehouse.searchByPriceRange(itemsFiltered, minBound, maxBound);
                filter(itemsFiltered);
                break;
            case 6:

                if (itemsFiltered.isEmpty()) {
                    System.err.println("Non è stato trovato nulla con questo metodo di ricerca");
                    menuCatalogue();
                } else {
                    if (itemsFiltered.size() == 1) {

                        for (Item item : itemsFiltered) {
                            item.printCharacteristicsForCustomer();
                        }
                        System.out.println("""
                                Vuoi aggiungere al carrello?
                                1) Si
                                2) Torna indietro""");
                        switch (inputInt()) {
                            case 1:
                                addItemToCart();
                            case 2:
                                menuCatalogue();
                        }

                    } else {

                        System.out.println();
                        int answerInput;
                        do {
                            System.out.println("Per selezionare un articolo da questa lista digita 1 oppure digita 0 per tornare indietro");
                            answerInput = inputInt();
                            if (answerInput == 1) {
                                addItemToCart();
                            } else if (answerInput == 0) {
                                filter(itemsFiltered);
                            } else {
                                System.err.println("Input errato, riprova. (Digita 'si' o 'no') ");
                            }
                        } while (answerInput != 1 && answerInput != 2);

                    }
                }
                break;
            case 7:
                itemsFiltered.clear();
                System.out.println("Il filtro di ricerca è stato resettato");
                menuCatalogue();
                break;
            case 0:
                menuCatalogue();
                break;
        }
        return itemsFiltered;
    }

    public static Item selectItemById(int id) {
        Item selectedItem = null;
        for (Item item : itemsWarehouse) {
            if (item.getItemId() == id) {
                selectedItem = item;
                selectedItem.printCharacteristicsForCustomer();
                break;
            }
        }
        return selectedItem;
    }

    public static int inputInt() {

        int input = 0;
        boolean correctInput = false;

        while (!correctInput) {
            try {
                input = scanner.nextInt();
                correctInput = true;
            } catch (InputMismatchException e) {
                System.err.println("Valore non valido, riprova.");
                scanner.next();
            }
        }
        return input;
    }

    public static float inputFloat() {

        float input = 0;
        boolean correctInput = false;

        while (!correctInput) {
            try {
                input = scanner.nextFloat();
                correctInput = true;
            } catch (InputMismatchException e) {
                System.err.println("Valore non valido, riprova.");
                scanner.next();
            }
        }
        return input;
    }
  
}
