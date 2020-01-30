package edu.kis.vh.nursery;
/**
*This class is implementation of DeafultCounringRhymer
*Gives mechanism of stack data structure

*/
public class DefaultCountingOutRhymer {


    //:todo make dynamic implementation
    private int[] NUMBERS = new int[12];


    private int sizePointer = -1;
    /**
    *Add new element at the end
     */
    public void pushElement(int in) {
        if (!isFull())
            NUMBERS[++sizePointer] = in;
    }

    /**
    * @return true if the stack is empty
     */
    public boolean isEmpty() {
        return sizePointer == -1;
    }

    /**
     *
     * @return true if stack is full
     */
    public boolean isFull() {
        return sizePointer == 11;
    }

    /**
    *@return the last element of stack
     */
    protected int getLastElement() {
        if (isEmpty())
            return -1;

        return NUMBERS[sizePointer];
    }

    /**
     * @return popped elment from stack if stack is empty return -1
     */
    public int popElement() {
        if (isEmpty())
            return -1;

        return NUMBERS[sizePointer--];
    }

}
