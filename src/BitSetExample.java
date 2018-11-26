import java.util.BitSet;

public class BitSetExample {

    public static void main(String[] args)
    {
        // Constructors of BitSet class
        BitSet bs1 = new BitSet();
        BitSet bs2 = new BitSet();

        /* assigning values to set1*/
        bs1.set(0);
        bs1.set(1);
        bs1.set(3);
        bs1.set(4);

        // assign values to bs2
        bs2.set(4);
        bs2.set(6);
        bs2.set(5);
        bs2.set(1);
        bs2.set(2);
        bs2.set(3);
        bs2.set(12);

        // Printing the 2 Bitsets
        System.out.println("bs1 : " + bs1);
        System.out.println("bs2 : " + bs2);

        // Print the first clear bit of bs1
        System.out.println(bs1.nextClearBit(1));

        // Print the first clear bit of bs2 after index 3
        System.out.println(bs2.nextClearBit(3));
    }
}
