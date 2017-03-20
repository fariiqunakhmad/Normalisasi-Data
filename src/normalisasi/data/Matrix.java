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
public class Matrix {
    double[][] dataAsal;

    public Matrix(double[][] dataAsal) {
        this.dataAsal = dataAsal;
    }
    public double[][] transpose() {
        double[][] dataBaru = new double[dataAsal[0].length][dataAsal.length];
        for (int i = 0; i < dataAsal.length; i++) {
            for (int j = 0; j < dataAsal[i].length; j++) {
                dataBaru[j][i] = dataAsal[i][j];
            }
        }
        return dataBaru;
    }
}
