package androidx.core.app;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k.C0692a;

public final class m {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f4850c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static String f4851d;

    /* renamed from: e  reason: collision with root package name */
    private static Set f4852e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    private static final Object f4853f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private static d f4854g;

    /* renamed from: a  reason: collision with root package name */
    private final Context f4855a;

    /* renamed from: b  reason: collision with root package name */
    private final NotificationManager f4856b;

    static class a {
        static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        static int b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    private static class b implements e {

        /* renamed from: a  reason: collision with root package name */
        final String f4857a;

        /* renamed from: b  reason: collision with root package name */
        final int f4858b;

        /* renamed from: c  reason: collision with root package name */
        final String f4859c;

        /* renamed from: d  reason: collision with root package name */
        final Notification f4860d;

        b(String str, int i4, String str2, Notification notification) {
            this.f4857a = str;
            this.f4858b = i4;
            this.f4859c = str2;
            this.f4860d = notification;
        }

        public void a(C0692a aVar) {
            aVar.q(this.f4857a, this.f4858b, this.f4859c, this.f4860d);
        }

        public String toString() {
            return "NotifyTask[" + "packageName:" + this.f4857a + ", id:" + this.f4858b + ", tag:" + this.f4859c + "]";
        }
    }

    private static class c {

        /* renamed from: a  reason: collision with root package name */
        final ComponentName f4861a;

        /* renamed from: b  reason: collision with root package name */
        final IBinder f4862b;

        c(ComponentName componentName, IBinder iBinder) {
            this.f4861a = componentName;
            this.f4862b = iBinder;
        }
    }

    private static class d implements Handler.Callback, ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        private final Context f4863a;

        /* renamed from: b  reason: collision with root package name */
        private final HandlerThread f4864b;

        /* renamed from: c  reason: collision with root package name */
        private final Handler f4865c;

        /* renamed from: d  reason: collision with root package name */
        private final Map f4866d = new HashMap();

        /* renamed from: e  reason: collision with root package name */
        private Set f4867e = new HashSet();

        private static class a {

            /* renamed from: a  reason: collision with root package name */
            final ComponentName f4868a;

            /* renamed from: b  reason: collision with root package name */
            boolean f4869b = false;

            /* renamed from: c  reason: collision with root package name */
            C0692a f4870c;

            /* renamed from: d  reason: collision with root package name */
            ArrayDeque f4871d = new ArrayDeque();

            /* renamed from: e  reason: collision with root package name */
            int f4872e = 0;

            a(ComponentName componentName) {
                this.f4868a = componentName;
            }
        }

        d(Context context) {
            this.f4863a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f4864b = handlerThread;
            handlerThread.start();
            this.f4865c = new Handler(handlerThread.getLooper(), this);
        }

        private boolean a(a aVar) {
            if (aVar.f4869b) {
                return true;
            }
            boolean bindService = this.f4863a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f4868a), this, 33);
            aVar.f4869b = bindService;
            if (bindService) {
                aVar.f4872e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.f4868a);
                this.f4863a.unbindService(this);
            }
            return aVar.f4869b;
        }

        private void b(a aVar) {
            if (aVar.f4869b) {
                this.f4863a.unbindService(this);
                aVar.f4869b = false;
            }
            aVar.f4870c = null;
        }

        private void c(e eVar) {
            j();
            for (a aVar : this.f4866d.values()) {
                aVar.f4871d.add(eVar);
                g(aVar);
            }
        }

        private void d(ComponentName componentName) {
            a aVar = (a) this.f4866d.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        private void e(ComponentName componentName, IBinder iBinder) {
            a aVar = (a) this.f4866d.get(componentName);
            if (aVar != null) {
                aVar.f4870c = C0692a.C0196a.v(iBinder);
                aVar.f4872e = 0;
                g(aVar);
            }
        }

        private void f(ComponentName componentName) {
            a aVar = (a) this.f4866d.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        private void g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Processing component ");
                sb.append(aVar.f4868a);
                sb.append(", ");
                sb.append(aVar.f4871d.size());
                sb.append(" queued tasks");
            }
            if (!aVar.f4871d.isEmpty()) {
                if (!a(aVar) || aVar.f4870c == null) {
                    i(aVar);
                    return;
                }
                while (true) {
                    e eVar = (e) aVar.f4871d.peek();
                    if (eVar == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Sending task ");
                            sb2.append(eVar);
                        }
                        eVar.a(aVar.f4870c);
                        aVar.f4871d.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Remote service has died: ");
                            sb3.append(aVar.f4868a);
                        }
                    } catch (RemoteException e4) {
                        Log.w("NotifManCompat", "RemoteException communicating with " + aVar.f4868a, e4);
                    }
                }
                if (!aVar.f4871d.isEmpty()) {
                    i(aVar);
                }
            }
        }

        private void i(a aVar) {
            if (!this.f4865c.hasMessages(3, aVar.f4868a)) {
                int i4 = aVar.f4872e;
                int i5 = i4 + 1;
                aVar.f4872e = i5;
                if (i5 > 6) {
                    Log.w("NotifManCompat", "Giving up on delivering " + aVar.f4871d.size() + " tasks to " + aVar.f4868a + " after " + aVar.f4872e + " retries");
                    aVar.f4871d.clear();
                    return;
                }
                int i6 = (1 << i4) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Scheduling retry for ");
                    sb.append(i6);
                    sb.append(" ms");
                }
                this.f4865c.sendMessageDelayed(this.f4865c.obtainMessage(3, aVar.f4868a), (long) i6);
            }
        }

        private void j() {
            Set e4 = m.e(this.f4863a);
            if (!e4.equals(this.f4867e)) {
                this.f4867e = e4;
                List<ResolveInfo> queryIntentServices = this.f4863a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet = new HashSet<>();
                for (ResolveInfo next : queryIntentServices) {
                    if (e4.contains(next.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = next.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (next.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet) {
                    if (!this.f4866d.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Adding listener record for ");
                            sb.append(componentName2);
                        }
                        this.f4866d.put(componentName2, new a(componentName2));
                    }
                }
                Iterator it = this.f4866d.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!hashSet.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Removing listener record for ");
                            sb2.append(entry.getKey());
                        }
                        b((a) entry.getValue());
                        it.remove();
                    }
                }
            }
        }

        public void h(e eVar) {
            this.f4865c.obtainMessage(0, eVar).sendToTarget();
        }

        public boolean handleMessage(Message message) {
            int i4 = message.what;
            if (i4 == 0) {
                c((e) message.obj);
                return true;
            } else if (i4 == 1) {
                c cVar = (c) message.obj;
                e(cVar.f4861a, cVar.f4862b);
                return true;
            } else if (i4 == 2) {
                f((ComponentName) message.obj);
                return true;
            } else if (i4 != 3) {
                return false;
            } else {
                d((ComponentName) message.obj);
                return true;
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Connected to service ");
                sb.append(componentName);
            }
            this.f4865c.obtainMessage(1, new c(componentName, iBinder)).sendToTarget();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Disconnected from service ");
                sb.append(componentName);
            }
            this.f4865c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    private interface e {
        void a(C0692a aVar);
    }

    private m(Context context) {
        this.f4855a = context;
        this.f4856b = (NotificationManager) context.getSystemService("notification");
    }

    public static m d(Context context) {
        return new m(context);
    }

    public static Set e(Context context) {
        Set set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f4850c) {
            if (string != null) {
                try {
                    if (!string.equals(f4851d)) {
                        String[] split = string.split(":", -1);
                        HashSet hashSet = new HashSet(split.length);
                        for (String unflattenFromString : split) {
                            ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                            if (unflattenFromString2 != null) {
                                hashSet.add(unflattenFromString2.getPackageName());
                            }
                        }
                        f4852e = hashSet;
                        f4851d = string;
                    }
                } finally {
                }
            }
            set = f4852e;
        }
        return set;
    }

    private void h(e eVar) {
        synchronized (f4853f) {
            try {
                if (f4854g == null) {
                    f4854g = new d(this.f4855a.getApplicationContext());
                }
                f4854g.h(eVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean i(Notification notification) {
        Bundle a4 = j.a(notification);
        if (a4 == null || !a4.getBoolean("android.support.useSideChannel")) {
            return false;
        }
        return true;
    }

    public boolean a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.a(this.f4856b);
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f4855a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f4855a.getApplicationInfo();
        String packageName = this.f4855a.getApplicationContext().getPackageName();
        int i4 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class cls2 = Integer.TYPE;
            Method method = cls.getMethod("checkOpNoThrow", new Class[]{cls2, cls2, String.class});
            Integer num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
            num.intValue();
            if (((Integer) method.invoke(appOpsManager, new Object[]{num, Integer.valueOf(i4), packageName})).intValue() == 0) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    public void b(int i4) {
        c((String) null, i4);
    }

    public void c(String str, int i4) {
        this.f4856b.cancel(str, i4);
    }

    public void f(int i4, Notification notification) {
        g((String) null, i4, notification);
    }

    public void g(String str, int i4, Notification notification) {
        if (i(notification)) {
            h(new b(this.f4855a.getPackageName(), i4, str, notification));
            this.f4856b.cancel(str, i4);
            return;
        }
        this.f4856b.notify(str, i4, notification);
    }
}
