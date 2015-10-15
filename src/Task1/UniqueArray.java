package Task1;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UniqueArray {
    public static int[] unique(int[] integers)
    {
        ArrayList<Integer> resultInt = new ArrayList<Integer>();
        int current = integers[0];
        boolean found = false;

        for (int i = 0; i < integers.length; i++)
        {
            if (current == integers[i] && !found)
            {
                found = true;
            }
            else if (current != integers[i])
            {
                resultInt.add(current);
                current = integers[i];
                found = false;
            }
        }
        int[] result = new int[resultInt.size()];
        for (int i = 0; i < resultInt.size(); i++) {
            result[i] = resultInt.get(i);
        }

        return result;
    }
}
