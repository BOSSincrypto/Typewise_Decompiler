package A2;

import java.util.List;
import java.util.Map;
import kotlin.reflect.KVisibility;

public interface b extends a {
    Object call(Object... objArr);

    Object callBy(Map map);

    List getParameters();

    h getReturnType();

    List getTypeParameters();

    KVisibility getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
