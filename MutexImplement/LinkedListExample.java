package MutexImplement;


import java.util.ArrayList;

public class LinkedListExample implements Runnable {

    
    static MyList list = null;
    public static void main(String[] args) throws InterruptedException {
        list = new MyList();
        
        ArrayList<Thread> threads = new ArrayList<Thread>();
        for (int i = 0; i < 5; i++)
        {
            Thread t = new Thread(new LinkedListExample());
            t.start();
            threads.add(t);
        }
        
        for (Thread t : threads)
        {
            t.join();            
        }

        list.printList();
    }

    @Override
    public void run() {
        list.add("Hello 1!");
        list.add("Hello 2!");
        list.add("Hello 3!");
        System.out.println("test");
    }

    
}
