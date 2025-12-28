package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.util.Xml;
import androidx.appcompat.app.C0373g;
import com.silkimen.http.HttpRequest;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import org.xmlpull.v1.XmlSerializer;

abstract class B {

    static class a implements Executor {

        /* renamed from: a  reason: collision with root package name */
        private final Object f2526a = new Object();

        /* renamed from: b  reason: collision with root package name */
        final Queue f2527b = new ArrayDeque();

        /* renamed from: c  reason: collision with root package name */
        final Executor f2528c;

        /* renamed from: d  reason: collision with root package name */
        Runnable f2529d;

        a(Executor executor) {
            this.f2528c = executor;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(Runnable runnable) {
            try {
                runnable.run();
            } finally {
                c();
            }
        }

        /* access modifiers changed from: protected */
        public void c() {
            synchronized (this.f2526a) {
                try {
                    Runnable runnable = (Runnable) this.f2527b.poll();
                    this.f2529d = runnable;
                    if (runnable != null) {
                        this.f2528c.execute(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void execute(Runnable runnable) {
            synchronized (this.f2526a) {
                try {
                    this.f2527b.add(new A(this, runnable));
                    if (this.f2529d == null) {
                        c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    static class b implements Executor {
        b() {
        }

        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    static void a(Context context, String str) {
        if (str.equals("")) {
            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return;
        }
        try {
            FileOutputStream openFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
            XmlSerializer newSerializer = Xml.newSerializer();
            try {
                newSerializer.setOutput(openFileOutput, (String) null);
                newSerializer.startDocument(HttpRequest.CHARSET_UTF8, Boolean.TRUE);
                newSerializer.startTag((String) null, "locales");
                newSerializer.attribute((String) null, "application_locales", str);
                newSerializer.endTag((String) null, "locales");
                newSerializer.endDocument();
                StringBuilder sb = new StringBuilder();
                sb.append("Storing App Locales : app-locales: ");
                sb.append(str);
                sb.append(" persisted successfully.");
                if (openFileOutput == null) {
                    return;
                }
            } catch (Exception e4) {
                Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales: " + str, e4);
                if (openFileOutput == null) {
                    return;
                }
            } catch (Throwable th) {
                if (openFileOutput != null) {
                    try {
                        openFileOutput.close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
            try {
                openFileOutput.close();
            } catch (IOException unused2) {
            }
        } catch (FileNotFoundException unused3) {
            Log.w("AppLocalesStorageHelper", String.format("Storing App Locales : FileNotFoundException: Cannot open file %s for writing ", new Object[]{"androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"}));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
        if (r3 != null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004e, code lost:
        if (r3 == null) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String b(android.content.Context r9) {
        /*
            java.lang.String r0 = "AppLocalesStorageHelper"
            java.lang.String r1 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.lang.String r2 = ""
            java.io.FileInputStream r3 = r9.openFileInput(r1)     // Catch:{ FileNotFoundException -> 0x006f }
            org.xmlpull.v1.XmlPullParser r4 = android.util.Xml.newPullParser()     // Catch:{ IOException | XmlPullParserException -> 0x0049 }
            java.lang.String r5 = "UTF-8"
            r4.setInput(r3, r5)     // Catch:{ IOException | XmlPullParserException -> 0x0049 }
            int r5 = r4.getDepth()     // Catch:{ IOException | XmlPullParserException -> 0x0049 }
        L_0x0017:
            int r6 = r4.next()     // Catch:{ IOException | XmlPullParserException -> 0x0049 }
            r7 = 1
            if (r6 == r7) goto L_0x0043
            r7 = 3
            if (r6 != r7) goto L_0x002a
            int r8 = r4.getDepth()     // Catch:{ IOException | XmlPullParserException -> 0x0049 }
            if (r8 <= r5) goto L_0x0043
            goto L_0x002a
        L_0x0028:
            r9 = move-exception
            goto L_0x0069
        L_0x002a:
            if (r6 == r7) goto L_0x0017
            r7 = 4
            if (r6 != r7) goto L_0x0030
            goto L_0x0017
        L_0x0030:
            java.lang.String r6 = r4.getName()     // Catch:{ IOException | XmlPullParserException -> 0x0049 }
            java.lang.String r7 = "locales"
            boolean r6 = r6.equals(r7)     // Catch:{ IOException | XmlPullParserException -> 0x0049 }
            if (r6 == 0) goto L_0x0017
            java.lang.String r5 = "application_locales"
            r6 = 0
            java.lang.String r2 = r4.getAttributeValue(r6, r5)     // Catch:{ IOException | XmlPullParserException -> 0x0049 }
        L_0x0043:
            if (r3 == 0) goto L_0x0051
        L_0x0045:
            r3.close()     // Catch:{ IOException -> 0x0051 }
            goto L_0x0051
        L_0x0049:
            java.lang.String r4 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r0, r4)     // Catch:{ all -> 0x0028 }
            if (r3 == 0) goto L_0x0051
            goto L_0x0045
        L_0x0051:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0065
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: "
            r9.append(r0)
            r9.append(r2)
            goto L_0x0068
        L_0x0065:
            r9.deleteFile(r1)
        L_0x0068:
            return r2
        L_0x0069:
            if (r3 == 0) goto L_0x006e
            r3.close()     // Catch:{ IOException -> 0x006e }
        L_0x006e:
            throw r9
        L_0x006f:
            java.lang.String r9 = "Reading app Locales : Locales record file not found: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r0, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.B.b(android.content.Context):java.lang.String");
    }

    static void c(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (C0373g.k().f()) {
                    String b4 = b(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        C0373g.b.b(systemService, C0373g.a.a(b4));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }
}
