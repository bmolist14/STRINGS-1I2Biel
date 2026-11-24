import java.util.Scanner;

public class ExII03PrimersUltims {
    public static void main(String[] args) {
        System.out.print("Escriu una cadena: ");
        Scanner scanner = new Scanner(System.in);
        String cadena = scanner.nextLine();
        String resultat = "";
        if (cadena.length() >= 2) {
            resultat = cadena.substring(0, 2) + cadena.substring(cadena.length() - 2);
        }
        System.out.println("Resultat: '" + resultat + "'");
    }
}
