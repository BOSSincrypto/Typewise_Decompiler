package org.tensorflow.lite.nnapi;

import org.tensorflow.lite.TensorFlowLite;
import org.tensorflow.lite.d;

public class a implements org.tensorflow.lite.b, AutoCloseable {

    /* renamed from: a  reason: collision with root package name */
    private C0219a f15747a;

    /* renamed from: b  reason: collision with root package name */
    private b f15748b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f15749c;

    /* renamed from: org.tensorflow.lite.nnapi.a$a  reason: collision with other inner class name */
    public static final class C0219a {

        /* renamed from: a  reason: collision with root package name */
        private int f15750a = -1;

        /* renamed from: b  reason: collision with root package name */
        private String f15751b = null;

        /* renamed from: c  reason: collision with root package name */
        private String f15752c = null;

        /* renamed from: d  reason: collision with root package name */
        private String f15753d = null;

        /* renamed from: e  reason: collision with root package name */
        private Integer f15754e = null;

        /* renamed from: f  reason: collision with root package name */
        private Boolean f15755f = null;

        /* renamed from: g  reason: collision with root package name */
        private Boolean f15756g = null;

        /* renamed from: h  reason: collision with root package name */
        private long f15757h = 0;

        public String a() {
            return this.f15751b;
        }

        public boolean b() {
            Boolean bool = this.f15756g;
            if (bool == null || !bool.booleanValue()) {
                return false;
            }
            return true;
        }

        public String c() {
            return this.f15752c;
        }

        public int d() {
            return this.f15750a;
        }

        public int e() {
            Integer num = this.f15754e;
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        public String f() {
            return this.f15753d;
        }

        public long g() {
            return this.f15757h;
        }

        public Boolean h() {
            return this.f15755f;
        }
    }

    public interface b extends org.tensorflow.lite.b, AutoCloseable {
        void close();
    }

    public a(C0219a aVar) {
        TensorFlowLite.a();
        this.f15747a = aVar;
    }

    private void a() {
        String str;
        if (this.f15748b == null) {
            if (this.f15749c) {
                str = "Should not access delegate after delegate has been closed.";
            } else {
                str = "Should not access delegate before interpreter has been constructed.";
            }
            throw new IllegalStateException(str);
        }
    }

    public long F() {
        a();
        return this.f15748b.F();
    }

    public void close() {
        b bVar = this.f15748b;
        if (bVar != null) {
            bVar.close();
            this.f15748b = null;
        }
    }

    public void e(d dVar) {
        this.f15748b = dVar.a(this.f15747a);
        this.f15749c = true;
    }

    public a() {
        this(new C0219a());
    }
}
