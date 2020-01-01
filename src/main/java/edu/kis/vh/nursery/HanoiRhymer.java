package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    /*
      odrzuc gdy:
     1. w kolejce sie cos wgl znajuje  &&
     2. liczba na wejsciu jest wieksza od bierzacej
     */
    public void pushElement(int number) {
        //meine
        System.out.println("last element : " + getLastElement() + " input: " + number);
        if (!isEmpty() && number > getLastElement())
            totalRejected++;
        else
            super.pushElement(number);
    }
}
