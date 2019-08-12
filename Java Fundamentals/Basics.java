import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Math;

public class Basics{
    public static void main(String [] args){
        //Task 1: 
        System.out.println("Task 1: ");
        
        for (int i = 1; i < 256; i++){
            System.out.println("i: " + i);
        }
        System.out.println("\n");

        //Task 2:
        System.out.println("Task 2: ");
        for (int i = 1; i < 256; i++){
            if (i % 2 == 1){
                System.out.println("i: " + i);
            } 
        }
        System.out.println("\n");

        //Task 3:
        System.out.println("Task 3: ");
        //keep 0 outside of the loop so we don't reset everytime
        int sum = 0;
        for (int i = 0; i < 256; i++){
            sum = sum + i;
            System.out.println("New Number: " + i + " " + "Sum: " + sum);
        }
        System.out.println("\n");

        //Task 4:
        System.out.println("Task 4: ");
        int [] myArray = {2,5,6,7,8};
        for (int i = 0; i < myArray.length; i++){
            System.out.println("Array Element: " + myArray[i]);
        }
        System.out.println("\n");

        //Task 5: 
        System.out.println("Task 5: ");
        int [] findMaxArray = {-1, 5, 10, 0};
        int max = findMaxArray[0];
        for (int i = 0; i < findMaxArray.length; i++){
            if (max < findMaxArray[i]){
                max = findMaxArray[i];
            }
        }
        System.out.println("The max is: " + max);
        System.out.println("\n");

        //Task 6: 
        System.out.println("Task 6: ");
        int [] findAvgArray = {3, 10, 2};
        int sumAvg = 0;
        int avg = 0;
        for (int i = 0; i < findAvgArray.length; i++){
            sumAvg = sumAvg + findAvgArray[i];
        }
        avg = (sumAvg/findAvgArray.length);
        System.out.println("The Average of this array is: " + avg);
        System.out.println("\n");


        //Task 7:
        System.out.println("Task 7: ");
        ArrayList<Object> oddArray = new ArrayList<Object>();
        for (int i = 1; i < 256; i++){
            if (i % 2 == 1){
                oddArray.add(i);
            }
        }
        System.out.println(oddArray);
        System.out.println("\n");

        //Task 8:
        System.out.println("Task 8: ");
        int [] greaterArray = {1,3,5,7};
        int compNum = 3;
        int count = 0;
        for (int i = 0; i < greaterArray.length; i++){
            if (greaterArray[i] > compNum){
                count = count + 1;
            }
        }
        System.out.println("Amount of numbers greater than Y: " + count);
        System.out.println("\n");

        //Task 9: 
        System.out.println("Task 9: ");
        int [] squareArray = {2,3,4,5};
        ArrayList<Object> newArray = new ArrayList<Object>();
        for (int i = 0; i < squareArray.length; i++){
            int temp = squareArray[i];
            int newVal = temp * temp;
            newArray.add(newVal);
        }
        System.out.println(newArray);
        System.out.println("\n");

        //Task 10: 
        System.out.println("Task 10:" );
        int [] negArray = {-1,4,-15,0,1,6};
        for (int i = 0; i < negArray.length; i++){
            if (negArray[i] < 0){
                negArray[i] = 0;
            }
        }
        for (int i = 0; i < negArray.length; i++){
            System.out.println(negArray[i]);
        }
        System.out.println("\n");
        
        //Task 11:
        System.out.println("Task 11: ");
        int [] allArray = {1,5,10,-2};
        ArrayList<Object> maxMinAvgArray = new ArrayList<Object>();
        int maxAllArray = allArray[0];
        int minAllArray = allArray[0];
        int avgAllArray = 0;
        int sumAllArray = 0;
        for (int i = 0; i < allArray.length; i++){
            if (maxAllArray < allArray[i]){
                maxAllArray = allArray[i];
            }
            if (minAllArray > allArray[i]){
                minAllArray = allArray[i];
            }
            sumAllArray = sumAllArray + allArray[i];
        }
        avgAllArray = (sumAllArray/allArray.length);
        maxMinAvgArray.add(maxAllArray);
        maxMinAvgArray.add(minAllArray);
        maxMinAvgArray.add(avgAllArray);
        System.out.println("Max is: " + maxAllArray);
        System.out.println("Min is: " + minAllArray);
        System.out.println("Avg is: " + avgAllArray);
        System.out.println("new array : " + maxMinAvgArray);
        System.out.println("\n");

        //Task 12:
        int [] shiftArray = {1,5,10,7,-2};
        for (int i = 0; i < shiftArray.length - 1; i++){
            System.out.println("norm val: " + shiftArray[i]);
            System.out.println("shifted val: " + shiftArray[i + 1]);
            shiftArray[i] = shiftArray[i + 1];
        }
        shiftArray[shiftArray.length - 1] = 0;
        for (int i = 0; i < shiftArray.length; i++){
            System.out.println(shiftArray[i]);
        }
    }
}