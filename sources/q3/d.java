package q3;

import E0.g;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.SystemClock;
import ch.icoaching.wrio.logging.Log;
import kotlin.jvm.internal.o;

final class d implements a {

    /* renamed from: b  reason: collision with root package name */
    private final InputMethodService f15968b;

    /* renamed from: c  reason: collision with root package name */
    private int[] f15969c;

    /* renamed from: d  reason: collision with root package name */
    private long f15970d;

    public d(InputMethodService inputMethodService) {
        o.e(inputMethodService, "inputMethodService");
        this.f15968b = inputMethodService;
    }

    public int[] a() {
        int[] iArr = this.f15969c;
        if (iArr == null || g.a(iArr) <= 0 || SystemClock.elapsedRealtime() - this.f15970d >= 1000) {
            int[] a4 = c.b(this.f15968b);
            Log log = Log.f10572a;
            Log.d(log, "CurrentDisplaySizeProvider", "getCurrentDisplaySize() :: Returning display size fetched from the system: (" + a4[0] + " x " + a4[1] + ')', (Throwable) null, 4, (Object) null);
            return a4;
        }
        Log log2 = Log.f10572a;
        Log.d(log2, "CurrentDisplaySizeProvider", "getCurrentDisplaySize() :: Returning display size received in onConfigurationChanged(): (" + iArr[0] + " x " + iArr[1] + ')', (Throwable) null, 4, (Object) null);
        return iArr;
    }

    public void onConfigurationChanged(Configuration configuration) {
        o.e(configuration, "newConfig");
        String configuration2 = configuration.toString();
        o.d(configuration2, "toString(...)");
        try {
            int V3 = kotlin.text.o.V(configuration2, "mBounds=Rect", 0, false, 6, (Object) null);
            if (V3 > -1) {
                int i4 = V3 + 13;
                String substring = configuration2.substring(i4, kotlin.text.o.U(configuration2, ')', i4, false, 4, (Object) null));
                o.d(substring, "substring(...)");
                Log log = Log.f10572a;
                Log.d(log, "CurrentDisplaySizeProvider", "onConfigurationChanged() :: mBoundsString = '" + substring + '\'', (Throwable) null, 4, (Object) null);
                String substring2 = substring.substring(0, kotlin.text.o.U(substring, ',', 0, false, 6, (Object) null));
                o.d(substring2, "substring(...)");
                String obj = kotlin.text.o.M0(substring2).toString();
                String substring3 = substring.substring(kotlin.text.o.U(substring, ',', 0, false, 6, (Object) null) + 1, kotlin.text.o.U(substring, '-', 0, false, 6, (Object) null));
                o.d(substring3, "substring(...)");
                String obj2 = kotlin.text.o.M0(substring3).toString();
                int U3 = kotlin.text.o.U(substring, '-', 0, false, 6, (Object) null) + 1;
                int U4 = kotlin.text.o.U(substring, ',', U3, false, 4, (Object) null);
                String substring4 = substring.substring(U3, U4);
                o.d(substring4, "substring(...)");
                String obj3 = kotlin.text.o.M0(substring4).toString();
                String substring5 = substring.substring(U4 + 1);
                o.d(substring5, "substring(...)");
                Rect rect = new Rect(Integer.parseInt(obj), Integer.parseInt(obj2), Integer.parseInt(obj3), Integer.parseInt(kotlin.text.o.M0(substring5).toString()));
                int width = rect.width();
                int height = rect.height();
                Log.d(log, "CurrentDisplaySizeProvider", "onConfigurationChanged() :: Display size = (" + width + " x " + height + ')', (Throwable) null, 4, (Object) null);
                this.f15969c = new int[]{width, height};
                this.f15970d = SystemClock.elapsedRealtime();
            }
        } catch (Exception e4) {
            Log log2 = Log.f10572a;
            log2.o("CurrentDisplaySizeProvider", "onConfigurationChanged() :: Error parsing mBounds from configuration string: '" + configuration2 + '\'', e4);
        }
    }
}
