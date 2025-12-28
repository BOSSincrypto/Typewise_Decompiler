package J;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final c f592a;

    private static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        private final Uri f594a;

        /* renamed from: b  reason: collision with root package name */
        private final ClipDescription f595b;

        /* renamed from: c  reason: collision with root package name */
        private final Uri f596c;

        b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f594a = uri;
            this.f595b = clipDescription;
            this.f596c = uri2;
        }

        public Object a() {
            return null;
        }

        public Uri b() {
            return this.f594a;
        }

        public void c() {
        }

        public Uri d() {
            return this.f596c;
        }

        public ClipDescription getDescription() {
            return this.f595b;
        }
    }

    private interface c {
        Object a();

        Uri b();

        void c();

        Uri d();

        ClipDescription getDescription();
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f592a = new a(uri, clipDescription, uri2);
        } else {
            this.f592a = new b(uri, clipDescription, uri2);
        }
    }

    public static f f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new f(new a(obj));
        }
        return null;
    }

    public Uri a() {
        return this.f592a.b();
    }

    public ClipDescription b() {
        return this.f592a.getDescription();
    }

    public Uri c() {
        return this.f592a.d();
    }

    public void d() {
        this.f592a.c();
    }

    public Object e() {
        return this.f592a.a();
    }

    private static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        final InputContentInfo f593a;

        a(Object obj) {
            this.f593a = (InputContentInfo) obj;
        }

        public Object a() {
            return this.f593a;
        }

        public Uri b() {
            return this.f593a.getContentUri();
        }

        public void c() {
            this.f593a.requestPermission();
        }

        public Uri d() {
            return this.f593a.getLinkUri();
        }

        public ClipDescription getDescription() {
            return this.f593a.getDescription();
        }

        a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f593a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    private f(c cVar) {
        this.f592a = cVar;
    }
}
