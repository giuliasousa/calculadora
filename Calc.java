import java.util.Scanner;

public class Calc{
    static public void main(String[]args){

    Scanner scan = new Scanner(System.in);

    Numero n1 = new Numero();
    Numero n2 = new Numero();
    Numero resultado = new Numero();

    System.out.printf("Digite o 1° número: ");
    n1.setValor(scan.nextInt());

    System.out.printf("Digite o 2° número: ");
    n2.setValor(scan.nextInt());

    }
}