/*we need to count the distinct common elements
 * for eg a={10,20,15,15,30,30,5}
 *        b={30,5,30,80}
 * then the common elements are{5,30}
 * so we return 2.
 * 
 */
import java.util.*;
public class IntersectionOfTwoArrays {
    static int intersection(int a[], int b[])
    {
        HashSet<Integer>s=new HashSet<Integer>();
        for(int i=0; i<a.length; i++)
        {
            s.add(a[i]);
        }
        int res=0;
        for(int j=0; j<b.length; j++)
        {
            if(s.contains(b[j]))
            res++;
            s.remove(b[j]);
        }
        return res;
    }
    public static void main(String args[])
    {
        int []a={1,2,3,4,5,5,6};
        int []b={2,3,4,7,8,9};

        System.out.println(intersection(a,b));
    }
}
