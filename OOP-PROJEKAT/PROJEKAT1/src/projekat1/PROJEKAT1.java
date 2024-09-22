package projekat1;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PROJEKAT1 {
    
    
    private static int getBrojRedovaOdKorisnika()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite br redova matrice");
        return s.nextInt();
    
    }
    
     private static int getBrojKolonaOdKorisnika()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite br kolona matrice");
        return s.nextInt();
    
    }

    public static void main(String[] args) throws BadRowIndexException, BadColumnIndexException {
        
        Matrica m1;
       
        int brojRedova = getBrojRedovaOdKorisnika();
        int brojKolona = getBrojKolonaOdKorisnika();
        
        
        while(true){
        
            try{
            
            m1 = new Matrica(brojRedova, brojKolona);
            break;
            
        } catch (BadColumnCountException bcce){
            System.out.println("Broj kolona nije ispravan");
            brojKolona = getBrojKolonaOdKorisnika();
        } catch (BadRowCountException brce){
            System.out.println("Broj redova nije ispravan");
            brojRedova = getBrojRedovaOdKorisnika();
        }
            
     }
        
       m1.unesiVrednosti();
       m1.postaviVrednost();
        
         try (PrintWriter pw = new PrintWriter(new FileWriter("matrica.txt"))) {
            pw.write("Matrica:\n");
            for (int i = 0; i < brojRedova; i++) {
                for (int j = 0; j < brojKolona; j++) {
                    try {
                double vrijednost = m1.get(i, j);
                pw.write(vrijednost + "\t");
            } catch (UnsupportedOperationException e) {
                pw.write("N/A\t");
            }
        }
        pw.write("\n");
    }
    System.out.println("Matrica je spremljena u datoteku 'matrica.txt'.");
    
    double suma = ((MatricaSume) m1).sumaElemenata();
    System.out.println("Suma elemenata matrice: " + suma);
    
        } catch (IOException e) {
            System.out.println("Greška prilikom spremanja u datoteku.");
        }
         
    }
    
}
        
        
    
        
        
   

    

