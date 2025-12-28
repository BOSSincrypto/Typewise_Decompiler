package ch.icoaching.wrio.keyboard.view;

import ch.icoaching.wrio.keyboard.model.config.JsonConfig;
import java.util.Iterator;
import java.util.List;

public abstract class L {
    /* access modifiers changed from: private */
    public static final int b(List list) {
        Iterator it = list.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 = Math.max(i4, ((JsonConfig.Keyboard.Layout.Column) it.next()).getRows().size());
        }
        return i4;
    }
}
