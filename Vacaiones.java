import java.util.Scanner;

public class Vacaciones{
 public static void main(String args[]{

	String clave = "";
	String nombre = "";
	int antiguedad = 0;

	Scanner in = new Scanner( System.in);

	System.out.println("Ingrese Nombres y apellidos: ");
	nombre = in.nextLine();

	System.out.println("Ingrese clave \n Clave 1 = Atención al cliente, \n Clave 2 = Logistica,  \n Clave 3 = Gerencia");
	clave = in.nextLine();
	
	System.out.println("Ingrese antiguedad por anios: ");
	antiguedad = in.nextLine();


	if((clave == "Clave 1") && (antiguedad == 1)) {
	    System.out.println(nombre + " usted tene derecho a recibir 6 dias de vacaciones"); 
	} else {
		if ((clave == "Clave 1") && ((antiguedad >= 2 )|| (antiguedad <= 6))){
		    System.out.println(nombre + " usted tiene derecho a 14 dias de vacaciones");
		} else {
			if((clave = "Clave 1") && (antiguedad > 7)){
				System.out.println(nombre + " usted tiene derecho a 20 dias de vacaciones");
			}
		}



	if((clave == "Clave 2") && (antiguedad == 1)) {
	    System.out.println(nombre + " usted tene derecho a recibir 7 dias de vacaciones"); 
	} else {
		if ((clave == "Clave 2") && ((antiguedad >= 2 )|| (antiguedad <= 6))){
		    System.out.println(nombre + " usted tiene derecho a 15 dias de vacaciones");
		} else {
			if((clave = "Clave 2") && (antiguedad > 7)){
				System.out.println(nombre + " usted tiene derecho a 22 dias de vacaciones");
			}
		}



	if((clave == "Clave 3") && (antiguedad == 1)) {
	    System.out.println(nombre + " usted tene derecho a recibir 10 dias de vacaciones"); 
	} else {
		if ((clave == "Clave 3") && ((antiguedad >= 2 )|| (antiguedad <= 6))){
		    System.out.println(nombre + " usted tiene derecho a 20 dias de vacaciones");
		} else {
			if((clave = "Clave 3") && (antiguedad > 7)){
				System.out.println(nombre + " usted tiene derecho a 30 dias de vacaciones");
			}
		}




   

 }
}