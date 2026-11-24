import java.util.Scanner;

public class Ex02Substrings {
    public static void main(String[] args) {
        String path = "home/user/index.html";
        int punt = path.lastIndexOf('.');
        int barra = path.lastIndexOf('/');
        System.out.println("Extensio: " + path.substring(punt));
        System.out.println("Nom: " + path.substring(barra + 1, punt));
    }
}
