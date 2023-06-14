import java.util.Scanner;

public class Vacaciones{
 public static void main(String args[]){

	int  clave = 0 ;
	String nombre = "";
	int antiguedad = 0;

	Scanner in = new Scanner( System.in);

	System.out.println("Ingrese Nombres y apellidos: ");
	nombre = in.nextLine();

	System.out.println("Ingrese clave \n 1 = Atención al cliente, \n 2 = Logistica,  \n 3 = Gerencia");
	clave = in.nextInt();
	
	System.out.println("Ingrese antiguedad por anios: ");
	antiguedad = in.nextInt();

	
	//System.out.println("Entrando a Atencion al cliente con "+ nombre + ", " + clave + ", " + antiguedad); 
	if(clave == 1 && antiguedad == 1) {
	    System.out.println(nombre + " usted tene derecho a recibir 6 dias de vacaciones"); 
	} else {
		if ((clave == 1) && ((antiguedad >= 2 ) && (antiguedad <= 6))){
		    System.out.println(nombre + " usted tiene derecho a 14 dias de vacaciones");
		} else {
			 if(clave == 1 && antiguedad > 7){
				System.out.println(nombre + " usted tiene derecho a 20 dias de vacaciones");
			 }
			}
                }

	//System.out.println("Entrando a logistica con "+ nombre + ", " + clave + ", " + antiguedad); 
	if(clave == 2 && antiguedad == 1) {
	    System.out.println(nombre + " usted tene derecho a recibir 7 dias de vacaciones"); 
	} else {
		if ((clave == 2) && ((antiguedad >= 2 ) &&  (antiguedad <= 6))){
		    System.out.println(nombre + " usted tiene derecho a 15 dias de vacaciones");
		} else {
			if(clave == 2 && antiguedad > 7){
				System.out.println(nombre + " usted tiene derecho a 22 dias de vacaciones");
			}
		        }
		}


	//System.out.println("Entrando a Gerencia con "+ nombre + ", " + clave + ", " + antiguedad); 
	if(clave == 3 && antiguedad == 1) {
	    System.out.println(nombre + " usted tene derecho a recibir 10 dias de vacaciones"); 
	} else {
		if ((clave == 3) && ((antiguedad >= 2 ) && (antiguedad <= 6))){
		    System.out.println(nombre + " usted tiene derecho a 20 dias de vacaciones");
		} else {
			if(clave == 3 && antiguedad > 7){
				System.out.println(nombre + " usted tiene derecho a 30 dias de vacaciones");
			}
			}
		}
  }
}
