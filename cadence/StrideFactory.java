package cadence;

import java.util.ArrayList;

import cadence.stride.*;

public class StrideFactory {
    public ArrayList<Stride> createStrides() {
        ArrayList<Stride> strides = new ArrayList<Stride>();
        strides.add(this.createJvType());
        strides.add(this.createJvArray());
        strides.add(this.createJvMap());
        strides.add(this.createJvRecord());
        strides.add(this.createJvRequest());
        strides.add(this.createJvStream());
        strides.add(this.createJvCollector());

        return strides;
    }

    private Stride createJvType() {
        return new JvType();
    }

    private Stride createJvArray() {
        return new JvArray();
    }

    private Stride createJvMap() {
        return new JvMap();
    }

    private Stride createJvRecord() {
        return new JvRecord();
    }

    private Stride createJvRequest() {
        return new JvRequest();
    }

    private Stride createJvStream() {
        return new JvStream();
    }

    private Stride createJvCollector() {
        return new JvCollector();
    }
}
