package SemaphoreImp;

import java.util.concurrent.Semaphore;

public class NightClub {

    private Semaphore sem;
    public NightClub() {
        sem = new Semaphore(2);
    }
    
    public void enter() throws InterruptedException {
        this.sem.acquire();
        System.out.println("Entered the nightclub");
    }
    
    public void leave() {
        this.sem.release();
        System.out.println("Left the nightclub");
    }
}
