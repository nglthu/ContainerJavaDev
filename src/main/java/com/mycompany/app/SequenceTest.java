import java.lang.Object;
public class SequenceTest {
    private Object [] obj;
    private int next =0;
    public SequenceTest(int size){
        obj = new Object[size];


    }

    public void add (Object x){
        if (this.next < obj.length) {
            obj[next] =x;
            next ++;
        }
        

    }

    
}
