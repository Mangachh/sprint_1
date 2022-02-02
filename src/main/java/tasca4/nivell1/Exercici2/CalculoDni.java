package tasca4.nivell1.Exercici2;

public class CalculoDni {
    /*Exercici 2. Crea una classe anomenada CalculoDni que 
     * calculi la lletra del DNI en rebre el número com a paràmetre. 
     * Crea una classe jUnit que verifiqui   el seu correcte funcionament,                    
     * parametritzant-la perquè el test rebi un espectre de dades ampli i validi 
     * si el càlcul és correcte per a 10 números de DNI predefinits.*/
    
    private final char[] LETTER_AT_POS = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
            'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };

  
    public char getDniLeter(int number){
        int rest = number % 23;
        return LETTER_AT_POS[rest];
    }
    
}
