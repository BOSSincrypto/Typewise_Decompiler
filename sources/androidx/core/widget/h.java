package androidx.core.widget;

import android.widget.ListView;

public abstract class h {

    static class a {
        static boolean a(ListView listView, int i4) {
            return listView.canScrollList(i4);
        }

        static void b(ListView listView, int i4) {
            listView.scrollListBy(i4);
        }
    }

    public static void a(ListView listView, int i4) {
        a.b(listView, i4);
    }
}
