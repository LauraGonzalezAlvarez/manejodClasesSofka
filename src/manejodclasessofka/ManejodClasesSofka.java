/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manejodclasessofka;

/**
 * Main principal de la clase
 * @author Laura Daniela Gonzalez Alvarez
 */
public class ManejodClasesSofka {

     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       BankAccount bankaccount = new BankAccount(1022222,false);        
        bankaccount.setActived(true);
        boolean acti =bankaccount.getActived();
    }
    
}
