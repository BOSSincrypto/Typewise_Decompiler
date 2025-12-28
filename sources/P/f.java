package P;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.core.util.g;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final b f1096a;

    private static class a extends b {

        /* renamed from: a  reason: collision with root package name */
        private final TextView f1097a;

        /* renamed from: b  reason: collision with root package name */
        private final d f1098b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f1099c = true;

        a(TextView textView) {
            this.f1097a = textView;
            this.f1098b = new d(textView);
        }

        private InputFilter[] d(InputFilter[] inputFilterArr) {
            for (d dVar : inputFilterArr) {
                if (dVar == this.f1098b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length + 1)];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, r0);
            inputFilterArr2[r0] = this.f1098b;
            return inputFilterArr2;
        }

        private SparseArray e(InputFilter[] inputFilterArr) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i4 = 0; i4 < inputFilterArr.length; i4++) {
                InputFilter inputFilter = inputFilterArr[i4];
                if (inputFilter instanceof d) {
                    sparseArray.put(i4, inputFilter);
                }
            }
            return sparseArray;
        }

        private InputFilter[] f(InputFilter[] inputFilterArr) {
            SparseArray e4 = e(inputFilterArr);
            if (e4.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length - e4.size())];
            int i4 = 0;
            for (int i5 = 0; i5 < length; i5++) {
                if (e4.indexOfKey(i5) < 0) {
                    inputFilterArr2[i4] = inputFilterArr[i5];
                    i4++;
                }
            }
            return inputFilterArr2;
        }

        private TransformationMethod h(TransformationMethod transformationMethod) {
            if (transformationMethod instanceof h) {
                return ((h) transformationMethod).a();
            }
            return transformationMethod;
        }

        private void i() {
            this.f1097a.setFilters(a(this.f1097a.getFilters()));
        }

        private TransformationMethod k(TransformationMethod transformationMethod) {
            if (!(transformationMethod instanceof h) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                return new h(transformationMethod);
            }
            return transformationMethod;
        }

        /* access modifiers changed from: package-private */
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            if (!this.f1099c) {
                return f(inputFilterArr);
            }
            return d(inputFilterArr);
        }

        /* access modifiers changed from: package-private */
        public void b(boolean z3) {
            if (z3) {
                j();
            }
        }

        /* access modifiers changed from: package-private */
        public void c(boolean z3) {
            this.f1099c = z3;
            j();
            i();
        }

        /* access modifiers changed from: package-private */
        public void g(boolean z3) {
            this.f1099c = z3;
        }

        /* access modifiers changed from: package-private */
        public void j() {
            this.f1097a.setTransformationMethod(l(this.f1097a.getTransformationMethod()));
        }

        /* access modifiers changed from: package-private */
        public TransformationMethod l(TransformationMethod transformationMethod) {
            if (this.f1099c) {
                return k(transformationMethod);
            }
            return h(transformationMethod);
        }
    }

    static class b {
        b() {
        }

        /* access modifiers changed from: package-private */
        public abstract InputFilter[] a(InputFilter[] inputFilterArr);

        /* access modifiers changed from: package-private */
        public abstract void b(boolean z3);

        /* access modifiers changed from: package-private */
        public abstract void c(boolean z3);
    }

    private static class c extends b {

        /* renamed from: a  reason: collision with root package name */
        private final a f1100a;

        c(TextView textView) {
            this.f1100a = new a(textView);
        }

        private boolean d() {
            return !androidx.emoji2.text.f.h();
        }

        /* access modifiers changed from: package-private */
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            if (d()) {
                return inputFilterArr;
            }
            return this.f1100a.a(inputFilterArr);
        }

        /* access modifiers changed from: package-private */
        public void b(boolean z3) {
            if (!d()) {
                this.f1100a.b(z3);
            }
        }

        /* access modifiers changed from: package-private */
        public void c(boolean z3) {
            if (d()) {
                this.f1100a.g(z3);
            } else {
                this.f1100a.c(z3);
            }
        }
    }

    public f(TextView textView, boolean z3) {
        g.h(textView, "textView cannot be null");
        if (!z3) {
            this.f1096a = new c(textView);
        } else {
            this.f1096a = new a(textView);
        }
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f1096a.a(inputFilterArr);
    }

    public void b(boolean z3) {
        this.f1096a.b(z3);
    }

    public void c(boolean z3) {
        this.f1096a.c(z3);
    }
}
