package manejodclasessofka;

/**
 * Representa la clase Vegetal con sus atributos y metodos getter and setter
 *
 * @author Laura Daniela Gonzalez Alvarez
 */
public class Vegetable {

    /**
     * Representa el color del vegetal
     */
    public String colour;
    /**
     * Representa el sabor del vegetal
     */
    private String flavor;
    /**
     * Representa la cantidad de vegetales
     */
    protected int amount;

    /**
     * Constructor de la clase
     *
     * @param colour Representa el color del vegetal
     * @param flavor Representa el sabor del vegetal
     * @param amount Representa la cantidad de vegetales
     */
    public Vegetable(String colour, String flavor, int amount) {
        this.colour = colour;
        this.flavor = flavor;
        this.amount = amount;
    }

    /**
     * Método que recibe el sabor de la fruta
     *
     * @param flavor Asigna el sabor de la fruta
     */
    private void flavor(String flavor) {
        this.flavor = flavor;
    }

    /**
     * Método que asigna la cantidad de vegetales
     *
     * @param amount cantidad de vegetales
     */
    protected void amount(int amount) {
        this.amount = amount;
    }

    /**
     * Función que pide el color del vegetal
     *
     * @return retorna el color
     */
    public String getColour() {
        return colour;
    }

}

