package cadence;

import java.util.ArrayList;
import cadence.stride.Stride;

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

        ArrayList<Stride> strides = this.factory.createStrides();
        for (Stride stride: strides) {
            stride.printStrideStart();
            stride.run();
            stride.printStrideEnd();
        }
    }
}
