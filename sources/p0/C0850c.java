package p0;

import android.content.Context;
import ch.icoaching.wrio.C;
import ch.icoaching.wrio.C0561z;
import ch.icoaching.wrio.ai_assistant.ui.PromptItemType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.o;

/* renamed from: p0.c  reason: case insensitive filesystem */
public abstract class C0850c {

    /* renamed from: p0.c$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15829a;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|4|5|6|7|8|9|10|11|12|13|15) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                ch.icoaching.wrio.ai_assistant.ui.PromptItemType[] r0 = ch.icoaching.wrio.ai_assistant.ui.PromptItemType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ch.icoaching.wrio.ai_assistant.ui.PromptItemType r1 = ch.icoaching.wrio.ai_assistant.ui.PromptItemType.PROOFREAD     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ch.icoaching.wrio.ai_assistant.ui.PromptItemType r1 = ch.icoaching.wrio.ai_assistant.ui.PromptItemType.TRANSLATE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ch.icoaching.wrio.ai_assistant.ui.PromptItemType r1 = ch.icoaching.wrio.ai_assistant.ui.PromptItemType.TONALITY     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                ch.icoaching.wrio.ai_assistant.ui.PromptItemType r1 = ch.icoaching.wrio.ai_assistant.ui.PromptItemType.INCLUSIVE_LANGUAGE     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                ch.icoaching.wrio.ai_assistant.ui.PromptItemType r1 = ch.icoaching.wrio.ai_assistant.ui.PromptItemType.SHORTEN     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                ch.icoaching.wrio.ai_assistant.ui.PromptItemType r1 = ch.icoaching.wrio.ai_assistant.ui.PromptItemType.EXTEND     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                f15829a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p0.C0850c.a.<clinit>():void");
        }
    }

    public static final int a(ch.icoaching.wrio.ai_assistant.ui.a aVar, Context context) {
        o.e(aVar, "<this>");
        o.e(context, "context");
        switch (a.f15829a[aVar.c().ordinal()]) {
            case 1:
                return C0561z.proofread;
            case 2:
                if (!kotlin.text.o.X(aVar.d())) {
                    return context.getResources().getIdentifier(kotlin.text.o.C(aVar.d(), "-", "_", false, 4, (Object) null), "drawable", context.getPackageName());
                }
                throw new IllegalArgumentException("No translate language present!");
            case 3:
                return ch.icoaching.wrio.ai_assistant.text_transformation.a.a(aVar.d());
            case 4:
                return C0561z.inclusive_language;
            case 5:
                return C0561z.shorten;
            case 6:
                return C0561z.extend;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final C0849b b(PromptItemType promptItemType, Context context) {
        o.e(promptItemType, "<this>");
        o.e(context, "context");
        switch (a.f15829a[promptItemType.ordinal()]) {
            case 1:
                PromptItemType promptItemType2 = PromptItemType.PROOFREAD;
                String string = context.getString(C.proofread);
                o.d(string, "getString(...)");
                return new C0849b(promptItemType2, string, C0561z.proofread);
            case 2:
                PromptItemType promptItemType3 = PromptItemType.TRANSLATE;
                String string2 = context.getString(C.translate);
                o.d(string2, "getString(...)");
                return new C0849b(promptItemType3, string2, C0561z.translate);
            case 3:
                PromptItemType promptItemType4 = PromptItemType.TONALITY;
                String string3 = context.getString(C.tonality);
                o.d(string3, "getString(...)");
                return new C0849b(promptItemType4, string3, C0561z.tonality);
            case 4:
                PromptItemType promptItemType5 = PromptItemType.INCLUSIVE_LANGUAGE;
                String string4 = context.getString(C.inclusive_language);
                o.d(string4, "getString(...)");
                return new C0849b(promptItemType5, string4, C0561z.inclusive_language);
            case 5:
                PromptItemType promptItemType6 = PromptItemType.SHORTEN;
                String string5 = context.getString(C.shorten);
                o.d(string5, "getString(...)");
                return new C0849b(promptItemType6, string5, C0561z.shorten);
            case 6:
                PromptItemType promptItemType7 = PromptItemType.EXTEND;
                String string6 = context.getString(C.extend);
                o.d(string6, "getString(...)");
                return new C0849b(promptItemType7, string6, C0561z.extend);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
