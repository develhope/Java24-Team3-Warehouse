import java.util.ArrayList;

public class Warehouse {

    private ArrayList<Item> itemsWarehouse;

    public Warehouse(ArrayList<Item> itemsWarehouse) {
        this.itemsWarehouse = itemsWarehouse;
    }

    public void addItem(Item item) {
        itemsWarehouse.add(item);
    }

    public void removeItem(Item item) {
        itemsWarehouse.remove(item);
    }

    public void removeItemById(ArrayList<Item> items, int itemId) {
        items.removeIf(item -> item.getItemId() == itemId);
    }

    public void showWarehouse() {
        for (Item item : itemsWarehouse) {
            System.out.println(item);
        }
    }

    public static Item searchById(ArrayList<Item> list, int itemId) {
        Item selectedItem = null;
        boolean isArticleAvailable = false;
        for (Item item : list) {
            if (item.getItemId() == itemId) {
                isArticleAvailable = true;
                selectedItem = item;

            }
        }
        if (!isArticleAvailable) {
            System.out.println("Nessun articolo trovato con questo parametro di ricerca");
            Main.filter(list);
        }

        System.out.println("Articoli trovati col parametro di ricerca selezionato");
        selectedItem.printCharacteristicsForCustomer();
        return selectedItem;
    }

    public static ArrayList<Item> searchByPrice(ArrayList<Item> list, float sellingPrice) {
        ArrayList<Item> filteredList = new ArrayList<>();
        boolean isArticleAvailable = false;
        for (Item item : list) {
            if (item.getSellingPrice() == sellingPrice) {
                isArticleAvailable = true;
                filteredList.add(item);
            }
        }
        if (!isArticleAvailable) {
            System.out.println("Nessun articolo trovato con questo parametro di ricerca.");
            Main.filter(list);
        }

        System.out.println("Articoli trovati col parametro di ricerca selezionato");
        Item.shortPrint(filteredList);
        return filteredList;
    }

    public static ArrayList<Item> searchByPriceRange(ArrayList<Item> list, float minBound, float maxBound) {
        ArrayList<Item> filteredList = new ArrayList<>();
        boolean isArticleAvailable = false;
        for (Item item : list) {
            if (item.getSellingPrice() >= minBound && item.getSellingPrice() <= maxBound) {
                isArticleAvailable = true;
                filteredList.add(item);
            }
        }
        if (!isArticleAvailable) {
            System.out.println("Nessun articolo trovato con questo parametro di ricerca.");
            Main.filter(list);
        }

        System.out.println("Articoli trovati col parametro di ricerca selezionato");
        Item.shortPrint(filteredList);
        return filteredList;
    }

    public static ArrayList<Item> searchByCost(ArrayList<Item> list, float buyingCost) {
        ArrayList<Item> filteredList = new ArrayList<>();
        boolean isArticleAvailable = false;
        for (Item item : list) {
            if (item.getBuyingCost() == buyingCost) {
                isArticleAvailable = true;
                filteredList.add(item);
            }
        }
        if (!isArticleAvailable) {
            System.out.println("Nessun articolo trovato con questo parametro di ricerca.");
            Main.filter(list);
        }

        System.out.println("Articoli trovati col parametro di ricerca selezionato");
        Item.shortPrint(filteredList);
        return filteredList;
    }

    public static ArrayList<Item> searchByCostRange(ArrayList<Item> list, float minBound, float maxBound) {
        ArrayList<Item> filteredList = new ArrayList<>();
        boolean isArticleAvailable = false;
        for (Item item : list) {
            if (item.getBuyingCost() >= minBound && item.getBuyingCost() <= maxBound) {
                isArticleAvailable = true;
                filteredList.add(item);
            }
        }
        if (!isArticleAvailable) {
            System.out.println("Nessun articolo trovato con questo parametro di ricerca.");
            Main.filter(list);
        }

        System.out.println("Articoli trovati col parametro di ricerca selezionato");
        Item.shortPrint(filteredList);
        return filteredList;
    }

    public static ArrayList<Item> searchByDeviceType(ArrayList<Item> list, String deviceType) {
        ArrayList<Item> filteredList = new ArrayList<>();
        boolean isArticleAvailable = false;
        for (Item item : list) {
            if (item.getDeviceType().toString().equalsIgnoreCase(deviceType)) {
                isArticleAvailable = true;
                filteredList.add(item);
            }
        }
        if (!isArticleAvailable) {
            System.out.println("Nessun articolo trovato con questo parametro di ricerca.");
            Main.filter(list);
        }

        System.out.println("Articoli trovati col parametro di ricerca selezionato");
        Item.shortPrint(filteredList);
        return filteredList;
    }

    public static ArrayList<Item> searchByManufacturer(ArrayList<Item> list, String manufacturer) {
        ArrayList<Item> filteredList = new ArrayList<>();
        boolean isArticleAvailable = false;
        for (Item item : list) {
            if (item.getManufacturer().equalsIgnoreCase(manufacturer)) {
                isArticleAvailable = true;
                filteredList.add(item);
            }
        }
        if (!isArticleAvailable) {
            System.out.println("Nessun articolo trovato con questo parametro di ricerca.");
            Main.filter(list);
        }

        System.out.println("Articoli trovati col parametro di ricerca selezionato");
        Item.shortPrint(filteredList);
        return filteredList;
    }

    public static ArrayList<Item> searchByModel(ArrayList<Item> list, String deviceModel) {
        ArrayList<Item> filteredList = new ArrayList<>();
        boolean isArticleAvailable = false;
        for (Item item : list) {
            if (item.getDeviceModel().equalsIgnoreCase(deviceModel)) {
                isArticleAvailable = true;
                filteredList.add(item);
            }
        }
        if (!isArticleAvailable) {
            System.out.println("Nessun articolo trovato con questo parametro di ricerca.");
            Main.filter(list);
        }

        System.out.println("Articoli trovati col parametro di ricerca selezionato");
        Item.shortPrint(filteredList);
        return filteredList;
    }

    public ArrayList<Item> getItemsWarehouse() {
        return itemsWarehouse;
    }

    public void setItemsWarehouse(ArrayList<Item> itemsWarehouse) {
        this.itemsWarehouse = itemsWarehouse;
    }

}