package cadence;

import java.util.ArrayList;
import cadence.stride.StrideInterface;

public class Runner {
    private final StrideFactory factory;

    public Runner() {
        this.factory = new StrideFactory();
    }

    public void run(String[] args) {
        for (String arg: args) {
            System.out.println("Nice! arg: " + arg);
            System.out.println("------------\n");
        }

        ArrayList<StrideInterface> strides = this.factory.createStrides();
        for (StrideInterface stride: strides) {
            stride.printStrideStart();
            stride.run();
            stride.printStrideEnd();
        }
    }
}
