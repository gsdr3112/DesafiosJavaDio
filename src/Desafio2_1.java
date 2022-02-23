import java.io.IOException;
import java.util.Scanner;

public class Desafio2_1 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        //Escreva aqui a sua lógica


        System.out.printf("%.2f%%", (B/A-1)*100);
    }

}