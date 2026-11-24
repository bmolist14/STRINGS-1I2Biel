import java.util.Scanner;

public class ExII01Longitud {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escriu una cadena: ");
        String cadena = scanner.nextLine();
        System.out.println("Longitud: " + cadena.length());
    }
}
