package Task1;


import java.util.*;

public class UniqueArray {
    public static int[] unique(int[] integers)
    {
        List<Integer> tempList = new ArrayList<Integer>();
        for (int i = 0; i < integers.length; i++) {
            tempList.add(integers[i]);
        }
        int size = tempList.size();
        int duplicates = 0;

        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (!tempList.get(j).equals(tempList.get(i)))
                    continue;
                duplicates++;
                tempList.remove(j);
                j--;
                size--;
            }
        }
        int[] result = new int[tempList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i]= tempList.get(i);
        }


        return result;
    }
}
