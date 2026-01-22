package JavaBasics.Streams;
import java.util.*;
import java.util.stream.Collectors;
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
        Stream<Integer> s4=s3.sorted();
        s4.forEach(System.out::println);
        List<Integer> num1= new ArrayList<Integer>();
        num1.add(1);
        num1.add(4);
        num1.add(3);
        num1.add(2);
        Stream<Integer> s5= num1.stream();  
        Stream<Integer> s6 = s5.sorted();
    
        System.out.print(s6+" ");
        Stream<Integer> s7= num1.stream();
        List<Integer> collected = s7.collect(Collectors.toList());
        System.out.println("Collected list: " + collected);
        
        // Practice: Find sum
        int sum = num1.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum: " + sum);
        
        // Practice: Find average
        double avg = num1.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println("Average: " + avg);
        
        // Practice: Filter and map
        List<Integer> filtered = num1.stream().filter(n -> n > 2).map(n -> n*2).collect(Collectors.toList());
        System.out.println("Filtered and mapped: " + filtered);

        
        
    }
}
