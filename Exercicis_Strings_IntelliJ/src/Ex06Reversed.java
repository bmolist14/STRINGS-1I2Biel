import java.util.Scanner;

public class Ex06Reversed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdueix un text: ");
        String text = scanner.nextLine();
        String invertit = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            invertit = invertit + text.charAt(i);
        }
        System.out.println("Text invertit: " + invertit);
    }
}
