package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

public abstract class e {

    static class a {
        static int a(TypedArray typedArray, int i4) {
            return typedArray.getType(i4);
        }
    }

    public interface b {
    }

    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        private final d[] f4918a;

        public c(d[] dVarArr) {
            this.f4918a = dVarArr;
        }

        public d[] a() {
            return this.f4918a;
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final String f4919a;

        /* renamed from: b  reason: collision with root package name */
        private final int f4920b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f4921c;

        /* renamed from: d  reason: collision with root package name */
        private final String f4922d;

        /* renamed from: e  reason: collision with root package name */
        private final int f4923e;

        /* renamed from: f  reason: collision with root package name */
        private final int f4924f;

        public d(String str, int i4, boolean z3, String str2, int i5, int i6) {
            this.f4919a = str;
            this.f4920b = i4;
            this.f4921c = z3;
            this.f4922d = str2;
            this.f4923e = i5;
            this.f4924f = i6;
        }

        public String a() {
            return this.f4919a;
        }

        public int b() {
            return this.f4924f;
        }

        public int c() {
            return this.f4923e;
        }

        public String d() {
            return this.f4922d;
        }

        public int e() {
            return this.f4920b;
        }

        public boolean f() {
            return this.f4921c;
        }
    }

    /* renamed from: androidx.core.content.res.e$e  reason: collision with other inner class name */
    public static final class C0071e implements b {

        /* renamed from: a  reason: collision with root package name */
        private final androidx.core.provider.e f4925a;

        /* renamed from: b  reason: collision with root package name */
        private final int f4926b;

        /* renamed from: c  reason: collision with root package name */
        private final int f4927c;

        /* renamed from: d  reason: collision with root package name */
        private final String f4928d;

        public C0071e(androidx.core.provider.e eVar, int i4, int i5, String str) {
            this.f4925a = eVar;
            this.f4927c = i4;
            this.f4926b = i5;
            this.f4928d = str;
        }

        public int a() {
            return this.f4927c;
        }

        public androidx.core.provider.e b() {
            return this.f4925a;
        }

        public String c() {
            return this.f4928d;
        }

        public int d() {
            return this.f4926b;
        }
    }

    private static int a(TypedArray typedArray, int i4) {
        return a.a(typedArray, i4);
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public static androidx.core.content.res.e.b b(org.xmlpull.v1.XmlPullParser r3, android.content.res.Resources r4) {
        /*
        L_0x0000:
            int r0 = r3.next()
            r1 = 2
            if (r0 == r1) goto L_0x000b
            r2 = 1
            if (r0 == r2) goto L_0x000b
            goto L_0x0000
        L_0x000b:
            if (r0 != r1) goto L_0x0012
            androidx.core.content.res.e$b r3 = d(r3, r4)
            return r3
        L_0x0012:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r4 = "No start tag found"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.e.b(org.xmlpull.v1.XmlPullParser, android.content.res.Resources):androidx.core.content.res.e$b");
    }

    public static List c(Resources resources, int i4) {
        if (i4 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i4);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(obtainTypedArray, 0) == 1) {
                for (int i5 = 0; i5 < obtainTypedArray.length(); i5++) {
                    int resourceId = obtainTypedArray.getResourceId(i5, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i4)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    private static b d(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, (String) null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    private static b e(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), G.d.f502h);
        String string = obtainAttributes.getString(G.d.f503i);
        String string2 = obtainAttributes.getString(G.d.f507m);
        String string3 = obtainAttributes.getString(G.d.f508n);
        int resourceId = obtainAttributes.getResourceId(G.d.f504j, 0);
        int integer = obtainAttributes.getInteger(G.d.f505k, 1);
        int integer2 = obtainAttributes.getInteger(G.d.f506l, 500);
        String string4 = obtainAttributes.getString(G.d.f509o);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(f(xmlPullParser, resources));
                    } else {
                        g(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new c((d[]) arrayList.toArray(new d[0]));
        }
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new C0071e(new androidx.core.provider.e(string, string2, string3, c(resources, resourceId)), integer, integer2, string4);
    }

    private static d f(XmlPullParser xmlPullParser, Resources resources) {
        boolean z3;
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), G.d.f510p);
        int i4 = G.d.f519y;
        if (!obtainAttributes.hasValue(i4)) {
            i4 = G.d.f512r;
        }
        int i5 = obtainAttributes.getInt(i4, 400);
        int i6 = G.d.f517w;
        if (!obtainAttributes.hasValue(i6)) {
            i6 = G.d.f513s;
        }
        if (1 == obtainAttributes.getInt(i6, 0)) {
            z3 = true;
        } else {
            z3 = false;
        }
        int i7 = G.d.f520z;
        if (!obtainAttributes.hasValue(i7)) {
            i7 = G.d.f514t;
        }
        int i8 = G.d.f518x;
        if (!obtainAttributes.hasValue(i8)) {
            i8 = G.d.f515u;
        }
        String string = obtainAttributes.getString(i8);
        int i9 = obtainAttributes.getInt(i7, 0);
        int i10 = G.d.f516v;
        if (!obtainAttributes.hasValue(i10)) {
            i10 = G.d.f511q;
        }
        int resourceId = obtainAttributes.getResourceId(i10, 0);
        String string2 = obtainAttributes.getString(i10);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new d(string2, i5, z3, string, i9, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) {
        int i4 = 1;
        while (i4 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i4++;
            } else if (next == 3) {
                i4--;
            }
        }
    }

    private static List h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }
}
