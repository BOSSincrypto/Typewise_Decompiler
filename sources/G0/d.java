package g0;

import f0.b;
import f0.c;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;

public abstract class d implements WebMessageBoundaryInterface {
    private static c[] a(InvocationHandler[] invocationHandlerArr) {
        c[] cVarArr = new c[invocationHandlerArr.length];
        for (int i4 = 0; i4 < invocationHandlerArr.length; i4++) {
            cVarArr[i4] = new f(invocationHandlerArr[i4]);
        }
        return cVarArr;
    }

    public static b b(WebMessageBoundaryInterface webMessageBoundaryInterface) {
        return new b(webMessageBoundaryInterface.getData(), a(webMessageBoundaryInterface.getPorts()));
    }
}
