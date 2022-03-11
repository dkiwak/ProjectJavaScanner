import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jak masz na imię?  ");
        String name = scanner.nextLine();
        System.out.println("Jak masz na nazwisko?  ");
        String lastname = scanner.nextLine();
        System.out.println("Ile masz lat?  ");
        int age = scanner.nextInt();
    }

}
