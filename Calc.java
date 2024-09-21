import java.util.Scanner;

public class Calc{
    static public void main(String[]args){

        Scanner scan = new Scanner(System.in);

        Numero n1 = new Numero();
        Numero n2 = new Numero();
        // Numero resultado = new Numero();
        String opc="S";

        while(opc.equalsIgnoreCase("s")){
            System.out.printf("%nDigite o 1° número: ");
            n1.setValor(scan.nextInt());

            System.out.printf("%nDigite o operador (+, -, *, /): ");
            char operador= scan.next().charAt(0);

            System.out.printf("%nDigite o 2° número: ");
            n2.setValor(scan.nextInt());

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
                    resultado = n1.getValor() / n2.getValor();;
                    break; 
                default:
                    System.out.println("Operador inválido! Digite novamente: ");
                    
                }

            System.out.printf("%.2f %c %.2f = %.2f%n", n1.getValor(), operador, n2.getValor(), resultado);

            System.out.printf("%nDeseja fazer outro cálculo?(S | N): ");
            opc =scan.next();

            System.out.printf("%n--------------------");
        } 

            System.out.printf("%nCalculadora finalizada.%nObrigado! :)");

    }
}