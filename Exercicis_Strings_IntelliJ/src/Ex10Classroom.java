import java.util.Scanner;

public class Ex10Classroom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] alumnes = {"Paula", "Santiago", "Pascual", "Jorge", "Saul", "Enrique"};
        System.out.println("Alumnes de la classe:");
        mostrar(alumnes); // Tasca 1
        System.out.print("Quina posicio vols canviar? (0-5): ");
        String entrada = scanner.nextLine();
        int posicio;
        try { posicio = Integer.parseInt(entrada); }
        catch (NumberFormatException e) {
            System.out.println("La posicio no es valida.");
            return;
        }
        if (posicio >= 0 && posicio < alumnes.length) {
            System.out.println("Nom actual: " + alumnes[posicio]);
            System.out.print("Nom nou: ");
            alumnes[posicio] = scanner.nextLine();
            mostrar(alumnes); // Tasca 2
        } else System.out.println("Aquesta posicio no existeix.");
    }
    public static void mostrar(String[] alumnes) {
        for (int i = 0; i < alumnes.length; i++) {
            System.out.print(alumnes[i]);
            if (i < alumnes.length - 1) System.out.print(", ");
        }
        System.out.println();
    }
}
