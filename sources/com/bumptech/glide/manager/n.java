package com.bumptech.glide.manager;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.q;
import androidx.lifecycle.Lifecycle;
import com.bumptech.glide.i;
import com.bumptech.glide.manager.r;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p1.l;

final class n {

    /* renamed from: a  reason: collision with root package name */
    final Map f11174a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final r.b f11175b;

    class a implements m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Lifecycle f11176a;

        a(Lifecycle lifecycle) {
            this.f11176a = lifecycle;
        }

        public void a() {
        }

        public void c() {
        }

        public void e() {
            n.this.f11174a.remove(this.f11176a);
        }
    }

    private final class b implements s {

        /* renamed from: a  reason: collision with root package name */
        private final q f11178a;

        b(q qVar) {
            this.f11178a = qVar;
        }

        private void b(q qVar, Set set) {
            List p02 = qVar.p0();
            int size = p02.size();
            for (int i4 = 0; i4 < size; i4++) {
                Fragment fragment = (Fragment) p02.get(i4);
                b(fragment.getChildFragmentManager(), set);
                i a4 = n.this.a(fragment.getLifecycle());
                if (a4 != null) {
                    set.add(a4);
                }
            }
        }

        public Set a() {
            HashSet hashSet = new HashSet();
            b(this.f11178a, hashSet);
            return hashSet;
        }
    }

    n(r.b bVar) {
        this.f11175b = bVar;
    }

    /* access modifiers changed from: package-private */
    public i a(Lifecycle lifecycle) {
        l.a();
        return (i) this.f11174a.get(lifecycle);
    }

    /* access modifiers changed from: package-private */
    public i b(Context context, com.bumptech.glide.b bVar, Lifecycle lifecycle, q qVar, boolean z3) {
        l.a();
        i a4 = a(lifecycle);
        if (a4 != null) {
            return a4;
        }
        LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(lifecycle);
        i a5 = this.f11175b.a(bVar, lifecycleLifecycle, new b(qVar), context);
        this.f11174a.put(lifecycle, a5);
        lifecycleLifecycle.e(new a(lifecycle));
        if (z3) {
            a5.a();
        }
        return a5;
    }
}
