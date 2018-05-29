/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animaux;

import java.util.Vector;

/**
 *
 * @author loic
 */
public class Animaux {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Vector<Animal> animaux = new Vector<Animal>();
        animaux.add(new Chat());
        animaux.add(new Tigre());
        animaux.add(new Loup());
        animaux.add(new Lion());

        for (Animal a : animaux) {
            a.crier();
            a.deplacement();
        }

    }

}
