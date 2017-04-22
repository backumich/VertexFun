package ua.com.vertex.generics.issues;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by sweet_home on 01.10.16.
 */
public class PrimitiveByteSet {
    Byte[] possibles = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    Set<Byte> mySet =
            new HashSet<Byte>(Arrays.asList(possibles));
    // But you can’t do this:
//     Set<Byte> mySet2 = new HashSet<Byte>(
//       Arrays.asList(1,2,3,4,5,6,7,8,9));


}
