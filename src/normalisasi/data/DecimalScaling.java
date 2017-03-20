/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package normalisasi.data;

/**
 *
 * @author Afa
 */
public class DecimalScaling {
    double[][] dataAsal;
    int i;

    public DecimalScaling(double[][] dataAsal) {
        this.dataAsal = dataAsal;
    }

    public DecimalScaling(double[][] dataAsal, int i) {
        this.dataAsal = dataAsal;
        this.i = i;
    }
    public double[][] getDataHasil() {
        double[][] dataHasil = dataAsal;
        for (int i = 0; i < dataAsal.length; i++) {
            for (int j = 0; j < dataAsal[i].length; j++) {
                //dataHasil[i][j] = (dataAsal[i][j] - 10^i) ; //data / 10^i
            }
        }
        return dataHasil;
    }
}
