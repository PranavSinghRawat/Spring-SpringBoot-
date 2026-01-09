package JavaBasics.Streams;
import java.util.*;
import java.util.stream.Stream;;

public class stream {
    public static void main(String[] args){
        List<Integer> num= new ArrayList<Integer>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        Stream<Integer> s1= num.stream();
        Stream<Integer> s2=s1.filter(n->n%2==0);
        Stream<Integer> s3=s2.map(n->n*n);
        s3.forEach(System.out::println);
        
    }
}
