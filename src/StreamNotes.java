public class StreamNotes {
    /*
    streams are a pipeline through which data will flow and the functions to operate on the data
    streams are similar to collections however
        -they don't store their data
        -flows, flow of information
        -once processing is done flow disappears
        -lifetime is only during the processing
        -collection stores data but streams just work with the data
    streams are immutable
        -methods such as "filter" produce new streams
        stream.filter(w -> w.length() > 10);
    stream processing is *lazy*

    ex.) get the first 5 words that are greater than length 10
    Stream<String> fiveLongWords = words
        .filter(w -> w.length() > 10)
        .limit(5)
        -works "backwards" and only computes what is necessary
            -limit works similar to a break in the loop
            -goes further than just a break, can have a lot of actions be pipelined but not executed
        -stream will be "consumed" after terminal action is performed
            -ie can't work with the exact same stream again, cannot perform *more* actions on the exact same string

    -methods take lambda expressions
        - input -> body
        -usually small function, 1-3 expressions
        -cannot be called over and over
        ex.) (String w) -> w.length() > 10 -> if just 1 expression don't need parenthesis, type of parameter, or semicolon at end
            w -> w.length() > 10
        ex.) (v,w) -> v.length() - w.length()

    Examples
    String::toUpperCase
    (String w) -> w.toUpperCase()
    String::compareTo
    (String s, String t) -> s.compareTo(t)
    Double::compare
    (double x, double y) -> Double.compare(x,y)
    System.out::println
    x -> System.out.println(x)

    Stream<String> words = Stream.of("Mary", "had", "a", "little", "lamb");
    Stream<Integer> digits = Stream.of(3,1,4,1,5,9)

    also works for arrays
    Integer[] digitArray = {3,1,4,1,5,9};
    Stream<Integer> digitStream = Stream.of(digitArray);

    -collect a stream into an array
    String[] result = stream.toArray(String[]::new);

    Stream transformations with map
    Stream<String> lowercaseWords = words.map(w->w.toLowerCase())
    Stream<String> consonantsOnly = lowercaseWords.map(w->w.replaceAll("[aeiou]",""));
    Stream<Integer> consonantCount = consonantsOnly.map(w->w.length())

    no stream classes for byte, short, long, char, or float
    there are IntStream, DoubleStream,etc
    convert map -> .mapToInt
     */
}
