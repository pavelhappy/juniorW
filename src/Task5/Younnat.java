package Task5;

import java.util.ArrayList;

/*
 Задача №5
  Есть  некая  карта  местности,  по  которой  можно  перемещаться  в  направлениях
[«NORTH»,  «SOUTH»,  «EAST»,  «WEST»].  Написать  метод,  который  на  вход  принимает
массив  строк,  соответствующих  маршруту  передвижения  по  карте,  на  выходе  —
минимизированное перемещение.
dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}) => new String[]{«WEST»}
dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH"}) => new String[]{}

 */
public class Younnat
{
    public static void main(String[] args)
    {
        String n = "NORTH";
        String s = "SOUTH";
        String e = "EAST";
        String w = "WEST";
        String[] result = dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH","SOUTH", "EAST", "WEST", "NORTH", "WEST"});
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static String[] dirReduc (String[] routes)
    {
        ArrayList<String> routesList = new ArrayList<String>();
        int cW = 0;
        int cN = 0;
        int cS = 0;
        int cE = 0;
        int north = 0;
        int west = 0;
        int south = 0;
        int east = 0;
        for (int i = 0; i < routes.length; i++)
        {
            if (routes[i].toString() == "NORTH") cN++;
            else if (routes[i].toString() == "SOUTH") cS++;
            else if (routes[i].toString() == "EAST") cE++;
            else if (routes[i].toString() == "WEST") cW++;
        }
        if (cN > cS)
        {
            north = cN - cS;
        }
        else if (cS > cN)
        {
            south = cS - cN;
        }
        if (cE > cW)
        {
            east = cE - cW;
        }
        else if (cW > cE)
        {
            west = cW - cE;
        }
        for (int i = 0; i < north; i++) {
            routesList.add("NORTH");
        }
        for (int i = 0; i < south; i++) {
            routesList.add("SOUTH");
        }
        for (int i = 0; i < east; i++) {
            routesList.add("EAST");
        }
        for (int i = 0; i < west; i++) {
            routesList.add("WEST");
        }
        //System.out.println(cN + " " + cS + " " + cE + " " + cW);
        String[] result = new String[routesList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = routesList.get(i);
        }
        return result;
    }
}
