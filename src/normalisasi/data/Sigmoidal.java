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
public class Sigmoidal {
    double[][] dataAsal;
    double E=2.718281828;

    public Sigmoidal(double[][] dataAsal) {
        this.dataAsal = dataAsal;
    }
    
    public double[][] getDataHasil() {
        double[][] dataHasil = dataAsal;
        ZScore zScore = new ZScore(dataAsal);
        double[][] dataZScore = zScore.getDataHasil();
        for (int i = 0; i < dataAsal.length; i++) {
            for (int j = 0; j < dataAsal[i].length; j++) {
//                dataHasil[i][j] = (1-E^(-dataZScore[i][j]))/(1+E^(-dataZScore[i][j])) ; //(1-e^(-x))/(1+ e^(-x))
            }
        }
        return dataHasil;
    }
}
