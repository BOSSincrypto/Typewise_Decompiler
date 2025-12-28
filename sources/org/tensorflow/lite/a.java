package org.tensorflow.lite;

abstract class a {

    /* renamed from: org.tensorflow.lite.a$a  reason: collision with other inner class name */
    static /* synthetic */ class C0218a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f15738a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                org.tensorflow.lite.DataType[] r0 = org.tensorflow.lite.DataType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15738a = r0
                org.tensorflow.lite.DataType r1 = org.tensorflow.lite.DataType.FLOAT32     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15738a     // Catch:{ NoSuchFieldError -> 0x001d }
                org.tensorflow.lite.DataType r1 = org.tensorflow.lite.DataType.INT32     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f15738a     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.tensorflow.lite.DataType r1 = org.tensorflow.lite.DataType.INT16     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f15738a     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.tensorflow.lite.DataType r1 = org.tensorflow.lite.DataType.INT8     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f15738a     // Catch:{ NoSuchFieldError -> 0x003e }
                org.tensorflow.lite.DataType r1 = org.tensorflow.lite.DataType.UINT8     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f15738a     // Catch:{ NoSuchFieldError -> 0x0049 }
                org.tensorflow.lite.DataType r1 = org.tensorflow.lite.DataType.INT64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f15738a     // Catch:{ NoSuchFieldError -> 0x0054 }
                org.tensorflow.lite.DataType r1 = org.tensorflow.lite.DataType.BOOL     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f15738a     // Catch:{ NoSuchFieldError -> 0x0060 }
                org.tensorflow.lite.DataType r1 = org.tensorflow.lite.DataType.STRING     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.tensorflow.lite.a.C0218a.<clinit>():void");
        }
    }

    static DataType a(int i4) {
        switch (i4) {
            case 1:
                return DataType.FLOAT32;
            case 2:
                return DataType.INT32;
            case 3:
                return DataType.UINT8;
            case 4:
                return DataType.INT64;
            case 5:
                return DataType.STRING;
            case 6:
                return DataType.BOOL;
            case 7:
                return DataType.INT16;
            case 9:
                return DataType.INT8;
            default:
                throw new IllegalArgumentException("DataType error: DataType " + i4 + " is not recognized in Java.");
        }
    }

    static String b(DataType dataType) {
        switch (C0218a.f15738a[dataType.ordinal()]) {
            case 1:
                return "float";
            case 2:
                return "int";
            case 3:
                return "short";
            case 4:
            case 5:
                return "byte";
            case 6:
                return "long";
            case 7:
                return "bool";
            case 8:
                return "string";
            default:
                throw new IllegalArgumentException("DataType error: DataType " + dataType + " is not supported yet");
        }
    }
}
