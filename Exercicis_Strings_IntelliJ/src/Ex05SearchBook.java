import java.util.Scanner;

public class Ex05SearchBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] catalogo = {"Los muertos vivientes", "Brevísima historia del tiempo",
            "La clave secreta del universo", "Mi universo", "Patria",
            "De mayor quiero ser feliz", "Empieza por los zapatos"};
        System.out.println("1. Buscar titol exacte / 2. Buscar paraules del titol");
        System.out.print("Opcio: ");
        String opcio = scanner.nextLine();
        System.out.print("Quin llibre busques? ");
        String cerca = scanner.nextLine();
        boolean trobat = false;
        for (int i = 0; i < catalogo.length; i++) {
            if (opcio.equals("1")) {
                if (catalogo[i].equalsIgnoreCase(cerca)) {
                    System.out.println("Llibre trobat: " + catalogo[i]);
                    trobat = true;
                }
            } else if (opcio.equals("2")) {
                if (!cerca.isEmpty() && catalogo[i].toLowerCase().contains(cerca.toLowerCase())) {
                    System.out.println("Llibre trobat: " + catalogo[i]);
                    trobat = true;
                }
            }
        }
        if (!opcio.equals("1") && !opcio.equals("2")) System.out.println("Opcio no valida.");
        else if (!trobat) System.out.println("No s'ha trobat cap llibre.");
    }
}
