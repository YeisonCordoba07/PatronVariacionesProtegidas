/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mal;

/**
 *
 * @author YEISON
 */
public class JugarMal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Personaje guerrero = new Personaje("Guerrero", 400, 10);
        Personaje arquera = new Personaje("Arquera", 200, 7);
        Personaje mago = new Personaje("Mago", 325, 15);
        
        guerrero.atacar();
        arquera.atacar();
        mago.atacar();
    }
    
}
