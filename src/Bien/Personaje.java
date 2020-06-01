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
public abstract class Personaje {
    protected int vida;
    protected int daño;

    public Personaje(int vida, int daño) {
        this.vida = vida;
        this.daño = daño;
    }
    
    public abstract void atacar();
}
