import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Login {
    private Customer customer;
    private Staff staff;

    public Login(Customer customer, Staff staff) {
        this.customer = customer;
        this.staff = staff;
    }

    public static String readString() {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader inputReader = new BufferedReader(input);
        try {
            return inputReader.readLine();
        } catch (IOException e) {
            System.err.println("Error while reading user input");
            return "";
        }
    }

    public void runLogin(){
        while(true){
            System.out.println("Welcome, please insert username and password");
            String username = readString();
            String password = readString();
            if(username.equals(customer.getUsername()) && password.equals(customer.getPassword())){
                System.out.println("Welcome customer, you are logged in");
                //menuCustomer();
                break;
            } else if (username.equals(staff.getUsername()) && password.equals(staff.getPassword())){
                System.out.println("Welcome staff, you are logged in");
                //menuStaff();
                break;
            } else {
                System.out.println("username or password not valid, try again");
            }

        }
    }


}
