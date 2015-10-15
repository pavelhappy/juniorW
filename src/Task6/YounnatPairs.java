package Task6;

import java.util.ArrayList;

/*
 Задача №6
  Принять  во  внимание,  что  не  все  маршруты  могут  быть  упрощены.  К  примеру,
["NORTH", "WEST", "SOUTH", "EAST"] не упрощаем, поскольку NORTH и WEST, WEST и SOUTH,
SOUTH и EAST попарно НЕ противоположны.
 */
public class YounnatPairs
{
    public static void main(String[] args)
    {
        String[] result = dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH","SOUTH", "EAST", "WEST", "NORTH", "WEST", "EAST"});
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static String[] dirReduc (String[] routes)
    {
        ArrayList<String> routesList = new ArrayList<String>();
        for (int i = 0; i < routes.length-1; i++)
        {
            if (((routes[i].toString() == "NORTH")&&(routes[i+1].toString() == "SOUTH"))||
                    ((routes[i].toString() == "SOUTH")&&(routes[i+1].toString() == "NORTH"))||
                    ((routes[i].toString() == "WEST")&&(routes[i+1].toString() == "EAST"))||
                    ((routes[i].toString() == "EAST")&&(routes[i+1].toString() == "WEST")))
            {
                i++;
            }

            else
            {
                routesList.add(routes[i]);
            }

        }
        if (!(((routes[routes.length-2].toString() == "NORTH")&&(routes[routes.length-1].toString() == "SOUTH"))||
                ((routes[routes.length-2].toString() == "SOUTH")&&(routes[routes.length-1].toString() == "NORTH"))||
                ((routes[routes.length-2].toString() == "WEST")&&(routes[routes.length-1].toString() == "EAST"))||
                ((routes[routes.length-2].toString() == "EAST")&&(routes[routes.length-1].toString() == "WEST"))))
        {
            routesList.add(routes[routes.length-1]);
        }
        String[] result = new String[routesList.size()];
        for (int i = 0; i < result.length; i++)
        {
            result[i] = routesList.get(i);
        }
        return result;
    }
}
