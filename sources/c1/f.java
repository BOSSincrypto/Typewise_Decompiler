package c1;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import c1.n;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import g1.i;
import g1.l;
import java.io.IOException;
import java.io.InputStream;
import o1.C0839b;

public final class f implements n {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7534a;

    /* renamed from: b  reason: collision with root package name */
    private final e f7535b;

    private static final class a implements o, e {

        /* renamed from: a  reason: collision with root package name */
        private final Context f7536a;

        a(Context context) {
            this.f7536a = context;
        }

        public Class a() {
            return AssetFileDescriptor.class;
        }

        public n c(r rVar) {
            return new f(this.f7536a, this);
        }

        /* renamed from: e */
        public void b(AssetFileDescriptor assetFileDescriptor) {
            assetFileDescriptor.close();
        }

        /* renamed from: f */
        public AssetFileDescriptor d(Resources.Theme theme, Resources resources, int i4) {
            return resources.openRawResourceFd(i4);
        }
    }

    private static final class b implements o, e {

        /* renamed from: a  reason: collision with root package name */
        private final Context f7537a;

        b(Context context) {
            this.f7537a = context;
        }

        public Class a() {
            return Drawable.class;
        }

        public n c(r rVar) {
            return new f(this.f7537a, this);
        }

        /* renamed from: e */
        public void b(Drawable drawable) {
        }

        /* renamed from: f */
        public Drawable d(Resources.Theme theme, Resources resources, int i4) {
            return i.a(this.f7537a, i4, theme);
        }
    }

    private static final class c implements o, e {

        /* renamed from: a  reason: collision with root package name */
        private final Context f7538a;

        c(Context context) {
            this.f7538a = context;
        }

        public Class a() {
            return InputStream.class;
        }

        public n c(r rVar) {
            return new f(this.f7538a, this);
        }

        /* renamed from: e */
        public void b(InputStream inputStream) {
            inputStream.close();
        }

        /* renamed from: f */
        public InputStream d(Resources.Theme theme, Resources resources, int i4) {
            return resources.openRawResource(i4);
        }
    }

    private static final class d implements com.bumptech.glide.load.data.d {

        /* renamed from: a  reason: collision with root package name */
        private final Resources.Theme f7539a;

        /* renamed from: b  reason: collision with root package name */
        private final Resources f7540b;

        /* renamed from: c  reason: collision with root package name */
        private final e f7541c;

        /* renamed from: d  reason: collision with root package name */
        private final int f7542d;

        /* renamed from: e  reason: collision with root package name */
        private Object f7543e;

        d(Resources.Theme theme, Resources resources, e eVar, int i4) {
            this.f7539a = theme;
            this.f7540b = resources;
            this.f7541c = eVar;
            this.f7542d = i4;
        }

        public Class a() {
            return this.f7541c.a();
        }

        public void b() {
            Object obj = this.f7543e;
            if (obj != null) {
                try {
                    this.f7541c.b(obj);
                } catch (IOException unused) {
                }
            }
        }

        public void cancel() {
        }

        public DataSource e() {
            return DataSource.LOCAL;
        }

        public void f(Priority priority, d.a aVar) {
            try {
                Object d4 = this.f7541c.d(this.f7539a, this.f7540b, this.f7542d);
                this.f7543e = d4;
                aVar.d(d4);
            } catch (Resources.NotFoundException e4) {
                aVar.c(e4);
            }
        }
    }

    private interface e {
        Class a();

        void b(Object obj);

        Object d(Resources.Theme theme, Resources resources, int i4);
    }

    f(Context context, e eVar) {
        this.f7534a = context.getApplicationContext();
        this.f7535b = eVar;
    }

    public static o c(Context context) {
        return new a(context);
    }

    public static o e(Context context) {
        return new b(context);
    }

    public static o g(Context context) {
        return new c(context);
    }

    /* renamed from: d */
    public n.a a(Integer num, int i4, int i5, X0.d dVar) {
        Resources resources;
        Resources.Theme theme = (Resources.Theme) dVar.c(l.f13609b);
        if (theme != null) {
            resources = theme.getResources();
        } else {
            resources = this.f7534a.getResources();
        }
        return new n.a(new C0839b(num), new d(theme, resources, this.f7535b, num.intValue()));
    }

    /* renamed from: f */
    public boolean b(Integer num) {
        return true;
    }
}
