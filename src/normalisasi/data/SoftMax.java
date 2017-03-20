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
public class SoftMax {
    double[][] dataAsal;

    public SoftMax(double[][] dataAsal) {
        this.dataAsal = dataAsal;
    }
    
    public double[][] getDataHasil() {
        double[][] dataHasil = dataAsal;
        for (int i = 0; i < dataAsal.length; i++) {
            for (int j = 0; j < dataAsal[i].length; j++) {
//                dataHasil[i][j] = (dataAsal[i][j] - newMin) ; //1/(1+e^(-(data-mean)/(x*(std/(2*3.14)))))
            }
        }
        return dataHasil;
    }
}
