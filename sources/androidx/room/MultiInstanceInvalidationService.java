package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.j;
import com.getcapacitor.PluginMethod;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import l2.q;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\t8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR&\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00120\u00118\u0000X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0000X\u0004¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\n\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/room/MultiInstanceInvalidationService;", "Landroid/app/Service;", "<init>", "()V", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "", "a", "I", "c", "()I", "d", "(I)V", "maxClientId", "", "", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "clientNames", "Landroid/os/RemoteCallbackList;", "Landroidx/room/i;", "Landroid/os/RemoteCallbackList;", "()Landroid/os/RemoteCallbackList;", "callbackList", "Landroidx/room/j$a;", "Landroidx/room/j$a;", "binder", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: a  reason: collision with root package name */
    private int f6724a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f6725b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    private final RemoteCallbackList f6726c = new b(this);

    /* renamed from: d  reason: collision with root package name */
    private final j.a f6727d = new a(this);

    public static final class a extends j.a {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ MultiInstanceInvalidationService f6728d;

        a(MultiInstanceInvalidationService multiInstanceInvalidationService) {
            this.f6728d = multiInstanceInvalidationService;
        }

        public int j(i iVar, String str) {
            o.e(iVar, PluginMethod.RETURN_CALLBACK);
            int i4 = 0;
            if (str == null) {
                return 0;
            }
            RemoteCallbackList a4 = this.f6728d.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f6728d;
            synchronized (a4) {
                try {
                    multiInstanceInvalidationService.d(multiInstanceInvalidationService.c() + 1);
                    int c4 = multiInstanceInvalidationService.c();
                    if (multiInstanceInvalidationService.a().register(iVar, Integer.valueOf(c4))) {
                        multiInstanceInvalidationService.b().put(Integer.valueOf(c4), str);
                        i4 = c4;
                    } else {
                        multiInstanceInvalidationService.d(multiInstanceInvalidationService.c() - 1);
                        multiInstanceInvalidationService.c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return i4;
        }

        public void m(int i4, String[] strArr) {
            o.e(strArr, "tables");
            RemoteCallbackList a4 = this.f6728d.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f6728d;
            synchronized (a4) {
                String str = (String) multiInstanceInvalidationService.b().get(Integer.valueOf(i4));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = multiInstanceInvalidationService.a().beginBroadcast();
                int i5 = 0;
                while (i5 < beginBroadcast) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService.a().getBroadcastCookie(i5);
                        o.c(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        Integer num = (Integer) broadcastCookie;
                        int intValue = num.intValue();
                        String str2 = (String) multiInstanceInvalidationService.b().get(num);
                        if (i4 != intValue && o.a(str, str2)) {
                            try {
                                ((i) multiInstanceInvalidationService.a().getBroadcastItem(i5)).g(strArr);
                            } catch (RemoteException e4) {
                                Log.w("ROOM", "Error invoking a remote callback", e4);
                            }
                        }
                        i5++;
                    } catch (Throwable th) {
                        multiInstanceInvalidationService.a().finishBroadcast();
                        throw th;
                    }
                }
                multiInstanceInvalidationService.a().finishBroadcast();
                q qVar = q.f14567a;
            }
        }

        public void t(i iVar, int i4) {
            o.e(iVar, PluginMethod.RETURN_CALLBACK);
            RemoteCallbackList a4 = this.f6728d.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f6728d;
            synchronized (a4) {
                multiInstanceInvalidationService.a().unregister(iVar);
                String str = (String) multiInstanceInvalidationService.b().remove(Integer.valueOf(i4));
            }
        }
    }

    public static final class b extends RemoteCallbackList {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MultiInstanceInvalidationService f6729a;

        b(MultiInstanceInvalidationService multiInstanceInvalidationService) {
            this.f6729a = multiInstanceInvalidationService;
        }

        /* renamed from: a */
        public void onCallbackDied(i iVar, Object obj) {
            o.e(iVar, PluginMethod.RETURN_CALLBACK);
            o.e(obj, "cookie");
            this.f6729a.b().remove((Integer) obj);
        }
    }

    public final RemoteCallbackList a() {
        return this.f6726c;
    }

    public final Map b() {
        return this.f6725b;
    }

    public final int c() {
        return this.f6724a;
    }

    public final void d(int i4) {
        this.f6724a = i4;
    }

    public IBinder onBind(Intent intent) {
        o.e(intent, "intent");
        return this.f6727d;
    }
}
