public class CountDistinctElements{
      static int count(int arr[])
      {
        int res=0;
        for(int i=0; i<arr.length; i++)
        {
            boolean flag=false;
            for(int j=0; j<i; j++)
            {
                if(arr[i]==arr[j])
                {
                    flag=true;
                    break;
                }
            }
            if(flag==false)
            {
                res++;
            }
        }
        return res;
      }
      public static void main(String args[])
      {
        int []arr={10,20,10,20,30};
        System.out.println(count(arr));

      }
    
}
//time complexity is O(n^2)
