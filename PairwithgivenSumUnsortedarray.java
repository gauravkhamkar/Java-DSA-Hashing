import java.util.*;
public class PairwithgivenSumUnsortedarray {
    static boolean pair(int arr[], int sum)
    {
        HashSet<Integer>s=new HashSet<Integer>();
        for(int i=0; i<arr.length; i++)
        {
           if(s.contains(sum-arr[i]))
           {
            return true;
           }
           s.add(arr[i]);
           
        }
        return false;
    }
}
