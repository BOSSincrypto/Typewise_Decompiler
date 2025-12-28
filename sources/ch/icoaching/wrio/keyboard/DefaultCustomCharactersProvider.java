package ch.icoaching.wrio.keyboard;

import ch.icoaching.wrio.data.c;
import ch.icoaching.wrio.subscription.a;
import ch.icoaching.wrio.tutorialmode.TutorialModeManager;
import i2.C0680a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.D;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.n;

public final class DefaultCustomCharactersProvider implements u {

    /* renamed from: a  reason: collision with root package name */
    private final D f9823a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C0680a f9824b;

    /* renamed from: c  reason: collision with root package name */
    private final a f9825c;

    /* renamed from: d  reason: collision with root package name */
    private final TutorialModeManager f9826d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final j f9827e;

    /* renamed from: f  reason: collision with root package name */
    private final n f9828f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public List f9829g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public List f9830h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public List f9831i;

    /* renamed from: j  reason: collision with root package name */
    private final Character[] f9832j;

    /* renamed from: k  reason: collision with root package name */
    private final Character[] f9833k;

    /* renamed from: l  reason: collision with root package name */
    private final List f9834l;

    public DefaultCustomCharactersProvider(D d4, C0680a aVar, a aVar2, TutorialModeManager tutorialModeManager, c cVar) {
        Character[] chArr;
        o.e(d4, "serviceScope");
        o.e(aVar, "defaultSharedPreferences");
        o.e(aVar2, "subscriptionChecker");
        o.e(tutorialModeManager, "tutorialManager");
        o.e(cVar, "languageSettings");
        this.f9823a = d4;
        this.f9824b = aVar;
        this.f9825c = aVar2;
        this.f9826d = tutorialModeManager;
        j b4 = kotlinx.coroutines.flow.o.b(0, 0, (BufferOverflow) null, 7, (Object) null);
        this.f9827e = b4;
        this.f9828f = b4;
        this.f9829g = aVar.B0();
        this.f9830h = aVar.g();
        this.f9831i = aVar.e();
        ArrayList arrayList = new ArrayList(2);
        for (int i4 = 0; i4 < 2; i4++) {
            arrayList.add(Character.valueOf(":;".charAt(i4)));
        }
        this.f9832j = (Character[]) arrayList.toArray(new Character[0]);
        if (!kotlin.text.o.G((String) cVar.e().get(0), "es", false, 2, (Object) null)) {
            ArrayList arrayList2 = new ArrayList(2);
            for (int i5 = 0; i5 < 2; i5++) {
                arrayList2.add(Character.valueOf("'\"".charAt(i5)));
            }
            chArr = (Character[]) arrayList2.toArray(new Character[0]);
        } else {
            ArrayList arrayList3 = new ArrayList(4);
            for (int i6 = 0; i6 < 4; i6++) {
                arrayList3.add(Character.valueOf("¿¡'\"".charAt(i6)));
            }
            chArr = (Character[]) arrayList3.toArray(new Character[0]);
        }
        this.f9833k = chArr;
        ArrayList arrayList4 = new ArrayList(16);
        for (int i7 = 0; i7 < 16; i7++) {
            arrayList4.add(Character.valueOf("#?!@()/+-_%&=*€$".charAt(i7)));
        }
        this.f9834l = arrayList4;
        f();
    }

    private final void f() {
        e.j(e.k(new DefaultCustomCharactersProvider$observeCustomCharacters$$inlined$filter$1(this.f9824b.J0()), new DefaultCustomCharactersProvider$observeCustomCharacters$2(this, (kotlin.coroutines.c<? super DefaultCustomCharactersProvider$observeCustomCharacters$2>) null)), this.f9823a);
    }

    public Character[] a() {
        if (this.f9825c.b()) {
            return (Character[]) this.f9830h.toArray(new Character[0]);
        }
        return this.f9833k;
    }

    public n b() {
        return this.f9828f;
    }

    public List c() {
        if (!this.f9825c.b() || this.f9826d.j()) {
            return this.f9834l;
        }
        return this.f9831i;
    }

    public Character[] d() {
        if (this.f9825c.b()) {
            return (Character[]) this.f9829g.toArray(new Character[0]);
        }
        return this.f9832j;
    }
}
