import java.util.*;
public class HashMap1 {
    public static void main(String args[])
{   
    //creating a hash map
    HashMap<String, Integer>m=new HashMap<String, Integer>();

//inserting key-value pairs into the hashmap
    m.put("gfg",10);
    m.put("ide",15);
    m.put("courses",20);
    m.put("rr",10);
// to check whether the key is present in the hashmap
    if(m.containsKey("ide"))
    {
        System.out.println("yes");
    }
    else{
        System.out.println("no");
    }
   //to remove the key-value pair from the hashmap
    m.remove("ide");
    System.out.println(m.size());
    System.out.println(m);
    m.remove("courses");
    System.out.println(m.size());

    /*Map.Entry is an interface that represents a key-value pair held by a Map.
    It's a nested interface within the Map interface. If you've ever worked with
    a map (or dictionary-like structures in other languages), you know that it's 
    composed of key-value pairs. Map.Entry is the Java way to represent such a pair. */
    for(Map.Entry<String,Integer>e:m.entrySet())
    {
        System.out.println(e.getKey()+" "+e.getValue());
    }
   // to check whether the given value is present in the hashmap
    if(m.containsValue(15))
    {
        System.out.println("yes");
    }
    else{
        System.out.println("no");
    }
//to get the value of the key from the hashmap
    System.out.println(m.get("gfg"));
//if its not present then its gives output as 'null'
    System.out.println(m.get("courses"));
}

}
//Hash set is used to store only keys
//hash map is used to store key value pair
