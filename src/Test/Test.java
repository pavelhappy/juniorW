package Test;

import Task1.UniqueArray;

public class Test {
    public static void main(String[] args) {
        int[] massive = {1, 5, 2, -1, 5, 35, 4, 8};
        int[] result = UniqueArray.unique(massive);

       for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
