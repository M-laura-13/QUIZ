import java.util.Scanner;

public class Validacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el numero donde inicia el rango ");
        int num1 = scanner.nextInt();
        System.out.println("ingrese el numero donde termina el rango");
        int num2 = scanner.nextInt();

        int contador = 0;

        for(int i=num1;i<=num2;i++){
            if (i%2==0){
                contador++;
            }
        }

        System.out.println("los numeros divisores dentro del rando de "+num1 + " y " +num2+" de "+" son "+ contador );
        scanner.close();
    }
}
