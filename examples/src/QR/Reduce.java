/* $Id$ */

package QR;


import ibis.gmi.GroupMember;

class Reduce extends GroupMember implements i_Reduce {

    PivotElt solution;

    boolean empty = true;

    i_Reduce group;

    Reduce() {
        super();
    }

    public void init(i_Reduce group) {
        this.group = group;
    }


    public synchronized void reduce_it(PivotElt elt) {
        //		System.out.println("Got a reduce ... ");
        solution = elt;
        empty = false;
        notifyAll();
    }

    public synchronized PivotElt reduce(PivotElt elt) {

        empty = true;

        //		System.out.println("Doing a reduce ...");
        group.reduce_it(elt);

        while (empty) {
            try {
                wait();
            } catch (Exception e) {
                System.err.println("reduce got exception " + e);
            }
        }
        return solution;
    }
}
