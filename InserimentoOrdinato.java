import java.util.Scanner;
public class InserimentoOrdinato{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        String [] stringa = new String [100];
        String attuale;
        boolean fine =false;
        do{
            System.out.println("Inserisci una stringa");
            attuale=in.next();
            if(attuale.equalsIgnoreCase("fine")){
                fine=true;
            }
            else{
                
            }
        }while(fine=false);
    }
}