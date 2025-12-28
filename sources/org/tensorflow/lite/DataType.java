package org.tensorflow.lite;

public enum DataType {
    FLOAT32(1),
    INT32(2),
    UINT8(3),
    INT64(4),
    STRING(5),
    BOOL(6),
    INT16(7),
    INT8(9);
    
    private final int value;

    private DataType(int i4) {
        this.value = i4;
    }

    public int byteSize() {
        switch (ordinal()) {
            case 0:
            case 1:
                return 4;
            case 2:
            case 7:
                return 1;
            case 3:
                return 8;
            case 4:
            case 5:
                return -1;
            case 6:
                return 2;
            default:
                throw new IllegalArgumentException("DataType error: DataType " + this + " is not supported yet");
        }
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.value;
    }
}
