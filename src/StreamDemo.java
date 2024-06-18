import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    /**
     * returns the count of even numbers in an arraylist using streams
     * @param list
     * @return count of even numbers
     */
    public static long countEvens(ArrayList<Integer> list){
        //filter method returns another stream which consists of only the elements that pass the test
        //count returns a long
        //put one on each line for easier readability
        return list
                .stream()                           //get the stream from the array list
                .filter(w -> w%2 == 0)              //filter and keep the even numbers -> called a transformation (the lazy actions)
                .count();                           //count the even numbers -> the terminal operation here
    }

    public static long sumEvens(ArrayList<Integer> list){
        return list.
                stream().
                filter(w->w%2==0).
                reduce(0,(x,y)->x+y); //reduce(0,Integer::sum);
    }

    public static void dickens(){
        Stream<String> words = Stream.of("A","Tale","of","Two","Cities");
        /*
        Stream<String> lowercaseWords = words.map(w->w.toLowerCase());
        Stream<String> consonantsOnly = lowercaseWords.map(w->w.replaceAll("[aeiou]",""));
        Stream<Integer> consonantLength = consonantsOnly.map(w->w.length());
        consonantLength.forEach(System.out::println);
        // can't use this because we already have terminal statement List<Integer> cL = consonantLength.collect(Collectors.toList());
        */

        words.map(w->w.toLowerCase())
                .map(w->w.replaceAll("[aeiou]",""))
                .map(w->w.length())
                .forEach(System.out::println);

    }
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>(List.of(1,3,4,10,12));

        System.out.println("the number of even numbers = " + countEvens(l));
        System.out.println("the sum of the even numbers = " + sumEvens(l));
        dickens();

    }
}
