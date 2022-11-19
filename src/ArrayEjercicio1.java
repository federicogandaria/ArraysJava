
//Crear un vector de tipo Entero con 5 posiciones, llenarlo con información solicitada al usuario. Después de recoger
// toda la información, se requiere imprimir el índice de cada posición en el arreglo con su valor
// de la siguiente manera:
//[0] = 55
//[1] = 99
//[2] = 11
//[3] = 56
//[4] = 69



import java.util.Scanner;

public class ArrayEjercicio1 {
    public static void main(String[] args) {
        Scanner ingresa = new Scanner(System.in);
       int numeros[] = new int[5];




        System.out.println("Escribe un número: ");
        numeros[0] =  ingresa.nextInt();
        System.out.println("Escribe un número: ");
        numeros[1] =  ingresa.nextInt();
        System.out.println("Escribe un número: ");
        numeros[2] =  ingresa.nextInt();
        System.out.println("Escribe un número: ");
        numeros[3] =  ingresa.nextInt();
        System.out.println("Escribe un número: ");
        numeros[4] =  ingresa.nextInt();

        for (int i = 0; i< numeros.length; i++){



            System.out.println("Número elemento "+ "["+ i +"]" +": "+ numeros[i]);
    }
    }
}
