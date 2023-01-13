import java.util.concurrent.*;

class CallableTask implements Callable<String> {

    private final String name;

    public CallableTask(String name){
        this.name = name;
    }
    @Override
    public String call() throws Exception {
        Thread.sleep(1000); //simulate processing stuff
        return "Hello" + name;
    }
}
public class CallableTasks {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = (ExecutorService) Executors.newFixedThreadPool(1);
        Future<String> welcome = //future means result later
                executorService.submit(new CallableTask(" there"));
        System.out.println("new task executed");

        String welcomeMsg = welcome.get();
        System.out.println(welcomeMsg);

        System.out.println("\n main completed");
        executorService.shutdown();
    }
}
