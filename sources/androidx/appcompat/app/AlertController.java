package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.O;
import androidx.core.view.P;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import n.C0822a;
import n.f;
import n.j;

class AlertController {

    /* renamed from: A  reason: collision with root package name */
    NestedScrollView f2424A;

    /* renamed from: B  reason: collision with root package name */
    private int f2425B = 0;

    /* renamed from: C  reason: collision with root package name */
    private Drawable f2426C;

    /* renamed from: D  reason: collision with root package name */
    private ImageView f2427D;

    /* renamed from: E  reason: collision with root package name */
    private TextView f2428E;

    /* renamed from: F  reason: collision with root package name */
    private TextView f2429F;

    /* renamed from: G  reason: collision with root package name */
    private View f2430G;

    /* renamed from: H  reason: collision with root package name */
    ListAdapter f2431H;

    /* renamed from: I  reason: collision with root package name */
    int f2432I = -1;

    /* renamed from: J  reason: collision with root package name */
    private int f2433J;

    /* renamed from: K  reason: collision with root package name */
    private int f2434K;

    /* renamed from: L  reason: collision with root package name */
    int f2435L;

    /* renamed from: M  reason: collision with root package name */
    int f2436M;

    /* renamed from: N  reason: collision with root package name */
    int f2437N;

    /* renamed from: O  reason: collision with root package name */
    int f2438O;

    /* renamed from: P  reason: collision with root package name */
    private boolean f2439P;

    /* renamed from: Q  reason: collision with root package name */
    private int f2440Q = 0;

    /* renamed from: R  reason: collision with root package name */
    Handler f2441R;

    /* renamed from: S  reason: collision with root package name */
    private final View.OnClickListener f2442S = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Context f2443a;

    /* renamed from: b  reason: collision with root package name */
    final x f2444b;

    /* renamed from: c  reason: collision with root package name */
    private final Window f2445c;

    /* renamed from: d  reason: collision with root package name */
    private final int f2446d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f2447e;

    /* renamed from: f  reason: collision with root package name */
    private CharSequence f2448f;

    /* renamed from: g  reason: collision with root package name */
    ListView f2449g;

    /* renamed from: h  reason: collision with root package name */
    private View f2450h;

    /* renamed from: i  reason: collision with root package name */
    private int f2451i;

    /* renamed from: j  reason: collision with root package name */
    private int f2452j;

    /* renamed from: k  reason: collision with root package name */
    private int f2453k;

    /* renamed from: l  reason: collision with root package name */
    private int f2454l;

    /* renamed from: m  reason: collision with root package name */
    private int f2455m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f2456n = false;

    /* renamed from: o  reason: collision with root package name */
    Button f2457o;

    /* renamed from: p  reason: collision with root package name */
    private CharSequence f2458p;

    /* renamed from: q  reason: collision with root package name */
    Message f2459q;

    /* renamed from: r  reason: collision with root package name */
    private Drawable f2460r;

    /* renamed from: s  reason: collision with root package name */
    Button f2461s;

    /* renamed from: t  reason: collision with root package name */
    private CharSequence f2462t;

    /* renamed from: u  reason: collision with root package name */
    Message f2463u;

    /* renamed from: v  reason: collision with root package name */
    private Drawable f2464v;

    /* renamed from: w  reason: collision with root package name */
    Button f2465w;

    /* renamed from: x  reason: collision with root package name */
    private CharSequence f2466x;

    /* renamed from: y  reason: collision with root package name */
    Message f2467y;

    /* renamed from: z  reason: collision with root package name */
    private Drawable f2468z;

    public static class RecycleListView extends ListView {

        /* renamed from: a  reason: collision with root package name */
        private final int f2469a;

        /* renamed from: b  reason: collision with root package name */
        private final int f2470b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f14956c2);
            this.f2470b = obtainStyledAttributes.getDimensionPixelOffset(j.f14961d2, -1);
            this.f2469a = obtainStyledAttributes.getDimensionPixelOffset(j.f14966e2, -1);
        }

        public void a(boolean z3, boolean z4) {
            int i4;
            int i5;
            if (!z4 || !z3) {
                int paddingLeft = getPaddingLeft();
                if (z3) {
                    i4 = getPaddingTop();
                } else {
                    i4 = this.f2469a;
                }
                int paddingRight = getPaddingRight();
                if (z4) {
                    i5 = getPaddingBottom();
                } else {
                    i5 = this.f2470b;
                }
                setPadding(paddingLeft, i4, paddingRight, i5);
            }
        }
    }

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            Message message4;
            AlertController alertController = AlertController.this;
            if (view == alertController.f2457o && (message4 = alertController.f2459q) != null) {
                message = Message.obtain(message4);
            } else if (view == alertController.f2461s && (message3 = alertController.f2463u) != null) {
                message = Message.obtain(message3);
            } else if (view != alertController.f2465w || (message2 = alertController.f2467y) == null) {
                message = null;
            } else {
                message = Message.obtain(message2);
            }
            if (message != null) {
                message.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f2441R.obtainMessage(1, alertController2.f2444b).sendToTarget();
        }
    }

    public static class b {

        /* renamed from: A  reason: collision with root package name */
        public int f2472A;

        /* renamed from: B  reason: collision with root package name */
        public int f2473B;

        /* renamed from: C  reason: collision with root package name */
        public int f2474C;

        /* renamed from: D  reason: collision with root package name */
        public int f2475D;

        /* renamed from: E  reason: collision with root package name */
        public boolean f2476E = false;

        /* renamed from: F  reason: collision with root package name */
        public boolean[] f2477F;

        /* renamed from: G  reason: collision with root package name */
        public boolean f2478G;

        /* renamed from: H  reason: collision with root package name */
        public boolean f2479H;

        /* renamed from: I  reason: collision with root package name */
        public int f2480I = -1;

        /* renamed from: J  reason: collision with root package name */
        public DialogInterface.OnMultiChoiceClickListener f2481J;

        /* renamed from: K  reason: collision with root package name */
        public Cursor f2482K;

        /* renamed from: L  reason: collision with root package name */
        public String f2483L;

        /* renamed from: M  reason: collision with root package name */
        public String f2484M;

        /* renamed from: N  reason: collision with root package name */
        public AdapterView.OnItemSelectedListener f2485N;

        /* renamed from: O  reason: collision with root package name */
        public boolean f2486O = true;

        /* renamed from: a  reason: collision with root package name */
        public final Context f2487a;

        /* renamed from: b  reason: collision with root package name */
        public final LayoutInflater f2488b;

        /* renamed from: c  reason: collision with root package name */
        public int f2489c = 0;

        /* renamed from: d  reason: collision with root package name */
        public Drawable f2490d;

        /* renamed from: e  reason: collision with root package name */
        public int f2491e = 0;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f2492f;

        /* renamed from: g  reason: collision with root package name */
        public View f2493g;

        /* renamed from: h  reason: collision with root package name */
        public CharSequence f2494h;

        /* renamed from: i  reason: collision with root package name */
        public CharSequence f2495i;

        /* renamed from: j  reason: collision with root package name */
        public Drawable f2496j;

        /* renamed from: k  reason: collision with root package name */
        public DialogInterface.OnClickListener f2497k;

        /* renamed from: l  reason: collision with root package name */
        public CharSequence f2498l;

        /* renamed from: m  reason: collision with root package name */
        public Drawable f2499m;

        /* renamed from: n  reason: collision with root package name */
        public DialogInterface.OnClickListener f2500n;

        /* renamed from: o  reason: collision with root package name */
        public CharSequence f2501o;

        /* renamed from: p  reason: collision with root package name */
        public Drawable f2502p;

        /* renamed from: q  reason: collision with root package name */
        public DialogInterface.OnClickListener f2503q;

        /* renamed from: r  reason: collision with root package name */
        public boolean f2504r;

        /* renamed from: s  reason: collision with root package name */
        public DialogInterface.OnCancelListener f2505s;

        /* renamed from: t  reason: collision with root package name */
        public DialogInterface.OnDismissListener f2506t;

        /* renamed from: u  reason: collision with root package name */
        public DialogInterface.OnKeyListener f2507u;

        /* renamed from: v  reason: collision with root package name */
        public CharSequence[] f2508v;

        /* renamed from: w  reason: collision with root package name */
        public ListAdapter f2509w;

        /* renamed from: x  reason: collision with root package name */
        public DialogInterface.OnClickListener f2510x;

        /* renamed from: y  reason: collision with root package name */
        public int f2511y;

        /* renamed from: z  reason: collision with root package name */
        public View f2512z;

        class a extends ArrayAdapter {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ RecycleListView f2513a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(Context context, int i4, int i5, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i4, i5, charSequenceArr);
                this.f2513a = recycleListView;
            }

            public View getView(int i4, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i4, view, viewGroup);
                boolean[] zArr = b.this.f2477F;
                if (zArr != null && zArr[i4]) {
                    this.f2513a.setItemChecked(i4, true);
                }
                return view2;
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$b$b  reason: collision with other inner class name */
        class C0050b extends CursorAdapter {

            /* renamed from: a  reason: collision with root package name */
            private final int f2515a;

            /* renamed from: b  reason: collision with root package name */
            private final int f2516b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ RecycleListView f2517c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ AlertController f2518d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0050b(Context context, Cursor cursor, boolean z3, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z3);
                this.f2517c = recycleListView;
                this.f2518d = alertController;
                Cursor cursor2 = getCursor();
                this.f2515a = cursor2.getColumnIndexOrThrow(b.this.f2483L);
                this.f2516b = cursor2.getColumnIndexOrThrow(b.this.f2484M);
            }

            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f2515a));
                RecycleListView recycleListView = this.f2517c;
                int position = cursor.getPosition();
                boolean z3 = true;
                if (cursor.getInt(this.f2516b) != 1) {
                    z3 = false;
                }
                recycleListView.setItemChecked(position, z3);
            }

            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return b.this.f2488b.inflate(this.f2518d.f2436M, viewGroup, false);
            }
        }

        class c implements AdapterView.OnItemClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ AlertController f2520a;

            c(AlertController alertController) {
                this.f2520a = alertController;
            }

            public void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
                b.this.f2510x.onClick(this.f2520a.f2444b, i4);
                if (!b.this.f2479H) {
                    this.f2520a.f2444b.dismiss();
                }
            }
        }

        class d implements AdapterView.OnItemClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ RecycleListView f2522a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AlertController f2523b;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f2522a = recycleListView;
                this.f2523b = alertController;
            }

            public void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
                boolean[] zArr = b.this.f2477F;
                if (zArr != null) {
                    zArr[i4] = this.f2522a.isItemChecked(i4);
                }
                b.this.f2481J.onClick(this.f2523b.f2444b, i4, this.f2522a.isItemChecked(i4));
            }
        }

        public b(Context context) {
            this.f2487a = context;
            this.f2504r = true;
            this.f2488b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARNING: type inference failed for: r8v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r8v3 */
        /* JADX WARNING: type inference failed for: r8v4 */
        /* JADX WARNING: type inference failed for: r2v5, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r1v22, types: [androidx.appcompat.app.AlertController$b$b] */
        /* JADX WARNING: type inference failed for: r1v23, types: [androidx.appcompat.app.AlertController$b$a] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void b(androidx.appcompat.app.AlertController r10) {
            /*
                r9 = this;
                android.view.LayoutInflater r0 = r9.f2488b
                int r1 = r10.f2435L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r9.f2478G
                if (r1 == 0) goto L_0x0034
                android.database.Cursor r1 = r9.f2482K
                if (r1 != 0) goto L_0x0025
                androidx.appcompat.app.AlertController$b$a r8 = new androidx.appcompat.app.AlertController$b$a
                android.content.Context r3 = r9.f2487a
                int r4 = r10.f2436M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r9.f2508v
                r1 = r8
                r2 = r9
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x0069
            L_0x0025:
                androidx.appcompat.app.AlertController$b$b r8 = new androidx.appcompat.app.AlertController$b$b
                android.content.Context r3 = r9.f2487a
                android.database.Cursor r4 = r9.f2482K
                r5 = 0
                r1 = r8
                r2 = r9
                r6 = r0
                r7 = r10
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x0069
            L_0x0034:
                boolean r1 = r9.f2479H
                if (r1 == 0) goto L_0x003c
                int r1 = r10.f2437N
            L_0x003a:
                r4 = r1
                goto L_0x003f
            L_0x003c:
                int r1 = r10.f2438O
                goto L_0x003a
            L_0x003f:
                android.database.Cursor r1 = r9.f2482K
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L_0x005b
                android.widget.SimpleCursorAdapter r8 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r9.f2487a
                android.database.Cursor r5 = r9.f2482K
                java.lang.String r1 = r9.f2483L
                java.lang.String[] r6 = new java.lang.String[]{r1}
                int[] r7 = new int[]{r2}
                r2 = r8
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x0069
            L_0x005b:
                android.widget.ListAdapter r8 = r9.f2509w
                if (r8 == 0) goto L_0x0060
                goto L_0x0069
            L_0x0060:
                androidx.appcompat.app.AlertController$d r8 = new androidx.appcompat.app.AlertController$d
                android.content.Context r1 = r9.f2487a
                java.lang.CharSequence[] r3 = r9.f2508v
                r8.<init>(r1, r4, r2, r3)
            L_0x0069:
                r10.f2431H = r8
                int r1 = r9.f2480I
                r10.f2432I = r1
                android.content.DialogInterface$OnClickListener r1 = r9.f2510x
                if (r1 == 0) goto L_0x007c
                androidx.appcompat.app.AlertController$b$c r1 = new androidx.appcompat.app.AlertController$b$c
                r1.<init>(r10)
                r0.setOnItemClickListener(r1)
                goto L_0x0088
            L_0x007c:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r9.f2481J
                if (r1 == 0) goto L_0x0088
                androidx.appcompat.app.AlertController$b$d r1 = new androidx.appcompat.app.AlertController$b$d
                r1.<init>(r0, r10)
                r0.setOnItemClickListener(r1)
            L_0x0088:
                android.widget.AdapterView$OnItemSelectedListener r1 = r9.f2485N
                if (r1 == 0) goto L_0x008f
                r0.setOnItemSelectedListener(r1)
            L_0x008f:
                boolean r1 = r9.f2479H
                if (r1 == 0) goto L_0x0098
                r1 = 1
                r0.setChoiceMode(r1)
                goto L_0x00a0
            L_0x0098:
                boolean r1 = r9.f2478G
                if (r1 == 0) goto L_0x00a0
                r1 = 2
                r0.setChoiceMode(r1)
            L_0x00a0:
                r10.f2449g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.b.b(androidx.appcompat.app.AlertController):void");
        }

        public void a(AlertController alertController) {
            View view = this.f2493g;
            if (view != null) {
                alertController.k(view);
            } else {
                CharSequence charSequence = this.f2492f;
                if (charSequence != null) {
                    alertController.p(charSequence);
                }
                Drawable drawable = this.f2490d;
                if (drawable != null) {
                    alertController.m(drawable);
                }
                int i4 = this.f2489c;
                if (i4 != 0) {
                    alertController.l(i4);
                }
                int i5 = this.f2491e;
                if (i5 != 0) {
                    alertController.l(alertController.c(i5));
                }
            }
            CharSequence charSequence2 = this.f2494h;
            if (charSequence2 != null) {
                alertController.n(charSequence2);
            }
            CharSequence charSequence3 = this.f2495i;
            if (!(charSequence3 == null && this.f2496j == null)) {
                alertController.j(-1, charSequence3, this.f2497k, (Message) null, this.f2496j);
            }
            CharSequence charSequence4 = this.f2498l;
            if (!(charSequence4 == null && this.f2499m == null)) {
                alertController.j(-2, charSequence4, this.f2500n, (Message) null, this.f2499m);
            }
            CharSequence charSequence5 = this.f2501o;
            if (!(charSequence5 == null && this.f2502p == null)) {
                alertController.j(-3, charSequence5, this.f2503q, (Message) null, this.f2502p);
            }
            if (!(this.f2508v == null && this.f2482K == null && this.f2509w == null)) {
                b(alertController);
            }
            View view2 = this.f2512z;
            if (view2 == null) {
                int i6 = this.f2511y;
                if (i6 != 0) {
                    alertController.q(i6);
                }
            } else if (this.f2476E) {
                alertController.s(view2, this.f2472A, this.f2473B, this.f2474C, this.f2475D);
            } else {
                alertController.r(view2);
            }
        }
    }

    private static final class c extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference f2525a;

        public c(DialogInterface dialogInterface) {
            this.f2525a = new WeakReference(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i4 = message.what;
            if (i4 == -3 || i4 == -2 || i4 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f2525a.get(), message.what);
            } else if (i4 == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    private static class d extends ArrayAdapter {
        public d(Context context, int i4, int i5, CharSequence[] charSequenceArr) {
            super(context, i4, i5, charSequenceArr);
        }

        public long getItemId(int i4) {
            return (long) i4;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, x xVar, Window window) {
        this.f2443a = context;
        this.f2444b = xVar;
        this.f2445c = window;
        this.f2441R = new c(xVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, j.f14859F, C0822a.f14678k, 0);
        this.f2433J = obtainStyledAttributes.getResourceId(j.f14863G, 0);
        this.f2434K = obtainStyledAttributes.getResourceId(j.f14871I, 0);
        this.f2435L = obtainStyledAttributes.getResourceId(j.f14879K, 0);
        this.f2436M = obtainStyledAttributes.getResourceId(j.f14883L, 0);
        this.f2437N = obtainStyledAttributes.getResourceId(j.f14891N, 0);
        this.f2438O = obtainStyledAttributes.getResourceId(j.f14875J, 0);
        this.f2439P = obtainStyledAttributes.getBoolean(j.f14887M, true);
        this.f2446d = obtainStyledAttributes.getDimensionPixelSize(j.f14867H, 0);
        obtainStyledAttributes.recycle();
        xVar.g(1);
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    private ViewGroup h(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int i() {
        int i4 = this.f2434K;
        if (i4 == 0) {
            return this.f2433J;
        }
        if (this.f2440Q == 1) {
            return i4;
        }
        return this.f2433J;
    }

    private void o(ViewGroup viewGroup, View view, int i4, int i5) {
        View findViewById = this.f2445c.findViewById(f.f14798v);
        View findViewById2 = this.f2445c.findViewById(f.f14797u);
        P.F0(view, i4, i5);
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        if (findViewById2 != null) {
            viewGroup.removeView(findViewById2);
        }
    }

    private void t(ViewGroup viewGroup) {
        boolean z3;
        Button button = (Button) viewGroup.findViewById(16908313);
        this.f2457o = button;
        button.setOnClickListener(this.f2442S);
        if (!TextUtils.isEmpty(this.f2458p) || this.f2460r != null) {
            this.f2457o.setText(this.f2458p);
            Drawable drawable = this.f2460r;
            if (drawable != null) {
                int i4 = this.f2446d;
                drawable.setBounds(0, 0, i4, i4);
                this.f2457o.setCompoundDrawables(this.f2460r, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f2457o.setVisibility(0);
            z3 = true;
        } else {
            this.f2457o.setVisibility(8);
            z3 = false;
        }
        Button button2 = (Button) viewGroup.findViewById(16908314);
        this.f2461s = button2;
        button2.setOnClickListener(this.f2442S);
        if (!TextUtils.isEmpty(this.f2462t) || this.f2464v != null) {
            this.f2461s.setText(this.f2462t);
            Drawable drawable2 = this.f2464v;
            if (drawable2 != null) {
                int i5 = this.f2446d;
                drawable2.setBounds(0, 0, i5, i5);
                this.f2461s.setCompoundDrawables(this.f2464v, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f2461s.setVisibility(0);
            z3 |= true;
        } else {
            this.f2461s.setVisibility(8);
        }
        Button button3 = (Button) viewGroup.findViewById(16908315);
        this.f2465w = button3;
        button3.setOnClickListener(this.f2442S);
        if (!TextUtils.isEmpty(this.f2466x) || this.f2468z != null) {
            this.f2465w.setText(this.f2466x);
            Drawable drawable3 = this.f2468z;
            if (drawable3 != null) {
                int i6 = this.f2446d;
                drawable3.setBounds(0, 0, i6, i6);
                this.f2465w.setCompoundDrawables(this.f2468z, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f2465w.setVisibility(0);
            z3 |= true;
        } else {
            this.f2465w.setVisibility(8);
        }
        if (y(this.f2443a)) {
            if (z3) {
                b(this.f2457o);
            } else if (z3) {
                b(this.f2461s);
            } else if (z3) {
                b(this.f2465w);
            }
        }
        if (!z3) {
            viewGroup.setVisibility(8);
        }
    }

    private void u(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f2445c.findViewById(f.f14799w);
        this.f2424A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f2424A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.f2429F = textView;
        if (textView != null) {
            CharSequence charSequence = this.f2448f;
            if (charSequence != null) {
                textView.setText(charSequence);
                return;
            }
            textView.setVisibility(8);
            this.f2424A.removeView(this.f2429F);
            if (this.f2449g != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.f2424A.getParent();
                int indexOfChild = viewGroup2.indexOfChild(this.f2424A);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(this.f2449g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    private void v(ViewGroup viewGroup) {
        View view = this.f2450h;
        boolean z3 = false;
        if (view == null) {
            if (this.f2451i != 0) {
                view = LayoutInflater.from(this.f2443a).inflate(this.f2451i, viewGroup, false);
            } else {
                view = null;
            }
        }
        if (view != null) {
            z3 = true;
        }
        if (!z3 || !a(view)) {
            this.f2445c.setFlags(131072, 131072);
        }
        if (z3) {
            FrameLayout frameLayout = (FrameLayout) this.f2445c.findViewById(f.f14790n);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f2456n) {
                frameLayout.setPadding(this.f2452j, this.f2453k, this.f2454l, this.f2455m);
            }
            if (this.f2449g != null) {
                ((O.a) viewGroup.getLayoutParams()).weight = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void w(ViewGroup viewGroup) {
        if (this.f2430G != null) {
            viewGroup.addView(this.f2430G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f2445c.findViewById(f.f14775O).setVisibility(8);
            return;
        }
        this.f2427D = (ImageView) this.f2445c.findViewById(16908294);
        if (TextUtils.isEmpty(this.f2447e) || !this.f2439P) {
            this.f2445c.findViewById(f.f14775O).setVisibility(8);
            this.f2427D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f2445c.findViewById(f.f14786j);
        this.f2428E = textView;
        textView.setText(this.f2447e);
        int i4 = this.f2425B;
        if (i4 != 0) {
            this.f2427D.setImageResource(i4);
            return;
        }
        Drawable drawable = this.f2426C;
        if (drawable != null) {
            this.f2427D.setImageDrawable(drawable);
            return;
        }
        this.f2428E.setPadding(this.f2427D.getPaddingLeft(), this.f2427D.getPaddingTop(), this.f2427D.getPaddingRight(), this.f2427D.getPaddingBottom());
        this.f2427D.setVisibility(8);
    }

    private void x() {
        boolean z3;
        boolean z4;
        boolean z5;
        ListAdapter listAdapter;
        View findViewById;
        View view;
        View findViewById2;
        View findViewById3 = this.f2445c.findViewById(f.f14796t);
        int i4 = f.f14776P;
        View findViewById4 = findViewById3.findViewById(i4);
        int i5 = f.f14789m;
        View findViewById5 = findViewById3.findViewById(i5);
        int i6 = f.f14787k;
        View findViewById6 = findViewById3.findViewById(i6);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(f.f14791o);
        v(viewGroup);
        View findViewById7 = viewGroup.findViewById(i4);
        View findViewById8 = viewGroup.findViewById(i5);
        View findViewById9 = viewGroup.findViewById(i6);
        ViewGroup h4 = h(findViewById7, findViewById4);
        ViewGroup h5 = h(findViewById8, findViewById5);
        ViewGroup h6 = h(findViewById9, findViewById6);
        u(h5);
        t(h6);
        w(h4);
        char c4 = 0;
        if (viewGroup.getVisibility() != 8) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (h4 == null || h4.getVisibility() == 8) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (h6 == null || h6.getVisibility() == 8) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (!(z5 || h5 == null || (findViewById2 = h5.findViewById(f.f14771K)) == null)) {
            findViewById2.setVisibility(0);
        }
        if (z4) {
            NestedScrollView nestedScrollView = this.f2424A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            if (this.f2448f == null && this.f2449g == null) {
                view = null;
            } else {
                view = h4.findViewById(f.f14774N);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (!(h5 == null || (findViewById = h5.findViewById(f.f14772L)) == null)) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f2449g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z4, z5);
        }
        if (!z3) {
            View view2 = this.f2449g;
            if (view2 == null) {
                view2 = this.f2424A;
            }
            if (view2 != null) {
                if (z5) {
                    c4 = 2;
                }
                o(h5, view2, z4 | c4 ? 1 : 0, 3);
            }
        }
        ListView listView2 = this.f2449g;
        if (listView2 != null && (listAdapter = this.f2431H) != null) {
            listView2.setAdapter(listAdapter);
            int i7 = this.f2432I;
            if (i7 > -1) {
                listView2.setItemChecked(i7, true);
                listView2.setSelection(i7);
            }
        }
    }

    private static boolean y(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0822a.f14677j, typedValue, true);
        if (typedValue.data != 0) {
            return true;
        }
        return false;
    }

    public int c(int i4) {
        TypedValue typedValue = new TypedValue();
        this.f2443a.getTheme().resolveAttribute(i4, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView d() {
        return this.f2449g;
    }

    public void e() {
        this.f2444b.setContentView(i());
        x();
    }

    public boolean f(int i4, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f2424A;
        if (nestedScrollView == null || !nestedScrollView.s(keyEvent)) {
            return false;
        }
        return true;
    }

    public boolean g(int i4, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f2424A;
        if (nestedScrollView == null || !nestedScrollView.s(keyEvent)) {
            return false;
        }
        return true;
    }

    public void j(int i4, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f2441R.obtainMessage(i4, onClickListener);
        }
        if (i4 == -3) {
            this.f2466x = charSequence;
            this.f2467y = message;
            this.f2468z = drawable;
        } else if (i4 == -2) {
            this.f2462t = charSequence;
            this.f2463u = message;
            this.f2464v = drawable;
        } else if (i4 == -1) {
            this.f2458p = charSequence;
            this.f2459q = message;
            this.f2460r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    public void k(View view) {
        this.f2430G = view;
    }

    public void l(int i4) {
        this.f2426C = null;
        this.f2425B = i4;
        ImageView imageView = this.f2427D;
        if (imageView == null) {
            return;
        }
        if (i4 != 0) {
            imageView.setVisibility(0);
            this.f2427D.setImageResource(this.f2425B);
            return;
        }
        imageView.setVisibility(8);
    }

    public void m(Drawable drawable) {
        this.f2426C = drawable;
        this.f2425B = 0;
        ImageView imageView = this.f2427D;
        if (imageView == null) {
            return;
        }
        if (drawable != null) {
            imageView.setVisibility(0);
            this.f2427D.setImageDrawable(drawable);
            return;
        }
        imageView.setVisibility(8);
    }

    public void n(CharSequence charSequence) {
        this.f2448f = charSequence;
        TextView textView = this.f2429F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void p(CharSequence charSequence) {
        this.f2447e = charSequence;
        TextView textView = this.f2428E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void q(int i4) {
        this.f2450h = null;
        this.f2451i = i4;
        this.f2456n = false;
    }

    public void r(View view) {
        this.f2450h = view;
        this.f2451i = 0;
        this.f2456n = false;
    }

    public void s(View view, int i4, int i5, int i6, int i7) {
        this.f2450h = view;
        this.f2451i = 0;
        this.f2456n = true;
        this.f2452j = i4;
        this.f2453k = i5;
        this.f2454l = i6;
        this.f2455m = i7;
    }
}
