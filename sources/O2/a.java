package O2;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import androidx.core.app.j;
import androidx.work.g;
import ch.icoaching.wrio.C;
import ch.icoaching.wrio.C0561z;
import com.capacitorjs.plugins.localnotifications.e;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlin.uuid.Uuid;

public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static final C0018a f1077c = new C0018a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final Context f1078a;

    /* renamed from: b  reason: collision with root package name */
    private final NotificationManager f1079b;

    /* renamed from: O2.a$a  reason: collision with other inner class name */
    public static final class C0018a {
        public /* synthetic */ C0018a(i iVar) {
            this();
        }

        public final int a(Context context) {
            o.e(context, "context");
            try {
                return context.getPackageManager().getApplicationInfo(context.getPackageName(), Uuid.SIZE_BITS).metaData.getInt("notifications_icon");
            } catch (Exception unused) {
                return C0561z.ic_notifications_black;
            }
        }

        private C0018a() {
        }
    }

    public a(Context context) {
        o.e(context, "context");
        this.f1078a = context;
        Object systemService = context.getSystemService("notification");
        o.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        this.f1079b = (NotificationManager) systemService;
        if (Build.VERSION.SDK_INT >= 26) {
            a();
        }
    }

    private final void a() {
        String string = this.f1078a.getString(C.keyboard_push_channel_name);
        o.d(string, "getString(...)");
        NotificationChannel a4 = e.a("dictionary_notification_channel", string, 4);
        a4.setDescription(this.f1078a.getString(C.keyboard_push_channel_description));
        this.f1079b.createNotificationChannel(a4);
    }

    public final g b() {
        String string = this.f1078a.getString(C.keyboard_push_integrity);
        o.d(string, "getString(...)");
        Notification b4 = new j.d(this.f1078a, "dictionary_notification_channel").i(string).p(true).s(f1077c.a(this.f1078a)).b();
        o.d(b4, "build(...)");
        if (Build.VERSION.SDK_INT >= 29) {
            return new g(16772863, b4, 1);
        }
        return new g(16772863, b4);
    }

    public final g c() {
        String string = this.f1078a.getString(C.keyboard_push_word_case_restoration);
        o.d(string, "getString(...)");
        Notification b4 = new j.d(this.f1078a, "dictionary_notification_channel").i(string).p(true).s(f1077c.a(this.f1078a)).b();
        o.d(b4, "build(...)");
        if (Build.VERSION.SDK_INT >= 29) {
            return new g(16772863, b4, 1);
        }
        return new g(16772863, b4);
    }

    public final g d() {
        String string = this.f1078a.getString(C.keyboard_push_word_case_restoration);
        o.d(string, "getString(...)");
        Notification b4 = new j.d(this.f1078a, "dictionary_notification_channel").i(string).p(true).s(f1077c.a(this.f1078a)).b();
        o.d(b4, "build(...)");
        if (Build.VERSION.SDK_INT >= 29) {
            return new g(16772863, b4, 1);
        }
        return new g(16772863, b4);
    }

    public final g e() {
        String string = this.f1078a.getString(C.keyboard_push_word_case_restoration);
        o.d(string, "getString(...)");
        Notification b4 = new j.d(this.f1078a, "dictionary_notification_channel").i(string).p(true).s(f1077c.a(this.f1078a)).b();
        o.d(b4, "build(...)");
        if (Build.VERSION.SDK_INT >= 29) {
            return new g(16772863, b4, 1);
        }
        return new g(16772863, b4);
    }

    public final g f() {
        String string = this.f1078a.getString(C.keyboard_cards_autocorrectioninitialization_title);
        o.d(string, "getString(...)");
        Notification b4 = new j.d(this.f1078a, "dictionary_notification_channel").i(string).p(true).s(f1077c.a(this.f1078a)).b();
        o.d(b4, "build(...)");
        if (Build.VERSION.SDK_INT >= 29) {
            return new g(16772863, b4, 1);
        }
        return new g(16772863, b4);
    }
}
