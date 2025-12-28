package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f4304a;

    /* renamed from: b  reason: collision with root package name */
    int f4305b = -1;

    /* renamed from: c  reason: collision with root package name */
    int f4306c = -1;

    /* renamed from: d  reason: collision with root package name */
    private SparseArray f4307d = new SparseArray();

    /* renamed from: e  reason: collision with root package name */
    private SparseArray f4308e = new SparseArray();

    static class a {

        /* renamed from: a  reason: collision with root package name */
        int f4309a;

        /* renamed from: b  reason: collision with root package name */
        ArrayList f4310b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        int f4311c = -1;

        /* renamed from: d  reason: collision with root package name */
        c f4312d;

        public a(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), f.f7);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == f.g7) {
                    this.f4309a = obtainStyledAttributes.getResourceId(index, this.f4309a);
                } else if (index == f.h7) {
                    this.f4311c = obtainStyledAttributes.getResourceId(index, this.f4311c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f4311c);
                    context.getResources().getResourceName(this.f4311c);
                    if ("layout".equals(resourceTypeName)) {
                        c cVar = new c();
                        this.f4312d = cVar;
                        cVar.e(context, this.f4311c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: package-private */
        public void a(C0062b bVar) {
            this.f4310b.add(bVar);
        }
    }

    /* renamed from: androidx.constraintlayout.widget.b$b  reason: collision with other inner class name */
    static class C0062b {

        /* renamed from: a  reason: collision with root package name */
        float f4313a = Float.NaN;

        /* renamed from: b  reason: collision with root package name */
        float f4314b = Float.NaN;

        /* renamed from: c  reason: collision with root package name */
        float f4315c = Float.NaN;

        /* renamed from: d  reason: collision with root package name */
        float f4316d = Float.NaN;

        /* renamed from: e  reason: collision with root package name */
        int f4317e = -1;

        /* renamed from: f  reason: collision with root package name */
        c f4318f;

        public C0062b(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), f.D7);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == f.E7) {
                    this.f4317e = obtainStyledAttributes.getResourceId(index, this.f4317e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f4317e);
                    context.getResources().getResourceName(this.f4317e);
                    if ("layout".equals(resourceTypeName)) {
                        c cVar = new c();
                        this.f4318f = cVar;
                        cVar.e(context, this.f4317e);
                    }
                } else if (index == f.F7) {
                    this.f4316d = obtainStyledAttributes.getDimension(index, this.f4316d);
                } else if (index == f.G7) {
                    this.f4314b = obtainStyledAttributes.getDimension(index, this.f4314b);
                } else if (index == f.H7) {
                    this.f4315c = obtainStyledAttributes.getDimension(index, this.f4315c);
                } else if (index == f.I7) {
                    this.f4313a = obtainStyledAttributes.getDimension(index, this.f4313a);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    b(Context context, ConstraintLayout constraintLayout, int i4) {
        this.f4304a = constraintLayout;
        a(context, i4);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.content.Context r8, int r9) {
        /*
            r7 = this;
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.XmlResourceParser r9 = r0.getXml(r9)
            int r0 = r9.getEventType()     // Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x002f }
            r1 = 0
        L_0x000d:
            r2 = 1
            if (r0 == r2) goto L_0x008d
            if (r0 == 0) goto L_0x007e
            r3 = 2
            if (r0 == r3) goto L_0x0017
            goto L_0x0081
        L_0x0017:
            java.lang.String r0 = r9.getName()     // Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x002f }
            int r4 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x002f }
            r5 = 4
            r6 = 3
            switch(r4) {
                case -1349929691: goto L_0x0050;
                case 80204913: goto L_0x0046;
                case 1382829617: goto L_0x003d;
                case 1657696882: goto L_0x0033;
                case 1901439077: goto L_0x0025;
                default: goto L_0x0024;
            }     // Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x002f }
        L_0x0024:
            goto L_0x005a
        L_0x0025:
            java.lang.String r2 = "Variant"
            boolean r0 = r0.equals(r2)     // Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x002f }
            if (r0 == 0) goto L_0x005a
            r2 = r6
            goto L_0x005b
        L_0x002f:
            r8 = move-exception
            goto L_0x0086
        L_0x0031:
            r8 = move-exception
            goto L_0x008a
        L_0x0033:
            java.lang.String r2 = "layoutDescription"
            boolean r0 = r0.equals(r2)     // Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x002f }
            if (r0 == 0) goto L_0x005a
            r2 = 0
            goto L_0x005b
        L_0x003d:
            java.lang.String r4 = "StateSet"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x002f }
            if (r0 == 0) goto L_0x005a
            goto L_0x005b
        L_0x0046:
            java.lang.String r2 = "State"
            boolean r0 = r0.equals(r2)     // Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x002f }
            if (r0 == 0) goto L_0x005a
            r2 = r3
            goto L_0x005b
        L_0x0050:
            java.lang.String r2 = "ConstraintSet"
            boolean r0 = r0.equals(r2)     // Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x002f }
            if (r0 == 0) goto L_0x005a
            r2 = r5
            goto L_0x005b
        L_0x005a:
            r2 = -1
        L_0x005b:
            if (r2 == r3) goto L_0x0071
            if (r2 == r6) goto L_0x0066
            if (r2 == r5) goto L_0x0062
            goto L_0x0081
        L_0x0062:
            r7.b(r8, r9)     // Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x002f }
            goto L_0x0081
        L_0x0066:
            androidx.constraintlayout.widget.b$b r0 = new androidx.constraintlayout.widget.b$b     // Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x002f }
            r0.<init>(r8, r9)     // Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x002f }
            if (r1 == 0) goto L_0x0081
            r1.a(r0)     // Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x002f }
            goto L_0x0081
        L_0x0071:
            androidx.constraintlayout.widget.b$a r1 = new androidx.constraintlayout.widget.b$a     // Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x002f }
            r1.<init>(r8, r9)     // Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x002f }
            android.util.SparseArray r0 = r7.f4307d     // Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x002f }
            int r2 = r1.f4309a     // Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x002f }
            r0.put(r2, r1)     // Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x002f }
            goto L_0x0081
        L_0x007e:
            r9.getName()     // Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x002f }
        L_0x0081:
            int r0 = r9.next()     // Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x002f }
            goto L_0x000d
        L_0x0086:
            r8.printStackTrace()
            goto L_0x008d
        L_0x008a:
            r8.printStackTrace()
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.b.a(android.content.Context, int):void");
    }

    private void b(Context context, XmlPullParser xmlPullParser) {
        int i4;
        c cVar = new c();
        int attributeCount = xmlPullParser.getAttributeCount();
        int i5 = 0;
        while (i5 < attributeCount) {
            String attributeName = xmlPullParser.getAttributeName(i5);
            String attributeValue = xmlPullParser.getAttributeValue(i5);
            if (attributeName == null || attributeValue == null || !"id".equals(attributeName)) {
                i5++;
            } else {
                if (attributeValue.contains("/")) {
                    i4 = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName());
                } else {
                    i4 = -1;
                }
                if (i4 == -1) {
                    if (attributeValue.length() > 1) {
                        i4 = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                cVar.p(context, xmlPullParser);
                this.f4308e.put(i4, cVar);
                return;
            }
        }
    }

    public void c(d dVar) {
    }
}
