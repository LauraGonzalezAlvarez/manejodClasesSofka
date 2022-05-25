package manejodclasessofka;

import java.util.Date;

/**
 * Representa la clase persona con sus atributos y metodos getter and setter
 *
 * @author Laura Daniela Gonzalez Alvarez
 */
public class Person {

    /**
     * Representa los valores de tipo caracteres el nombre, primer apellido y
     * segundo apellido
     */
    public String name, lastName1, lastName2;
    /**
     * Represena la fecha de nacimiento de la persona
     */
    public Date dateBirth;
    /**
     * Representa la altura de la persona
     */
    public float height;

    /**
     * Representa el constructor de la clase
     *
     * @param name Nombre de la persona
     * @param lastName1 Primer apellido de la persons
     * @param lastName2 Segundo apellido de la persona
     * @param dateBirth Fecha de cumpleaños de la persona
     * @param height Altura de la persona
     */
    public Person(String name, String lastName1, String lastName2, Date dateBirth, float height) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }

    /**
     * Recibe el primer apellido de la persona
     *
     * @param name lo asigna a la variable
     */
    public void SetName(String name) {
        this.lastName1 = name;
    }

    /**
     * Función que solicita el primer apellido de la persona
     *
     * @return Retorna el primer apellido de la persona
     */
    public String getName() {
        return lastName1;

    }

}
