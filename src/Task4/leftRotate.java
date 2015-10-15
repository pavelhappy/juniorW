package Task4;

import java.util.ArrayList;
import java.util.Arrays;

/*
    Задача №4
  Есть  массив  целых  чисел.  Необходимо  написать  метод,  производящий
циклический  сдвиг  этого  массива  на  n  элементов  влево.  n  может  быть  больше  числа
элементов  массива,  так  же  n  может  быть  отрицательным,  что  будет  означать  сдвиг
вправо.
Object[] data = new Object[]{1, 2, 3, 4, 5};
rotate(data, 1)    =>    {5, 1, 2, 3, 4}
rotate(data, 2)    =>    {4, 5, 1, 2, 3}
rotate(data, 3)    =>    {3, 4, 5, 1, 2}
rotate(data, 4)    =>    {2, 3, 4, 5, 1}
rotate(data, 5)    =>    {1, 2, 3, 4, 5}
rotate(data, 0)    =>    {1, 2, 3, 4, 5}
rotate(data, -1)    =>    {2, 3, 4, 5, 1}
rotate(data, -2)    =>    {3, 4, 5, 1, 2}
rotate(data, -3)    =>    {4, 5, 1, 2, 3}
rotate(data, -4)    =>    {5, 1, 2, 3, 4}
rotate(data, -5)    =>    {1, 2, 3, 4, 5}

 */
public class leftRotate
{
    public static void main(String[] args)
    {
        Object[] data = new Object[]{1, 2, 3, 4, 5};
        Object[] result = rotate(data, 9);

        System.out.println(Arrays.deepToString(result));
    }

    public static Object[] rotate(Object[] data, int n)
    {
        Object[] result = new Object[data.length];
        ArrayList<Object> tempList = new ArrayList<Object>();
        Object temp;
        for (int i = 0; i < data.length; i++)
        {
            tempList.add(data[i]);
        }

        if (n > 0)
        {
            for (int i = 0; i < n; i++)
            {
                temp = tempList.get(tempList.size()-1);
                tempList.add(0, temp);
                tempList.remove(tempList.size()-1);
            }
        }
        else if (n < 0)
        {
            for (int i = 0; i < Math.abs(n); i++)
            {
                temp = tempList.get(0);
                tempList.remove(0);
                tempList.add(temp);
            }

        }

        for (int i = 0; i < result.length; i++)
        {
            result[i] = tempList.get(i);
        }

        return result;
    }
}
