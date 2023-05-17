package BTVN_So_6;

import java.util.*;

public class Bài4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 4, 5, 3, 3, 4, 2, 7, 2, 2));
        // Sắp  xeesp danh sách
        Collections.sort(list);
        System.out.println(list);

        Set<Integer> listSet = new HashSet<>(list);
        System.out.println(listSet);
       

    }
}
