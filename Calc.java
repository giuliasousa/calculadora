import java.util.Scanner;

public class Calc{
    static public void main(String[]args){

        Scanner scan = new Scanner(System.in);

        Numero n1 = new Numero();
        Numero n2 = new Numero();
        String opc="S";

        while(opc.equalsIgnoreCase("s")){
            System.out.printf("%nDigite o 1° número: ");

            while (!scan.hasNextDouble()) {
                System.out.println("Digite somente números: ");
                scan.next();
            }
            n1.setValor(scan.nextDouble());

            System.out.printf("%nDigite o operador (+, -, *, /): ");
            char operador= scan.next().charAt(0);

            System.out.printf("%nDigite o 2° número: ");

            while (!scan.hasNextDouble()) {
                System.out.println("Digite somente números: ");
                scan.next();
            }
            n2.setValor(scan.nextDouble());



            double resultado = 0;
            switch(operador){
                case '+':
                    resultado = n1.getValor() + n2.getValor();
                    break;
                case '-':
                    resultado = n1.getValor() - n2.getValor();;
                    break;
                case '*':
                    resultado = n1.getValor() * n2.getValor();;
                    break;
                case '/':
                    if (n2.getValor() == 0) {
                        System.out.println("Divisão por zero não é permitida!");
                    } else {
                        resultado = n1.getValor() / n2.getValor();
                    }
                    break; 
                default:
                    System.out.println("Operador inválido! Digite novamente: ");
                    continue;
                }

            System.out.printf("%.2f %c %.2f = %.2f%n", n1.getValor(), operador, n2.getValor(), resultado);

            System.out.printf("%n--------------------");

            System.out.printf("%nDeseja fazer outro cálculo?(S | N): ");
            opc =scan.next();

        } 

            System.out.printf("%nCalculadora finalizada.%nObrigado! :)");

    }
}