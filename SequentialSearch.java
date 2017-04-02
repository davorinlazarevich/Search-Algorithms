/**
 * Created by Davorin on 4/2/2017.
 */
public class SequentialSearch {
    public static int search(int [ ] numbers, int key)
    {
        for (int index = 0; index < numbers.length; index++)
        {
            if ( numbers[index] == key)
            return index;  //We found it!!!
        }
        // If we get to the end of the loop, a value has not yet
        // been returned.  We did not find the key in this array.
        return -1;
    }
}
