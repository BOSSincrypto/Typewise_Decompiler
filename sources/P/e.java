package P;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.f;

final class e implements KeyListener {

    /* renamed from: a  reason: collision with root package name */
    private final KeyListener f1094a;

    /* renamed from: b  reason: collision with root package name */
    private final a f1095b;

    public static class a {
        public boolean a(Editable editable, int i4, KeyEvent keyEvent) {
            return f.f(editable, i4, keyEvent);
        }
    }

    e(KeyListener keyListener) {
        this(keyListener, new a());
    }

    public void clearMetaKeyState(View view, Editable editable, int i4) {
        this.f1094a.clearMetaKeyState(view, editable, i4);
    }

    public int getInputType() {
        return this.f1094a.getInputType();
    }

    public boolean onKeyDown(View view, Editable editable, int i4, KeyEvent keyEvent) {
        if (this.f1095b.a(editable, i4, keyEvent) || this.f1094a.onKeyDown(view, editable, i4, keyEvent)) {
            return true;
        }
        return false;
    }

    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f1094a.onKeyOther(view, editable, keyEvent);
    }

    public boolean onKeyUp(View view, Editable editable, int i4, KeyEvent keyEvent) {
        return this.f1094a.onKeyUp(view, editable, i4, keyEvent);
    }

    e(KeyListener keyListener, a aVar) {
        this.f1094a = keyListener;
        this.f1095b = aVar;
    }
}
