package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    public DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    /*
    count out the first element from from stack
     */
    @Override
    public int popElement() {
		/*
		if heap isnt empty, reverse heap
		 */
        while (!isEmpty())
            temp.pushElement(super.popElement());

        int poppedElement = temp.popElement();
		/*
		if temp heap isnt empty, reverse heap
		 */
        while (!temp.isEmpty())
            pushElement(temp.popElement());

        return poppedElement;
    }
}
