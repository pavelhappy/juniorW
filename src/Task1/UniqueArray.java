package Task1;
/*
������ �1
  ����������  ��������  �����  UniqueArray,  ������������  util-�����  public  static
int[]  unique(int[]  integers); �� ���� ������� ������, � ������� ����� ��������������
�������������  ��������.  ��  ������  �  ������,  ���������  ������  ��  ����������
��������� �������� �������:
        �����: UniqueArray.unique([1, 5, 2, 0, 2, -3, 1, 10])
        ���������: [1, 5, 2, 0, -3, 10]

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
