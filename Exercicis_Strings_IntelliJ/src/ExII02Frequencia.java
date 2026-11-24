import java.util.Scanner;

public class ExII02Frequencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escriu una cadena (exemple: google.com): ");
        String cadena = scanner.nextLine();
        System.out.print("{");
        boolean primer = true;
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (cadena.indexOf(caracter) == i) { // Comptar cada caracter una sola vegada
                int vegades = 0;
                for (int j = 0; j < cadena.length(); j++) {
                    if (cadena.charAt(j) == caracter) vegades++;
                }
                if (!primer) System.out.print(", ");
                System.out.print("'" + caracter + "': " + vegades);
                primer = false;
            }
        }
        System.out.println("}");
    }
}
