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
public class ZScore {
    double[][] dataAsal;
    public ZScore(double[][] dataAsal){
        this.dataAsal=dataAsal;
    }
    public double[][] getDataHasil(){
        double[][] dataHasil=dataAsal;
        for (int i = 0; i < dataAsal.length; i++) {
            for (int j = 0; j < dataAsal[i].length; j++) {
                dataHasil[i][j] = (dataAsal[i][j] - dataMean()[j])/ dataStd()[j]; //(data-mean)/std
            }
        }
        return dataHasil;
    }
    public double[] dataMean(){
        Matrix matrix= new Matrix(dataAsal);
        double[][] dataBaru = matrix.transpose();
        double[] dataMean = new double[dataBaru.length];
        for (int i = 0; i < dataBaru.length; i++) {
            Statistics s = new Statistics(dataBaru[i]);
            dataMean[i]=s.getMean();
        }
        return dataMean;
    } 
    public double[] dataStd(){
        Matrix matrix= new Matrix(dataAsal);
        double[][] dataBaru = matrix.transpose();
        double[] dataStd = new double[dataBaru.length];
        for (int i = 0; i < dataBaru.length; i++) {
            Statistics s = new Statistics(dataBaru[i]);
            dataStd[i]=s.getStdDev();
        }
        return dataStd;
    } 
}
