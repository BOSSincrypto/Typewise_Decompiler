package ch.icoaching.wrio.keyboard;

import ch.icoaching.wrio.data.source.local.RecentSymbolsStore;
import ch.icoaching.wrio.keyboard.model.config.Emoji;
import g2.C0657a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C0718m;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.D;
import kotlinx.coroutines.g0;

public final class RecentSymbolsAndEmojisUseCase {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final RecentSymbolsStore f9973a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final RecentEmojiStore f9974b;

    /* renamed from: c  reason: collision with root package name */
    private final D f9975c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final List f9976d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final List f9977e = new ArrayList();

    public RecentSymbolsAndEmojisUseCase(RecentSymbolsStore recentSymbolsStore, RecentEmojiStore recentEmojiStore, D d4) {
        o.e(recentSymbolsStore, "recentSymbolsStore");
        o.e(recentEmojiStore, "recentEmojiStore");
        o.e(d4, "serviceScope");
        this.f9973a = recentSymbolsStore;
        this.f9974b = recentEmojiStore;
        this.f9975c = d4;
    }

    private final void c() {
        if (!this.f9977e.isEmpty()) {
            g0 unused = C0739h.d(this.f9975c, (CoroutineContext) null, (CoroutineStart) null, new RecentSymbolsAndEmojisUseCase$saveRecentEmojis$1(this, (c<? super RecentSymbolsAndEmojisUseCase$saveRecentEmojis$1>) null), 3, (Object) null);
        }
    }

    private final void i() {
        if (!this.f9976d.isEmpty()) {
            g0 unused = C0739h.d(this.f9975c, (CoroutineContext) null, (CoroutineStart) null, new RecentSymbolsAndEmojisUseCase$saveRecentSymbols$1(this, (c<? super RecentSymbolsAndEmojisUseCase$saveRecentSymbols$1>) null), 3, (Object) null);
        }
    }

    public final Object b(c cVar) {
        return this.f9974b.c(cVar);
    }

    public final void d(char c4) {
        Object obj;
        if (!Character.isDigit(c4)) {
            Iterator it = this.f9976d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C0657a) obj).a() == c4) {
                    break;
                }
            }
            C0657a aVar = (C0657a) obj;
            if (aVar != null) {
                aVar.b(aVar.c() + 1);
            } else {
                this.f9976d.add(new C0657a(c4, 1));
            }
        }
    }

    public final void e(Emoji emoji) {
        o.e(emoji, "emoji");
        this.f9977e.add(emoji);
    }

    public final void f(String str) {
        o.e(str, "emojiString");
        List list = this.f9977e;
        this.f9977e.add(Emoji.copy$default((Emoji) list.remove(C0718m.l(list)), str, false, 2, (Object) null));
    }

    public final void g(List list) {
        o.e(list, "defaultFrequentlyUsedSymbols");
        g0 unused = C0739h.d(this.f9975c, (CoroutineContext) null, (CoroutineStart) null, new RecentSymbolsAndEmojisUseCase$initializeDefaults$1(this, list, (c<? super RecentSymbolsAndEmojisUseCase$initializeDefaults$1>) null), 3, (Object) null);
    }

    public final void k() {
        c();
        i();
    }
}
