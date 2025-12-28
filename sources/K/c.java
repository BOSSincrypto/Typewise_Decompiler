package K;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class c extends a {

    /* renamed from: i  reason: collision with root package name */
    private int f779i;

    /* renamed from: j  reason: collision with root package name */
    private int f780j;

    /* renamed from: k  reason: collision with root package name */
    private LayoutInflater f781k;

    public c(Context context, int i4, Cursor cursor, boolean z3) {
        super(context, cursor, z3);
        this.f780j = i4;
        this.f779i = i4;
        this.f781k = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f781k.inflate(this.f780j, viewGroup, false);
    }

    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f781k.inflate(this.f779i, viewGroup, false);
    }
}
