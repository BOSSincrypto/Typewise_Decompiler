package d0;

import android.view.ViewGroup;
import androidx.appcompat.app.F;

/* renamed from: d0.k  reason: case insensitive filesystem */
public abstract class C0620k {
    public static C0620k a(ViewGroup viewGroup) {
        F.a(viewGroup.getTag(C0618i.transition_current_scene));
        return null;
    }

    static void b(ViewGroup viewGroup, C0620k kVar) {
        viewGroup.setTag(C0618i.transition_current_scene, kVar);
    }
}
