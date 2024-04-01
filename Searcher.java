import java.util.*;

public class Searcher<T> {
    // Returns the index of the key in the sorted array, or -1 if the
    // key is not found.
    public static <T> int binarySearch(T[] array, int arraySize, T key,
                                       Comparator<T> comparer) {
       int mid=0;
       int low=0;
       int high = arraySize-1;
       while(high>=low){
           mid=(high+low)/2;
           if(comparer.compare(array[mid],key)<0){
               low=mid+1;
           }
           if(comparer.compare(array[mid],key)>0){
               high=mid-1;
           }
           else if(comparer.compare(array[mid],key)==0){
               return mid;
           }
       }
        return -1;
    }
}