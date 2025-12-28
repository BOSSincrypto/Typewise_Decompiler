package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.f;
import androidx.emoji2.text.n;
import java.util.Arrays;

final class i {

    /* renamed from: a  reason: collision with root package name */
    private final f.i f5494a;

    /* renamed from: b  reason: collision with root package name */
    private final n f5495b;

    /* renamed from: c  reason: collision with root package name */
    private f.d f5496c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f5497d;

    /* renamed from: e  reason: collision with root package name */
    private final int[] f5498e;

    private static final class a {
        static int a(CharSequence charSequence, int i4, int i5) {
            int length = charSequence.length();
            if (i4 < 0 || length < i4 || i5 < 0) {
                return -1;
            }
            while (true) {
                boolean z3 = false;
                while (i5 != 0) {
                    i4--;
                    if (i4 >= 0) {
                        char charAt = charSequence.charAt(i4);
                        if (z3) {
                            if (!Character.isHighSurrogate(charAt)) {
                                return -1;
                            }
                            i5--;
                        } else if (!Character.isSurrogate(charAt)) {
                            i5--;
                        } else if (Character.isHighSurrogate(charAt)) {
                            return -1;
                        } else {
                            z3 = true;
                        }
                    } else if (z3) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
                return i4;
            }
        }

        static int b(CharSequence charSequence, int i4, int i5) {
            int length = charSequence.length();
            if (i4 < 0 || length < i4 || i5 < 0) {
                return -1;
            }
            while (true) {
                boolean z3 = false;
                while (i5 != 0) {
                    if (r7 < length) {
                        char charAt = charSequence.charAt(r7);
                        if (z3) {
                            if (!Character.isLowSurrogate(charAt)) {
                                return -1;
                            }
                            i5--;
                            i4 = r7 + 1;
                        } else if (!Character.isSurrogate(charAt)) {
                            i5--;
                            r7++;
                        } else if (Character.isLowSurrogate(charAt)) {
                            return -1;
                        } else {
                            r7++;
                            z3 = true;
                        }
                    } else if (z3) {
                        return -1;
                    } else {
                        return length;
                    }
                }
                return r7;
            }
        }
    }

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        private int f5499a = 1;

        /* renamed from: b  reason: collision with root package name */
        private final n.a f5500b;

        /* renamed from: c  reason: collision with root package name */
        private n.a f5501c;

        /* renamed from: d  reason: collision with root package name */
        private n.a f5502d;

        /* renamed from: e  reason: collision with root package name */
        private int f5503e;

        /* renamed from: f  reason: collision with root package name */
        private int f5504f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f5505g;

        /* renamed from: h  reason: collision with root package name */
        private final int[] f5506h;

        b(n.a aVar, boolean z3, int[] iArr) {
            this.f5500b = aVar;
            this.f5501c = aVar;
            this.f5505g = z3;
            this.f5506h = iArr;
        }

        private static boolean d(int i4) {
            return i4 == 65039;
        }

        private static boolean f(int i4) {
            return i4 == 65038;
        }

        private int g() {
            this.f5499a = 1;
            this.f5501c = this.f5500b;
            this.f5504f = 0;
            return 1;
        }

        private boolean h() {
            if (this.f5501c.b().j() || d(this.f5503e)) {
                return true;
            }
            if (this.f5505g) {
                if (this.f5506h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f5506h, this.f5501c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public int a(int i4) {
            n.a a4 = this.f5501c.a(i4);
            int i5 = 2;
            if (this.f5499a != 2) {
                if (a4 == null) {
                    i5 = g();
                } else {
                    this.f5499a = 2;
                    this.f5501c = a4;
                    this.f5504f = 1;
                }
            } else if (a4 != null) {
                this.f5501c = a4;
                this.f5504f++;
            } else if (f(i4)) {
                i5 = g();
            } else if (!d(i4)) {
                if (this.f5501c.b() != null) {
                    i5 = 3;
                    if (this.f5504f != 1) {
                        this.f5502d = this.f5501c;
                        g();
                    } else if (h()) {
                        this.f5502d = this.f5501c;
                        g();
                    } else {
                        i5 = g();
                    }
                } else {
                    i5 = g();
                }
            }
            this.f5503e = i4;
            return i5;
        }

        /* access modifiers changed from: package-private */
        public h b() {
            return this.f5501c.b();
        }

        /* access modifiers changed from: package-private */
        public h c() {
            return this.f5502d.b();
        }

        /* access modifiers changed from: package-private */
        public boolean e() {
            if (this.f5499a != 2 || this.f5501c.b() == null || (this.f5504f <= 1 && !h())) {
                return false;
            }
            return true;
        }
    }

    i(n nVar, f.i iVar, f.d dVar, boolean z3, int[] iArr) {
        this.f5494a = iVar;
        this.f5495b = nVar;
        this.f5496c = dVar;
        this.f5497d = z3;
        this.f5498e = iArr;
    }

    private void a(Spannable spannable, h hVar, int i4, int i5) {
        spannable.setSpan(this.f5494a.a(hVar), i4, i5, 33);
    }

    private static boolean b(Editable editable, KeyEvent keyEvent, boolean z3) {
        j[] jVarArr;
        if (g(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!f(selectionStart, selectionEnd) && (jVarArr = (j[]) editable.getSpans(selectionStart, selectionEnd, j.class)) != null && jVarArr.length > 0) {
            int length = jVarArr.length;
            int i4 = 0;
            while (i4 < length) {
                j jVar = jVarArr[i4];
                int spanStart = editable.getSpanStart(jVar);
                int spanEnd = editable.getSpanEnd(jVar);
                if ((!z3 || spanStart != selectionStart) && ((z3 || spanEnd != selectionStart) && (selectionStart <= spanStart || selectionStart >= spanEnd))) {
                    i4++;
                } else {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    static boolean c(InputConnection inputConnection, Editable editable, int i4, int i5, boolean z3) {
        int i6;
        int i7;
        if (editable != null && inputConnection != null && i4 >= 0 && i5 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (f(selectionStart, selectionEnd)) {
                return false;
            }
            if (z3) {
                i7 = a.a(editable, selectionStart, Math.max(i4, 0));
                i6 = a.b(editable, selectionEnd, Math.max(i5, 0));
                if (i7 == -1 || i6 == -1) {
                    return false;
                }
            } else {
                i7 = Math.max(selectionStart - i4, 0);
                i6 = Math.min(selectionEnd + i5, editable.length());
            }
            j[] jVarArr = (j[]) editable.getSpans(i7, i6, j.class);
            if (jVarArr != null && jVarArr.length > 0) {
                for (j jVar : jVarArr) {
                    int spanStart = editable.getSpanStart(jVar);
                    int spanEnd = editable.getSpanEnd(jVar);
                    i7 = Math.min(spanStart, i7);
                    i6 = Math.max(spanEnd, i6);
                }
                int max = Math.max(i7, 0);
                int min = Math.min(i6, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max, min);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    static boolean d(Editable editable, int i4, KeyEvent keyEvent) {
        boolean z3;
        if (i4 == 67) {
            z3 = b(editable, keyEvent, false);
        } else if (i4 != 112) {
            z3 = false;
        } else {
            z3 = b(editable, keyEvent, true);
        }
        if (!z3) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    private boolean e(CharSequence charSequence, int i4, int i5, h hVar) {
        if (hVar.d() == 0) {
            hVar.k(this.f5496c.a(charSequence, i4, i5, hVar.h()));
        }
        if (hVar.d() == 2) {
            return true;
        }
        return false;
    }

    private static boolean f(int i4, int i5) {
        return i4 == -1 || i5 == -1 || i4 != i5;
    }

    private static boolean g(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0049 A[Catch:{ all -> 0x002a }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0065 A[Catch:{ all -> 0x002a }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0124  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence h(java.lang.CharSequence r11, int r12, int r13, int r14, boolean r15) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof androidx.emoji2.text.o
            if (r0 == 0) goto L_0x000a
            r1 = r11
            androidx.emoji2.text.o r1 = (androidx.emoji2.text.o) r1
            r1.a()
        L_0x000a:
            java.lang.Class<androidx.emoji2.text.j> r1 = androidx.emoji2.text.j.class
            if (r0 != 0) goto L_0x002f
            boolean r2 = r11 instanceof android.text.Spannable     // Catch:{ all -> 0x002a }
            if (r2 == 0) goto L_0x0013
            goto L_0x002f
        L_0x0013:
            boolean r2 = r11 instanceof android.text.Spanned     // Catch:{ all -> 0x002a }
            if (r2 == 0) goto L_0x002d
            r2 = r11
            android.text.Spanned r2 = (android.text.Spanned) r2     // Catch:{ all -> 0x002a }
            int r3 = r12 + -1
            int r4 = r13 + 1
            int r2 = r2.nextSpanTransition(r3, r4, r1)     // Catch:{ all -> 0x002a }
            if (r2 > r13) goto L_0x002d
            androidx.emoji2.text.s r2 = new androidx.emoji2.text.s     // Catch:{ all -> 0x002a }
            r2.<init>((java.lang.CharSequence) r11)     // Catch:{ all -> 0x002a }
            goto L_0x0037
        L_0x002a:
            r12 = move-exception
            goto L_0x012b
        L_0x002d:
            r2 = 0
            goto L_0x0037
        L_0x002f:
            androidx.emoji2.text.s r2 = new androidx.emoji2.text.s     // Catch:{ all -> 0x002a }
            r3 = r11
            android.text.Spannable r3 = (android.text.Spannable) r3     // Catch:{ all -> 0x002a }
            r2.<init>((android.text.Spannable) r3)     // Catch:{ all -> 0x002a }
        L_0x0037:
            r3 = 0
            if (r2 == 0) goto L_0x0063
            java.lang.Object[] r4 = r2.getSpans(r12, r13, r1)     // Catch:{ all -> 0x002a }
            androidx.emoji2.text.j[] r4 = (androidx.emoji2.text.j[]) r4     // Catch:{ all -> 0x002a }
            if (r4 == 0) goto L_0x0063
            int r5 = r4.length     // Catch:{ all -> 0x002a }
            if (r5 <= 0) goto L_0x0063
            int r5 = r4.length     // Catch:{ all -> 0x002a }
            r6 = r3
        L_0x0047:
            if (r6 >= r5) goto L_0x0063
            r7 = r4[r6]     // Catch:{ all -> 0x002a }
            int r8 = r2.getSpanStart(r7)     // Catch:{ all -> 0x002a }
            int r9 = r2.getSpanEnd(r7)     // Catch:{ all -> 0x002a }
            if (r8 == r13) goto L_0x0058
            r2.removeSpan(r7)     // Catch:{ all -> 0x002a }
        L_0x0058:
            int r12 = java.lang.Math.min(r8, r12)     // Catch:{ all -> 0x002a }
            int r13 = java.lang.Math.max(r9, r13)     // Catch:{ all -> 0x002a }
            int r6 = r6 + 1
            goto L_0x0047
        L_0x0063:
            if (r12 == r13) goto L_0x0122
            int r4 = r11.length()     // Catch:{ all -> 0x002a }
            if (r12 < r4) goto L_0x006d
            goto L_0x0122
        L_0x006d:
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r14 == r4) goto L_0x0080
            if (r2 == 0) goto L_0x0080
            int r4 = r2.length()     // Catch:{ all -> 0x002a }
            java.lang.Object[] r1 = r2.getSpans(r3, r4, r1)     // Catch:{ all -> 0x002a }
            androidx.emoji2.text.j[] r1 = (androidx.emoji2.text.j[]) r1     // Catch:{ all -> 0x002a }
            int r1 = r1.length     // Catch:{ all -> 0x002a }
            int r14 = r14 - r1
        L_0x0080:
            androidx.emoji2.text.i$b r1 = new androidx.emoji2.text.i$b     // Catch:{ all -> 0x002a }
            androidx.emoji2.text.n r4 = r10.f5495b     // Catch:{ all -> 0x002a }
            androidx.emoji2.text.n$a r4 = r4.f()     // Catch:{ all -> 0x002a }
            boolean r5 = r10.f5497d     // Catch:{ all -> 0x002a }
            int[] r6 = r10.f5498e     // Catch:{ all -> 0x002a }
            r1.<init>(r4, r5, r6)     // Catch:{ all -> 0x002a }
            int r4 = java.lang.Character.codePointAt(r11, r12)     // Catch:{ all -> 0x002a }
            r5 = r4
            r4 = r3
            r3 = r2
        L_0x0096:
            r2 = r12
        L_0x0097:
            if (r12 >= r13) goto L_0x00e9
            if (r4 >= r14) goto L_0x00e9
            int r6 = r1.a(r5)     // Catch:{ all -> 0x002a }
            r7 = 1
            if (r6 == r7) goto L_0x00d7
            r7 = 2
            if (r6 == r7) goto L_0x00cb
            r7 = 3
            if (r6 == r7) goto L_0x00a9
            goto L_0x0097
        L_0x00a9:
            if (r15 != 0) goto L_0x00b5
            androidx.emoji2.text.h r6 = r1.c()     // Catch:{ all -> 0x002a }
            boolean r6 = r10.e(r11, r2, r12, r6)     // Catch:{ all -> 0x002a }
            if (r6 != 0) goto L_0x0096
        L_0x00b5:
            if (r3 != 0) goto L_0x00c1
            androidx.emoji2.text.s r3 = new androidx.emoji2.text.s     // Catch:{ all -> 0x002a }
            android.text.SpannableString r6 = new android.text.SpannableString     // Catch:{ all -> 0x002a }
            r6.<init>(r11)     // Catch:{ all -> 0x002a }
            r3.<init>((android.text.Spannable) r6)     // Catch:{ all -> 0x002a }
        L_0x00c1:
            androidx.emoji2.text.h r6 = r1.c()     // Catch:{ all -> 0x002a }
            r10.a(r3, r6, r2, r12)     // Catch:{ all -> 0x002a }
            int r4 = r4 + 1
            goto L_0x0096
        L_0x00cb:
            int r6 = java.lang.Character.charCount(r5)     // Catch:{ all -> 0x002a }
            int r12 = r12 + r6
            if (r12 >= r13) goto L_0x0097
            int r5 = java.lang.Character.codePointAt(r11, r12)     // Catch:{ all -> 0x002a }
            goto L_0x0097
        L_0x00d7:
            int r12 = java.lang.Character.codePointAt(r11, r2)     // Catch:{ all -> 0x002a }
            int r12 = java.lang.Character.charCount(r12)     // Catch:{ all -> 0x002a }
            int r2 = r2 + r12
            if (r2 >= r13) goto L_0x00e7
            int r12 = java.lang.Character.codePointAt(r11, r2)     // Catch:{ all -> 0x002a }
            r5 = r12
        L_0x00e7:
            r12 = r2
            goto L_0x0097
        L_0x00e9:
            boolean r13 = r1.e()     // Catch:{ all -> 0x002a }
            if (r13 == 0) goto L_0x010b
            if (r4 >= r14) goto L_0x010b
            if (r15 != 0) goto L_0x00fd
            androidx.emoji2.text.h r13 = r1.b()     // Catch:{ all -> 0x002a }
            boolean r13 = r10.e(r11, r2, r12, r13)     // Catch:{ all -> 0x002a }
            if (r13 != 0) goto L_0x010b
        L_0x00fd:
            if (r3 != 0) goto L_0x0104
            androidx.emoji2.text.s r3 = new androidx.emoji2.text.s     // Catch:{ all -> 0x002a }
            r3.<init>((java.lang.CharSequence) r11)     // Catch:{ all -> 0x002a }
        L_0x0104:
            androidx.emoji2.text.h r13 = r1.b()     // Catch:{ all -> 0x002a }
            r10.a(r3, r13, r2, r12)     // Catch:{ all -> 0x002a }
        L_0x010b:
            if (r3 == 0) goto L_0x0119
            android.text.Spannable r12 = r3.b()     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x0118
            androidx.emoji2.text.o r11 = (androidx.emoji2.text.o) r11
            r11.d()
        L_0x0118:
            return r12
        L_0x0119:
            if (r0 == 0) goto L_0x0121
            r12 = r11
            androidx.emoji2.text.o r12 = (androidx.emoji2.text.o) r12
            r12.d()
        L_0x0121:
            return r11
        L_0x0122:
            if (r0 == 0) goto L_0x012a
            r12 = r11
            androidx.emoji2.text.o r12 = (androidx.emoji2.text.o) r12
            r12.d()
        L_0x012a:
            return r11
        L_0x012b:
            if (r0 == 0) goto L_0x0132
            androidx.emoji2.text.o r11 = (androidx.emoji2.text.o) r11
            r11.d()
        L_0x0132:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.i.h(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }
}
