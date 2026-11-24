import java.util.Scanner;

public class ExII04IngLy {
    public static void main(String[] args) {
        System.out.print("Escriu una cadena: ");
        Scanner scanner = new Scanner(System.in);
        String cadena = scanner.nextLine();
        if (cadena.length() >= 3) {
            if (cadena.endsWith("ing")) cadena += "ly";
            else cadena += "ing";
        }
        System.out.println("Resultat: " + cadena);
    }
}
