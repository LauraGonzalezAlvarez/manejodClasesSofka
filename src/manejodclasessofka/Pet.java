package manejodclasessofka;

/**
 * Representa la clase Mascota con sus atributos y metodos getter and setter
 *
 * @author Laura Daniela Gonzalez Alvarez
 */
public class Pet {

    /**
     * Variable que almacena el nombre de la mascota
     */
    public String name;
    /**
     * Variable que almaceda la edad de la mascota
     */
    private int age;
    /**
     * Variable que almacena la cedula del dueño de la mascota
     */
    protected int owner;

    /**
     * Constructor de la clase
     *
     * @param name Variable que almacena el nombre de la mascota
     * @param age Variable que almaceda la edad de la mascota
     * @param owner Variable que almacena la cedula del dueño de la mascota
     */
    public Pet(String name, int age, int owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    /**
     * Función que solicita el valor de la variable edad
     *
     * @param age Variable que almaceda la edad de la mascota
     * @return la edad de la mascota
     */
    private int getAge(int age) {
        return age;
    }

    /**
     * Función que solicita la cedula del dueño de la mascota
     *
     * @param owner cedula del dueño de la mascota
     * @return cedula
     */
    protected int getowner(int owner) {
        return owner;
    }

}

