package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private int[] NUMBERS = new int[12];


    private int sizePointer = -1;

    public void pushElement(int in) {
        if (!isFull())
            NUMBERS[++sizePointer] = in;
    }

    /*
    true if data structure is empty
     */
    public boolean isEmpty() {
        return sizePointer == -1;
    }

    public boolean isFull() {
        return sizePointer == 11;
    }

    /*
    return last element of data struccture
     */
    protected int getLastElement() {
        if (isEmpty())
            return -1;

        return NUMBERS[sizePointer];
    }

    public int popElement() {
        if (isEmpty())
            return -1;

        return NUMBERS[sizePointer--];
    }

}
