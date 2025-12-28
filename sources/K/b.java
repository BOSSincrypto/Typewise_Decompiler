package K;

import android.database.Cursor;
import android.widget.Filter;

class b extends Filter {

    /* renamed from: a  reason: collision with root package name */
    a f778a;

    interface a {
        void a(Cursor cursor);

        Cursor b();

        CharSequence c(Cursor cursor);

        Cursor d(CharSequence charSequence);
    }

    b(a aVar) {
        this.f778a = aVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.f778a.c((Cursor) obj);
    }

    /* access modifiers changed from: protected */
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor d4 = this.f778a.d(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (d4 != null) {
            filterResults.count = d4.getCount();
            filterResults.values = d4;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor b4 = this.f778a.b();
        Object obj = filterResults.values;
        if (obj != null && obj != b4) {
            this.f778a.a((Cursor) obj);
        }
    }
}
