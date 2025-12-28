package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.appcompat.widget.C0392p;
import androidx.core.view.C0402a;
import androidx.core.view.P;
import androidx.core.view.accessibility.A;
import n.C0822a;

public class CheckableImageButton extends C0392p implements Checkable {

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f12035g = {16842912};

    /* renamed from: d  reason: collision with root package name */
    private boolean f12036d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f12037e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f12038f;

    class a extends C0402a {
        a() {
        }

        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        public void g(View view, A a4) {
            super.g(view, a4);
            a4.h0(CheckableImageButton.this.a());
            a4.i0(CheckableImageButton.this.isChecked());
        }
    }

    static class b extends M.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        boolean f12040c;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            /* renamed from: c */
            public b[] newArray(int i4) {
                return new b[i4];
            }
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        private void u(Parcel parcel) {
            boolean z3 = true;
            if (parcel.readInt() != 1) {
                z3 = false;
            }
            this.f12040c = z3;
        }

        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f12040c ? 1 : 0);
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            u(parcel);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0822a.f14693z);
    }

    public boolean a() {
        return this.f12037e;
    }

    public boolean isChecked() {
        return this.f12036d;
    }

    public int[] onCreateDrawableState(int i4) {
        if (!this.f12036d) {
            return super.onCreateDrawableState(i4);
        }
        int[] iArr = f12035g;
        return View.mergeDrawableStates(super.onCreateDrawableState(i4 + iArr.length), iArr);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.t());
        setChecked(bVar.f12040c);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f12040c = this.f12036d;
        return bVar;
    }

    public void setCheckable(boolean z3) {
        if (this.f12037e != z3) {
            this.f12037e = z3;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z3) {
        if (this.f12037e && this.f12036d != z3) {
            this.f12036d = z3;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z3) {
        this.f12038f = z3;
    }

    public void setPressed(boolean z3) {
        if (this.f12038f) {
            super.setPressed(z3);
        }
    }

    public void toggle() {
        setChecked(!this.f12036d);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f12037e = true;
        this.f12038f = true;
        P.o0(this, new a());
    }
}
