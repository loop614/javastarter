package cadence.stride;

import java.util.List;

public class JvCollector extends AbstractStride {
    @Override
    public void run() {
        List<String> vowels = List.of("a", "e", "i", "o", "u");

        StringBuilder result = vowels.stream().collect(
                StringBuilder::new,
                StringBuilder::append,
                (a, b) -> a.append(",").append(b)
        );
        System.out.println(result.toString());

        StringBuilder result1 = vowels.parallelStream().collect(
                StringBuilder::new,
                StringBuilder::append,
                (a, b) -> a.append(",").append(b)
        );
        System.out.println(result1.toString());
    }
}
