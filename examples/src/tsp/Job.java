/* $Id$ */

package tsp;

public class Job implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    int[] path = null;

    int length;

    transient Job next;

    Job(int length, int[] path) {
        this.path = new int[path.length];
        this.length = length;
        // Copy the already known path.
        System.arraycopy(path, 0, this.path, 0, path.length);
    }
}
