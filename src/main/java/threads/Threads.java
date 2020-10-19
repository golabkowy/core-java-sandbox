package threads;

public class Threads {

    private static void threadFlow(String threadName) throws InterruptedException {
        while (true) {
            System.out.println(threadName);
            // of course its better to wait for notification than sleep until some condition is fulfilled
            // for education purposes only ;)
            Thread.sleep(2000L);
        }
    }

    public static void main(String[] args) {
        // Things to implement
        // co to volatile
        // barer
        // ThreadPool
        // Executors
        // metody run i start
        // metoda signal()

        // sleepy i czekania az sie skonczy
        // sleepy są też przeladowane do przyjmowania nanosekund jednak tak naprawdę czas sleepa zależy od tego jak system ubsługuje pod spodem
        // czas sleepa() może się różnić na różnych systemach
        // sleep po interrupcie wątku będzie rzucał InterruptedException

        // join - metoda sluży do czekania danego wątku aż inny zakończy swoje działanie

        // synchronizacja wątków

        // simple implementation of runnable
        Runnable runnable_thread = new Runnable() {
            @Override
            public void run() {
                try {
                    threadFlow("new Runnable works!");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        //bez start() nie startujemy nowego wątku tylko się odpala ten runnable
//        runnable_thread.run();
//        dlatego powinniśmy owrapować ten runnable w thread
//        Thread thread = new Thread(runnable_thread);
        // i dopiero odpalić
//        thread.start();


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    threadFlow("new Thread(new Runnable works!)");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread lambdaThread = new Thread(() -> {
            try {
                threadFlow("LAMBDA Thread");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });


        // co ciekawe jako, że Runnable stał się interfejsem funkcyjnym to można teraz użyć lambdy aby zaimplementowac metodę defaultową run() z tego właśnie interfejsu funkcyjnego
        lambdaThread.start();

        thread.start();

        // Main Program thread
        try {
            threadFlow("MAIN THREAD WORKS");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
