package ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches;

import ch.icoaching.typewise.language_modelling.modelling.StatefulLanguageModel;
import ch.icoaching.typewise.language_modelling.preprocessing.c;
import kotlin.jvm.internal.o;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    private final c f8469a;

    /* renamed from: b  reason: collision with root package name */
    private final StatefulLanguageModel f8470b;

    /* renamed from: c  reason: collision with root package name */
    private final int f8471c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f8472d;

    /* renamed from: e  reason: collision with root package name */
    private final String f8473e;

    public d(c cVar, StatefulLanguageModel statefulLanguageModel, int i4, boolean z3) {
        o.e(cVar, "pp");
        o.e(statefulLanguageModel, "model");
        this.f8469a = cVar;
        this.f8470b = statefulLanguageModel;
        this.f8471c = i4;
        this.f8472d = z3;
        this.f8473e = statefulLanguageModel.c();
    }

    public static /* synthetic */ Object a(d dVar, String str, String str2, boolean z3, kotlin.coroutines.c cVar, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 2) != 0) {
                str2 = "";
            }
            if ((i4 & 4) != 0) {
                z3 = true;
            }
            return dVar.b(str, str2, z3, cVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getProbabilitiesAndStateFromText");
    }

    public abstract Object b(String str, String str2, boolean z3, kotlin.coroutines.c cVar);

    /* access modifiers changed from: protected */
    public final boolean c() {
        return this.f8472d;
    }

    /* access modifiers changed from: protected */
    public final StatefulLanguageModel d() {
        return this.f8470b;
    }

    /* access modifiers changed from: protected */
    public final c e() {
        return this.f8469a;
    }

    /* access modifiers changed from: protected */
    public final int f() {
        return this.f8471c;
    }

    /* access modifiers changed from: protected */
    public final String g() {
        return this.f8473e;
    }
}
