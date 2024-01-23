import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Calculadora {
    int numero;
    int numerodobro;

    Scanner lerNumero = new Scanner(System.in);
    int numeroDobrado(){
        System.out.println("Infome numero: ");
        numero = lerNumero.nextInt();
        numerodobro = numero*2;
        return numerodobro;
    }
}
