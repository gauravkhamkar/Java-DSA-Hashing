import java.util.ArrayList;
import java.util.LinkedList;
class MyHash{
    int BUCKET;
    ArrayList<LinkedList<Integer>>table;
    MyHash(int b)
    {
        BUCKET=b;
        table=new ArrayList<LinkedList<Integer>>();
        for(int i=0; i<b; i++)
        {
            table.add(new LinkedList<Integer>());
        }
    }
     void insert(int key)
    {
        int i=key%BUCKET;
        table.get(i).add(key);

    }
    void remove(int key)
    {
        int i=key%BUCKET;
        table.get(i).remove((Integer)i);
    }
    boolean search(int key)
    {
        int i=key%BUCKET;
        return table.get(i).contains(key );

    }
     

}