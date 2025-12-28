package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.appcompat.app.F;
import androidx.core.app.j;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.uuid.Uuid;
import y.C0940b;

class k implements i {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4839a;

    /* renamed from: b  reason: collision with root package name */
    private final Notification.Builder f4840b;

    /* renamed from: c  reason: collision with root package name */
    private final j.d f4841c;

    /* renamed from: d  reason: collision with root package name */
    private RemoteViews f4842d;

    /* renamed from: e  reason: collision with root package name */
    private RemoteViews f4843e;

    /* renamed from: f  reason: collision with root package name */
    private final List f4844f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private final Bundle f4845g = new Bundle();

    /* renamed from: h  reason: collision with root package name */
    private int f4846h;

    /* renamed from: i  reason: collision with root package name */
    private RemoteViews f4847i;

    static class a {
        static Notification a(Notification.Builder builder) {
            return builder.build();
        }

        static Notification.Builder b(Notification.Builder builder, int i4) {
            return builder.setPriority(i4);
        }

        static Notification.Builder c(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSubText(charSequence);
        }

        static Notification.Builder d(Notification.Builder builder, boolean z3) {
            return builder.setUsesChronometer(z3);
        }
    }

    static class b {
        static Notification.Builder a(Notification.Builder builder, boolean z3) {
            return builder.setShowWhen(z3);
        }
    }

    static class c {
        static Notification.Builder a(Notification.Builder builder, Bundle bundle) {
            return builder.setExtras(bundle);
        }
    }

    static class d {
        static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        static Notification.Action.Builder e(int i4, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i4, charSequence, pendingIntent);
        }

        static String f(Notification notification) {
            return notification.getGroup();
        }

        static Notification.Builder g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        static Notification.Builder h(Notification.Builder builder, boolean z3) {
            return builder.setGroupSummary(z3);
        }

        static Notification.Builder i(Notification.Builder builder, boolean z3) {
            return builder.setLocalOnly(z3);
        }

        static Notification.Builder j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    static class e {
        static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        static Notification.Builder c(Notification.Builder builder, int i4) {
            return builder.setColor(i4);
        }

        static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        static Notification.Builder f(Notification.Builder builder, int i4) {
            return builder.setVisibility(i4);
        }
    }

    static class f {
        static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    static class g {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z3) {
            return builder.setAllowGeneratedReplies(z3);
        }

        static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    static class h {
        static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        static Notification.Builder b(Notification.Builder builder, int i4) {
            return builder.setBadgeIconType(i4);
        }

        static Notification.Builder c(Notification.Builder builder, boolean z3) {
            return builder.setColorized(z3);
        }

        static Notification.Builder d(Notification.Builder builder, int i4) {
            return builder.setGroupAlertBehavior(i4);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        static Notification.Builder g(Notification.Builder builder, long j4) {
            return builder.setTimeoutAfter(j4);
        }
    }

    static class i {
        static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, int i4) {
            return builder.setSemanticAction(i4);
        }
    }

    static class j {
        static Notification.Builder a(Notification.Builder builder, boolean z3) {
            return builder.setAllowSystemGeneratedContextualActions(z3);
        }

        static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z3) {
            return builder.setContextual(z3);
        }

        static Notification.Builder d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    /* renamed from: androidx.core.app.k$k  reason: collision with other inner class name */
    static class C0068k {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z3) {
            return builder.setAuthenticationRequired(z3);
        }

        static Notification.Builder b(Notification.Builder builder, int i4) {
            return builder.setForegroundServiceBehavior(i4);
        }
    }

    k(j.d dVar) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Icon icon;
        List<String> list;
        int i4;
        this.f4841c = dVar;
        Context context = dVar.f4808a;
        this.f4839a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f4840b = h.a(context, dVar.f4797K);
        } else {
            this.f4840b = new Notification.Builder(dVar.f4808a);
        }
        Notification notification = dVar.f4804R;
        Notification.Builder lights = this.f4840b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, dVar.f4816i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        if ((notification.flags & 2) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z3);
        if ((notification.flags & 8) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z4);
        if ((notification.flags & 16) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        Notification.Builder deleteIntent = onlyAlertOnce.setAutoCancel(z5).setDefaults(notification.defaults).setContentTitle(dVar.f4812e).setContentText(dVar.f4813f).setContentInfo(dVar.f4818k).setContentIntent(dVar.f4814g).setDeleteIntent(notification.deleteIntent);
        PendingIntent pendingIntent = dVar.f4815h;
        if ((notification.flags & Uuid.SIZE_BITS) != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        deleteIntent.setFullScreenIntent(pendingIntent, z6).setNumber(dVar.f4819l).setProgress(dVar.f4827t, dVar.f4828u, dVar.f4829v);
        Notification.Builder builder = this.f4840b;
        IconCompat iconCompat = dVar.f4817j;
        if (iconCompat == null) {
            icon = null;
        } else {
            icon = iconCompat.l(context);
        }
        f.b(builder, icon);
        a.b(a.d(a.c(this.f4840b, dVar.f4824q), dVar.f4822o), dVar.f4820m);
        Iterator it = dVar.f4809b.iterator();
        while (it.hasNext()) {
            b((j.a) it.next());
        }
        Bundle bundle = dVar.f4790D;
        if (bundle != null) {
            this.f4845g.putAll(bundle);
        }
        int i5 = Build.VERSION.SDK_INT;
        this.f4842d = dVar.f4794H;
        this.f4843e = dVar.f4795I;
        b.a(this.f4840b, dVar.f4821n);
        d.i(this.f4840b, dVar.f4833z);
        d.g(this.f4840b, dVar.f4830w);
        d.j(this.f4840b, dVar.f4832y);
        d.h(this.f4840b, dVar.f4831x);
        this.f4846h = dVar.f4801O;
        e.b(this.f4840b, dVar.f4789C);
        e.c(this.f4840b, dVar.f4791E);
        e.f(this.f4840b, dVar.f4792F);
        e.d(this.f4840b, dVar.f4793G);
        e.e(this.f4840b, notification.sound, notification.audioAttributes);
        if (i5 < 28) {
            list = e(f(dVar.f4810c), dVar.f4807U);
        } else {
            list = dVar.f4807U;
        }
        if (list != null && !list.isEmpty()) {
            for (String a4 : list) {
                e.a(this.f4840b, a4);
            }
        }
        this.f4847i = dVar.f4796J;
        if (dVar.f4811d.size() > 0) {
            Bundle bundle2 = dVar.c().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i6 = 0; i6 < dVar.f4811d.size(); i6++) {
                bundle4.putBundle(Integer.toString(i6), l.a((j.a) dVar.f4811d.get(i6)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            dVar.c().putBundle("android.car.EXTENSIONS", bundle2);
            this.f4845g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i7 = Build.VERSION.SDK_INT;
        Object obj = dVar.f4806T;
        if (obj != null) {
            f.c(this.f4840b, obj);
        }
        if (i7 >= 24) {
            c.a(this.f4840b, dVar.f4790D);
            g.e(this.f4840b, dVar.f4826s);
            RemoteViews remoteViews = dVar.f4794H;
            if (remoteViews != null) {
                g.c(this.f4840b, remoteViews);
            }
            RemoteViews remoteViews2 = dVar.f4795I;
            if (remoteViews2 != null) {
                g.b(this.f4840b, remoteViews2);
            }
            RemoteViews remoteViews3 = dVar.f4796J;
            if (remoteViews3 != null) {
                g.d(this.f4840b, remoteViews3);
            }
        }
        if (i7 >= 26) {
            h.b(this.f4840b, dVar.f4798L);
            h.e(this.f4840b, dVar.f4825r);
            h.f(this.f4840b, dVar.f4799M);
            h.g(this.f4840b, dVar.f4800N);
            h.d(this.f4840b, dVar.f4801O);
            if (dVar.f4788B) {
                h.c(this.f4840b, dVar.f4787A);
            }
            if (!TextUtils.isEmpty(dVar.f4797K)) {
                this.f4840b.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
        if (i7 >= 28) {
            Iterator it2 = dVar.f4810c.iterator();
            if (it2.hasNext()) {
                F.a(it2.next());
                throw null;
            }
        }
        if (i7 >= 29) {
            j.a(this.f4840b, dVar.f4803Q);
            j.b(this.f4840b, j.c.a((j.c) null));
        }
        if (i7 >= 31 && (i4 = dVar.f4802P) != 0) {
            C0068k.b(this.f4840b, i4);
        }
        if (dVar.f4805S) {
            if (this.f4841c.f4831x) {
                this.f4846h = 2;
            } else {
                this.f4846h = 1;
            }
            this.f4840b.setVibrate((long[]) null);
            this.f4840b.setSound((Uri) null);
            int i8 = notification.defaults & -4;
            notification.defaults = i8;
            this.f4840b.setDefaults(i8);
            if (i7 >= 26) {
                if (TextUtils.isEmpty(this.f4841c.f4830w)) {
                    d.g(this.f4840b, "silent");
                }
                h.d(this.f4840b, this.f4846h);
            }
        }
    }

    private void b(j.a aVar) {
        Icon icon;
        Bundle bundle;
        IconCompat d4 = aVar.d();
        if (d4 != null) {
            icon = d4.k();
        } else {
            icon = null;
        }
        Notification.Action.Builder a4 = f.a(icon, aVar.h(), aVar.a());
        if (aVar.e() != null) {
            for (RemoteInput c4 : o.b(aVar.e())) {
                d.c(a4, c4);
            }
        }
        if (aVar.c() != null) {
            bundle = new Bundle(aVar.c());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 24) {
            g.a(a4, aVar.b());
        }
        bundle.putInt("android.support.action.semanticAction", aVar.f());
        if (i4 >= 28) {
            i.b(a4, aVar.f());
        }
        if (i4 >= 29) {
            j.c(a4, aVar.j());
        }
        if (i4 >= 31) {
            C0068k.a(a4, aVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.g());
        d.b(a4, bundle);
        d.a(this.f4840b, d.d(a4));
    }

    private static List e(List list, List list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        C0940b bVar = new C0940b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    private static List f(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        F.a(it.next());
        throw null;
    }

    private void g(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    public Notification.Builder a() {
        return this.f4840b;
    }

    public Notification c() {
        RemoteViews remoteViews;
        Bundle a4;
        RemoteViews f4;
        RemoteViews d4;
        j.f fVar = this.f4841c.f4823p;
        if (fVar != null) {
            fVar.b(this);
        }
        if (fVar != null) {
            remoteViews = fVar.e(this);
        } else {
            remoteViews = null;
        }
        Notification d5 = d();
        if (remoteViews != null) {
            d5.contentView = remoteViews;
        } else {
            RemoteViews remoteViews2 = this.f4841c.f4794H;
            if (remoteViews2 != null) {
                d5.contentView = remoteViews2;
            }
        }
        if (!(fVar == null || (d4 = fVar.d(this)) == null)) {
            d5.bigContentView = d4;
        }
        if (!(fVar == null || (f4 = this.f4841c.f4823p.f(this)) == null)) {
            d5.headsUpContentView = f4;
        }
        if (!(fVar == null || (a4 = j.a(d5)) == null)) {
            fVar.a(a4);
        }
        return d5;
    }

    /* access modifiers changed from: protected */
    public Notification d() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            return a.a(this.f4840b);
        }
        if (i4 >= 24) {
            Notification a4 = a.a(this.f4840b);
            if (this.f4846h != 0) {
                if (!(d.f(a4) == null || (a4.flags & 512) == 0 || this.f4846h != 2)) {
                    g(a4);
                }
                if (d.f(a4) != null && (a4.flags & 512) == 0 && this.f4846h == 1) {
                    g(a4);
                }
            }
            return a4;
        }
        c.a(this.f4840b, this.f4845g);
        Notification a5 = a.a(this.f4840b);
        RemoteViews remoteViews = this.f4842d;
        if (remoteViews != null) {
            a5.contentView = remoteViews;
        }
        RemoteViews remoteViews2 = this.f4843e;
        if (remoteViews2 != null) {
            a5.bigContentView = remoteViews2;
        }
        RemoteViews remoteViews3 = this.f4847i;
        if (remoteViews3 != null) {
            a5.headsUpContentView = remoteViews3;
        }
        if (this.f4846h != 0) {
            if (!(d.f(a5) == null || (a5.flags & 512) == 0 || this.f4846h != 2)) {
                g(a5);
            }
            if (d.f(a5) != null && (a5.flags & 512) == 0 && this.f4846h == 1) {
                g(a5);
            }
        }
        return a5;
    }
}
