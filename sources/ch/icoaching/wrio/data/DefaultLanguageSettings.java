package ch.icoaching.wrio.data;

import ch.icoaching.wrio.keyboard.M;
import ch.icoaching.wrio.keyboard.layout.Layout;
import ch.icoaching.wrio.subscription.a;
import i2.C0680a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C0718m;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.D;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.r;
import l2.q;
import u2.p;

public final class DefaultLanguageSettings implements c {

    /* renamed from: a  reason: collision with root package name */
    private final C0680a f9473a;

    /* renamed from: b  reason: collision with root package name */
    private final a f9474b;

    /* renamed from: c  reason: collision with root package name */
    private final k f9475c = r.a("en");

    /* renamed from: d  reason: collision with root package name */
    private final String[] f9476d = {"af", "br", "ca", "cs", "da", "de", "de-ch", "en", "en-gb", "en-us", "es", "et", "eu", "fi", "fil", "fr", "fr-ca", "fr-ch", "ga", "gl", "hin-en", "hr", "hu", "id", "is", "it", "lt", "lv", "ms", "nl", "nl-be", "no", "pl", "pt", "pt-br", "ro", "sk", "sl", "sq", "sr", "sv", "tr", "vi"};

    /* renamed from: e  reason: collision with root package name */
    private final k f9477e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f9478f;

    /* renamed from: g  reason: collision with root package name */
    private String f9479g;

    /* renamed from: h  reason: collision with root package name */
    private Layout f9480h;

    /* renamed from: i  reason: collision with root package name */
    private List f9481i;

    @d(c = "ch.icoaching.wrio.data.DefaultLanguageSettings$1", f = "DefaultLanguageSettings.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ll2/q;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ch.icoaching.wrio.data.DefaultLanguageSettings$1  reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements p {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DefaultLanguageSettings this$0;

        {
            this.this$0 = r1;
        }

        public final c<q> create(Object obj, c<?> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(this.this$0, cVar);
            r02.L$0 = obj;
            return r02;
        }

        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.f();
            if (this.label == 0) {
                f.b(obj);
                String str = (String) this.L$0;
                if (str == null || o.a(str, "langs") || o.a(str, "settings_custom_keyboard_layout") || o.a(str, "settings_userspecificlanguage") || kotlin.text.o.G(str, "lang_config", false, 2, (Object) null)) {
                    this.this$0.q();
                }
                return q.f14567a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(String str, c<? super q> cVar) {
            return ((AnonymousClass1) create(str, cVar)).invokeSuspend(q.f14567a);
        }
    }

    public DefaultLanguageSettings(D d4, C0680a aVar, a aVar2) {
        D d5 = d4;
        C0680a aVar3 = aVar;
        a aVar4 = aVar2;
        o.e(d5, "applicationCoroutineScope");
        o.e(aVar3, "defaultSharedPreferences");
        o.e(aVar4, "subscriptionChecker");
        this.f9473a = aVar3;
        this.f9474b = aVar4;
        e.j(e.k(aVar.J0(), new AnonymousClass1(this, (c<? super AnonymousClass1>) null)), d5);
        Layout layout = Layout.QWERTY;
        this.f9477e = r.a(layout);
        this.f9479g = "en";
        this.f9480h = layout;
        this.f9481i = C0718m.e("system");
    }

    private final Layout m(String str) {
        String n02 = this.f9473a.n0();
        Layout layout = Layout.QWERTY;
        if (o.a(n02, layout.getValue())) {
            return layout;
        }
        Layout layout2 = Layout.QWERTZ;
        if (o.a(n02, layout2.getValue())) {
            return layout2;
        }
        Layout layout3 = Layout.AZERTY;
        if (o.a(n02, layout3.getValue())) {
            return layout3;
        }
        Layout layout4 = Layout.WORKMAN;
        if (o.a(n02, layout4.getValue())) {
            return layout4;
        }
        Layout layout5 = Layout.NEO2;
        if (o.a(n02, layout5.getValue())) {
            return layout5;
        }
        Layout layout6 = Layout.DVORAK;
        if (o.a(n02, layout6.getValue())) {
            return layout6;
        }
        Layout layout7 = Layout.COLEMAK;
        if (o.a(n02, layout7.getValue())) {
            return layout7;
        }
        return M.a(str);
    }

    private final List n(List list) {
        String[] strArr = this.f9476d;
        List m4 = C0718m.m(Arrays.copyOf(strArr, strArr.length));
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (m4.contains(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            String languageTag = Locale.getDefault().toLanguageTag();
            o.d(languageTag, "toLanguageTag(...)");
            String lowerCase = languageTag.toLowerCase(Locale.ROOT);
            o.d(lowerCase, "toLowerCase(...)");
            if (m4.contains(lowerCase)) {
                arrayList.add(lowerCase);
            } else if (kotlin.text.o.L(lowerCase, "-", false, 2, (Object) null)) {
                String str2 = ((String[]) kotlin.text.o.t0(lowerCase, new String[]{"-"}, false, 0, 6, (Object) null).toArray(new String[0]))[0];
                if (m4.contains(str2)) {
                    arrayList.add(str2);
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.add("en");
            }
        }
        if (h()) {
            arrayList.add("user_specific");
        }
        return new ArrayList(arrayList);
    }

    private final void o() {
        if (!this.f9478f) {
            q();
        }
    }

    /* access modifiers changed from: private */
    public final void q() {
        this.f9478f = true;
        List n4 = n(this.f9473a.K0());
        this.f9481i = n4;
        d((String) n4.get(0));
        if (!this.f9474b.b()) {
            this.f9481i = C0718m.e(this.f9481i.get(0));
        }
        r();
    }

    private final void r() {
        Layout m4 = m((String) this.f9481i.get(0));
        if (!this.f9474b.b() && k3.a.a(m4)) {
            Layout a4 = M.a((String) this.f9481i.get(0));
            if (a4 != this.f9480h) {
                this.f9480h = a4;
                this.f9477e.d(a4);
            }
        } else if (m4 != this.f9480h) {
            this.f9480h = m4;
            this.f9477e.d(m4);
        }
    }

    public kotlinx.coroutines.flow.q a() {
        return this.f9477e;
    }

    public String b() {
        o();
        return this.f9479g;
    }

    public kotlinx.coroutines.flow.c c() {
        return new DefaultLanguageSettings$observeUserSpecificLanguageEnabled$$inlined$map$1(new DefaultLanguageSettings$observeUserSpecificLanguageEnabled$$inlined$filter$1(this.f9473a.J0()), this);
    }

    public void d(String str) {
        o.e(str, "language");
        o();
        this.f9479g = str;
        this.f9475c.d(str);
    }

    public List e() {
        o();
        return new ArrayList(this.f9481i);
    }

    public Map f() {
        return this.f9473a.q();
    }

    public List g() {
        return this.f9473a.x0();
    }

    public boolean h() {
        return this.f9473a.F0();
    }

    public kotlinx.coroutines.flow.q i() {
        return this.f9475c;
    }

    public List j() {
        List e4 = e();
        List g4 = g();
        ArrayList arrayList = new ArrayList();
        for (Object next : e4) {
            if (!g4.contains((String) next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public Layout k() {
        o();
        return this.f9480h;
    }

    public void l(Map map) {
        o.e(map, "languageUsage");
        this.f9473a.M(map);
    }
}
