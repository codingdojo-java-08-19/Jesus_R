import java.util.ArrayList;

public class ExcepJava{
    public static void main(String [] args){
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("Hello World");
        myList.add(48);
        myList.add("Goodbye World");
        

        //Looping and casting each variable to an integer with catch and exception
        CannotCast cantCast = new CannotCast();
        try{
            for (int i = 0; i < myList.size(); i++){
                Integer castedVal = (Integer) myList.get(i);
            }
        }
    }
}