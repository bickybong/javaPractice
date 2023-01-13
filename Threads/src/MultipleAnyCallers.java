import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleAnyCallers {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = (ExecutorService) Executors.newFixedThreadPool(3);
        List<CallableTask> tasks = List.of(new CallableTask(" there"),
                new CallableTask(" sheesh"), new CallableTask(" baby"));
        String results = executorService.invokeAny(tasks); //takes the first task that runs

        System.out.println(results);

        executorService.shutdown(); //stops the executor

    }
}
