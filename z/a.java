package Z;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public final class a implements j {

    /* renamed from: c  reason: collision with root package name */
    public static final C0040a f2127c = new C0040a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f2128a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f2129b;

    /* renamed from: Z.a$a  reason: collision with other inner class name */
    public static final class C0040a {
        public /* synthetic */ C0040a(i iVar) {
            this();
        }

        private final void a(i iVar, int i4, Object obj) {
            long j4;
            if (obj == null) {
                iVar.B(i4);
            } else if (obj instanceof byte[]) {
                iVar.a0(i4, (byte[]) obj);
            } else if (obj instanceof Float) {
                iVar.E(i4, (double) ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                iVar.E(i4, ((Number) obj).doubleValue());
            } else if (obj instanceof Long) {
                iVar.U(i4, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                iVar.U(i4, (long) ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                iVar.U(i4, (long) ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                iVar.U(i4, (long) ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                iVar.q(i4, (String) obj);
            } else if (obj instanceof Boolean) {
                if (((Boolean) obj).booleanValue()) {
                    j4 = 1;
                } else {
                    j4 = 0;
                }
                iVar.U(i4, j4);
            } else {
                throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i4 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
            }
        }

        public final void b(i iVar, Object[] objArr) {
            o.e(iVar, "statement");
            if (objArr != null) {
                int length = objArr.length;
                int i4 = 0;
                while (i4 < length) {
                    Object obj = objArr[i4];
                    i4++;
                    a(iVar, i4, obj);
                }
            }
        }

        private C0040a() {
        }
    }

    public a(String str, Object[] objArr) {
        o.e(str, "query");
        this.f2128a = str;
        this.f2129b = objArr;
    }

    public void a(i iVar) {
        o.e(iVar, "statement");
        f2127c.b(iVar, this.f2129b);
    }

    public String e() {
        return this.f2128a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(String str) {
        this(str, (Object[]) null);
        o.e(str, "query");
    }
}
