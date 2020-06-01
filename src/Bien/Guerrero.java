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
public class Guerrero extends Personaje{

    public Guerrero(int vida, int daño) {
        super(vida, daño);
    }
    
    @Override
    public void atacar(){
        System.out.println("Atacando con espada");
    }
}
