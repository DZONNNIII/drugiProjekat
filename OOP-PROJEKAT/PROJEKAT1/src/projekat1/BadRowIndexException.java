package projekat1;

public class BadRowIndexException extends Exception{
    
    public BadRowIndexException(int unetiBrojRedova, int najveciIndeksReda){
        super("Matrica nema red na indeksu " + unetiBrojRedova + ", najveci indeks reda je " + najveciIndeksReda);
    }
    
}
