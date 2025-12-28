package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.a;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f4736a = (IconCompat) aVar.v(remoteActionCompat.f4736a, 1);
        remoteActionCompat.f4737b = aVar.l(remoteActionCompat.f4737b, 2);
        remoteActionCompat.f4738c = aVar.l(remoteActionCompat.f4738c, 3);
        remoteActionCompat.f4739d = (PendingIntent) aVar.r(remoteActionCompat.f4739d, 4);
        remoteActionCompat.f4740e = aVar.h(remoteActionCompat.f4740e, 5);
        remoteActionCompat.f4741f = aVar.h(remoteActionCompat.f4741f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.x(false, false);
        aVar.M(remoteActionCompat.f4736a, 1);
        aVar.D(remoteActionCompat.f4737b, 2);
        aVar.D(remoteActionCompat.f4738c, 3);
        aVar.H(remoteActionCompat.f4739d, 4);
        aVar.z(remoteActionCompat.f4740e, 5);
        aVar.z(remoteActionCompat.f4741f, 6);
    }
}
