package ch.icoaching.typewise.autocorrection.scripts.capitalization;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.autocorrection.scripts.capitalization.CapitalizationBase", f = "CapitalizationBase.kt", l = {334}, m = "capitalizeSuggestions$suspendImpl")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class CapitalizationBase$capitalizeSuggestions$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8019a;

    /* renamed from: b  reason: collision with root package name */
    Object f8020b;

    /* renamed from: c  reason: collision with root package name */
    Object f8021c;

    /* renamed from: d  reason: collision with root package name */
    Object f8022d;

    /* renamed from: e  reason: collision with root package name */
    Object f8023e;

    /* renamed from: f  reason: collision with root package name */
    Object f8024f;

    /* renamed from: g  reason: collision with root package name */
    Object f8025g;

    /* renamed from: h  reason: collision with root package name */
    Object f8026h;

    /* renamed from: i  reason: collision with root package name */
    Object f8027i;

    /* renamed from: j  reason: collision with root package name */
    int f8028j;

    /* renamed from: k  reason: collision with root package name */
    int f8029k;

    /* renamed from: l  reason: collision with root package name */
    int f8030l;

    /* renamed from: m  reason: collision with root package name */
    /* synthetic */ Object f8031m;

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ CapitalizationBase f8032n;

    /* renamed from: o  reason: collision with root package name */
    int f8033o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CapitalizationBase$capitalizeSuggestions$1(CapitalizationBase capitalizationBase, c cVar) {
        super(cVar);
        this.f8032n = capitalizationBase;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8031m = obj;
        this.f8033o |= Integer.MIN_VALUE;
        return CapitalizationBase.j(this.f8032n, (List) null, (List) null, (List) null, (List) null, (List) null, (String) null, this);
    }
}
