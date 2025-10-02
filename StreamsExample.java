import java.util.*;
import java.util.stream.*;

public class StreamsExamples {
    public static void main(String[] args) {
        List<List<String>> listOfLists = Arrays.asList(

            Arrays.asList("Raghu", "Yashu","Reyansh", "Reyanvi"),
            Arrays.asList("Hyderabad", "Bangalore","Vijayawada", "Tanuku"),
            Arrays.asList("Apple", "Bus","Ball", "Van")
        );
        System.out.println(listOfLists);
        List<String> flatList = listOfLists.stream()
                                .flatMap(List::stream)
                                .collect(Collectors.toList());

        System.out.println(flatList);                                
        }
}
