import java.util.*;
public class CountDistinctElementsEffSoln {
    static int count(int arr[])
    {
//hash set only adds distinct elements into it
        HashSet<Integer>s=new HashSet<Integer>();
        for(int i=0; i<arr.length; i++)
        {
            s.add(arr[i]);
        }
        return s.size();
    }
    public static void main(String args[])
    {
        int []arr={10,20,10,30,10};
        System.out.println(count(arr));
    }
}
