package androidx.room;

import Z.i;
import Z.j;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.o;
import l2.q;

public final class u implements j, i {

    /* renamed from: i  reason: collision with root package name */
    public static final a f6871i = new a((kotlin.jvm.internal.i) null);

    /* renamed from: j  reason: collision with root package name */
    public static final TreeMap f6872j = new TreeMap();

    /* renamed from: a  reason: collision with root package name */
    private final int f6873a;

    /* renamed from: b  reason: collision with root package name */
    private volatile String f6874b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f6875c;

    /* renamed from: d  reason: collision with root package name */
    public final double[] f6876d;

    /* renamed from: e  reason: collision with root package name */
    public final String[] f6877e;

    /* renamed from: f  reason: collision with root package name */
    public final byte[][] f6878f;

    /* renamed from: g  reason: collision with root package name */
    private final int[] f6879g;

    /* renamed from: h  reason: collision with root package name */
    private int f6880h;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final u a(String str, int i4) {
            o.e(str, "query");
            TreeMap treeMap = u.f6872j;
            synchronized (treeMap) {
                Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i4));
                if (ceilingEntry != null) {
                    treeMap.remove(ceilingEntry.getKey());
                    u uVar = (u) ceilingEntry.getValue();
                    uVar.m(str, i4);
                    o.d(uVar, "sqliteQuery");
                    return uVar;
                }
                q qVar = q.f14567a;
                u uVar2 = new u(i4, (kotlin.jvm.internal.i) null);
                uVar2.m(str, i4);
                return uVar2;
            }
        }

        public final void b() {
            TreeMap treeMap = u.f6872j;
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                o.d(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i4 = size - 1;
                    if (size > 0) {
                        it.next();
                        it.remove();
                        size = i4;
                    } else {
                        return;
                    }
                }
            }
        }

        private a() {
        }
    }

    public /* synthetic */ u(int i4, kotlin.jvm.internal.i iVar) {
        this(i4);
    }

    public static final u f(String str, int i4) {
        return f6871i.a(str, i4);
    }

    public void B(int i4) {
        this.f6879g[i4] = 1;
    }

    public void E(int i4, double d4) {
        this.f6879g[i4] = 3;
        this.f6876d[i4] = d4;
    }

    public void U(int i4, long j4) {
        this.f6879g[i4] = 2;
        this.f6875c[i4] = j4;
    }

    public void a(i iVar) {
        o.e(iVar, "statement");
        int h4 = h();
        if (1 <= h4) {
            int i4 = 1;
            while (true) {
                int i5 = this.f6879g[i4];
                if (i5 == 1) {
                    iVar.B(i4);
                } else if (i5 == 2) {
                    iVar.U(i4, this.f6875c[i4]);
                } else if (i5 == 3) {
                    iVar.E(i4, this.f6876d[i4]);
                } else if (i5 == 4) {
                    String str = this.f6877e[i4];
                    if (str != null) {
                        iVar.q(i4, str);
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else if (i5 == 5) {
                    byte[] bArr = this.f6878f[i4];
                    if (bArr != null) {
                        iVar.a0(i4, bArr);
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                if (i4 != h4) {
                    i4++;
                } else {
                    return;
                }
            }
        }
    }

    public void a0(int i4, byte[] bArr) {
        o.e(bArr, "value");
        this.f6879g[i4] = 5;
        this.f6878f[i4] = bArr;
    }

    public void close() {
    }

    public String e() {
        String str = this.f6874b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public int h() {
        return this.f6880h;
    }

    public final void m(String str, int i4) {
        o.e(str, "query");
        this.f6874b = str;
        this.f6880h = i4;
    }

    public final void o() {
        TreeMap treeMap = f6872j;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f6873a), this);
            f6871i.b();
            q qVar = q.f14567a;
        }
    }

    public void q(int i4, String str) {
        o.e(str, "value");
        this.f6879g[i4] = 4;
        this.f6877e[i4] = str;
    }

    private u(int i4) {
        this.f6873a = i4;
        int i5 = i4 + 1;
        this.f6879g = new int[i5];
        this.f6875c = new long[i5];
        this.f6876d = new double[i5];
        this.f6877e = new String[i5];
        this.f6878f = new byte[i5][];
    }
}
