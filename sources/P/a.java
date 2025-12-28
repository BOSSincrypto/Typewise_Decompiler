package P;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.core.util.g;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final b f1080a;

    /* renamed from: b  reason: collision with root package name */
    private int f1081b = Integer.MAX_VALUE;

    /* renamed from: c  reason: collision with root package name */
    private int f1082c = 0;

    /* renamed from: P.a$a  reason: collision with other inner class name */
    private static class C0019a extends b {

        /* renamed from: a  reason: collision with root package name */
        private final EditText f1083a;

        /* renamed from: b  reason: collision with root package name */
        private final g f1084b;

        C0019a(EditText editText, boolean z3) {
            this.f1083a = editText;
            g gVar = new g(editText, z3);
            this.f1084b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(b.getInstance());
        }

        /* access modifiers changed from: package-private */
        public KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            if (keyListener instanceof NumberKeyListener) {
                return keyListener;
            }
            return new e(keyListener);
        }

        /* access modifiers changed from: package-private */
        public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            if (inputConnection instanceof c) {
                return inputConnection;
            }
            return new c(this.f1083a, inputConnection, editorInfo);
        }

        /* access modifiers changed from: package-private */
        public void c(boolean z3) {
            this.f1084b.c(z3);
        }
    }

    static class b {
        b() {
        }

        /* access modifiers changed from: package-private */
        public abstract KeyListener a(KeyListener keyListener);

        /* access modifiers changed from: package-private */
        public abstract InputConnection b(InputConnection inputConnection, EditorInfo editorInfo);

        /* access modifiers changed from: package-private */
        public abstract void c(boolean z3);
    }

    public a(EditText editText, boolean z3) {
        g.h(editText, "editText cannot be null");
        this.f1080a = new C0019a(editText, z3);
    }

    public KeyListener a(KeyListener keyListener) {
        return this.f1080a.a(keyListener);
    }

    public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f1080a.b(inputConnection, editorInfo);
    }

    public void c(boolean z3) {
        this.f1080a.c(z3);
    }
}
