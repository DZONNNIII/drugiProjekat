package projekat1;

public class BadRowCountException extends Exception{
    
     public BadRowCountException(int unetiBrojRedova) {
        super("Br redova matrice ne moze da bude " + unetiBrojRedova + " vec mora da bude veci od 0.");
        
    }
    
}
