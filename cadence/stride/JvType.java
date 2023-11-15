package cadence.stride;

import java.util.Arrays;

public class JvType extends AbstractStride {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    @Override
    public void run() {
        tryPrimitives();
        tryObjects();
    }

    private void tryObjects() {
        Byte b = 0x11;
        Short s = 2;
        Integer i = 2;
        Long l = 2147483647L;
        Float f = -1f;
        Double d = 1.2147483648;
        Boolean bb = false;
        Character c = 'c';
        Character a = 'a';
        Character t = 't';
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        sb.append(a);
        sb.append(t);
        System.out.println(sb + "<- i built this");

        Level high = Level.HIGH;
        String myWord = "my word";
        System.out.println(b + " byte bytes: " + Byte.BYTES);
        System.out.println(c + " char bytes: " + Character.BYTES);
        System.out.println(i + " int bytes: " + Integer.BYTES);
        System.out.println(l + " long bytes: " + Long.BYTES);
        System.out.println(s + " short bytes: " + Short.BYTES);
        System.out.println(d + " double bytes: " + Double.BYTES);
        System.out.println(f + " float bytes: " + Float.BYTES);
        System.out.println(bb + " boolean");
        System.out.println(myWord + " is a string with length " + myWord.length() + " with first letter " + myWord.charAt(0));
        System.out.println(high + " level must be high");
    }

    private void tryPrimitives() {
        byte b = 0x11;
        short s = 2;
        int i = 1;
        long l = 2147483647;
        float f = -1;
        double d = 1.2147483648;
        boolean bb = false;
        char c = 'c';

        Level high = Level.HIGH;
        String myWord = "my word";

        System.out.println(bb + " boolean");
        System.out.println(myWord + " is a string with length " + myWord.length() + " with first letter " + myWord.charAt(0));
        System.out.println(high + " level must be high");

        System.out.println("---");
        int[] arr = {3, 2, 1};
        int sum = Arrays.stream(arr).sum();
        System.out.println(sum + " is the sum of " + Arrays.toString(arr));
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        printMeToScreen(arr);
        System.out.println("---");
    }

    public <T> void printMeToScreen(T a) {
        System.out.println(a);
    }
}
