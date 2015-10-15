package Test;

import Task1.UniqueArray;

public class Test {
    public static void main(String[] args) {
        int[] massive = {1, 5, 2, -1, 5, 35, 4, 8};
        UniqueArray r = new UniqueArray();
        int[] res = r.unique(massive);
       for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
