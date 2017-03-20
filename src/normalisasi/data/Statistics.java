/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package normalisasi.data;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Afa
 */
public class Statistics {
    double[] data;
    int size;   

    public Statistics(double[] data) 
    {
        this.data = data;
        size = data.length;
    }
    double getMin(){
        Arrays.sort(data);
        return data[0];
    }
    double getMax(){
        Arrays.sort(data);
        return data[data.length-1];
    }
    double getMean()
    {
        double sum = 0.0;
        for(double a : data)
            sum += a;
        return sum/size;
    }

    double getVariance()
    {
        double mean = getMean();
        double temp = 0;
        for(double a :data)
            temp += (a-mean)*(a-mean);
        return temp/size;
    }

    double getStdDev()
    {
        return Math.sqrt(getVariance());
    }

    public double median() 
    {
       Arrays.sort(data);

       if (data.length % 2 == 0) 
       {
          return (data[(data.length / 2) - 1] + data[data.length / 2]) / 2.0;
       } 
       return data[data.length / 2];
    }
}
