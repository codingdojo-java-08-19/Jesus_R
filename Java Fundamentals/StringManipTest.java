import java.awt.SystemTray;

public class StringManipTest{
    public static void main(String [] args){
        //Methods are here:
        // Method 1:
        System.out.println("Method 1: ");
        StringManipMethods methods = new StringManipMethods();
        String trimmedAndCombinedWord = methods.trimAndConcat("     Hello      ", "        World        ");
        System.out.println(trimmedAndCombinedWord);
        System.out.println('\n');

        //Method 2:
        System.out.println("Method 2: ");
        Integer indexNum = methods.getIndexOrNull("Coding", 'o');
        Integer indexNum2 = methods.getIndexOrNull("Hello", 'o');
        Integer indexNum3 = methods.getIndexOrNull("Hi", 'o');
        System.out.println(indexNum);
        System.out.println(indexNum2);
        System.out.println(indexNum3);
        System.out.println('\n');

        //Method 3:
        System.out.println("Method 3: ");
        //Integer wordIndexNum = methods.getIndexOrNull("Hello", "llo");
        //Integer wordIndexNum2 = methods.getIndexOrNull("Hello", "world");
        System.out.println(wordIndexNum);
        System.out.println(wordIndexNum2);

        //Method 4:
        System.out.println("Method 4: ");
        //String newWord
    }
}