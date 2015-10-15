package Task2;

import java.util.ArrayList;

/*
 Задача №2
  Написать  метод,  принимающий  на  вход  целое  число,  возвращающий  число,
представляющее собой цифры входного параметра в обратном порядке:
        Вход: 145263
        Выход: 654321
        Вход: 1254859723
        Выход: 9875543221

 */
public class ReverseNumbers
{
    public static void main(String[] args)
    {
        int n = 1254859723;
        ArrayList<Integer> result  = reverseSort(n);

            for (int i = 0; i < result.size(); i++)
            {
                System.out.print(result.get(i));
            }

    }

    public static ArrayList<Integer> reverseSort(int wanttoSort)
    {
        ArrayList<Integer> inputArray = new ArrayList<Integer>();
        while (wanttoSort > 0) {
            int d = wanttoSort / 10;
            int k = wanttoSort - d * 10;
            wanttoSort = d;
            inputArray.add(k);
        }
        Integer temp, temp2 = 0;
        for (int j = 0; j < inputArray.size()-1;)
        {
            for (int i = 0; i < inputArray.size()-1; i++)
            {
                temp = inputArray.get(i);
                temp2 = inputArray.get(i+1);
                if (temp < inputArray.get(i+1))
                {
                    inputArray.set(i, temp2);
                    inputArray.set(i+1, temp);
                }
            }
            j++;
        }
        return inputArray;
    }
}
