package Study.stream.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> intTemp = new ArrayList<>( );
        for (Integer tmp : intList) {
            if (tmp >= 0 && tmp % 2 == 0) {
                intTemp.add(tmp);
            }
        }
        Collections.sort(intTemp);
        System.out.println("ОлдСкульное решение");
        System.out.println(intTemp);
        System.out.println("Решения с помощью Stream");
        StreamMain.main( );

    }
}
