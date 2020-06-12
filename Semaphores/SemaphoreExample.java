package SemaphoreImp;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SemaphoreExample implements Runnable {

   
    
    static NightClub nightclub;
    public static void main(String[] args) {
        // TODO code application logic here
        nightclub = new NightClub();
        
        for (int i = 0; i < 5; i++)
        {
            Thread t = new Thread(new SemaphoreExample());
            t.start();
        }
        
    }

    @Override
    public void run() {
        while(true)
        {
            try {
                nightclub.enter();
                nightclub.leave();
            } catch (InterruptedException ex) {
                Logger.getLogger(SemaphoreExample.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}