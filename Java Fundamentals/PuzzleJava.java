import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.lang.Math;

public class PuzzleJava {
    public static void main(String [] args){

        //Task 1: 
        int [] sumGreaterArray = {3,5,1,2,7,9,8,13,25,32};
        ArrayList<Integer> greaterArray = new ArrayList<Integer>();
        int sum = 0;
        int bigNum = 10;
        for (int  i = 0;  i < sumGreaterArray.length; i++){
            sum = sum + sumGreaterArray[i];
            if (sumGreaterArray[i] > bigNum){
                greaterArray.add(sumGreaterArray[i]);
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("New Array with vals > 10: " + greaterArray);
        System.out.println("\n");

        //Task 2: 
        ArrayList<String> nameArray = new ArrayList<String>();
        ArrayList<String> newStringArray = new ArrayList<String>();
        nameArray.add("Nancy");
        nameArray.add("Jinchi");
        nameArray.add("Fujibayashi");
        nameArray.add("Momochi");
        nameArray.add("Ishikawa");
        System.out.println("Array Before Shuffle: " + nameArray);
        Collections.shuffle(nameArray);
        System.out.println("Array After Shuffle: " + nameArray);
        System.out.println("\n");

        for (int i = 0; i < nameArray.size(); i++){
            System.out.println(nameArray.get(i).length());
            if (nameArray.get(i).length() > 5){
                newStringArray.add(nameArray.get(i));
            }
        }
        System.out.println("Array with name over 5 chracters long: " + newStringArray);

        //Task 3: 
        ArrayList<Character> alphabetArray = new ArrayList<Character>();
        for (char i = 'a'; i < '{'; i++){
            alphabetArray.add(i);
        }
        System.out.printf("Alphabet Array: " + alphabetArray);
        System.out.println("\n");

        //Shuffle Here:
        Collections.shuffle(alphabetArray);
        System.out.println("After Shuffling: " + alphabetArray);
        System.out.println("Last Character: " + alphabetArray.get(alphabetArray.size() - 1));
        System.out.println("First Character: " + alphabetArray.get(0));

        if (alphabetArray.get(0) == 'a'){
            System.out.println("You found a vowel!");
        }
        else if (alphabetArray.get(0) == 'e'){
            System.out.println("You found a vowel!");
        }
        else if (alphabetArray.get(0) == 'i'){
            System.out.println("You found a vowel!");
        }
        else if (alphabetArray.get(0) == 'o'){
            System.out.println("You found a vowel!");
        }
        else if (alphabetArray.get(0) == 'u'){
            System.out.println("You found a vowel!");
        }
        else {
            System.out.println("Aww, No Vowels");
        }
        System.out.println("\n");


        //Task 4: 
        ArrayList<Integer> randArray = new ArrayList<Integer>();
        Random rand = new Random();
        int count = 0;
        while (count < 10){
            int randInt = rand.nextInt(100);
            if (randInt > 55 && randInt < 101){
                randArray.add(randInt);
                count = count + 1;
            }
        }
        System.out.println("Array wtih rand vals between 55-100: " + randArray);
        System.out.println("\n");
        Collections.sort(randArray);
        System.out.println("Array After being sorted: " + randArray);
        int minRandArray = randArray.get(0);
        int maxRandArray = randArray.get(0);
        for (int i = 0; i < randArray.size(); i++){
            if (minRandArray > randArray.get(i)){
                minRandArray = randArray.get(i);
            }
            if (maxRandArray < randArray.get(i)){
                maxRandArray = randArray.get(i);
            }
        }
        System.out.println("Min is: " + minRandArray);
        System.out.println("Max is: " + maxRandArray);

        //Task 5: 
    }
}