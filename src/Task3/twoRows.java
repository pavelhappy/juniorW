package Task3;
import java.util.Arrays;
/*
 Задача №3
  Написать  метод,  принимающий  две  строки.  Определить  какая  из  двух  строк
короче, какая (соответственно) длиннее и вернуть результат по следующему шаблону —
shorter+reverse(longer)+shorter. Строки могут быть пустыми, с null-строками необходимо
обращаться как с пустыми.
 */
public class twoRows
{
    public static void main(String[] args) {
        String a = "short";
        String b = "longword";
        String result = srs(a,b);
        System.out.println(result);
    }

    public static String srs(String a, String b)
    {
        String longer;
        String shorter;
        if (a.length()>b.length())
        {
            longer = a;
            shorter = b;
        }
        else
        {
            longer = b;
            shorter = a;
        }
        String longerReverse = new StringBuilder(longer).reverse().toString();
        String result = shorter + longerReverse + shorter;
        return result;
    }
}
