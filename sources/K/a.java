package K;

import K.b;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: a  reason: collision with root package name */
    protected boolean f768a;

    /* renamed from: b  reason: collision with root package name */
    protected boolean f769b;

    /* renamed from: c  reason: collision with root package name */
    protected Cursor f770c;

    /* renamed from: d  reason: collision with root package name */
    protected Context f771d;

    /* renamed from: e  reason: collision with root package name */
    protected int f772e;

    /* renamed from: f  reason: collision with root package name */
    protected C0005a f773f;

    /* renamed from: g  reason: collision with root package name */
    protected DataSetObserver f774g;

    /* renamed from: h  reason: collision with root package name */
    protected b f775h;

    /* renamed from: K.a$a  reason: collision with other inner class name */
    private class C0005a extends ContentObserver {
        C0005a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z3) {
            a.this.i();
        }
    }

    private class b extends DataSetObserver {
        b() {
        }

        public void onChanged() {
            a aVar = a.this;
            aVar.f768a = true;
            aVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            a aVar = a.this;
            aVar.f768a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z3) {
        int i4;
        if (z3) {
            i4 = 1;
        } else {
            i4 = 2;
        }
        f(context, cursor, i4);
    }

    public void a(Cursor cursor) {
        Cursor j4 = j(cursor);
        if (j4 != null) {
            j4.close();
        }
    }

    public Cursor b() {
        return this.f770c;
    }

    public abstract CharSequence c(Cursor cursor);

    public abstract void e(View view, Context context, Cursor cursor);

    /* access modifiers changed from: package-private */
    public void f(Context context, Cursor cursor, int i4) {
        int i5;
        boolean z3 = false;
        if ((i4 & 1) == 1) {
            i4 |= 2;
            this.f769b = true;
        } else {
            this.f769b = false;
        }
        if (cursor != null) {
            z3 = true;
        }
        this.f770c = cursor;
        this.f768a = z3;
        this.f771d = context;
        if (z3) {
            i5 = cursor.getColumnIndexOrThrow("_id");
        } else {
            i5 = -1;
        }
        this.f772e = i5;
        if ((i4 & 2) == 2) {
            this.f773f = new C0005a();
            this.f774g = new b();
        } else {
            this.f773f = null;
            this.f774g = null;
        }
        if (z3) {
            C0005a aVar = this.f773f;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f774g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    public int getCount() {
        Cursor cursor;
        if (!this.f768a || (cursor = this.f770c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i4, View view, ViewGroup viewGroup) {
        if (!this.f768a) {
            return null;
        }
        this.f770c.moveToPosition(i4);
        if (view == null) {
            view = g(this.f771d, this.f770c, viewGroup);
        }
        e(view, this.f771d, this.f770c);
        return view;
    }

    public Filter getFilter() {
        if (this.f775h == null) {
            this.f775h = new b(this);
        }
        return this.f775h;
    }

    public Object getItem(int i4) {
        Cursor cursor;
        if (!this.f768a || (cursor = this.f770c) == null) {
            return null;
        }
        cursor.moveToPosition(i4);
        return this.f770c;
    }

    public long getItemId(int i4) {
        Cursor cursor;
        if (!this.f768a || (cursor = this.f770c) == null || !cursor.moveToPosition(i4)) {
            return 0;
        }
        return this.f770c.getLong(this.f772e);
    }

    public View getView(int i4, View view, ViewGroup viewGroup) {
        if (!this.f768a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f770c.moveToPosition(i4)) {
            if (view == null) {
                view = h(this.f771d, this.f770c, viewGroup);
            }
            e(view, this.f771d, this.f770c);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i4);
        }
    }

    public abstract View h(Context context, Cursor cursor, ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    public void i() {
        Cursor cursor;
        if (this.f769b && (cursor = this.f770c) != null && !cursor.isClosed()) {
            this.f768a = this.f770c.requery();
        }
    }

    public Cursor j(Cursor cursor) {
        Cursor cursor2 = this.f770c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0005a aVar = this.f773f;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f774g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f770c = cursor;
        if (cursor != null) {
            C0005a aVar2 = this.f773f;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f774g;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f772e = cursor.getColumnIndexOrThrow("_id");
            this.f768a = true;
            notifyDataSetChanged();
        } else {
            this.f772e = -1;
            this.f768a = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
