public class Main {

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
}
