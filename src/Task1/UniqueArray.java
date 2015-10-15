package Task1;
/*
Задача №1
  Необходимо  написать  класс  UniqueArray,  единственный  util-метод  public  static
int[]  unique(int[]  integers); На вход подаётся массив, в котором могут присутствовать
дублированные  значения.  На  выходе  —  массив,  состоящий  только  из  уникальных
элементов входного массива:
        Вызов: UniqueArray.unique([1, 5, 2, 0, 2, -3, 1, 10])
        Результат: [1, 5, 2, 0, -3, 10]

 */

import java.util.*;

public class UniqueArray {
    public static int[] unique(int[] integers)
    {
        List<Integer> tempList = new ArrayList<Integer>();
        for (int i = 0; i < integers.length; i++) {
            tempList.add(integers[i]);
        }

        for (int i = 0; i < tempList.size() - 1; i++) {
            for (int j = i + 1; j < tempList.size() - 1; j++) {
                if (!tempList.get(j).equals(tempList.get(i)))
                    continue;
                tempList.remove(j);
                j--;
            }
        }

        int[] result = new int[tempList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i]= tempList.get(i);
        }


        return result;
    }
}
