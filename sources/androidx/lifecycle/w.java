package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public class w extends Fragment {

    /* renamed from: b  reason: collision with root package name */
    public static final b f6088b = new b((i) null);

    /* renamed from: a  reason: collision with root package name */
    private a f6089a;

    public interface a {
        void a();

        void b();

        void c();
    }

    public static final class b {
        public /* synthetic */ b(i iVar) {
            this();
        }

        public final void a(Activity activity, Lifecycle.Event event) {
            o.e(activity, "activity");
            o.e(event, "event");
            if (activity instanceof m) {
                Lifecycle lifecycle = ((m) activity).getLifecycle();
                if (lifecycle instanceof n) {
                    ((n) lifecycle).h(event);
                }
            }
        }

        public final w b(Activity activity) {
            o.e(activity, "<this>");
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            o.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            return (w) findFragmentByTag;
        }

        public final void c(Activity activity) {
            o.e(activity, "activity");
            if (Build.VERSION.SDK_INT >= 29) {
                c.Companion.a(activity);
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager.beginTransaction().add(new w(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager.executePendingTransactions();
            }
        }

        private b() {
        }
    }

    public static final class c implements Application.ActivityLifecycleCallbacks {
        public static final a Companion = new a((i) null);

        public static final class a {
            public /* synthetic */ a(i iVar) {
                this();
            }

            public final void a(Activity activity) {
                o.e(activity, "activity");
                x.a(activity, new c());
            }

            private a() {
            }
        }

        public static final void registerIn(Activity activity) {
            Companion.a(activity);
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            o.e(activity, "activity");
        }

        public void onActivityDestroyed(Activity activity) {
            o.e(activity, "activity");
        }

        public void onActivityPaused(Activity activity) {
            o.e(activity, "activity");
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            o.e(activity, "activity");
            w.f6088b.a(activity, Lifecycle.Event.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            o.e(activity, "activity");
            w.f6088b.a(activity, Lifecycle.Event.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            o.e(activity, "activity");
            w.f6088b.a(activity, Lifecycle.Event.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            o.e(activity, "activity");
            w.f6088b.a(activity, Lifecycle.Event.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            o.e(activity, "activity");
            w.f6088b.a(activity, Lifecycle.Event.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            o.e(activity, "activity");
            w.f6088b.a(activity, Lifecycle.Event.ON_STOP);
        }

        public void onActivityResumed(Activity activity) {
            o.e(activity, "activity");
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            o.e(activity, "activity");
            o.e(bundle, "bundle");
        }

        public void onActivityStarted(Activity activity) {
            o.e(activity, "activity");
        }

        public void onActivityStopped(Activity activity) {
            o.e(activity, "activity");
        }
    }

    private final void a(Lifecycle.Event event) {
        if (Build.VERSION.SDK_INT < 29) {
            b bVar = f6088b;
            Activity activity = getActivity();
            o.d(activity, "activity");
            bVar.a(activity, event);
        }
    }

    private final void b(a aVar) {
        if (aVar != null) {
            aVar.b();
        }
    }

    private final void c(a aVar) {
        if (aVar != null) {
            aVar.c();
        }
    }

    private final void d(a aVar) {
        if (aVar != null) {
            aVar.a();
        }
    }

    public static final void e(Activity activity) {
        f6088b.c(activity);
    }

    public final void f(a aVar) {
        this.f6089a = aVar;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        b(this.f6089a);
        a(Lifecycle.Event.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        a(Lifecycle.Event.ON_DESTROY);
        this.f6089a = null;
    }

    public void onPause() {
        super.onPause();
        a(Lifecycle.Event.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        c(this.f6089a);
        a(Lifecycle.Event.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        d(this.f6089a);
        a(Lifecycle.Event.ON_START);
    }

    public void onStop() {
        super.onStop();
        a(Lifecycle.Event.ON_STOP);
    }
}
