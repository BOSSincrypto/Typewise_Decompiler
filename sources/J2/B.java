package J2;

import F2.b;
import java.lang.annotation.Annotation;
import kotlin.collections.C0713h;
import kotlin.jvm.internal.o;

public abstract class B {
    public static final b a(String str, Enum[] enumArr, String[] strArr, Annotation[][] annotationArr, Annotation[] annotationArr2) {
        o.e(str, "serialName");
        o.e(enumArr, "values");
        o.e(strArr, "names");
        o.e(annotationArr, "entryAnnotations");
        C0337y yVar = new C0337y(str, enumArr.length);
        if (annotationArr2 != null) {
            for (Annotation x3 : annotationArr2) {
                yVar.x(x3);
            }
        }
        int length = enumArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            Enum enumR = enumArr[i4];
            int i6 = i5 + 1;
            String str2 = (String) C0713h.E(strArr, i5);
            if (str2 == null) {
                str2 = enumR.name();
            }
            C0326s0.q(yVar, str2, false, 2, (Object) null);
            Annotation[] annotationArr3 = (Annotation[]) C0713h.E(annotationArr, i5);
            if (annotationArr3 != null) {
                for (Annotation w3 : annotationArr3) {
                    yVar.w(w3);
                }
            }
            i4++;
            i5 = i6;
        }
        return new A(str, enumArr, yVar);
    }

    public static final b b(String str, Enum[] enumArr) {
        o.e(str, "serialName");
        o.e(enumArr, "values");
        return new A(str, enumArr);
    }
}
