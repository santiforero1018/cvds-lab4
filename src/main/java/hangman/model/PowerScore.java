package hangman.model;

public class PowerScore implements GameScore {
    /**
     * @pre El juego inicia en 0
     * @pos la i-ésima letra correcta se bonifica con 5^i.
     * @pos se penaliza con 8 puntos cada letra incorrecta
     * @pre el puntaje minimo es 0
     * @pre si con las reglas anterios sobrepasa 500 puntos,
     * el puntaje es 500
     * 
     * 
     * @param count
     * @param incorrectCount
     * 
     * @throws     
     */
    public int calculateScore(int count, int incorrectCount){
        return 0;
    }
}
