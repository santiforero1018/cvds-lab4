package hangman.model;

public class BonusScore implements GameScore {
    /**
     * @pre El juego inicia en 0
     * @pos Se bonifica con 10 puntos cada letra correcta
     * @pos se penaliza con 5 puntos cada letra incorrecta
     * @pre el puntaje minimo es 0
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
