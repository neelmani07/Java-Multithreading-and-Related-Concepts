package atomicVariables;

import java.util.concurrent.atomic.AtomicInteger;


public class AtomicVariables {

  
    
    static AtomicInteger counter;
    public static void main(String[] args) {
        
         counter = new AtomicInteger(0);
         counter.set(5);
         counter.incrementAndGet();
    }
    
}

/* java.util.concurrent.atomic.AtomicInteger:-
 *
 * An int value that may be updated atomically.
 * See the java.util.concurrent.atomic package
 * specification for description of the properties 
 * of atomic variables. An AtomicInteger is used in
 * applications such as atomically incremented counters,
 * and cannot be used as a replacement for an Integer. 
 * However, this class does extend Number to allow uniform
 * access by tools and utilities that deal with numerically-
 * based classes.
 */
