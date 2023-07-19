package TheradRace;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread t1 = new Thread(counter);
        Thread t2 = new Thread(counter);
        Thread t3 = new Thread(counter);
        Thread t4 = new Thread(counter);
        t1.start();t2.start();t3.start();t4.start();

       while (t1.isAlive() || t2.isAlive() ||t3.isAlive() ||t4.isAlive()){}

        System.out.println(" size of odds => "+Counter.odds.size());
        System.out.println(" size of evens => "+Counter.odds.size());
    }

}
