package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import z1.g;

class TimePickerView extends ConstraintLayout {

    /* renamed from: A  reason: collision with root package name */
    private final ClockHandView f12501A;

    /* renamed from: B  reason: collision with root package name */
    private final ClockFaceView f12502B;

    /* renamed from: C  reason: collision with root package name */
    private final MaterialButtonToggleGroup f12503C;

    /* renamed from: D  reason: collision with root package name */
    private final View.OnClickListener f12504D;

    /* renamed from: y  reason: collision with root package name */
    private final Chip f12505y;

    /* renamed from: z  reason: collision with root package name */
    private final Chip f12506z;

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            e unused = TimePickerView.this.getClass();
        }
    }

    class b extends GestureDetector.SimpleOnGestureListener {
        b() {
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            d unused = TimePickerView.this.getClass();
            return false;
        }
    }

    class c implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GestureDetector f12509a;

        c(GestureDetector gestureDetector) {
            this.f12509a = gestureDetector;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f12509a.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    interface d {
    }

    interface e {
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void E(MaterialButtonToggleGroup materialButtonToggleGroup, int i4, boolean z3) {
    }

    private void F() {
        Chip chip = this.f12505y;
        int i4 = z1.e.selection_type;
        chip.setTag(i4, 12);
        this.f12506z.setTag(i4, 10);
        this.f12505y.setOnClickListener(this.f12504D);
        this.f12506z.setOnClickListener(this.f12504D);
        this.f12505y.setAccessibilityClassName("android.view.View");
        this.f12506z.setAccessibilityClassName("android.view.View");
    }

    private void G() {
        c cVar = new c(new GestureDetector(getContext(), new b()));
        this.f12505y.setOnTouchListener(cVar);
        this.f12506z.setOnTouchListener(cVar);
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i4) {
        super.onVisibilityChanged(view, i4);
        if (view == this && i4 == 0) {
            this.f12506z.sendAccessibilityEvent(8);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f12504D = new a();
        LayoutInflater.from(context).inflate(g.material_timepicker, this);
        this.f12502B = (ClockFaceView) findViewById(z1.e.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(z1.e.material_clock_period_toggle);
        this.f12503C = materialButtonToggleGroup;
        materialButtonToggleGroup.b(new g(this));
        this.f12505y = (Chip) findViewById(z1.e.material_minute_tv);
        this.f12506z = (Chip) findViewById(z1.e.material_hour_tv);
        this.f12501A = (ClockHandView) findViewById(z1.e.material_clock_hand);
        G();
        F();
    }
}
