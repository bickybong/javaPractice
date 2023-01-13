class Task1 extends Thread{
    public void run(){
        System.out.println("\n Task1 start");
        for (int i=101; i<=200; i++){
            System.out.print(i + " ");
        }
        Thread.yield(); //let other threads take more cpu
        try {
            Thread.sleep(200); //wait 2 secs before next line executes
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("\n Task1 is Done");
    }
}

class Task2 implements Runnable{

    @Override
    public void run() {
        System.out.println("\n Task2 start");
        for (int i=201; i<=300; i++){
            System.out.print(i + " ");
        }
        System.out.println("\n Task2 is Done");
    }
}
public class ThreadBasics {
    public static void main(String[] args) throws InterruptedException {
//        task 1
        Task1 task1 = new Task1();
        task1.setPriority(5);
        task1.start();

//        task 2
        Task2 task2 = new Task2();
        Thread task2Thread = new Thread(task2);
        task2Thread.start();

//        task 3
        task1.join(); //wait for task1 to finish than execute the rest
        task2Thread.join();
        System.out.println("\n Task3 start");
        for (int i=301; i<=400; i++){
            System.out.print(i + " ");
        }
        System.out.println("\n Task3 is Done");
    }
}
