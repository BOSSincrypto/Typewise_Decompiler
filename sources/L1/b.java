package L1;

import android.content.res.Resources;
import android.view.View;
import z1.C0972c;

public class b extends a {

    /* renamed from: f  reason: collision with root package name */
    private final float f875f;

    /* renamed from: g  reason: collision with root package name */
    private final float f876g;

    public b(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f875f = resources.getDimension(C0972c.m3_back_progress_bottom_container_max_scale_x_distance);
        this.f876g = resources.getDimension(C0972c.m3_back_progress_bottom_container_max_scale_y_distance);
    }
}
