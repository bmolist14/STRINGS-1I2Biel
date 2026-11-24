import java.util.Scanner;

public class ExII05ParaulaLlarga {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String[] paraules = {"casa", "ordinador", "sol", "programacio", "gat"};
        String mesLlarga = paraules[0];
        for (int i = 1; i < paraules.length; i++) {
            if (paraules[i].length() > mesLlarga.length()) mesLlarga = paraules[i];
        }
        System.out.println("Paraules: casa, ordinador, sol, programacio, gat");
        System.out.println("Paraula mes llarga: " + mesLlarga);
        System.out.println("Longitud: " + mesLlarga.length());
    }
}
