package homework;

import java.util.*;
import java.util.stream.Stream;

public class StreamsHomeWork {

    public static void main(String[] args){
        Collection temp;
        if(getStream())
    }

    /**
     * This function is given a collection. It will return a stream of the collection.
     *
     * <br><br>
     * This Function must take no longer 500 milliseconds to return.
     *
     * @param collection a collection (List or a Set) of objects
     * @return A stream of the collection
     */
    public static Stream getStream(Collection collection){
        return Stream<Collection> getStream = new Stream.generate(collection);
    }

    /**
     * This function is given a collection. It will return a parallel stream of the collection.
     *
     * <br><br>
     * This Function must take no longer 500 milliseconds to return.
     *
     * @param collection a collection (List or a Set) of objects
     * @return A stream of the collection that is parallel
     */
    public static Stream getParallelStream(Collection collection){
        return null;
    }

    /**
     * This function will convert a stream of objects into a list of strings. Each string in the list is the string
     * representation of the object. Map each object in the stream to a string and collect it into a list.
     *
     * <br><br>
     * This Function must take no longer 500 milliseconds to return.
     *
     * @param stream A stream of objects
     * @return A list of strings
     */
    public static List<String> convertStreamToStrings(Stream<? extends Object> stream){
        return null;
    }

    /**
     * This function will filter out all the numbers in the stream that are divisible by the divisor number. Then
     * raise the filtered number to the power number. Example: (n=filtered number) n^power. And finally collect all
     * the numbers in a set.
     *
     * <br><br>
     * This Function must take no longer 70 milliseconds to return.
     *
     * @param power A number that the numbers that the divisible numbers will be raised to.
     * @param divisor A number that the numbers in the stream must be divisible by.
     * @param stream A stream of integers.
     * @return A set of numbers
     */
    public static Set<Integer> powerDivisibleNumbers(int power, int divisor, Stream<Integer> stream){
        return null;
    }

    /**
     * This function is given a stream of lists containing integers. You must return a set of all of numbers that are
     * found in the streams sub-lists that are contained in the filter list. In other words, flatten the stream then
     * filter the numbers based on if they are contained in the filter list.
     *
     *<br><br>
     *This Function must take no longer 70 milliseconds to return.
     *
     * @param filterList A list of numbers
     * @param stream A stream of lists that contain numbers
     * @return A set of numbers found in the stream sub-lists that are equal to at least one number in the Filter List.
     */
    public static Set<Integer> flatFilteredMap(List<Integer> filterList, Stream<List<Integer>> stream){
        return null;
    }

    /**
     * This function is given a stream of strings and it is your job to convert the strings to a Map. The map's key are
     * the strings in the stream and the values are the strings in reverse order.
     * <br><br>
     * This Function must take no longer 70 milliseconds to return.
     * @param stream A stream of strings
     * @return A map with key equal to the strings in the stream and values equal to strings that are the reverse of the
     * keys
     */
    public static Map<String, String> toMap(Stream<String> stream){
        return null;
    }

    /**
     * This function will receive a stream of strings and it will return a sorted list of strings that meet all of the
     * following criteria:
     * <br><br>
     * 1) They must contain the pattern
     * <br>
     * 2) The strings length must be equal to or greater than the min length number
     * <br>
     * 3) The strings length must be an even or odd number
     * <br><br>
     *
     * The list returned must be sorted by the length of each string (low to high).
     * <br><br>
     * This Function must take no longer 150 milliseconds to return.
     *
     * @param pattern A pattern that all the strings in the list returned must contain
     * @param minLength The length that all the strings in the list returned must be equal to or greater than
     * @param even True if even false if odd. Denotes a condition that all the strings in the list returned must have a
     *             length that is even or odd.
     * @param stream A stream of strings to be filtered
     * @return A list of strings that meets the criteria outlined above sorted by their length from small to large
     */
    public static List<String> findWinners(String pattern, int minLength, boolean even, Stream<String> stream){
        return null;
    }

    /**
     * THIS FUNCTION IS NOT REQUIRED
     *
     *
     * This function will return a list of strings from the stream that do not contain any of the strings found in the
     * losers set as a substring. A substring means that one string is found with in the other string or they are equal.
     * <br>
     * <br>
     * In other words this function will look at each string in the stream and test if the string contains any of the
     * strings in the loser set as a substring. All strings from the stream that do not contain a string in the loser
     * set as a substring are collected in a list and returned.
     * <br>
     * <br>
     * Example:
     * <br>
     * stream = ('Hello', 'Happy', 'Zappos')
     * <br>
     * losers = ('ell', 'pos')
     * <br>
     * returned = ['Happy']
     * <br>
     * @param losers A set of sub strings that the returned strings cannot contain
     * @param stream A stream of strings that will be filtered
     * @return A list of strings the do not contain any of the strings in the loser set as sub strings
     */
     public static List<String> filterLosers(Set<String> losers, Stream<String> stream){
         return null;
    }
}
