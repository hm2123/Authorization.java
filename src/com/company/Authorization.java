import java.util.Scanner;

class Authorization {
    public static void main(String [] args) {
        String username, password;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter username");
        username = keyboard.nextLine();
        System.out.println("Enter password");
        password = keyboard.nextLine();
        System.out.println("Hello" + username + ", Welcome to csc200 calss! And your password is " + password);
        keyboard.close();
    }
}
