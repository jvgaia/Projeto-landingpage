import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma string: ");
        String string = scanner.nextLine();  // lê a string digitada pelo usuário
        
        int tamanho = string.length();  // tamanho da string
        
        // converte a string para um array de caracteres
        char[] caracteres = string.toCharArray();
        
        // inverte os caracteres do array
        for (int i = 0; i < tamanho / 2; i++) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[tamanho - i - 1];
            caracteres[tamanho - i - 1] = temp;
        }
        
        // cria uma nova string a partir do array de caracteres invertido
        String stringInvertida = new String(caracteres);
        
        System.out.println("String invertida: " + stringInvertida);
        
        scanner.close();
    }
}
