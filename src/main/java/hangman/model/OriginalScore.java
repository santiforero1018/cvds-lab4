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
        int puntaje = 0;
        if (100-10*incorrectCount < 0){
            puntaje = 0;
        }
        else {
            puntaje = 100-10*incorrectCount;;
        }

        return puntaje;
    }
}
