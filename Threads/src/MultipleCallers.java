import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallers {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = (ExecutorService) Executors.newFixedThreadPool(3);
        List<CallableTask> tasks = List.of(new CallableTask(" there"),
                new CallableTask(" sheesh"), new CallableTask(" baby"));
        List<Future<String>> results = executorService.invokeAll(tasks); //invokes all tasks

        for(Future<String> result:results){
            System.out.println(result.get());
        }

        executorService.shutdown();

    }
}
