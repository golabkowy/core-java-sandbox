package threads;

public class TestThread extends Thread {

    @Override
    public void run() {
        for(int i = 0 ; i < 10 ; i++){
            try{
                Thread.sleep(3000);
                System.out.println("TUTAJ MOJ KLASYCZNY WONCIO");

                // example of interruption handling
                 if(Thread.interrupted()){
                     return;
                 }

                // example of interruption handling
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
    //is it worth to override start() or interrupt() methods?
}
