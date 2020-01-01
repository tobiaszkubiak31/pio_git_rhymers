package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

    int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    /*
      odrzuc gdy:
     1. w kolejce sie cos wgl znajuje  &&
     2. liczba na wejsciu jest wieksza od bierzacej
     */
    public void countIn(int in) {
        //meine
        System.out.println("last element : " + peekaboo() + " input: " + in);
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
