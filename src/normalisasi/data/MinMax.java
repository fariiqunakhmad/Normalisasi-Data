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
public class MinMax {

    double[][] dataAsal;
    double newMin = 0;
    double newMax = 1;

    public MinMax(double[][] dataAsal) {
        this.dataAsal = dataAsal;
    }

    public MinMax(double[][] dataAsal, double newMin, double newMax) {
        this.dataAsal = dataAsal;
        this.newMin = newMin;
        this.newMax = newMax;

    }

    public double[][] getDataHasil() {
        double[][] dataHasil = dataAsal;
        double[] min, max;
        min = dataMin();
        max = dataMax();
        for (int i = 0; i < dataAsal.length; i++) {
            for (int j = 0; j < dataAsal[i].length; j++) {
                dataHasil[i][j] = (dataAsal[i][j] - min[j]) * (newMax - newMin) / (max[j] - min[j]) + newMin; //(data-min)*(newmax-newmin)/(max-min)+newmin
            }
        }
        return dataHasil;
    }

    public double[] dataMin() {
        Matrix matrix = new Matrix(dataAsal);
        double[][] dataBaru = matrix.transpose();
        double[] dataMin = new double[dataBaru.length];
        for (int i = 0; i < dataBaru.length; i++) {
            Statistics s = new Statistics(dataBaru[i]);
            dataMin[i] = s.getMin();
        }
        return dataMin;
    }

    public double[] dataMax() {
        Matrix matrix = new Matrix(dataAsal);
        double[][] dataBaru = matrix.transpose();
        double[] dataMax = new double[dataBaru.length];
        for (int i = 0; i < dataBaru.length; i++) {
            Statistics s = new Statistics(dataBaru[i]);
            dataMax[i] = s.getMax();
        }
        return dataMax;
    }
}
