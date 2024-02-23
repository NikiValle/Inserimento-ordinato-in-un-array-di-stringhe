import java.util.Scanner;
public class InserimentoOrdinato{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        String [] stringa = new String [100];
        String attuale;
        boolean fine =false;
        int lung =0;
        do{
            System.out.println("Inserisci una stringa");
            attuale=in.next();
            if(attuale.equalsIgnoreCase("fine")){
                fine=true;
            }
            else {
                for (int j = 0; j < lung; j++) {
                    for (int i = 0; i < attuale.length(); i++) {
                        if (attuale.charAt(i) > stringa[j].charAt(i)){
                            
                        }
                    }
                }
            }
            lung=lung+1;
        }while(fine=false);
    }
}