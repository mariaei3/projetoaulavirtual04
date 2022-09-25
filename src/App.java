import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota 01: ");
        int n1 = sc.nextInt();

        System.out.println("Digite a nota 02: ");
        int n2 = sc.nextInt();

        System.out.println("Digite a nota 03: ");
        int n3 = sc.nextInt();

        System.out.println("Digite a nota 04: ");
        int n4 = sc.nextInt();

        int media = (n1 + n2 + n3 + n4) / 4;

        System.out.println("A sua média bimestral é: " + media);

    }
}
