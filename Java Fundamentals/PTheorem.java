//we need to import java package
import java.lang.Math;
public class PTheorem{
    public double calculateHype(int edge1, int edge2){
        double c = Math.sqrt((edge1 * edge1) + (edge2 * edge2));
        return c;
    }
}