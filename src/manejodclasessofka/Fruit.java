package manejodclasessofka;

import java.util.ArrayList;

/**
 * Representa la clase Fruta con sus atributos y metodos getter and setter
 *
 * @author Laura Daniela Gonzalez Alvarez
 */
public class Fruit {

    /**
     * Representa la variable nombre de la fruta
     */
    public String name;
    /**
     * Representa la variable peso promedio
     */
    private float averageWeigth;
    /**
     * Representa el arreglo de colores
     */
    public ArrayList<String> colors;

    /**
     * Constructor de la clase
     *
     * @param name Representa el nombre de la fruta
     * @param averageWeigth Representa el peso promedio de la fruta
     * @param colors Representa los colores de la fruta
     */
    public Fruit(String name, float averageWeigth, ArrayList<String> colors) {
        this.name = name;
        this.averageWeigth = averageWeigth;
        this.colors = colors;
    }

    /**
     * Método que asigna el nombre de la fruta
     *
     * @param name Nombre de la fruta
     */
    public void setColor(String name) {
        this.name = name;
    }

    /**
     * Función que retorna el color de la fruta
     *
     * @return Color de la fruta
     */
    public ArrayList getColors() {
        return colors;
    }
}
