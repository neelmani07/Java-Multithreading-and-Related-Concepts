package threadingExample;

public class CreateThreads implements Runnable {
	
	
	public static void main(String[] args) {
        
        
        for (int i =0; i < 5; i++)
        {
            Thread t = new Thread(new CreateThreads());
            t.start();
        }
        System.out.println("Main Tread");
    }

    @Override
    public void run() {
        System.out.println("Created treads");
    }
    

}
