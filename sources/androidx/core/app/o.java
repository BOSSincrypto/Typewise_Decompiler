package androidx.core.app;

import android.app.RemoteInput;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    private final String f4875a;

    /* renamed from: b  reason: collision with root package name */
    private final CharSequence f4876b;

    /* renamed from: c  reason: collision with root package name */
    private final CharSequence[] f4877c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f4878d;

    /* renamed from: e  reason: collision with root package name */
    private final int f4879e;

    /* renamed from: f  reason: collision with root package name */
    private final Bundle f4880f;

    /* renamed from: g  reason: collision with root package name */
    private final Set f4881g;

    static class a {
        static void a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        public static RemoteInput b(o oVar) {
            Set<String> d4;
            RemoteInput.Builder addExtras = new RemoteInput.Builder(oVar.i()).setLabel(oVar.h()).setChoices(oVar.e()).setAllowFreeFormInput(oVar.c()).addExtras(oVar.g());
            if (Build.VERSION.SDK_INT >= 26 && (d4 = oVar.d()) != null) {
                for (String d5 : d4) {
                    b.d(addExtras, d5, true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                c.b(addExtras, oVar.f());
            }
            return addExtras.build();
        }

        static Bundle c(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    static class b {
        static void a(o oVar, Intent intent, Map<String, Uri> map) {
            RemoteInput.addDataResultToIntent(o.a(oVar), intent, map);
        }

        static Set<String> b(Object obj) {
            return ((RemoteInput) obj).getAllowedDataTypes();
        }

        static Map<String, Uri> c(Intent intent, String str) {
            return RemoteInput.getDataResultsFromIntent(intent, str);
        }

        static RemoteInput.Builder d(RemoteInput.Builder builder, String str, boolean z3) {
            return builder.setAllowDataType(str, z3);
        }
    }

    static class c {
        static int a(Object obj) {
            return ((RemoteInput) obj).getEditChoicesBeforeSending();
        }

        static RemoteInput.Builder b(RemoteInput.Builder builder, int i4) {
            return builder.setEditChoicesBeforeSending(i4);
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final String f4882a;

        /* renamed from: b  reason: collision with root package name */
        private final Set f4883b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        private final Bundle f4884c = new Bundle();

        /* renamed from: d  reason: collision with root package name */
        private CharSequence f4885d;

        /* renamed from: e  reason: collision with root package name */
        private CharSequence[] f4886e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f4887f = true;

        /* renamed from: g  reason: collision with root package name */
        private int f4888g = 0;

        public d(String str) {
            if (str != null) {
                this.f4882a = str;
                return;
            }
            throw new IllegalArgumentException("Result key can't be null");
        }

        public o a() {
            return new o(this.f4882a, this.f4885d, this.f4886e, this.f4887f, this.f4888g, this.f4884c, this.f4883b);
        }

        public d b(CharSequence charSequence) {
            this.f4885d = charSequence;
            return this;
        }
    }

    o(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z3, int i4, Bundle bundle, Set set) {
        this.f4875a = str;
        this.f4876b = charSequence;
        this.f4877c = charSequenceArr;
        this.f4878d = z3;
        this.f4879e = i4;
        this.f4880f = bundle;
        this.f4881g = set;
        if (f() == 2 && !c()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    static RemoteInput a(o oVar) {
        return a.b(oVar);
    }

    static RemoteInput[] b(o[] oVarArr) {
        if (oVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[oVarArr.length];
        for (int i4 = 0; i4 < oVarArr.length; i4++) {
            remoteInputArr[i4] = a(oVarArr[i4]);
        }
        return remoteInputArr;
    }

    public static Bundle j(Intent intent) {
        return a.c(intent);
    }

    public boolean c() {
        return this.f4878d;
    }

    public Set d() {
        return this.f4881g;
    }

    public CharSequence[] e() {
        return this.f4877c;
    }

    public int f() {
        return this.f4879e;
    }

    public Bundle g() {
        return this.f4880f;
    }

    public CharSequence h() {
        return this.f4876b;
    }

    public String i() {
        return this.f4875a;
    }

    public boolean k() {
        if (c() || ((e() != null && e().length != 0) || d() == null || d().isEmpty())) {
            return false;
        }
        return true;
    }
}
