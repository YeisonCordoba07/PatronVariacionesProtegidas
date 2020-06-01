/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bien;

/**
 *
 * @author YEISON
 */
public class PatronVariacionesProtegidas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Personaje guerrero = new Guerrero(400, 10);
        Personaje arquera = new Arquera(400, 10);
        Personaje mago = new Mago(400, 10);

        guerrero.atacar();
        arquera.atacar();
        mago.atacar();
    }

}
