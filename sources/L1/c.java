package L1;

import android.content.res.Resources;
import android.view.View;
import z1.C0972c;

public class c extends a {

    /* renamed from: f  reason: collision with root package name */
    private final float f877f;

    /* renamed from: g  reason: collision with root package name */
    private final float f878g;

    /* renamed from: h  reason: collision with root package name */
    private final float f879h;

    public c(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f877f = resources.getDimension(C0972c.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.f878g = resources.getDimension(C0972c.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.f879h = resources.getDimension(C0972c.m3_back_progress_side_container_max_scale_y_distance);
    }
}
