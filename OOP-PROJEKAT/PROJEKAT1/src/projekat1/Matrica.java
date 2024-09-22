package projekat1;

import java.util.Scanner;

public class Matrica implements MatricaSume{
    private double [][] podaci;
    
    public Matrica(int brRedova, int brKolona) throws BadRowCountException,BadColumnCountException
    {
        if(brRedova < 1)
        {
            throw new BadRowCountException(brRedova);
        }
        
        if(brKolona < 1)
        {
            throw new BadColumnCountException(brKolona);
        }
       
            this.podaci = new double[brRedova][brKolona];
    }
    
     public void unesiVrednosti() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < podaci.length; i++) {
            for (int j = 0; j < podaci[i].length; j++) {
                System.out.print("Unesite vrednost za element (" + i + ", " + j + "): ");
                podaci[i][j] = scanner.nextDouble();
            }
        }
    }

   public void postaviVrednost() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite red za postavljanje vrednosti: ");
        int red = scanner.nextInt();
        System.out.print("Unesite kolonu za postavljanje vrednosti: ");
        int kolona = scanner.nextInt();
        System.out.print("Unesite vrednost: ");
        double vrednost = scanner.nextDouble();

        if (red >= 0 && red < podaci.length && kolona >= 0 && kolona < podaci[0].length) {
            podaci[red][kolona] = vrednost;
            System.out.println("Vrednost je postavljena.");
        } else {
            System.out.println("Netačan red ili kolona.");
        }
    }

    @Override
    public double sumaElemenata() {
        double suma = 0;
        for (int i = 0; i < podaci.length; i++) {
            for (int j = 0; j < podaci[i].length; j++) {
                suma += podaci[i][j];
            }
        }
        return suma;   
    }

    
    double get(int i, int j) throws BadRowIndexException, BadColumnIndexException {
        if (i < 0 || i >= podaci.length) {
            throw new BadRowIndexException(i, podaci.length - 1);
        }

        if (j < 0 || j >= podaci[i].length) {
            throw new BadColumnIndexException(j, podaci[i].length - 1);
        }

        return podaci[i][j];
    }  

}

   


   
    
     

