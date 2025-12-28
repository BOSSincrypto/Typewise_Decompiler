package D0;

import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

public abstract class G {
    public static final E a(FloatBuffer floatBuffer, List list) {
        o.e(floatBuffer, "<this>");
        o.e(list, "shape");
        ArrayList arrayList = new ArrayList();
        floatBuffer.rewind();
        while (floatBuffer.hasRemaining()) {
            arrayList.add(Float.valueOf(floatBuffer.get()));
        }
        return E.f232d.b(list, arrayList);
    }

    public static final FloatBuffer b(E e4) {
        o.e(e4, "<this>");
        List<Number> d4 = e4.d();
        FloatBuffer allocate = FloatBuffer.allocate(d4.size());
        for (Number floatValue : d4) {
            allocate.put(floatValue.floatValue());
        }
        allocate.rewind();
        o.b(allocate);
        return allocate;
    }
}
