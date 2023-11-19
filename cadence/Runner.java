package cadence;

import java.util.ArrayList;
import cadence.stride.StrideImpl;

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

        ArrayList<StrideImpl> strides = this.factory.createStrides();
        for (StrideImpl stride: strides) {
            stride.printStrideStart();
            stride.run();
            stride.printStrideEnd();
        }
    }
}
