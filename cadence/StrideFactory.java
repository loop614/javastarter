package cadence;

import java.util.ArrayList;

import cadence.stride.*;

public class StrideFactory {
    public ArrayList<StrideImpl> createStrides() {
        ArrayList<StrideImpl> strides = new ArrayList<StrideImpl>();
        strides.add(this.createJvType());
        strides.add(this.createJvArray());
        strides.add(this.createJvMap());
        strides.add(this.createJvRecord());
        strides.add(this.createJvRequest());
        strides.add(this.createJvStream());
        strides.add(this.createJvCollector());

        return strides;
    }

    private StrideImpl createJvType() {
        return new JvType();
    }

    private StrideImpl createJvArray() {
        return new JvArray();
    }

    private StrideImpl createJvMap() {
        return new JvMap();
    }

    private StrideImpl createJvRecord() {
        return new JvRecord();
    }

    private StrideImpl createJvRequest() {
        return new JvRequest();
    }

    private StrideImpl createJvStream() {
        return new JvStream();
    }

    private StrideImpl createJvCollector() {
        return new JvCollector();
    }
}
