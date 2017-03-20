/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package normalisasi.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author Afa
 */
public class NormalisasiData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new FileReader("src/iris.txt"));
//        BufferedReader br = new BufferedReader(new FileReader("src/newthyroid.txt"));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        int lineCounter = 0;
        double[][] baris = new double[lineCounter][0];
        while (line != null) {
            lineCounter++;
            baris = Arrays.copyOf(baris, lineCounter);
            String[] v = line.split(",");
//            String[] v = line.split("\t");
            double[] data = new double[v.length - 1];
            for (int i = 0; i < v.length - 1; i++) {
                data[i] = Double.parseDouble(v[i]);
            }
            baris[lineCounter - 1] = data;
            line = br.readLine();
        }
        double[][] dataMula = baris;
//
//        double[][] dataMula = new double[][]{
//            {5, 8},
//            {3, 2},
//            {1, 6}
//        };
        System.out.println("Data Asal");
        for (int i = 0; i < dataMula.length; i++) {
            for (int j = 0; j < dataMula[i].length; j++) {
                double e = dataMula[i][j];
                System.out.print(e + "\t");
            }
            System.out.println("");
        }
        
        // MinMax
        MinMax minMax = new MinMax(dataMula);
//        System.out.println("");
//        System.out.println("Data Min");
//        double[] dataMin = minMax.dataMin();
//        for (int i = 0; i < dataMin.length; i++) {
//            double e = dataMin[i];
//            System.out.print(e+" ");
//        }
//        System.out.println("");
//        System.out.println("Data Max");
//        double[] dataMax = minMax.dataMax();
//        for (int i = 0; i < dataMax.length; i++) {
//            double e = dataMax[i];
//            System.out.print(e+" ");
//        }
        System.out.println("");
        System.out.println("Normalisasi MinMax");
        double[][] data = minMax.getDataHasil();
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                double e = data[i][j];
                System.out.print(e + "\t");
            }
            System.out.println("");
        }
        
        //ZScore
        ZScore zScore = new ZScore(dataMula);
//        System.out.println("");
//        System.out.println("Data Mean");
//        double[] dataMean = zScore.dataMean();
//        for (int i = 0; i < dataMean.length; i++) {
//            double e = dataMean[i];
//            System.out.print(e+" ");
//        }
//        System.out.println("");
//        System.out.println("Data Std");
//        double[] dataStd = zScore.dataStd();
//        for (int i = 0; i < dataStd.length; i++) {
//            double e = dataStd[i];
//            System.out.print(e+" ");
//        }
        System.out.println("");
        System.out.println("Normalisasi Z-Score");
        double[][] dataZScore = zScore.getDataHasil();
        for (int i = 0; i < dataZScore.length; i++) {
            for (int j = 0; j < dataZScore[i].length; j++) {
                double e = dataZScore[i][j];
                System.out.print(e + "\t");
            }
            System.out.println("");
        }
        
        //DecimalScaling
        DecimalScaling decimalScaling = new DecimalScaling(dataMula, -1);
        System.out.println();
        System.out.println("");
        System.out.println("Normalisasi Decimal Scaling");
        double[][] dataDecimalScaling = decimalScaling.getDataHasil();
        for (int i = 0; i < dataDecimalScaling.length; i++) {
            for (int j = 0; j < dataDecimalScaling[i].length; j++) {
                double e = dataDecimalScaling[i][j];
                System.out.print(e + "\t");
            }
            System.out.println("");
        }
        //Sigmoidal
        Sigmoidal sigmoidal = new Sigmoidal(dataMula);
        System.out.println("");
        System.out.println("Normalisasi Sigmoidal");
        double[][] dataSigmoidal = sigmoidal.getDataHasil();
        for (int i = 0; i < dataSigmoidal.length; i++) {
            for (int j = 0; j < dataSigmoidal[i].length; j++) {
                double e = dataSigmoidal[i][j];
                System.out.print(e + "\t");
            }
            System.out.println("");
        }
        
        //SoftMax
        SoftMax softMax = new SoftMax(dataMula);
        System.out.println("");
        System.out.println("Normalisasi SoftMax");
        double[][] dataSoftMax = softMax.getDataHasil();
        for (int i = 0; i < dataSoftMax.length; i++) {
            for (int j = 0; j < dataSoftMax[i].length; j++) {
                double e = dataSoftMax[i][j];
                System.out.print(e + "\t");
            }
            System.out.println("");
        }
        
    }

}
