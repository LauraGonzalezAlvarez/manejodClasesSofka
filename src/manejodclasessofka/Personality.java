package manejodclasessofka;

/**
 * Representa la clase personalidad con sus atributos y metodos getter and
 * setter
 *
 * @author Laura Daniela Gonzalez Alvarez
 */
public class Personality {

    /**
     * Representa la variable emocionalidad
     */
    public String emotionality;
    /**
     * Representa la calificación de la personalidad de 1 a 10
     */
    private int qualification;
    /**
     * Representa la cedula de la persona que tiene la emocionalidad
     */
    protected int person;

    /**
     * Constructor de la clase
     *
     * @param emotionality Representa la variable emocionalidad
     * @param qualification Representa la calificación de la personalidad de 1 a
     * 10
     * @param person Representa la cedula de la persona que tiene la
     * emocionalidad
     */
    public Personality(String emotionality, int qualification, int person) {
        this.emotionality = emotionality;
        this.qualification = qualification;
        this.person = person;
    }

    /**
     * Funcion que retorna la calificacion de la emocionalidad
     *
     * @param qualification recibe la calificacion de la emocionalidad
     * @return retorna el valor de la calificacion
     */
    private int getQuali(int qualification) {
        return qualification;
    }

    /**
     * Funcion que retorna la cedula de la persona
     *
     * @param person cedula
     * @return cedula de la persona
     */
    protected int getperson(int person) {
        return person;
    }

    /**
     * Funcion que obtiene el valor de la emocionalidad
     *
     * @return la variable emocionalidad
     */
    public String getEmotionality() {
        return emotionality;
    }

    /**
     * Método que asigna el valor de la emocionalidad
     *
     * @param emotionality variable de emocionalidad
     */
    public void setEmotionality(String emotionality) {
        this.emotionality = emotionality;
    }

    /**
     * Funcion que solicita la calificación
     *
     * @return Calificación
     */
    public int getQualification() {
        return qualification;
    }

}
