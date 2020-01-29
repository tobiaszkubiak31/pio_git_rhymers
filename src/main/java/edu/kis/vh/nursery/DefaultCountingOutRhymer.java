package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int INT = 12;
    public static final int INT1 = -1;
    public static final int INT2 = 11;

    private int[] NUMBERS = new int[INT];


    private int sizePointer = INT1;

    public void pushElement(int in) {
        if (!isFull())
            NUMBERS[++sizePointer] = in;
    }

    /*
    true if data structure is empty
     */
    public boolean isEmpty() {
        return sizePointer == INT1;
    }

    public boolean isFull() {
        return sizePointer == INT2;
    }

    /*
    return last element of data struccture
     */
    protected int getLastElement() {
        if (isEmpty())
            return INT1;

        return NUMBERS[sizePointer];
    }

    public int popElement() {
        if (isEmpty())
            return INT1;

        return NUMBERS[sizePointer--];
    }

}
