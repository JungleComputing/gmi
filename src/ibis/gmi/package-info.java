/**
 * The GMI (Group Method Invocation) package implements group communication
 * using method invocations.
 * <p>
 * The GMI model generalizes the RMI model in three ways. First, a reference
 * (stub) can be used to refer to a group of objects instead of a single object.
 * Second, GMI has several ways of forwarding method invocations and dealing
 * with the replies. For instance, GMI allows the user to express broadcast and
 * asynchronous communication. Third, GMI allows the programmer to configure a
 * group reference at run time to use specific forwarding and result-handling
 * schemes. Each method in a group reference can be configured separately,
 * and different forwarding and result-handling schemes can be combined.
 */

package ibis.gmi;
