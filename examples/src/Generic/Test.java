/* $Id$ */

package Generic;


import ibis.gmi.GroupMember;

class Test extends GroupMember implements myGroup {

    int i;

    Test() {
        System.out.println(myGroupRank + ": Test()");
    }

    public void groupInit() {
        i = myGroupRank;
        System.out.println(myGroupRank + ": Test.groupInit()");
    }

    public void put(int i) {
        System.out.println(myGroupRank + ": Test.put(" + i + ")");
        this.i = i;
    }

    public int get() {
        System.out.println(myGroupRank + ": Test.get() = " + i);
        return i;
    }
}
