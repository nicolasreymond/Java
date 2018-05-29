/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animaux;

/**
 *
 * @author loic
 */
public abstract class Animal {

    public int poids;
    public String couleur;
    public String article = "le";
    public String mouvement = "se déplace";
    public String nomSingulier;
    public String cri;

    public void manger() {
        System.out.println("mange");
    }
    
    public void boire() {
        System.out.println("boit");
    }
    
    public void deplacement() {
        System.out.println(groupeNominalMaj() + " " + mouvement);
    }
    
    public String toString() {
        return this.getClass().getName();
    }

    public void crier() {
        System.out.println(groupeNominalMaj() + " " + cri);
    }

    protected String groupeNominalMaj() {
        return ucFirst(article + " " + nomSingulier);
    }

    protected String ucFirst(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

}
