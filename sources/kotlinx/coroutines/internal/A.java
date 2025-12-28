package kotlinx.coroutines.internal;

abstract /* synthetic */ class A {

    /* renamed from: a  reason: collision with root package name */
    private static final int f14142a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f14142a;
    }

    public static final String b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
