package manejodclasessofka;

/**
 * Representa la clase Cuenta Bancaria con sus atributos y metodos getter and
 * setter
 *
 * @author Laura Daniela Gonzalez Alvarez
 */
public class BankAccount {

    /**
     * Representa el numero de la cuenta
     */
    private int accountNumber;
    /**
     * Representa la activacion de la cuenta
     */
    protected boolean activated;

    /**
     * Representa el constructor de la clase
     *
     * @param accountNumber Numero de la cuenta bancaria
     * @param activated Si la cuenta esta activada o desactivada
     */
    public BankAccount(int accountNumber, boolean activated) {
        this.accountNumber = accountNumber;
        this.activated = activated;
    }

    /**
     * Programa que recibe como parametro actived para asignar su valor
     *
     * @param actived Si la cuenta esta activada o desactivada
     */
    public void setActived(boolean actived) {
        this.activated = actived;
        System.out.println("La cuenta esta:" + actived);
    }

    /**
     * Función que solicita el valor de activated
     *
     * @return Si la cuenta esta activa o no
     */
    public boolean getActived() {
        return activated;
    }

}
