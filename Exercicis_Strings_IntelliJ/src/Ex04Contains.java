import java.util.Scanner;

public class Ex04Contains {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escriu un text: ");
        String text = scanner.nextLine();
        if (text.isEmpty()) {
            System.out.println("Text buit. Fi de l'exercici.");
            return;
        }
        System.out.print("Paraula que vols buscar: ");
        String paraula = scanner.nextLine();
        if (text.contains(paraula)) System.out.println("Paraula trobada.");
        else System.out.println("Paraula no trobada.");
    }
}
