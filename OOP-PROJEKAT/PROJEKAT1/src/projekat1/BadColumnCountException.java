package projekat1;

public class BadColumnCountException extends Exception{
    
    public BadColumnCountException(int unetiBrojKolona){
        super("Br kolona matrice ne moze da bude " + unetiBrojKolona + " vec mora da bude veci od 0.");
    }
}
