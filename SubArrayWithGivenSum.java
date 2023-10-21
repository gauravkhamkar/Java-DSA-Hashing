import java.util.HashSet;

public class SubArrayWithGivenSum {
    static boolean getsum(int arr[],int sum)
    {
        HashSet<Integer>s=new HashSet<Integer>();
        int presum=0;
        for(int i=0; i<arr.length; i++)
        {
            presum=presum+arr[i];
            if(s.contains(presum-sum))
            {
                return true;
            }
            if(presum==sum)
            {
                return true;
            }
            s.add(presum);
        }
        return false;
    }
    public static void main(String args[])
    {
        int []arr={2,2,2,2};
        System.out.println(getsum(arr,18));
        
    }
}
