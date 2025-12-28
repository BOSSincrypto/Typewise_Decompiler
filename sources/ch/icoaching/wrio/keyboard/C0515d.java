package ch.icoaching.wrio.keyboard;

import android.graphics.Paint;
import ch.icoaching.wrio.keyboard.model.config.Emoji;
import u2.l;

/* renamed from: ch.icoaching.wrio.keyboard.d  reason: case insensitive filesystem */
public final /* synthetic */ class C0515d implements l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Paint f9983a;

    public /* synthetic */ C0515d(Paint paint) {
        this.f9983a = paint;
    }

    public final Object invoke(Object obj) {
        return Boolean.valueOf(DefaultKeyboardController.C0(this.f9983a, (Emoji) obj));
    }
}
