package cadence.stride;

abstract public class AbstractStride implements StrideImpl {
    @Override
    public void printStrideStart() {
        System.out.println("Running stride " + this.getClass().getSimpleName() + ":\n");
    }

    @Override
    public void printStrideEnd() {
        System.out.println("\nStride done.\n");
        System.out.println("------------\n");
    }
}
