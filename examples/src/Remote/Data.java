/* $Id$ */

package Remote;


import java.io.Serializable;

class Data implements Serializable {

    private static final long serialVersionUID = 1L;

    double value;

    Data next;

    Data(double value, Data next) {
        this.value = value;
        this.next = next;
    }
}
