/**
 * Created by petriccione on 10/5/15.
 *
 * You will be implementing Hash Tables as Java classes, in addition to testing them in a third class containing a
 * main method.  All code should be written in Java using NetBeans, and based on zero-indexing.

 24 points: Implement a Java class named ChainedHashTable, based on a hash table with chaining using the multiplication
 method from the slides/textbook. Your should use an array of LinkedList<Integer> objects as your primary instance
 variable / data field.  The constructor should have a parameter for n, the total number of inputs expected.
 In the constructor, create the array of size m as the first power of 2 larger than n,
 full of constructed but empty linked lists at each index. You may choose A directly, or use the integer
 fraction method. There should also be public methods for insert, delete, and search as in the slides/textbook.
 I also want a public printTable method, which runs a loop and prints each linked list in the hash table; consider
 using the LinkedList class toString method.
 You will need a private helper method named hash. Given an int key, it computes and returns an int index of the table.

 5 points extra credit: Use a Universal collection of hash functions instead of the multiplication method, for the
 ChainedHashTable class above. The random constants a and b, and the prime number p > m should be chosen in
 the constructor.

 24 points: After your ChainedHashTable class is working, create another separate Java class called
 OpenAddressedHashTable in the same package, based on a hash table with open addressing using linear probing from
 the slides/textbook. Your should use an array of Integer objects as your primary instance variable / data field.
 The auxiliary hash function should use the multiplication method or can come from a universal collection -- either way,
 you can reuse your hash function from the ChainedHashTable class.
 The constructor should have a parameter for n, the total number of inputs expected. In the constructor, create the
 array of size m as an array of Integer of the same array length as the ChainedHashTable class's array.
 There should also be public methods for insert, delete, and search as in the slides/textbook. To facilitate your
 delete method, you may want to define a static final int instance variable / class data field named DELETED, whose
 value is Integer.MIN_VALUE.
 I also want a public printTable method, which runs a loop and prints each Integer in the hash table. With Java's
 handy auto-unboxing feature, this will be a very straight-forward printing loop.
 You will need a private helper method with one parameter named hash, to implement the auxiliary hash function.
 You will need another private helper method with two parameters named hash, to implement the primary hash function.
 Given a key and an "index" into the probe sequence, it returns the appropriate element of the probe sequence,
 which is an index into the hash table's main array. It will do this by invoking the one-parameter hash method.

 12 points: Create a third class in the same package, with a main method for testing. In main, test your two hash table
 classes by doing at least the following:
 Create a ChainedHashTable object and fill it with at least n = 20 inserted elements. Print out the hash table,
 remove a handful of its elements, then print out the hash table again. Then search for at least 5 keys in the table
 and 5 keys not in the table, printing out the results of the search each time.
 Create a OpenAddressedHashTable object and fill it with at least n = 20 inserted elements. Be sure not to put more
 elements into the table, because an open addressed table is full after m insertions. Print out the hash table,
 remove a handful of its elements, then print out the hash table again. Then search for at least 5 keys in the table
 and 5 keys not in the table, printing out the results of the search each time.
 You must implement your methods and classes described above from scratch, except you may use the following parts of
 the Java Standard Library:

 console I/O
 java.lang.String class
 java.lang.Integer class
 java.util.LinkedList<E> class
 java.util.Random class.
 java.util.Arrays.toString, java.util.Arrays.copyOf, java.util.Arrays.copyOfRange
 */
public class ChainedHashTable {
}
