package androidx.work;

import android.app.Notification;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final int f7155a;

    /* renamed from: b  reason: collision with root package name */
    private final int f7156b;

    /* renamed from: c  reason: collision with root package name */
    private final Notification f7157c;

    public g(int i4, Notification notification) {
        this(i4, notification, 0);
    }

    public int a() {
        return this.f7156b;
    }

    public Notification b() {
        return this.f7157c;
    }

    public int c() {
        return this.f7155a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f7155a == gVar.f7155a && this.f7156b == gVar.f7156b) {
            return this.f7157c.equals(gVar.f7157c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f7155a * 31) + this.f7156b) * 31) + this.f7157c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{" + "mNotificationId=" + this.f7155a + ", mForegroundServiceType=" + this.f7156b + ", mNotification=" + this.f7157c + '}';
    }

    public g(int i4, Notification notification, int i5) {
        this.f7155a = i4;
        this.f7157c = notification;
        this.f7156b = i5;
    }
}
