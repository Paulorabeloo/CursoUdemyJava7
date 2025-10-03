import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int soma = 0;

        for (int i=0; i<N; i++) {
            int x = sc.nextInt();
            soma = soma + x;
        }

        System.out.println(soma);

        for (int y=0; y<5; y++){
            System.out.println("Valor de y: " + y);
        }

        for (int z=5; z>=0; z--){
            System.out.println("Valor de z: " + z);
        }

        sc.close();
    }
}