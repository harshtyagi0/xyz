package training_Lecture_18;

import java.util.concurrent.*;

public class Receiver implements Runnable {
    private Data load;
 
    // standard constructors
    
    Receiver(Data d){
    	this.load=d;
    }
 
    public void run() {
        for(String receivedMessage = load.receive();
          !"End".equals(receivedMessage);
          receivedMessage = load.receive()) {
            
            System.out.println(receivedMessage);

            // ...
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); 
//                Log.error("Thread interrupted", e); 
            }
        }
    }
}