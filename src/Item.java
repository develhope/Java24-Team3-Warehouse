import java.util.ArrayList;

public class Item {
    private DeviceType deviceType;
    private String manufacturer;
    private String deviceModel;
    private String itemDescription = "Stiamo aggiornando le descrizione ";
    private float displaySize;
    private float memory;
    private float sellingPrice;
    private float buyingCost;
    private int itemId;
    private int quantityInWarehouse;

    public Item(DeviceType deviceType, String manufacturer, String deviceModel, float displaySize, float memory, float sellingPrice, float buyingCost, int itemId, int quantity) {
        this.deviceType = deviceType;
        this.manufacturer = manufacturer;
        this.deviceModel = deviceModel;
        this.displaySize = displaySize;
        this.memory = memory;
        this.sellingPrice = sellingPrice;
        this.buyingCost = buyingCost;
        this.itemId = itemId;
        this.quantityInWarehouse = quantity;
    }

    public DeviceType getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(DeviceType deviceType) {
        this.deviceType = deviceType;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public float getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(float displaySize) {
        this.displaySize = displaySize;
    }

    public float getMemory() {
        return memory;
    }

    public void setMemory(float memory) {
        this.memory = memory;
    }

    public float getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(float sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public float getBuyingCost() {
        return buyingCost;
    }

    public void setBuyingCost(float buyingCost) {
        this.buyingCost = buyingCost;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getQuantity() {
        return quantityInWarehouse;
    }

    public void setQuantity(int quantity) {
        this.quantityInWarehouse = quantity;
    }


    public void printCharacteristicsForStaff() {
        System.out.println("Caratteristiche tecniche: " +
                "ID: " + itemId + "\n" +
                "Tipo di dispositivo: " + deviceType + "\n" +
                "Modello: " + deviceModel + "\n" +
                "Produttore: " + manufacturer + "\n" +
                "Destrizione: " + itemDescription + "\n" +
                "Dimensione dello schermo: " + displaySize + "\n" +
                "Dimensione della memoria: " + memory + "\n" +
                "Prezzo di Vendita al cliente: " + sellingPrice + "\n" +
                "Prezzo di Acquisto dal produttore: " + buyingCost + "\n" +
                "Quantità nel magazzino: " + quantityInWarehouse + "\n");
    }

    public void printCharacteristicsForCustomer() {
        System.out.println("Caratteristiche tecniche: " +
                "ID: " + itemId + "\n" +
                "Tipo di dispositivo: " + deviceType + "\n" +
                "Modello: " + deviceModel + "\n" +
                "Produttore: " + manufacturer + "\n" +
                "Descrizione: " + itemDescription + "\n" +
                "Dimensione dello schermo: " + displaySize + "\n" +
                "Dimensione della memoria: " + memory + "\n" +
                "Prezzo: " + sellingPrice + "\n" +
                "Quantità nel magazzino: " + quantityInWarehouse + "\n");
    }

    public void shortPrint(ArrayList<Item> items) {
        for (Item item : items) {
            System.out.println(item.itemId + " " + item.deviceType + " " + item.deviceModel + " " + item.manufacturer + " " + item.sellingPrice + " € " + this.quantityInWarehouse );
        }
    }
}

enum DeviceType {
    TABLET,
    SMARTPHONE,
    NOTEBOOK
}