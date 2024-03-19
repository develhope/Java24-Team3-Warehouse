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

    public ArrayList<Item> searchById(ArrayList<Item> list, int itemId) {
        ArrayList<Item> filteredList = new ArrayList<>();
        for (Item item : list) {
            if (item.getItemId() == itemId) {
                filteredList.add(item);
            }
        }
        return filteredList;
    }

    public ArrayList<Item> searchByPrice(ArrayList<Item> list, float sellingPrice) {
        ArrayList<Item> filteredList = new ArrayList<>();
        for (Item item : list) {
            if (item.getSellingPrice() == sellingPrice) {
                filteredList.add(item);
            }
        }
        return filteredList;
    }

    public ArrayList<Item> searchByPriceRange(ArrayList<Item> list, float minBound, float maxBound) {
        ArrayList<Item> filteredList = new ArrayList<>();
        for (Item item : list) {
            if (item.getSellingPrice() >= minBound && item.getSellingPrice() <= maxBound) {
                filteredList.add(item);
            }
        }
        return filteredList;
    }

    public ArrayList<Item> searchByCost(ArrayList<Item> list, float buyingCost) {
        ArrayList<Item> filteredList = new ArrayList<>();
        for (Item item : list) {
            if (item.getBuyingCost() == buyingCost) {
                filteredList.add(item);
            }
        }
        return filteredList;
    }

    public ArrayList<Item> searchByCostRange(ArrayList<Item> list, float minBound, float maxBound) {
        ArrayList<Item> filteredList = new ArrayList<>();
        for (Item item : list) {
            if (item.getBuyingCost() >= minBound && item.getBuyingCost() <= maxBound) {
                filteredList.add(item);
            }
        }
        return filteredList;
    }

    public ArrayList<Item> searchByDeviceType(ArrayList<Item> list, String deviceType) {
        ArrayList<Item> filteredList = new ArrayList<>();
        for (Item item : list) {
            if (item.getDeviceType().toString().equalsIgnoreCase(deviceType)) {
                filteredList.add(item);
            }
        }
        return filteredList;
    }

    public ArrayList<Item> searchByManifacturer(ArrayList<Item> list, String manifacturer) {
        ArrayList<Item> filteredList = new ArrayList<>();
        for (Item item : list) {
            if (item.getManifacturer().equalsIgnoreCase(manifacturer)) {
                filteredList.add(item);
            }
        }
        return filteredList;
    }

    public ArrayList<Item> searchByModel(ArrayList<Item> list, String deviceModel) {
        ArrayList<Item> filteredList = new ArrayList<>();
        for (Item item : list) {
            if (item.getDeviceModel().equalsIgnoreCase(deviceModel)) {
                filteredList.add(item);
            }
        }
        return filteredList;
    }

    public ArrayList<Item> getItemsWarehouse() {
        return itemsWarehouse;
    }

    public void setItemsWarehouse(ArrayList<Item> itemsWarehouse) {
        this.itemsWarehouse = itemsWarehouse;
    }

}