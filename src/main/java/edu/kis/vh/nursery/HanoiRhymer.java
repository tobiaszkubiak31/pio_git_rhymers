package edu.kis.vh.nursery;
/*
Wyliczanka przyjmuje zawsze pierwszą liczbe na stos a następnie odrzuca następne liczby
jeśli są mniejsze badz rowne od ostatinego elementu stosu
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    /*
      odrzuc gdy:
     1. w kolejce sie cos wgl znajuje  &&
     2. liczba na wejsciu jest wieksza od bieżacej
     */

    @Override
    public void pushElement(int number) {
        if (!isEmpty() && number > getLastElement())
            totalRejected++;
        else
            super.pushElement(number);
    }
}
