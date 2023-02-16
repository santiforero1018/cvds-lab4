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
        int puntaje = 0;
        if (puntaje+10*count-5*incorrectCount < 0){
            puntaje = 0;
        }
        else {
            puntaje = puntaje+10*count-5*incorrectCount;
        }
        return puntaje;
    }
}
