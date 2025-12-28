package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.g;
import androidx.work.m;
import i0.e;
import java.util.ArrayList;
import java.util.List;
import l0.v;
import l0.y;

class c {

    /* renamed from: e  reason: collision with root package name */
    private static final String f7251e = m.i("ConstraintsCmdHandler");

    /* renamed from: a  reason: collision with root package name */
    private final Context f7252a;

    /* renamed from: b  reason: collision with root package name */
    private final int f7253b;

    /* renamed from: c  reason: collision with root package name */
    private final g f7254c;

    /* renamed from: d  reason: collision with root package name */
    private final e f7255d;

    c(Context context, int i4, g gVar) {
        this.f7252a = context;
        this.f7253b = i4;
        this.f7254c = gVar;
        this.f7255d = new e(gVar.g().t(), (i0.c) null);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        List<v> s4 = this.f7254c.g().u().J().s();
        ConstraintProxy.a(this.f7252a, s4);
        this.f7255d.a(s4);
        ArrayList<v> arrayList = new ArrayList<>(s4.size());
        long currentTimeMillis = System.currentTimeMillis();
        for (v vVar : s4) {
            String str = vVar.f14470a;
            if (currentTimeMillis >= vVar.c() && (!vVar.h() || this.f7255d.e(str))) {
                arrayList.add(vVar);
            }
        }
        for (v vVar2 : arrayList) {
            String str2 = vVar2.f14470a;
            Intent c4 = b.c(this.f7252a, y.a(vVar2));
            m e4 = m.e();
            String str3 = f7251e;
            e4.a(str3, "Creating a delay_met command for workSpec with id (" + str2 + ")");
            this.f7254c.f().a().execute(new g.b(this.f7254c, c4, this.f7253b));
        }
        this.f7255d.d();
    }
}
