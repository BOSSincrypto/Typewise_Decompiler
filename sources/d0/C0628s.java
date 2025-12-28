package d0;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: d0.s  reason: case insensitive filesystem */
public class C0628s {

    /* renamed from: a  reason: collision with root package name */
    public final Map f13522a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public View f13523b;

    /* renamed from: c  reason: collision with root package name */
    final ArrayList f13524c = new ArrayList();

    public C0628s(View view) {
        this.f13523b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0628s)) {
            return false;
        }
        C0628s sVar = (C0628s) obj;
        if (this.f13523b != sVar.f13523b || !this.f13522a.equals(sVar.f13522a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f13523b.hashCode() * 31) + this.f13522a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f13523b + "\n") + "    values:";
        for (String str2 : this.f13522a.keySet()) {
            str = str + "    " + str2 + ": " + this.f13522a.get(str2) + "\n";
        }
        return str;
    }
}
