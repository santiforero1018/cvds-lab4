package hangman.model;

public class OriginalScore implements GameScore {
    /**
     * calculo del puntaje de manera original, se dictan las siguientes
     * condiciones:
     * @pre Se inicia con 100 puntos
     * @pre No se bonifican las letras correctas 
     * @pos Se penaliza con 10 puntos con cada letra incorrecta
     * @pre El puntaje minimo es 0 
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
