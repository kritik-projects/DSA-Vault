import java.util.ArrayList;
import java.util.List;

public class Print1ToN { 
    
    public static List<Integer> printNos(int x) {
        List<Integer> result = new ArrayList<>();
        generateList(1, x, result);
        return result;
    }

    private static void generateList(int i, int x, List<Integer> l) {
        if (i > x) {
            return;
        }
        l.add(i);
        generateList(i + 1, x, l);
    } 

    public static void main(String[] args) {
        int x = 5;
        List<Integer> output = printNos(x);
        System.out.println(output); 
    }
}