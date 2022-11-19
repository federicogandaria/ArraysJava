//Crear un arreglo de números enteros de 20 posiciones, el cual,
// debe ser llenado con números aleatorios entre 1 y 100; después de haber
// llenado dicho arreglo, se debe volver a recorrer utilizando un ciclo diferente
// al que se usó para llenarse e imprimir los números pares e impares. Ejemplo
//Números pares: 2, 4, 6, 8, 10
//Números impares: 1, 3, 5, 7, 9


public class ArrayEjercicio2 {
    public static void main(String[] args) {

        int numero;
       int numeros[] = new int[20];
        for(int i=0;i<numeros.length;i++){
            numero=(int)(Math.random()*100)+1;
            if(numero == 101){
                numero--;
            }
            numeros[i] = numero;

        }

    for (int i=1; i < numeros.length; i++){

        if(numeros[i] % 2==0){
            System.out.println(numeros[i] +" Es numero par");
        }else {
            System.out.println(numeros[i]+ " Es impar");
        }

    }



    }


}


//      for (int inicio = 1; inicio <= 100 ; inicio++){
//
//            if (inicio % 2 == 0){
//                System.out.println("Número par: "+inicio);
//            }
//        }