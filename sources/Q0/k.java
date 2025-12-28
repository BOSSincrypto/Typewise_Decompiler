package q0;

import android.content.Context;
import ch.icoaching.wrio.C;
import ch.icoaching.wrio.C0561z;
import ch.icoaching.wrio.ai_assistant.text_transformation.TonalityTextTransformation;
import ch.icoaching.wrio.keyboard.model.ThemeModel;
import java.util.ArrayList;
import kotlin.jvm.internal.o;
import l2.q;
import q0.C0859b;
import u2.l;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    private l f15948a;

    /* renamed from: b  reason: collision with root package name */
    private ThemeModel.AIAssistantTheme.AIAssistantDropDownTheme f15949b;

    /* renamed from: c  reason: collision with root package name */
    private i f15950c;

    /* access modifiers changed from: private */
    public static final q b(k kVar, String str) {
        o.e(str, "it");
        l d4 = kVar.d();
        if (d4 != null) {
            d4.invoke(str);
        }
        return q.f14567a;
    }

    private final void g(Context context) {
        ArrayList arrayList = new ArrayList();
        String string = context.getString(C.make_it_formal);
        o.d(string, "getString(...)");
        arrayList.add(new C0859b.C0224b(string, TonalityTextTransformation.Tonality.FORMAL.getValue(), C0561z.formal));
        String string2 = context.getString(C.make_it_friendly);
        o.d(string2, "getString(...)");
        arrayList.add(new C0859b.C0224b(string2, TonalityTextTransformation.Tonality.FRIENDLY.getValue(), C0561z.friendly));
        String string3 = context.getString(C.make_it_academic);
        o.d(string3, "getString(...)");
        arrayList.add(new C0859b.C0224b(string3, TonalityTextTransformation.Tonality.ACADEMIC.getValue(), C0561z.academic));
        String string4 = context.getString(C.make_it_casual);
        o.d(string4, "getString(...)");
        arrayList.add(new C0859b.C0224b(string4, TonalityTextTransformation.Tonality.CASUAL.getValue(), C0561z.casual));
        String string5 = context.getString(C.make_it_romantic);
        o.d(string5, "getString(...)");
        arrayList.add(new C0859b.C0224b(string5, TonalityTextTransformation.Tonality.ROMANTIC.getValue(), C0561z.romantic));
        String string6 = context.getString(C.make_it_funny);
        o.d(string6, "getString(...)");
        arrayList.add(new C0859b.C0224b(string6, TonalityTextTransformation.Tonality.FUNNY.getValue(), C0561z.funny));
        i iVar = this.f15950c;
        if (iVar != null) {
            iVar.E(arrayList, new j(this));
        }
    }

    public i c(Context context) {
        i iVar;
        o.e(context, "context");
        if (this.f15950c == null) {
            this.f15950c = new i(context);
            g(context);
        }
        ThemeModel.AIAssistantTheme.AIAssistantDropDownTheme aIAssistantDropDownTheme = this.f15949b;
        if (!(aIAssistantDropDownTheme == null || (iVar = this.f15950c) == null)) {
            iVar.setTheme(aIAssistantDropDownTheme);
        }
        i iVar2 = this.f15950c;
        o.b(iVar2);
        return iVar2;
    }

    public l d() {
        return this.f15948a;
    }

    public void e(ThemeModel.AIAssistantTheme.AIAssistantDropDownTheme aIAssistantDropDownTheme) {
        o.e(aIAssistantDropDownTheme, "theme");
        this.f15949b = aIAssistantDropDownTheme;
        i iVar = this.f15950c;
        if (iVar != null) {
            iVar.setTheme(aIAssistantDropDownTheme);
        }
    }

    public void f(l lVar) {
        this.f15948a = lVar;
    }
}
