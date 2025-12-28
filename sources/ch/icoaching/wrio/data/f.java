package ch.icoaching.wrio.data;

import K2.C0341a;
import K2.C0344d;
import K2.t;
import M2.a;
import M2.b;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import c.C0489b;
import ch.icoaching.wrio.X;
import ch.icoaching.wrio.keyboard.DiacriticsStore;
import i2.C0680a;
import kotlin.jvm.internal.o;
import l2.q;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f9502a = new f();

    /* renamed from: b  reason: collision with root package name */
    private static C0341a f9503b;

    /* renamed from: c  reason: collision with root package name */
    private static C0680a f9504c;

    /* renamed from: d  reason: collision with root package name */
    private static SharedPreferences f9505d;

    /* renamed from: e  reason: collision with root package name */
    private static a f9506e;

    /* renamed from: f  reason: collision with root package name */
    private static h f9507f;

    /* renamed from: g  reason: collision with root package name */
    private static i f9508g;

    /* renamed from: h  reason: collision with root package name */
    private static b f9509h;

    /* renamed from: i  reason: collision with root package name */
    private static c f9510i;

    /* renamed from: j  reason: collision with root package name */
    private static DiacriticsStore f9511j;

    /* renamed from: k  reason: collision with root package name */
    private static C0489b f9512k;

    /* renamed from: l  reason: collision with root package name */
    private static d f9513l;

    private f() {
    }

    /* access modifiers changed from: private */
    public static final q b(C0344d dVar) {
        o.e(dVar, "$this$Json");
        dVar.e(true);
        dVar.d(false);
        return q.f14567a;
    }

    public final void c() {
        f9511j = null;
    }

    public final a d() {
        if (f9506e == null) {
            f9506e = new DefaultAutocorrectionSettings(b.f944a.a(), f(), ch.icoaching.wrio.subscription.b.f10644a.a());
        }
        a aVar = f9506e;
        o.b(aVar);
        return aVar;
    }

    public final C0489b e() {
        if (f9512k == null) {
            Context a4 = a.f941a.a();
            c k4 = k();
            b bVar = b.f944a;
            f9512k = new C0489b(a4, k4, bVar.a(), bVar.b(), X.f9083a.b());
        }
        C0489b bVar2 = f9512k;
        o.b(bVar2);
        return bVar2;
    }

    public final C0680a f() {
        if (f9504c == null) {
            f9504c = new C0680a(a.f941a.a(), i());
        }
        C0680a aVar = f9504c;
        o.b(aVar);
        return aVar;
    }

    public final DiacriticsStore g() {
        if (f9511j == null) {
            f9511j = new DiacriticsStore(X.f9083a.r(), f());
        }
        DiacriticsStore diacriticsStore = f9511j;
        o.b(diacriticsStore);
        return diacriticsStore;
    }

    public final h h() {
        if (f9507f == null) {
            f9507f = new DefaultDictionarySettings(b.f944a.a(), f());
        }
        h hVar = f9507f;
        o.b(hVar);
        return hVar;
    }

    public final C0341a i() {
        if (f9503b == null) {
            f9503b = t.b((C0341a) null, new e(), 1, (Object) null);
        }
        C0341a aVar = f9503b;
        o.b(aVar);
        return aVar;
    }

    public final b j() {
        if (f9509h == null) {
            f9509h = new DefaultKeyboardSettings(b.f944a.a(), f(), a.f941a.c(), ch.icoaching.wrio.subscription.b.f10644a.a());
        }
        b bVar = f9509h;
        o.b(bVar);
        return bVar;
    }

    public final c k() {
        if (f9510i == null) {
            f9510i = new DefaultLanguageSettings(b.f944a.a(), f(), ch.icoaching.wrio.subscription.b.f10644a.a());
        }
        c cVar = f9510i;
        o.b(cVar);
        return cVar;
    }

    public final i l() {
        if (f9508g == null) {
            f9508g = new DefaultOtherSettings(f());
        }
        i iVar = f9508g;
        o.b(iVar);
        return iVar;
    }

    public final SharedPreferences m() {
        if (f9505d == null) {
            f9505d = PreferenceManager.getDefaultSharedPreferences(a.f941a.a());
        }
        SharedPreferences sharedPreferences = f9505d;
        o.b(sharedPreferences);
        return sharedPreferences;
    }

    public final d n() {
        if (f9513l == null) {
            f9513l = new d(f());
        }
        d dVar = f9513l;
        o.b(dVar);
        return dVar;
    }
}
