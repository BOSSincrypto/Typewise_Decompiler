package ch.icoaching.typewise.language_modelling.modelling;

import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.C0718m;
import kotlin.coroutines.c;
import kotlin.jvm.internal.i;
import kotlin.text.o;
import n2.C0830a;

public final class HashCheckedMixin {

    /* renamed from: c  reason: collision with root package name */
    public static final Companion f8637c = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f8638a;

    /* renamed from: b  reason: collision with root package name */
    private final List f8639b;

    public static final class Companion {

        public static final class a implements Comparator {
            public final int compare(Object obj, Object obj2) {
                Locale locale = Locale.ROOT;
                String lowerCase = ((String) C0718m.b0(o.t0((String) obj, new String[]{"/"}, false, 0, 6, (Object) null))).toLowerCase(locale);
                kotlin.jvm.internal.o.d(lowerCase, "toLowerCase(...)");
                String lowerCase2 = ((String) C0718m.b0(o.t0((String) obj2, new String[]{"/"}, false, 0, 6, (Object) null))).toLowerCase(locale);
                kotlin.jvm.internal.o.d(lowerCase2, "toLowerCase(...)");
                return C0830a.a(lowerCase, lowerCase2);
            }
        }

        private Companion() {
        }

        public final Object a(String str, List list, c cVar) {
            return new HashCheckedMixin(str, list, (i) null);
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0067  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object b(java.util.List r18, kotlin.coroutines.c r19) {
            /*
                r17 = this;
                r0 = r19
                boolean r1 = r0 instanceof ch.icoaching.typewise.language_modelling.modelling.HashCheckedMixin$Companion$hashOfFiles$1
                if (r1 == 0) goto L_0x0017
                r1 = r0
                ch.icoaching.typewise.language_modelling.modelling.HashCheckedMixin$Companion$hashOfFiles$1 r1 = (ch.icoaching.typewise.language_modelling.modelling.HashCheckedMixin$Companion$hashOfFiles$1) r1
                int r2 = r1.f8645f
                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                r4 = r2 & r3
                if (r4 == 0) goto L_0x0017
                int r2 = r2 - r3
                r1.f8645f = r2
                r2 = r17
                goto L_0x001e
            L_0x0017:
                ch.icoaching.typewise.language_modelling.modelling.HashCheckedMixin$Companion$hashOfFiles$1 r1 = new ch.icoaching.typewise.language_modelling.modelling.HashCheckedMixin$Companion$hashOfFiles$1
                r2 = r17
                r1.<init>(r2, r0)
            L_0x001e:
                java.lang.Object r0 = r1.f8643d
                java.lang.Object r3 = kotlin.coroutines.intrinsics.a.f()
                int r4 = r1.f8645f
                r5 = 1
                if (r4 == 0) goto L_0x0043
                if (r4 != r5) goto L_0x003b
                java.lang.Object r4 = r1.f8642c
                java.util.Collection r4 = (java.util.Collection) r4
                java.lang.Object r6 = r1.f8641b
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r7 = r1.f8640a
                java.util.Collection r7 = (java.util.Collection) r7
                kotlin.f.b(r0)
                goto L_0x0085
            L_0x003b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0043:
                kotlin.f.b(r0)
                ch.icoaching.typewise.language_modelling.modelling.HashCheckedMixin$Companion$a r0 = new ch.icoaching.typewise.language_modelling.modelling.HashCheckedMixin$Companion$a
                r0.<init>()
                r4 = r18
                java.util.List r0 = kotlin.collections.C0718m.r0(r4, r0)
                java.util.ArrayList r4 = new java.util.ArrayList
                r6 = 10
                int r6 = kotlin.collections.C0718m.t(r0, r6)
                r4.<init>(r6)
                java.util.Iterator r0 = r0.iterator()
                r6 = r0
            L_0x0061:
                boolean r0 = r6.hasNext()
                if (r0 == 0) goto L_0x0090
                java.lang.Object r0 = r6.next()
                java.lang.String r0 = (java.lang.String) r0
                ch.icoaching.typewise.file_handling.b r7 = ch.icoaching.typewise.file_handling.b.f8265a
                ch.icoaching.typewise.file_handling.FileIO$Scope r8 = ch.icoaching.typewise.file_handling.FileIO.Scope.PREDICTION
                ch.icoaching.typewise.file_handling.FileIO r7 = r7.a(r8)
                r1.f8640a = r4
                r1.f8641b = r6
                r1.f8642c = r4
                r1.f8645f = r5
                java.lang.Object r0 = r7.d(r0, r1)
                if (r0 != r3) goto L_0x0084
                return r3
            L_0x0084:
                r7 = r4
            L_0x0085:
                byte[] r0 = (byte[]) r0
                java.lang.String r0 = E0.c.b(r0)
                r4.add(r0)
                r4 = r7
                goto L_0x0061
            L_0x0090:
                r8 = r4
                java.util.List r8 = (java.util.List) r8
                r15 = 62
                r16 = 0
                java.lang.String r9 = "|"
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                java.lang.String r0 = kotlin.collections.C0718m.Z(r8, r9, r10, r11, r12, r13, r14, r15, r16)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.modelling.HashCheckedMixin.Companion.b(java.util.List, kotlin.coroutines.c):java.lang.Object");
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    private HashCheckedMixin(String str, List list) {
        this.f8638a = str;
        this.f8639b = list;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(kotlin.coroutines.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ch.icoaching.typewise.language_modelling.modelling.HashCheckedMixin$hashCheckFiles$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            ch.icoaching.typewise.language_modelling.modelling.HashCheckedMixin$hashCheckFiles$1 r0 = (ch.icoaching.typewise.language_modelling.modelling.HashCheckedMixin$hashCheckFiles$1) r0
            int r1 = r0.f8649d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8649d = r1
            goto L_0x0018
        L_0x0013:
            ch.icoaching.typewise.language_modelling.modelling.HashCheckedMixin$hashCheckFiles$1 r0 = new ch.icoaching.typewise.language_modelling.modelling.HashCheckedMixin$hashCheckFiles$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f8647b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f8649d
            java.lang.String r3 = "'"
            r4 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r4) goto L_0x002f
            java.lang.Object r0 = r0.f8646a
            ch.icoaching.typewise.language_modelling.modelling.HashCheckedMixin r0 = (ch.icoaching.typewise.language_modelling.modelling.HashCheckedMixin) r0
            kotlin.f.b(r7)
            goto L_0x0065
        L_0x002f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0037:
            kotlin.f.b(r7)
            java.lang.String r7 = r6.f8638a
            int r7 = r7.length()
            if (r7 != 0) goto L_0x004d
            java.util.List r7 = r6.f8639b
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x004d
            l2.q r7 = l2.q.f14567a
            return r7
        L_0x004d:
            java.util.List r7 = r6.f8639b
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x00c4
            ch.icoaching.typewise.language_modelling.modelling.HashCheckedMixin$Companion r7 = f8637c
            java.util.List r2 = r6.f8639b
            r0.f8646a = r6
            r0.f8649d = r4
            java.lang.Object r7 = r7.b(r2, r0)
            if (r7 != r1) goto L_0x0064
            return r1
        L_0x0064:
            r0 = r6
        L_0x0065:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r1 = r0.f8638a
            int r1 = r1.length()
            if (r1 == 0) goto L_0x00a8
            java.lang.String r1 = r0.f8638a
            boolean r1 = kotlin.jvm.internal.o.a(r1, r7)
            if (r1 == 0) goto L_0x007a
            l2.q r7 = l2.q.f14567a
            return r7
        L_0x007a:
            ch.icoaching.typewise.language_modelling.modelling.ModelFileSyncException r1 = new ch.icoaching.typewise.language_modelling.modelling.ModelFileSyncException
            java.util.List r2 = r0.f8639b
            java.lang.String r0 = r0.f8638a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "The hashes at '"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = "' ('"
            r4.append(r2)
            r4.append(r7)
            java.lang.String r7 = "') do not match with the target '"
            r4.append(r7)
            r4.append(r0)
            r4.append(r3)
            java.lang.String r7 = r4.toString()
            r1.<init>(r7)
            throw r1
        L_0x00a8:
            ch.icoaching.typewise.language_modelling.modelling.ModelFileSyncException r0 = new ch.icoaching.typewise.language_modelling.modelling.ModelFileSyncException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot load model. No hashes in config. File hash ('"
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = "')"
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L_0x00c4:
            ch.icoaching.typewise.language_modelling.modelling.ModelFileSyncException r7 = new ch.icoaching.typewise.language_modelling.modelling.ModelFileSyncException
            java.lang.String r0 = r6.f8638a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No files to be checked against target hash '"
            r1.append(r2)
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.modelling.HashCheckedMixin.a(kotlin.coroutines.c):java.lang.Object");
    }

    public /* synthetic */ HashCheckedMixin(String str, List list, i iVar) {
        this(str, list);
    }
}
