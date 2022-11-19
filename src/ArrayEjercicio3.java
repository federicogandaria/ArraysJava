//Imprimir los números primos del 1 al 1000, el resultado debe ser buscado de forma matemática.


public class ArrayEjercicio3 {
    public static void main(String[] args) {

        for (int i = 1; i<1000; i++){
            int cont = 0;


            for(int j=1; j<= i; j++){
                if(i % j == 0){
                    cont++;
                }
            }
            if(cont == 2){
                System.out.println(i);
            }
        }
    }

}

//Cuando aumenta la i hacemos i % j , comt 2 porque debe ser divisible por si mismo y por 1