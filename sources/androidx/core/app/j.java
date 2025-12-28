package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public abstract class j {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final Bundle f4764a;

        /* renamed from: b  reason: collision with root package name */
        private IconCompat f4765b;

        /* renamed from: c  reason: collision with root package name */
        private final o[] f4766c;

        /* renamed from: d  reason: collision with root package name */
        private final o[] f4767d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f4768e;

        /* renamed from: f  reason: collision with root package name */
        boolean f4769f = true;

        /* renamed from: g  reason: collision with root package name */
        private final int f4770g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f4771h;

        /* renamed from: i  reason: collision with root package name */
        public int f4772i;

        /* renamed from: j  reason: collision with root package name */
        public CharSequence f4773j;

        /* renamed from: k  reason: collision with root package name */
        public PendingIntent f4774k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f4775l;

        /* renamed from: androidx.core.app.j$a$a  reason: collision with other inner class name */
        public static final class C0067a {

            /* renamed from: a  reason: collision with root package name */
            private final IconCompat f4776a;

            /* renamed from: b  reason: collision with root package name */
            private final CharSequence f4777b;

            /* renamed from: c  reason: collision with root package name */
            private final PendingIntent f4778c;

            /* renamed from: d  reason: collision with root package name */
            private boolean f4779d;

            /* renamed from: e  reason: collision with root package name */
            private final Bundle f4780e;

            /* renamed from: f  reason: collision with root package name */
            private ArrayList f4781f;

            /* renamed from: g  reason: collision with root package name */
            private int f4782g;

            /* renamed from: h  reason: collision with root package name */
            private boolean f4783h;

            /* renamed from: i  reason: collision with root package name */
            private boolean f4784i;

            /* renamed from: j  reason: collision with root package name */
            private boolean f4785j;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public C0067a(int i4, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i4 != 0 ? IconCompat.c((Resources) null, "", i4) : null, charSequence, pendingIntent, new Bundle(), (o[]) null, true, 0, true, false, false);
            }

            private void c() {
                if (this.f4784i && this.f4778c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            public C0067a a(o oVar) {
                if (this.f4781f == null) {
                    this.f4781f = new ArrayList();
                }
                if (oVar != null) {
                    this.f4781f.add(oVar);
                }
                return this;
            }

            /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.Object[]] */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public androidx.core.app.j.a b() {
                /*
                    r17 = this;
                    r0 = r17
                    r17.c()
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    java.util.ArrayList r3 = r0.f4781f
                    if (r3 == 0) goto L_0x0031
                    java.util.Iterator r3 = r3.iterator()
                L_0x0017:
                    boolean r4 = r3.hasNext()
                    if (r4 == 0) goto L_0x0031
                    java.lang.Object r4 = r3.next()
                    androidx.core.app.o r4 = (androidx.core.app.o) r4
                    boolean r5 = r4.k()
                    if (r5 == 0) goto L_0x002d
                    r1.add(r4)
                    goto L_0x0017
                L_0x002d:
                    r2.add(r4)
                    goto L_0x0017
                L_0x0031:
                    boolean r3 = r1.isEmpty()
                    r4 = 0
                    if (r3 == 0) goto L_0x003a
                    r11 = r4
                    goto L_0x0047
                L_0x003a:
                    int r3 = r1.size()
                    androidx.core.app.o[] r3 = new androidx.core.app.o[r3]
                    java.lang.Object[] r1 = r1.toArray(r3)
                    androidx.core.app.o[] r1 = (androidx.core.app.o[]) r1
                    r11 = r1
                L_0x0047:
                    boolean r1 = r2.isEmpty()
                    if (r1 == 0) goto L_0x004f
                L_0x004d:
                    r10 = r4
                    goto L_0x005d
                L_0x004f:
                    int r1 = r2.size()
                    androidx.core.app.o[] r1 = new androidx.core.app.o[r1]
                    java.lang.Object[] r1 = r2.toArray(r1)
                    r4 = r1
                    androidx.core.app.o[] r4 = (androidx.core.app.o[]) r4
                    goto L_0x004d
                L_0x005d:
                    androidx.core.app.j$a r1 = new androidx.core.app.j$a
                    androidx.core.graphics.drawable.IconCompat r6 = r0.f4776a
                    java.lang.CharSequence r7 = r0.f4777b
                    android.app.PendingIntent r8 = r0.f4778c
                    android.os.Bundle r9 = r0.f4780e
                    boolean r12 = r0.f4779d
                    int r13 = r0.f4782g
                    boolean r14 = r0.f4783h
                    boolean r15 = r0.f4784i
                    boolean r2 = r0.f4785j
                    r5 = r1
                    r16 = r2
                    r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.j.a.C0067a.b():androidx.core.app.j$a");
            }

            private C0067a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, o[] oVarArr, boolean z3, int i4, boolean z4, boolean z5, boolean z6) {
                ArrayList arrayList;
                this.f4779d = true;
                this.f4783h = true;
                this.f4776a = iconCompat;
                this.f4777b = d.d(charSequence);
                this.f4778c = pendingIntent;
                this.f4780e = bundle;
                if (oVarArr == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(Arrays.asList(oVarArr));
                }
                this.f4781f = arrayList;
                this.f4779d = z3;
                this.f4782g = i4;
                this.f4783h = z4;
                this.f4784i = z5;
                this.f4785j = z6;
            }
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, o[] oVarArr, o[] oVarArr2, boolean z3, int i4, boolean z4, boolean z5, boolean z6) {
            this.f4765b = iconCompat;
            if (iconCompat != null && iconCompat.f() == 2) {
                this.f4772i = iconCompat.d();
            }
            this.f4773j = d.d(charSequence);
            this.f4774k = pendingIntent;
            this.f4764a = bundle == null ? new Bundle() : bundle;
            this.f4766c = oVarArr;
            this.f4767d = oVarArr2;
            this.f4768e = z3;
            this.f4770g = i4;
            this.f4769f = z4;
            this.f4771h = z5;
            this.f4775l = z6;
        }

        public PendingIntent a() {
            return this.f4774k;
        }

        public boolean b() {
            return this.f4768e;
        }

        public Bundle c() {
            return this.f4764a;
        }

        public IconCompat d() {
            int i4;
            if (this.f4765b == null && (i4 = this.f4772i) != 0) {
                this.f4765b = IconCompat.c((Resources) null, "", i4);
            }
            return this.f4765b;
        }

        public o[] e() {
            return this.f4766c;
        }

        public int f() {
            return this.f4770g;
        }

        public boolean g() {
            return this.f4769f;
        }

        public CharSequence h() {
            return this.f4773j;
        }

        public boolean i() {
            return this.f4775l;
        }

        public boolean j() {
            return this.f4771h;
        }
    }

    public static class b extends f {

        /* renamed from: e  reason: collision with root package name */
        private CharSequence f4786e;

        static class a {
            static Notification.BigTextStyle a(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.bigText(charSequence);
            }

            static Notification.BigTextStyle b(Notification.Builder builder) {
                return new Notification.BigTextStyle(builder);
            }

            static Notification.BigTextStyle c(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setBigContentTitle(charSequence);
            }

            static Notification.BigTextStyle d(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setSummaryText(charSequence);
            }
        }

        public void a(Bundle bundle) {
            super.a(bundle);
        }

        public void b(i iVar) {
            Notification.BigTextStyle a4 = a.a(a.c(a.b(iVar.a()), this.f4836b), this.f4786e);
            if (this.f4838d) {
                a.d(a4, this.f4837c);
            }
        }

        /* access modifiers changed from: protected */
        public String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public b h(CharSequence charSequence) {
            this.f4786e = d.d(charSequence);
            return this;
        }

        public b i(CharSequence charSequence) {
            this.f4837c = d.d(charSequence);
            this.f4838d = true;
            return this;
        }
    }

    public static final class c {
        public static Notification.BubbleMetadata a(c cVar) {
            return null;
        }
    }

    public static class d {

        /* renamed from: A  reason: collision with root package name */
        boolean f4787A;

        /* renamed from: B  reason: collision with root package name */
        boolean f4788B;

        /* renamed from: C  reason: collision with root package name */
        String f4789C;

        /* renamed from: D  reason: collision with root package name */
        Bundle f4790D;

        /* renamed from: E  reason: collision with root package name */
        int f4791E = 0;

        /* renamed from: F  reason: collision with root package name */
        int f4792F = 0;

        /* renamed from: G  reason: collision with root package name */
        Notification f4793G;

        /* renamed from: H  reason: collision with root package name */
        RemoteViews f4794H;

        /* renamed from: I  reason: collision with root package name */
        RemoteViews f4795I;

        /* renamed from: J  reason: collision with root package name */
        RemoteViews f4796J;

        /* renamed from: K  reason: collision with root package name */
        String f4797K;

        /* renamed from: L  reason: collision with root package name */
        int f4798L = 0;

        /* renamed from: M  reason: collision with root package name */
        String f4799M;

        /* renamed from: N  reason: collision with root package name */
        long f4800N;

        /* renamed from: O  reason: collision with root package name */
        int f4801O = 0;

        /* renamed from: P  reason: collision with root package name */
        int f4802P = 0;

        /* renamed from: Q  reason: collision with root package name */
        boolean f4803Q;

        /* renamed from: R  reason: collision with root package name */
        Notification f4804R;

        /* renamed from: S  reason: collision with root package name */
        boolean f4805S;

        /* renamed from: T  reason: collision with root package name */
        Object f4806T;

        /* renamed from: U  reason: collision with root package name */
        public ArrayList f4807U;

        /* renamed from: a  reason: collision with root package name */
        public Context f4808a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList f4809b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public ArrayList f4810c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        ArrayList f4811d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        CharSequence f4812e;

        /* renamed from: f  reason: collision with root package name */
        CharSequence f4813f;

        /* renamed from: g  reason: collision with root package name */
        PendingIntent f4814g;

        /* renamed from: h  reason: collision with root package name */
        PendingIntent f4815h;

        /* renamed from: i  reason: collision with root package name */
        RemoteViews f4816i;

        /* renamed from: j  reason: collision with root package name */
        IconCompat f4817j;

        /* renamed from: k  reason: collision with root package name */
        CharSequence f4818k;

        /* renamed from: l  reason: collision with root package name */
        int f4819l;

        /* renamed from: m  reason: collision with root package name */
        int f4820m;

        /* renamed from: n  reason: collision with root package name */
        boolean f4821n = true;

        /* renamed from: o  reason: collision with root package name */
        boolean f4822o;

        /* renamed from: p  reason: collision with root package name */
        f f4823p;

        /* renamed from: q  reason: collision with root package name */
        CharSequence f4824q;

        /* renamed from: r  reason: collision with root package name */
        CharSequence f4825r;

        /* renamed from: s  reason: collision with root package name */
        CharSequence[] f4826s;

        /* renamed from: t  reason: collision with root package name */
        int f4827t;

        /* renamed from: u  reason: collision with root package name */
        int f4828u;

        /* renamed from: v  reason: collision with root package name */
        boolean f4829v;

        /* renamed from: w  reason: collision with root package name */
        String f4830w;

        /* renamed from: x  reason: collision with root package name */
        boolean f4831x;

        /* renamed from: y  reason: collision with root package name */
        String f4832y;

        /* renamed from: z  reason: collision with root package name */
        boolean f4833z = false;

        static class a {
            static AudioAttributes a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i4) {
                return builder.setContentType(i4);
            }

            static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i4) {
                return builder.setLegacyStreamType(i4);
            }

            static AudioAttributes.Builder e(AudioAttributes.Builder builder, int i4) {
                return builder.setUsage(i4);
            }
        }

        public d(Context context, String str) {
            Notification notification = new Notification();
            this.f4804R = notification;
            this.f4808a = context;
            this.f4797K = str;
            notification.when = System.currentTimeMillis();
            this.f4804R.audioStreamType = -1;
            this.f4820m = 0;
            this.f4807U = new ArrayList();
            this.f4803Q = true;
        }

        protected static CharSequence d(CharSequence charSequence) {
            if (charSequence != null && charSequence.length() > 5120) {
                return charSequence.subSequence(0, 5120);
            }
            return charSequence;
        }

        private void l(int i4, boolean z3) {
            if (z3) {
                Notification notification = this.f4804R;
                notification.flags = i4 | notification.flags;
                return;
            }
            Notification notification2 = this.f4804R;
            notification2.flags = (~i4) & notification2.flags;
        }

        public d a(a aVar) {
            if (aVar != null) {
                this.f4809b.add(aVar);
            }
            return this;
        }

        public Notification b() {
            return new k(this).c();
        }

        public Bundle c() {
            if (this.f4790D == null) {
                this.f4790D = new Bundle();
            }
            return this.f4790D;
        }

        public d e(boolean z3) {
            l(16, z3);
            return this;
        }

        public d f(int i4) {
            this.f4791E = i4;
            return this;
        }

        public d g(PendingIntent pendingIntent) {
            this.f4814g = pendingIntent;
            return this;
        }

        public d h(CharSequence charSequence) {
            this.f4813f = d(charSequence);
            return this;
        }

        public d i(CharSequence charSequence) {
            this.f4812e = d(charSequence);
            return this;
        }

        public d j(int i4) {
            Notification notification = this.f4804R;
            notification.defaults = i4;
            if ((i4 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public d k(PendingIntent pendingIntent) {
            this.f4804R.deleteIntent = pendingIntent;
            return this;
        }

        public d m(String str) {
            this.f4830w = str;
            return this;
        }

        public d n(boolean z3) {
            this.f4831x = z3;
            return this;
        }

        public d o(Bitmap bitmap) {
            IconCompat iconCompat;
            if (bitmap == null) {
                iconCompat = null;
            } else {
                iconCompat = IconCompat.b(j.b(this.f4808a, bitmap));
            }
            this.f4817j = iconCompat;
            return this;
        }

        public d p(boolean z3) {
            l(2, z3);
            return this;
        }

        public d q(boolean z3) {
            l(8, z3);
            return this;
        }

        public d r(int i4) {
            this.f4820m = i4;
            return this;
        }

        public d s(int i4) {
            this.f4804R.icon = i4;
            return this;
        }

        public d t(Uri uri) {
            Notification notification = this.f4804R;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder e4 = a.e(a.c(a.b(), 4), 5);
            this.f4804R.audioAttributes = a.a(e4);
            return this;
        }

        public d u(f fVar) {
            if (this.f4823p != fVar) {
                this.f4823p = fVar;
                if (fVar != null) {
                    fVar.g(this);
                }
            }
            return this;
        }

        public d v(CharSequence charSequence) {
            this.f4824q = d(charSequence);
            return this;
        }

        public d w(int i4) {
            this.f4792F = i4;
            return this;
        }
    }

    public static class e extends f {

        /* renamed from: e  reason: collision with root package name */
        private ArrayList f4834e = new ArrayList();

        static class a {
            static Notification.InboxStyle a(Notification.InboxStyle inboxStyle, CharSequence charSequence) {
                return inboxStyle.addLine(charSequence);
            }

            static Notification.InboxStyle b(Notification.Builder builder) {
                return new Notification.InboxStyle(builder);
            }

            static Notification.InboxStyle c(Notification.InboxStyle inboxStyle, CharSequence charSequence) {
                return inboxStyle.setBigContentTitle(charSequence);
            }

            static Notification.InboxStyle d(Notification.InboxStyle inboxStyle, CharSequence charSequence) {
                return inboxStyle.setSummaryText(charSequence);
            }
        }

        public void b(i iVar) {
            Notification.InboxStyle c4 = a.c(a.b(iVar.a()), this.f4836b);
            if (this.f4838d) {
                a.d(c4, this.f4837c);
            }
            Iterator it = this.f4834e.iterator();
            while (it.hasNext()) {
                a.a(c4, (CharSequence) it.next());
            }
        }

        /* access modifiers changed from: protected */
        public String c() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        public e h(CharSequence charSequence) {
            if (charSequence != null) {
                this.f4834e.add(d.d(charSequence));
            }
            return this;
        }

        public e i(CharSequence charSequence) {
            this.f4836b = d.d(charSequence);
            return this;
        }

        public e j(CharSequence charSequence) {
            this.f4837c = d.d(charSequence);
            this.f4838d = true;
            return this;
        }
    }

    public static abstract class f {

        /* renamed from: a  reason: collision with root package name */
        protected d f4835a;

        /* renamed from: b  reason: collision with root package name */
        CharSequence f4836b;

        /* renamed from: c  reason: collision with root package name */
        CharSequence f4837c;

        /* renamed from: d  reason: collision with root package name */
        boolean f4838d = false;

        public void a(Bundle bundle) {
            if (this.f4838d) {
                bundle.putCharSequence("android.summaryText", this.f4837c);
            }
            CharSequence charSequence = this.f4836b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String c4 = c();
            if (c4 != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c4);
            }
        }

        public abstract void b(i iVar);

        /* access modifiers changed from: protected */
        public abstract String c();

        public RemoteViews d(i iVar) {
            return null;
        }

        public RemoteViews e(i iVar) {
            return null;
        }

        public RemoteViews f(i iVar) {
            return null;
        }

        public void g(d dVar) {
            if (this.f4835a != dVar) {
                this.f4835a = dVar;
                if (dVar != null) {
                    dVar.u(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        return notification.extras;
    }

    public static Bitmap b(Context context, Bitmap bitmap) {
        if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
            return bitmap;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(G.b.f433b);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(G.b.f432a);
        if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
            return bitmap;
        }
        double min = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
        return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * min), (int) Math.ceil(((double) bitmap.getHeight()) * min), true);
    }
}
