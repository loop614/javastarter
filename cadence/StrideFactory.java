package cadence;

import java.util.ArrayList;

import cadence.stride.*;

public class StrideFactory {
    public ArrayList<StrideInterface> createStrides() {
        ArrayList<StrideInterface> strides = new ArrayList<StrideInterface>();
        strides.add(this.createJvType());
        strides.add(this.createJvArray());
        strides.add(this.createJvMap());
        strides.add(this.createJvRecord());
        strides.add(this.createJvRequest());
        strides.add(this.createJvStream());

        return strides;
    }

    private StrideInterface createJvType() {
        return new JvType();
    }

    private StrideInterface createJvArray() {
        return new JvArray();
    }

    private StrideInterface createJvMap() {
        return new JvMap();
    }

    private StrideInterface createJvRecord() {
        return new JvRecord();
    }

    private StrideInterface createJvRequest() {
        return new JvRequest();
    }

    private StrideInterface createJvStream() {
        return new JvStream();
    }
}
