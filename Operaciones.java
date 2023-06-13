public class Operaciones{
  public static void main(String args[]){
 
   int operacion = 4;
   int numeroUno = 1;
   int numeroDos = 0;
   int resultado= 0;

   if(operacion  == 1){
      resultado = numeroUno + numeroDos;
   } else {
            if(operacion == 2) {
    	      resultado = numeroUno - numeroDos;
            } else {
                     if(operacion == 3) {
                        resultado = numeroUno * numeroDos;
                     } else {
                              if(operacion == 4 && numeroDos > 0){
                                 resultado = numeroUno / numeroDos;
                              } else {
                                    System.out.println("Error division por cero");
                                   }
                            }
                    }
          }
  System.out.println("El resultado de la operacion es: " + resultado);
 }
}