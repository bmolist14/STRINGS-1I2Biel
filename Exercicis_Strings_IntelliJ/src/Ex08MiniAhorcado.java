import java.util.Scanner;

public class Ex08MiniAhorcado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String paraula = "Forrest Gump";
        String descoberta = "";
        for (int i = 0; i < paraula.length(); i++) {
            if (i == 0 || paraula.charAt(i) == ' ') descoberta += paraula.charAt(i);
            else descoberta += '*';
        }
        System.out.println("Pelicula: " + descoberta); // Tasca 1
        for (int intent = 1; intent <= 3; intent++) { // Tasques 2 i 3
            System.out.print("Intent " + intent + "/3. Escriu una lletra: ");
            String entrada = scanner.nextLine();
            if (entrada.length() != 1) {
                System.out.println("Introdueix nomes una lletra.");
                intent--;
                continue;
            }
            char lletra = Character.toLowerCase(entrada.charAt(0));
            String nou = "";
            for (int i = 0; i < paraula.length(); i++) {
                if (Character.toLowerCase(paraula.charAt(i)) == lletra) nou += paraula.charAt(i);
                else nou += descoberta.charAt(i);
            }
            descoberta = nou;
            System.out.println(descoberta);
            if (!descoberta.contains("*")) {
                System.out.println("Has endevinat la pelicula!");
                return;
            }
        }
        System.out.println("Fi dels 3 intents. La pelicula era: " + paraula);
    }
}
