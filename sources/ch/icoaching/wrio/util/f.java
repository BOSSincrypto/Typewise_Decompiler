package ch.icoaching.wrio.util;

import K2.C0341a;
import android.content.Context;
import android.content.res.AssetManager;
import ch.icoaching.wrio.C0501a;
import ch.icoaching.wrio.keyboard.layout.Layout;
import ch.icoaching.wrio.keyboard.model.config.JsonConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.o;

public abstract class f {

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f10695a;

        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|19) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                ch.icoaching.wrio.keyboard.layout.Layout[] r0 = ch.icoaching.wrio.keyboard.layout.Layout.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ch.icoaching.wrio.keyboard.layout.Layout r1 = ch.icoaching.wrio.keyboard.layout.Layout.QWERTY     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ch.icoaching.wrio.keyboard.layout.Layout r1 = ch.icoaching.wrio.keyboard.layout.Layout.QWERTZ     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ch.icoaching.wrio.keyboard.layout.Layout r1 = ch.icoaching.wrio.keyboard.layout.Layout.AZERTY     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                ch.icoaching.wrio.keyboard.layout.Layout r1 = ch.icoaching.wrio.keyboard.layout.Layout.WORKMAN     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                ch.icoaching.wrio.keyboard.layout.Layout r1 = ch.icoaching.wrio.keyboard.layout.Layout.NEO2     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                ch.icoaching.wrio.keyboard.layout.Layout r1 = ch.icoaching.wrio.keyboard.layout.Layout.DVORAK     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                ch.icoaching.wrio.keyboard.layout.Layout r1 = ch.icoaching.wrio.keyboard.layout.Layout.COLEMAK     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                ch.icoaching.wrio.keyboard.layout.Layout r1 = ch.icoaching.wrio.keyboard.layout.Layout.AUTO     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                f10695a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.util.f.a.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public static final JsonConfig c(String str, Context context, C0341a aVar) {
        AssetManager assets = context.getAssets();
        o.d(assets, "getAssets(...)");
        String a4 = C0501a.a(assets, str);
        aVar.a();
        return (JsonConfig) aVar.c(JsonConfig.Companion.serializer(), a4);
    }

    /* access modifiers changed from: private */
    public static final String d(Layout layout) {
        switch (a.f10695a[layout.ordinal()]) {
            case 1:
            case 8:
                return "keyboard_layouts/qwerty.json";
            case 2:
                return "keyboard_layouts/qwertz.json";
            case 3:
                return "keyboard_layouts/azerty.json";
            case 4:
                return "keyboard_layouts/workman.json";
            case 5:
                return "keyboard_layouts/neo2.json";
            case 6:
                return "keyboard_layouts/dvorak.json";
            case 7:
                return "keyboard_layouts/colemak.json";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
