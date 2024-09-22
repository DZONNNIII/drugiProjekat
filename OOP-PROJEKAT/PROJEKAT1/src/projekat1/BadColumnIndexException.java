package projekat1;

public class BadColumnIndexException extends Exception{
    
    public BadColumnIndexException(int unetiBrojKolone, int najveciIndeksKolone) {
        super("Matrica nema kolonu na indeksu " + unetiBrojKolone + ", najveci indeks kolone je " + najveciIndeksKolone);
    }
    
}
