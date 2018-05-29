/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frequenceCardiaque;

/**
 *
 * @author nreymond
 */
public class FormuleFC {

    static double[] calculeFC(final boolean etreHomme, final int age, final String but) {
        double minFC;
        double maxFC;
        int FCmax = 0;

        // Assigner une consommation pour chaque appareil
        if (etreHomme) {
            FCmax = 226 - (age);
        } else {
            FCmax = 220 - (age);
        }
        // Selecteur de "Sport"
        switch (but) {
            case "PertePoids":
                minFC = 60 * FCmax / 100;
                maxFC = 70 * FCmax / 100;
                break;
            case "Endurance":
                minFC = 70 * FCmax / 100;
                maxFC = 80 * FCmax / 100;
                break;
            default:
                minFC = 80 * FCmax / 100;
                maxFC = 90 * FCmax / 100;
                break;
        }
        double[] result = {minFC, maxFC};
        return result;
    }

}
