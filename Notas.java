public class Notas {
  public static void main (String args[]){
    int notaMatematicas = 5;
    int notaBiologia = 2;
    int notaQuimica = 7;
    int notaFinal= 0;

    notaFinal = (notaMatematicas + notaBiologia + notaQuimica)/3;

    if(notaFinal >= 6)
      {
         System.out.println("\n Aprobo, la nota final fue de: " + notaFinal);
      }
    else
      {
         System.out.println(" \n Usted Reprobo. Su nota final es de:" + notaFinal +"\n");
      }
 }
}
