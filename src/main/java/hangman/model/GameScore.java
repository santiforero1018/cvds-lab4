package hangman.model;

public interface GameScore {
    /**
     * calcula el puntaje del juego 
     * 
     * 
     * @param count puntaje a sumar por acertar una letra
     * @param incorrectCount puntaje a restar por errar una letra
     * @throws
     */
    public int calculateScore(int count, int incorrectCount);
}
