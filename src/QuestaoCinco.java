import java.util.Scanner;
public class QuestaoCinco {
    public static void main(String[] args) {
        // Lendo a string do usuário
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palava: ");
        String original = sc.nextLine();
        sc.close();

        // Invertendo a string usando o StringBuilder
        String invertida = new StringBuilder(original).reverse().toString();

        // Imprimindo a string invertida
        System.out.println("String invertida: " + invertida);
    }

    
}
