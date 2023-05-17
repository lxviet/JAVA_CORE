package BTVN_So_6;

import java.util.ArrayList;
import java.util.List;

public class Bài3 {
    public static void main(String[] args) {
        List<Integer> listOne = new ArrayList<>(List.of(1,2,3,4,5));
        List<Integer> listTwo = new ArrayList<>(List.of(3,4,5,6,7));

        List<Integer> integerList = new ArrayList<>();

        for (int list : listOne) {
            if (listTwo.contains(list)){
                integerList.add(list);
            }
        }
        System.out.println(integerList);
    }
}
