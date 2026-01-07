package JavaBasics.Collections;
import java.util.*;
public class set {
    public static void main(String[] args){
            Set<Integer> num= new TreeSet<Integer>();
            num.add(24);
            num.add(2);
            num.add(53);
            for(int n:num){
                System.out.println(n);
            }
            Iterator<Integer> it=num.iterator();
            while(it.hasNext()){
                System.err.println(it.next());
            }
    }
}
