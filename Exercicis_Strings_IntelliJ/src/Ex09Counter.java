import java.util.Scanner;

public class Ex09Counter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escriu un text acabat en punt: ");
        String text = scanner.nextLine();
        String sensePunt = text;
        if (sensePunt.endsWith(".")) sensePunt = sensePunt.substring(0, sensePunt.length() - 1);
        int paraules = 0;
        if (!sensePunt.trim().isEmpty()) paraules = sensePunt.trim().split(" +").length;
        int vocals = 0;
        String minuscules = text.toLowerCase();
        for (int i = 0; i < minuscules.length(); i++) {
            char c = minuscules.charAt(i);
            if ("aeiouàèéíïòóúü".indexOf(c) >= 0) vocals++;
        }
        System.out.println("Paraules: " + paraules);
        System.out.println("Vocals: " + vocals);
    }
}
