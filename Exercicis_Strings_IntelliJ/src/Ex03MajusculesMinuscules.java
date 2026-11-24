import java.util.Scanner;

public class Ex03MajusculesMinuscules {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escriu un text: ");
        String text = scanner.nextLine();
        System.out.println("Majuscules: " + text.toUpperCase());
        System.out.println("Minuscules: " + text.toLowerCase());
    }
}
