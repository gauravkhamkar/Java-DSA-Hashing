import java.util.*;
public class SubArrayWith0Sum {
    static boolean findsum(int arr[])
    {
        HashSet<Integer>s=new HashSet<Integer>();
        int prefixsum=0;
        for(int i=0; i<arr.length; i++)
        {
            prefixsum=prefixsum+arr[i];
            
            if(s.contains(prefixsum))
            {
                return true;
            }
            if(prefixsum==0)
            {
                return true;
            }
            s.add(prefixsum);
        }
        return false;
    }
    public static void main(String args[])
    {
        int []arr={2,2,2,2};
        System.out.println(findsum(arr));
        
    }
}
