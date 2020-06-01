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
public class Personaje {
    private String nombre;
    private int vida;
    private int daño;

    public Personaje(String nombre, int vida, int daño) {
        this.nombre = nombre;
        this.vida = vida;
        this.daño = daño;
    }
    
    public void atacar(){
        switch (this.nombre){
            case "Guerrero":
                System.out.println("Atacar con espada");
                break;
            case "Arquera":
                System.out.println("Lanzar flechas");
                break;
            case "Mago":
                System.out.println("Lanzar fuego");
                break;
            default:
                System.out.println("Personaje no encontrado");
                break;
        }
    }
    
    
}
