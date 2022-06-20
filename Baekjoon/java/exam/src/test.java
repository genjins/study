import java.util.stream.Stream;

public class test {
    public static void main(String[] args) {
        Stream<Integer> iStream = Stream.iterate(10, n -> n+2).limit(10);

        
    }


    

    
}
