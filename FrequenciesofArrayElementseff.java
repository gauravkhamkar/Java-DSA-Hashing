/*
 * This imports the necessary classes from the Java Utility Package
 * which includes the HashMap and Map classes used in the code.
 */

import java.util.*;
public class FrequenciesofArrayElementseff {
      static void count(int arr[])
      {
        HashMap<Integer,Integer>h=new HashMap<>();
  //by this for loop x iterates through every element of the array.
        for(int x: arr)
        {
//this getordefault either gets us the value for the key or 
//makes it default as zero.
//for eg. for 50 it does not have any value so it sets its 
//default value as 0 and then does +1 so that we get 
//count of 50 as 1. then next it gives value of 40  as 1 then
//+1 it gives us value as 2.
//remember, here x is key and h. statement is value(key , value)
//the get or default either gives default value or give if the value is present.
            h.put(x,h.getOrDefault(x, 0)+1);
        }
        for(Map.Entry<Integer,Integer>e:h.entrySet())
        {
            System.out.println(e.getKey()+" "+e.getValue());
        }
      }

public static void main(String args[])
{
   int []arr={50,50,10,40,10};
   count(arr);
}
}
