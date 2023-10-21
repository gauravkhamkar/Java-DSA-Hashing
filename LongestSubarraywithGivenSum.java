//WE ARE GIVEN ARRAY OF POSITIVE OR NEGATIVE INTEGERS
//WE NEED TO FIND OUT LONGEST SUBARRAY WITH GIVEN SUM. 
//SUBARRAY MEANS  CONTINIOUS ELEMENTS
// import java.util.*;
public class LongestSubarraywithGivenSum {
    static int getlongest(int arr[],int sum)
    {
        int res=0;
        for(int i=0; i<arr.length; i++)
        {
            int currsum=0;
            for(int j=i; j<arr.length; j++)
            {
                currsum=currsum+arr[j];
                if(currsum==sum)
                {
                    res=Math.max(res,j-i+1);
                }
            }
        }
        return res;
    }
    public static void main(String args[])
    {
        int []a={5,8,-4,-4,9,-2,2};
        System.out.println(getlongest(a,0));
    }
}
//TIME COMPLEXITY IS O(N^2)
//QUESTION CAN ALSO BE SOLVED USING HASHSET
