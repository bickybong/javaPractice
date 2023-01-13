import java.security.PrivilegedAction;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer> {
    @Override
    public boolean test(Integer num) {
        return num%2 == 0;
    }
}

class SystemOutConsumer implements Consumer<Integer> {
    @Override
    public void accept(Integer num) {
        System.out.println(num);
    }
}

class NumberSquare implements Function<Integer, Integer> {
    @Override
    public Integer apply(Integer integer) {
        return integer*integer;
    }
}
public class lambdaBehindTheSeens {
    public static void main(String[] args) {
        PrivilegedAction<Predicate<Integer>> evenPredicate = () -> n -> n % 2 == 0;
        PrivilegedAction<Predicate<Integer>> oddPredicate = () -> n -> n % 1 == 0;
        List.of(23,43,34,45,64,22).stream()
                .filter(evenPredicate.run())
                .map(n -> n*n)
                .forEach(e -> System.out.println(e));

        List.of(23,43,34,45,64,22).stream()
                .filter(new EvenNumberPredicate())
                .map(new NumberSquare())
                .forEach(new SystemOutConsumer());

//            .filter(new EvenNumberPredicate())
//            Stream<T> filter(Predicate<? super T> predicate);
//            boolean test(T t);

//                        .map(n -> n*n)
//            <R> Stream<R> map(Function<? super T, ? extends R> mapper);
//            R apply(T t);

//                        .forEach(new SystemOutConsumer());
//            void forEach(Consumer<? super T> action);
//            void accept(T t);
    }
}
