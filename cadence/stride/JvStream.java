package cadence.stride;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JvStream extends AbstractStride implements StrideInterface {
    @Override
    public void run() {
        IntStream.range(0, 3)
                .peek(System.out::println)
                .filter(i -> i % 2 == 0)
                .mapToObj(i -> "Stream says hi even #" + i)
                .forEach(System.out::println);


        int result = Stream.of(1,2,3)
                .reduce(0, (acc, curr) -> acc / 2 + curr);

        System.out.println("Stream weird addition " + result);
    }
}
