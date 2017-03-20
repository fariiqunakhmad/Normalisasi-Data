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
    double E = 2.718281828;

    public SoftMax(double[][] dataAsal) {
        this.dataAsal = dataAsal;
    }

    public double[][] getDataHasil() {
        double[][] dataHasil = dataAsal;
        ZScore zScore = new ZScore(dataAsal);
        double[] dataMean = zScore.dataMean();
        double[] dataStd = zScore.dataStd();
        for (int i = 0; i < dataAsal.length; i++) {
            for (int j = 0; j < dataAsal[i].length; j++) {
                dataHasil[i][j] = 1 / (1 + Math.pow(E, (-(dataAsal[i][j] - dataMean[j]) / (1 * (dataStd[j] / (2 * 3.14)))))); //1/(1+e^(-(data-mean)/(x*(std/(2*3.14)))))
                // =1/(1+EXP(-((B160-AVERAGE(B$160:B$162))/($V$6*(STDEV(B$160:B$162)/(2*PI()))))))
            }
        }
        return dataHasil;
    }
}
