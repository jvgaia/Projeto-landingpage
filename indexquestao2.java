import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        
        // Recebe um número do usuário
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        
        // Verifica se o número pertence à sequência de Fibonacci
        if (isFibonacci(num)) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }
        
    }
    
    // Verifica se um número pertence à sequência de Fibonacci
    public static boolean isFibonacci(int num) {
        int a = 0;
        int b = 1;
        while (b < num) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b == num;
    }
    
}
