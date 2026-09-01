package CP;

import java.util.ArrayList;
import java.util.Arrays;
public class Practice01_TMain {

    public static void main(String[] args) {
        ArrayList<Integer> notas1 = new ArrayList<>(Arrays.asList(10,9,8,7,6));
        ArrayList<Integer> notas2 = new ArrayList<>(Arrays.asList(9,9,6,7,9));
        Practice01_TGroup grupoA = new Practice01_TGroup();
        Practice01_TEstud estudiante1= new Practice01_TEstud("Gabriel", 5 , notas1 );
    }
}
