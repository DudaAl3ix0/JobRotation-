import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para vereficar se pertence ou não " );
        int numero = sc.nextInt();

        int a = 0;
        int b = 1;
        int c = 0;

        while(c < numero ){
            c = a + b;
            a = b;
            b = c;
        }

        if(c == numero ){
            System.out.println( numero + " pertence á sequência de Fibonacci");
        }else{
            System.out.println(numero + " não pertence á sequência de Fibonacci.");
        }
    }
}
