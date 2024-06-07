import java.util.Scanner;

class Myclass {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter your name: ");

        String username = obj.nextLine();

        System.out.println("username is: " + username);
    }
}