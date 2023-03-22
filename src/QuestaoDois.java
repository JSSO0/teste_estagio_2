import java.util.Scanner;

public class QuestaoDois {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        //receber o valor
        System.out.print("Digite um número: ");
        int num = input.nextInt();
        //retorna a classe isFibonacci que valida se o número pertence ao while
        if (isFibonacci(num)) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean isFibonacci(int num) {
        //declara os primeiro números do fibonacci
        int fib1 = 0;
        int fib2 = 1;
        int fib_atual = 0;
        //com o fib_atual vazio
        //no while será somado o anterior, na primeira execuçaõ e na segunda será somado com o anterior, até o while ser invalido
        while (fib_atual < num) {
            fib_atual = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib_atual;
        }

        return fib_atual == num;

    }
}
