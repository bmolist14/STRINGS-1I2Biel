import java.util.Scanner;

public class Ex07Question {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quina d'aquestes opcions NO es un tipus primitiu de Java?");
        System.out.println("a. int");
        System.out.println("b. char");
        System.out.println("c. boolean");
        System.out.println("d. String");
        System.out.print("Resposta (a, b, c, d): ");
        String resposta = scanner.nextLine().toLowerCase();
        if (!resposta.equals("a") && !resposta.equals("b") && !resposta.equals("c") && !resposta.equals("d")) {
            System.out.println("Resposta no valida: a, b, c o d.");
        } else if (resposta.equals("d")) {
            System.out.println("Resposta correcta!");
        } else {
            System.out.println("Resposta incorrecta. La correcta es d.");
        }
    }
}
