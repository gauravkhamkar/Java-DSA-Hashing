import java.util.*;

public class HashSet1 {
    public static void main(String args[])
    {
        //creating a hash set 'h'
        HashSet<String> h= new HashSet<String>();

        //ADDING ELEMENTS INTO THE HASH SET
        h.add("gfg");
        h.add("courses");
        h.add("ide");
        h.add("g");

        //PRINTING SIZE OF THE HASHSET
        System.out.println(h.size());
        //REMOVING AN ELEMENT FROM THE HASHSET
        h.remove("ide");
        //PRINTING THE SIZE OF THE HASHSET
        System.out.println(h.size());
        //PRINTING THE ELEMENTS OF THE HASHSET
        System.out.println(h);

        //CHECKING IF THE HASH SET CONTAINS A ELEMENT(T/F)
        System.out.println(h.contains("ide"));

        //TRAVERSING THE HASHSET BY FOR LOOP AND PRINTING THE ELEMENTS
        for(String s:h)
        {
            System.out.println(s+ " ");
        }

        //CHECKING IF THE HASHSET IS EMPTY(T/F) 
        System.out.println(h.isEmpty());
        //REMOVING ALL THE ELEMENTS FROM THE HASHSET
        h.clear();
        //CHECKING IF THE HASHSET IS EMPTY
        System.out.println(h.isEmpty());
        //ITERATING THROUGH THE HASHSET USING ITERATOR 
        Iterator<String>i=h.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next()+ " "); 
        }
        //THIS LOOP PRINTS TILL HASHTABLE CONTAINS VALUES

         

        
    }
}
