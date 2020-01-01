package edu.kis.vh.nursery;

public class FIFORhymer extends defaultCountingOutRhymer {

    public defaultCountingOutRhymer temp = new defaultCountingOutRhymer();

    /*
    count out the first element from from stack
     */
    @Override
    public int countOut() {
		/*
		if heap isnt empty, reverse heap
		 */
        while (!callCheck())
            temp.countIn(super.countOut());

        int ret = temp.countOut();
		/*
		if temp heap isnt empty, reverse heap
		 */
        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }
}
