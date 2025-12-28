package androidx.work;

import androidx.work.e;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.o;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00042\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u000f\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00042\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/work/ArrayCreatingInputMerger;", "Landroidx/work/i;", "<init>", "()V", "", "array1", "array2", "d", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "array", "obj", "Ljava/lang/Class;", "valueClass", "c", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;", "e", "(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;", "", "Landroidx/work/e;", "inputs", "b", "(Ljava/util/List;)Landroidx/work/e;", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ArrayCreatingInputMerger extends i {
    private final Object c(Object obj, Object obj2, Class cls) {
        int length = Array.getLength(obj);
        Object newInstance = Array.newInstance(cls, length + 1);
        System.arraycopy(obj, 0, newInstance, 0, length);
        Array.set(newInstance, length, obj2);
        o.d(newInstance, "newArray");
        return newInstance;
    }

    private final Object d(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        int length2 = Array.getLength(obj2);
        Class<?> componentType = obj.getClass().getComponentType();
        o.b(componentType);
        Object newInstance = Array.newInstance(componentType, length + length2);
        System.arraycopy(obj, 0, newInstance, 0, length);
        System.arraycopy(obj2, 0, newInstance, length, length2);
        o.d(newInstance, "newArray");
        return newInstance;
    }

    private final Object e(Object obj, Class cls) {
        Object newInstance = Array.newInstance(cls, 1);
        Array.set(newInstance, 0, obj);
        o.d(newInstance, "newArray");
        return newInstance;
    }

    public e b(List list) {
        Class cls;
        o.e(list, "inputs");
        e.a aVar = new e.a();
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map h4 = ((e) it.next()).h();
            o.d(h4, "input.keyValueMap");
            Iterator it2 = h4.entrySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value != null) {
                        cls = value.getClass();
                    } else {
                        cls = String.class;
                    }
                    Object obj = hashMap.get(str);
                    o.d(str, "key");
                    if (obj != null) {
                        Class<?> cls2 = obj.getClass();
                        if (o.a(cls2, cls)) {
                            o.d(value, "value");
                            value = d(obj, value);
                        } else if (o.a(cls2.getComponentType(), cls)) {
                            value = c(obj, value, cls);
                        } else {
                            throw new IllegalArgumentException();
                        }
                    } else if (!cls.isArray()) {
                        value = e(value, cls);
                    }
                    o.d(value, "if (existingValue == nul…      }\n                }");
                    hashMap.put(str, value);
                }
            }
        }
        aVar.d(hashMap);
        e a4 = aVar.a();
        o.d(a4, "output.build()");
        return a4;
    }
}
