package cadence.stride;

import java.util.concurrent.atomic.AtomicLong;

public record JvRecord() implements StrideInterface {
    @Override
    public void run() {
        AtomicLong a = new AtomicLong();
        a.set(1);
        System.out.println("this is a record, and its immutable and final");
    }

    @Override
    public void printStrideStart() {
        System.out.println("Records cant extend anything, thus this is special println. :\n");
        System.out.println("Running stride " + this.getClass().getSimpleName() + ":\n");
    }

    @Override
    public void printStrideEnd() {
        System.out.println("\nStride done.\n");
        System.out.println("------------\n");
    }
}
