package retrofit2;

import java.lang.annotation.Annotation;

final class N implements M {

    /* renamed from: a  reason: collision with root package name */
    private static final M f16187a = new N();

    N() {
    }

    static Annotation[] a(Annotation[] annotationArr) {
        if (O.l(annotationArr, M.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[(annotationArr.length + 1)];
        annotationArr2[0] = f16187a;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    public Class annotationType() {
        return M.class;
    }

    public boolean equals(Object obj) {
        return obj instanceof M;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "@" + M.class.getName() + "()";
    }
}
