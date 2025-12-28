package E1;

import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;

public final /* synthetic */ class b implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Chip f400a;

    public /* synthetic */ b(Chip chip) {
        this.f400a = chip;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
        this.f400a.t(compoundButton, z3);
    }
}
