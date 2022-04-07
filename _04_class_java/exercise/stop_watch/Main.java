package _04_class_java.exercise.stop_watch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arr = new int[10000];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]= (int) Math.floor(Math.random()*10000);
        }
        StopWatch stopWatchTime = new StopWatch();
        stopWatchTime.start();
        selectionSort(arr);
        stopWatchTime.stop();
        System.out.println(Arrays.toString(arr));
        System.out.println(stopWatchTime.getElapsedTime());
    }
    public static int[] selectionSort(int...a){
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[i]){
                    int tempt = a[i];
                    a[i]=a[j];
                    a[j]=tempt;
                }
            }
        }
        return a;
    }



}
