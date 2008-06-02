/* $Id$ */

package Remote;

import ibis.gmi.GroupMember;

class Test extends GroupMember implements myGroup {

    int i;

    Object data;

    Test() {
        System.out.println(getRank() + ": Test()");
    }

    public void groupInit() {
        i = getRank();
        System.out.println(getRank() + ": Test.groupInit()");
    }

    public void put(Object o) {
        System.out.println(getRank() + ": Test.put()");
        data = o;
    }

    public Object get() {
        System.out.println(getRank() + ": Test.get()");
        return data;
    }

    public Object put_get(Object o) {
        System.out.println(getRank() + ": Test.put_get()");
        Main.inc_count();
        return o;
    }
}
