import java.util.Scanner;

public class IngresaDatos{

public static void main(String args[]){
   
	Scanner in = new Scanner(System.in);
	int numeroUno = 0;
	int numeroDos = 0;
	int resultado = 0;
	String nombreUno="";
	String nombreDos="";
	int diferenciaEdades= 0;


	System.out.println("Ingrese nombre primera persona: ");
	nombreUno = in.nextLine();

	

	
	System.out.println("Ingrese nombre Segunda persona: ");
	nombreDos = in.nextLine();

	System.out.println("Ingrese Edad primera persona: ");
	numeroUno = in.nextInt();

	System.out.println("Ingrese Edad Segunda persona: ");
	numeroDos = in.nextInt();

	if(numeroUno > numeroDos){
  		diferenciaEdades = numeroUno - numeroDos;
		System.out.println("\n" + nombreUno + " es mayor que " + nombreDos + " por " + diferenciaEdades + " anyos");
	} else {
		if(numeroDos > numeroUno){
			diferenciaEdades = numeroDos - numeroUno;
			System.out.println("\n" + nombreDos + " es mayor que " + nombreUno + " por " + diferenciaEdades + " anyos");
		  } else {
			System.out.println("\n" + nombreUno + " tiene la misma edad que " + nombreDos );
			 }
		}
 }
}