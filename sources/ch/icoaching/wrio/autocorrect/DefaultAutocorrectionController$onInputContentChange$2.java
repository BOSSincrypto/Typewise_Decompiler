package ch.icoaching.wrio.autocorrect;

import android.graphics.PointF;
import ch.icoaching.wrio.input.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.autocorrect.DefaultAutocorrectionController$onInputContentChange$2", f = "DefaultAutocorrectionController.kt", l = {305, 321}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Lch/icoaching/wrio/input/t;", "<anonymous>", "(Lkotlinx/coroutines/D;)Lch/icoaching/wrio/input/t;"}, k = 3, mv = {2, 0, 0})
final class DefaultAutocorrectionController$onInputContentChange$2 extends SuspendLambda implements p {
    final /* synthetic */ String $change;
    final /* synthetic */ int $cursorPosition;
    final /* synthetic */ boolean $isEmojiTriggered;
    final /* synthetic */ String $newContent;
    final /* synthetic */ String $oldContent;
    final /* synthetic */ List<PointF> $touchPointsNew;
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DefaultAutocorrectionController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultAutocorrectionController$onInputContentChange$2(String str, int i4, String str2, String str3, boolean z3, DefaultAutocorrectionController defaultAutocorrectionController, List<? extends PointF> list, c<? super DefaultAutocorrectionController$onInputContentChange$2> cVar) {
        super(2, cVar);
        this.$oldContent = str;
        this.$cursorPosition = i4;
        this.$newContent = str2;
        this.$change = str3;
        this.$isEmojiTriggered = z3;
        this.this$0 = defaultAutocorrectionController;
        this.$touchPointsNew = list;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DefaultAutocorrectionController$onInputContentChange$2(this.$oldContent, this.$cursorPosition, this.$newContent, this.$change, this.$isEmojiTriggered, this.this$0, this.$touchPointsNew, cVar);
    }

    /* JADX WARNING: type inference failed for: r0v64, types: [int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x03b2  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x03f5 A[SYNTHETIC, Splitter:B:119:0x03f5] */
    /* JADX WARNING: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x011a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0346  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            r28 = this;
            r1 = r28
            java.lang.Object r2 = kotlin.coroutines.intrinsics.a.f()
            int r0 = r1.label
            java.lang.String r3 = "removeAutocorrectionTriggers(...)"
            java.lang.String r4 = "DefaultAutocorrectController"
            r5 = 39
            java.lang.String r6 = "' | "
            r7 = 2
            r8 = 0
            r9 = 0
            r10 = 1
            if (r0 == 0) goto L_0x004a
            if (r0 == r10) goto L_0x0034
            if (r0 != r7) goto L_0x002c
            int r0 = r1.I$0
            java.lang.Object r2 = r1.L$1
            ch.icoaching.wrio.autocorrect.usecase.GetCorrectionsUseCase$b r2 = (ch.icoaching.wrio.autocorrect.usecase.GetCorrectionsUseCase.b) r2
            java.lang.Object r4 = r1.L$0
            java.lang.String r4 = (java.lang.String) r4
            kotlin.f.b(r29)
            r14 = r4
            r4 = r29
            goto L_0x0342
        L_0x002c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0034:
            int r0 = r1.I$2
            int r11 = r1.I$1
            int r12 = r1.I$0
            java.lang.Object r13 = r1.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r1.L$0
            java.lang.String r14 = (java.lang.String) r14
            kotlin.f.b(r29)
            r5 = r0
            r0 = r29
            goto L_0x02a1
        L_0x004a:
            kotlin.f.b(r29)
            ch.icoaching.wrio.logging.Log r0 = ch.icoaching.wrio.logging.Log.f10572a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "onInputContentChange() :: Step 1: '"
            r11.append(r12)
            java.lang.String r12 = r1.$oldContent
            int r13 = r1.$cursorPosition
            java.lang.Integer r13 = kotlin.coroutines.jvm.internal.a.d(r13)
            java.lang.CharSequence r12 = ch.icoaching.wrio.I.a(r12, r13)
            r11.append(r12)
            java.lang.String r12 = "' | '"
            r11.append(r12)
            java.lang.String r12 = r1.$newContent
            java.lang.CharSequence r12 = ch.icoaching.wrio.I.b(r12, r9, r10, r9)
            r11.append(r12)
            r11.append(r6)
            int r12 = r1.$cursorPosition
            r11.append(r12)
            java.lang.String r12 = " | '"
            r11.append(r12)
            java.lang.String r12 = r1.$change
            r11.append(r12)
            r11.append(r6)
            boolean r12 = r1.$isEmojiTriggered
            r11.append(r12)
            java.lang.String r17 = r11.toString()
            r19 = 4
            r20 = 0
            java.lang.String r16 = "DefaultAutocorrectController"
            r18 = 0
            r15 = r0
            ch.icoaching.wrio.logging.Log.d(r15, r16, r17, r18, r19, r20)
            ch.icoaching.wrio.autocorrect.DefaultAutocorrectionController r11 = r1.this$0
            android.view.inputmethod.EditorInfo r11 = r11.f9304s
            if (r11 != 0) goto L_0x00a9
            return r9
        L_0x00a9:
            ch.icoaching.wrio.autocorrect.DefaultAutocorrectionController r12 = r1.this$0
            boolean r11 = r12.o(r11)
            if (r11 != 0) goto L_0x00c0
            r19 = 4
            r20 = 0
            java.lang.String r16 = "DefaultAutocorrectController"
            java.lang.String r17 = "onInputContentChange() :: Autocorrection NOT allowed!"
            r18 = 0
            r15 = r0
            ch.icoaching.wrio.logging.Log.d(r15, r16, r17, r18, r19, r20)
            return r9
        L_0x00c0:
            java.lang.String r0 = r1.$newContent
            int r0 = r0.length()
            java.lang.String r11 = r1.$oldContent
            int r11 = r11.length()
            if (r0 >= r11) goto L_0x00cf
            return r9
        L_0x00cf:
            ch.icoaching.wrio.autocorrect.DefaultAutocorrectionController r0 = r1.this$0
            ch.icoaching.wrio.input.j r0 = r0.f9303r
            if (r0 == 0) goto L_0x00e0
            boolean r0 = r0.c()
            if (r0 != r10) goto L_0x00e0
            java.lang.String r0 = " \n&\\+=\\.!\\?,:;\\/\\\\"
            goto L_0x00e2
        L_0x00e0:
            java.lang.String r0 = " \n&\\+=\\/\\\\-"
        L_0x00e2:
            java.lang.String r11 = r1.$change
            boolean r0 = kotlin.text.o.L(r0, r11, r8, r7, r9)
            if (r0 != 0) goto L_0x00eb
            return r9
        L_0x00eb:
            r11 = -1
            int r0 = r1.$cursorPosition     // Catch:{ NullPointerException -> 0x010d, IndexOutOfBoundsException -> 0x010b }
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.a.d(r0)     // Catch:{ NullPointerException -> 0x010d, IndexOutOfBoundsException -> 0x010b }
            java.lang.Integer r12 = kotlin.coroutines.jvm.internal.a.d(r8)     // Catch:{ NullPointerException -> 0x010d, IndexOutOfBoundsException -> 0x010b }
            java.lang.String r13 = r1.$newContent     // Catch:{ NullPointerException -> 0x010d, IndexOutOfBoundsException -> 0x010b }
            int r13 = r13.length()     // Catch:{ NullPointerException -> 0x010d, IndexOutOfBoundsException -> 0x010b }
            java.lang.Integer r13 = kotlin.coroutines.jvm.internal.a.d(r13)     // Catch:{ NullPointerException -> 0x010d, IndexOutOfBoundsException -> 0x010b }
            java.lang.Comparable r0 = ch.icoaching.wrio.Y.a(r0, r12, r13)     // Catch:{ NullPointerException -> 0x010d, IndexOutOfBoundsException -> 0x010b }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ NullPointerException -> 0x010d, IndexOutOfBoundsException -> 0x010b }
            int r0 = r0.intValue()     // Catch:{ NullPointerException -> 0x010d, IndexOutOfBoundsException -> 0x010b }
            goto L_0x0118
        L_0x010b:
            r0 = move-exception
            goto L_0x010f
        L_0x010d:
            r0 = move-exception
            goto L_0x0114
        L_0x010f:
            r0.printStackTrace()
        L_0x0112:
            r0 = r11
            goto L_0x0118
        L_0x0114:
            r0.printStackTrace()
            goto L_0x0112
        L_0x0118:
            if (r0 != r11) goto L_0x011b
            return r9
        L_0x011b:
            java.lang.String r11 = r1.$newContent
            java.lang.String r11 = r11.substring(r8, r0)
            java.lang.String r12 = "substring(...)"
            kotlin.jvm.internal.o.d(r11, r12)
            java.util.List<android.graphics.PointF> r12 = r1.$touchPointsNew
            java.util.List r0 = r12.subList(r8, r0)
            java.util.ArrayList r15 = new java.util.ArrayList
            r12 = 10
            int r12 = kotlin.collections.C0718m.t(r0, r12)
            r15.<init>(r12)
            java.util.Iterator r0 = r0.iterator()
        L_0x013b:
            boolean r12 = r0.hasNext()
            if (r12 == 0) goto L_0x0158
            java.lang.Object r12 = r0.next()
            android.graphics.PointF r12 = (android.graphics.PointF) r12
            if (r12 != 0) goto L_0x014b
            r13 = r9
            goto L_0x0154
        L_0x014b:
            E0.p r13 = new E0.p
            float r14 = r12.x
            float r12 = r12.y
            r13.<init>(r14, r12)
        L_0x0154:
            r15.add(r13)
            goto L_0x013b
        L_0x0158:
            ch.icoaching.wrio.logging.Log r16 = ch.icoaching.wrio.logging.Log.f10572a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r12 = "onInputContentChange() :: Step 2:  '"
            r0.append(r12)
            java.lang.CharSequence r12 = ch.icoaching.wrio.I.b(r11, r9, r10, r9)
            r0.append(r12)
            r0.append(r5)
            java.lang.String r18 = r0.toString()
            r20 = 4
            r21 = 0
            java.lang.String r17 = "DefaultAutocorrectController"
            r19 = 0
            ch.icoaching.wrio.logging.Log.d(r16, r17, r18, r19, r20, r21)
            java.lang.String[] r0 = ch.icoaching.wrio.Y.e(r11)
            kotlin.jvm.internal.o.b(r0)
            ch.icoaching.wrio.autocorrect.DefaultAutocorrectionController r12 = r1.this$0
            ch.icoaching.wrio.data.b r12 = r12.f9294i
            ch.icoaching.wrio.autocorrect.DefaultAutocorrectionController r13 = r1.this$0
            ch.icoaching.wrio.subscription.a r13 = r13.f9291f
            java.lang.String r14 = ch.icoaching.wrio.Z.a(r0, r12, r13)
            r16 = 6
            r17 = 0
            r18 = 0
            r19 = 0
            r12 = r11
            r13 = r14
            r5 = r14
            r14 = r18
            r18 = r15
            r15 = r19
            int r15 = kotlin.text.o.b0(r12, r13, r14, r15, r16, r17)
            int r12 = r0.length
            if (r12 <= r10) goto L_0x01ee
            int r12 = r0.length
            int r12 = r12 - r7
            r0 = r0[r12]
            java.lang.String r12 = "get(...)"
            kotlin.jvm.internal.o.d(r0, r12)
            int r12 = r0.length()
            int r12 = r12 - r10
            r13 = r8
            r14 = r13
        L_0x01bc:
            if (r13 > r12) goto L_0x01e3
            if (r14 != 0) goto L_0x01c2
            r7 = r13
            goto L_0x01c3
        L_0x01c2:
            r7 = r12
        L_0x01c3:
            char r7 = r0.charAt(r7)
            r9 = 32
            int r7 = kotlin.jvm.internal.o.f(r7, r9)
            if (r7 > 0) goto L_0x01d1
            r7 = r10
            goto L_0x01d2
        L_0x01d1:
            r7 = r8
        L_0x01d2:
            if (r14 != 0) goto L_0x01dd
            if (r7 != 0) goto L_0x01da
            r14 = r10
        L_0x01d7:
            r7 = 2
            r9 = 0
            goto L_0x01bc
        L_0x01da:
            int r13 = r13 + 1
            goto L_0x01d7
        L_0x01dd:
            if (r7 != 0) goto L_0x01e0
            goto L_0x01e3
        L_0x01e0:
            int r12 = r12 + -1
            goto L_0x01d7
        L_0x01e3:
            int r12 = r12 + r10
            java.lang.CharSequence r0 = r0.subSequence(r13, r12)
            java.lang.String r0 = r0.toString()
        L_0x01ec:
            r7 = r0
            goto L_0x01f1
        L_0x01ee:
            java.lang.String r0 = ""
            goto L_0x01ec
        L_0x01f1:
            r16 = 6
            r17 = 0
            r14 = 0
            r0 = 0
            r12 = r11
            r13 = r7
            r9 = r15
            r15 = r0
            int r19 = kotlin.text.o.b0(r12, r13, r14, r15, r16, r17)
            r0 = 16384(0x4000, float:2.2959E-41)
            int r0 = android.text.TextUtils.getCapsMode(r11, r9, r0)
            if (r0 == 0) goto L_0x0209
            r15 = r10
            goto L_0x020a
        L_0x0209:
            r15 = r8
        L_0x020a:
            java.lang.String r0 = r1.$change
            boolean r0 = ch.icoaching.wrio.autocorrect.e.b(r0)
            if (r0 != 0) goto L_0x021e
            ch.icoaching.wrio.autocorrect.DefaultAutocorrectionController r0 = r1.this$0
            boolean r0 = r0.f9300o
            if (r0 == 0) goto L_0x021b
            goto L_0x021e
        L_0x021b:
            r14 = r5
            goto L_0x03d1
        L_0x021e:
            ch.icoaching.wrio.autocorrect.DefaultAutocorrectionController r0 = r1.this$0     // Catch:{ Exception -> 0x022a }
            ch.icoaching.wrio.input.i r0 = r0.f9292g     // Catch:{ Exception -> 0x022a }
            r12 = r15 ^ 1
            r0.e(r5, r12)     // Catch:{ Exception -> 0x022a }
            goto L_0x0249
        L_0x022a:
            r0 = move-exception
            ch.icoaching.wrio.logging.Log r12 = ch.icoaching.wrio.logging.Log.f10572a
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "onInputContentChange() :: Error updating times typed for: '"
            r13.append(r14)
            r13.append(r5)
            java.lang.String r14 = "' and "
            r13.append(r14)
            r13.append(r15)
            java.lang.String r13 = r13.toString()
            r12.e(r4, r13, r0)
        L_0x0249:
            ch.icoaching.wrio.autocorrect.DefaultAutocorrectionController r0 = r1.this$0
            java.util.List r0 = r0.f9306u
            java.util.Locale r12 = java.util.Locale.ROOT
            java.lang.String r12 = r5.toLowerCase(r12)
            java.lang.String r13 = "toLowerCase(...)"
            kotlin.jvm.internal.o.d(r12, r13)
            java.lang.CharSequence r12 = ch.icoaching.wrio.util.g.b(r12)
            boolean r0 = kotlin.collections.C0718m.L(r0, r12)
            if (r0 != 0) goto L_0x038e
            ch.icoaching.wrio.autocorrect.usecase.GetCorrectionsUseCase$a r0 = new ch.icoaching.wrio.autocorrect.usecase.GetCorrectionsUseCase$a
            r22 = r15 ^ 1
            r12 = r0
            r13 = r11
            r14 = r18
            r11 = r15
            r15 = r5
            r16 = r9
            r17 = r7
            r18 = r19
            r19 = r22
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            ch.icoaching.wrio.autocorrect.usecase.GetCorrectionsUseCase r12 = new ch.icoaching.wrio.autocorrect.usecase.GetCorrectionsUseCase
            ch.icoaching.wrio.autocorrect.DefaultAutocorrectionController r13 = r1.this$0
            kotlinx.coroutines.CoroutineDispatcher r13 = r13.f9286a
            ch.icoaching.wrio.autocorrect.DefaultAutocorrectionController r14 = r1.this$0
            ch.icoaching.wrio.autocorrect.AutocorrectFacade r14 = r14.f9298m
            r12.<init>(r13, r14)
            r1.L$0 = r5
            r1.L$1 = r7
            r1.I$0 = r9
            r1.I$1 = r11
            r1.I$2 = r8
            r1.label = r10
            java.lang.Object r0 = r12.b(r0, r1)
            if (r0 != r2) goto L_0x029d
            return r2
        L_0x029d:
            r14 = r5
            r13 = r7
            r5 = r8
            r12 = r9
        L_0x02a1:
            ch.icoaching.wrio.autocorrect.usecase.GetCorrectionsUseCase$b r0 = (ch.icoaching.wrio.autocorrect.usecase.GetCorrectionsUseCase.b) r0
            ch.icoaching.wrio.logging.Log r7 = ch.icoaching.wrio.logging.Log.f10572a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r15 = "onInputContentChange() :: Step 3: '"
            r9.append(r15)
            r9.append(r0)
            r9.append(r6)
            boolean r6 = r1.$isEmojiTriggered
            r9.append(r6)
            java.lang.String r24 = r9.toString()
            r26 = 4
            r27 = 0
            java.lang.String r23 = "DefaultAutocorrectController"
            r25 = 0
            r22 = r7
            ch.icoaching.wrio.logging.Log.d(r22, r23, r24, r25, r26, r27)
            ch.icoaching.wrio.autocorrect.DefaultAutocorrectionController r6 = r1.this$0
            java.lang.String r6 = r6.f9308w
            boolean r6 = kotlin.jvm.internal.o.a(r14, r6)
            if (r6 == 0) goto L_0x02f5
            ch.icoaching.wrio.autocorrect.DefaultAutocorrectionController r6 = r1.this$0
            int r6 = r6.f9307v
            if (r12 != r6) goto L_0x02f5
            r26 = 4
            r27 = 0
            java.lang.String r23 = "DefaultAutocorrectController"
            java.lang.String r24 = "onInputContentChange() :: Detected an unwanted correction"
            r25 = 0
            r22 = r7
            ch.icoaching.wrio.logging.Log.d(r22, r23, r24, r25, r26, r27)
            ch.icoaching.wrio.autocorrect.DefaultAutocorrectionController r0 = r1.this$0
            r0.e(r14, r8)
            r2 = 0
            return r2
        L_0x02f5:
            ch.icoaching.wrio.autocorrect.DefaultAutocorrectionController r6 = r1.this$0
            r6.f9308w = r14
            ch.icoaching.wrio.autocorrect.DefaultAutocorrectionController r6 = r1.this$0
            r6.f9307v = r12
            if (r0 == 0) goto L_0x038b
            ch.icoaching.wrio.autocorrect.DefaultAutocorrectionController r4 = r1.this$0
            long r5 = android.os.SystemClock.elapsedRealtime()
            r4.f9305t = r5
            ch.icoaching.wrio.autocorrect.DefaultAutocorrectionController r4 = r1.this$0
            android.view.inputmethod.CorrectionInfo r5 = r0.b()
            java.lang.CharSequence r5 = r5.getNewText()
            java.lang.String r6 = "getNewText(...)"
            kotlin.jvm.internal.o.d(r5, r6)
            java.lang.CharSequence r5 = ch.icoaching.wrio.util.g.b(r5)
            java.lang.String r5 = r5.toString()
            r4.f9309x = r5
            ch.icoaching.wrio.autocorrect.DefaultAutocorrectionController r4 = r1.this$0
            ch.icoaching.wrio.input.c r4 = r4.f9289d
            android.view.inputmethod.CorrectionInfo r5 = r0.b()
            boolean r6 = r1.$isEmojiTriggered
            r1.L$0 = r14
            r1.L$1 = r0
            r1.I$0 = r11
            r7 = 2
            r1.label = r7
            java.lang.Object r4 = r4.t(r5, r6, r8, r1)
            if (r4 != r2) goto L_0x0340
            return r2
        L_0x0340:
            r2 = r0
            r0 = r11
        L_0x0342:
            ch.icoaching.wrio.input.t r4 = (ch.icoaching.wrio.input.t) r4
            if (r4 == 0) goto L_0x038a
            c.a r5 = c.C0488a.c()
            android.view.inputmethod.CorrectionInfo r6 = r2.b()
            r5.b(r6)
            ch.icoaching.wrio.autocorrect.DefaultAutocorrectionController r5 = r1.this$0
            ch.icoaching.wrio.autocorrect.c$a r5 = r5.f9299n
            if (r5 == 0) goto L_0x0364
            android.view.inputmethod.CorrectionInfo r6 = r2.b()
            ch.icoaching.wrio.autocorrect.d r7 = r2.a()
            r5.a(r6, r7)
        L_0x0364:
            ch.icoaching.wrio.autocorrect.DefaultAutocorrectionController r5 = r1.this$0
            ch.icoaching.wrio.autocorrect.d r2 = r2.a()
            java.util.List r2 = r2.a()
            java.lang.Object r2 = kotlin.collections.C0718m.S(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r0 != 0) goto L_0x0377
            r8 = r10
        L_0x0377:
            r5.n(r14, r2, r8)
            ch.icoaching.wrio.autocorrect.DefaultAutocorrectionController r0 = r1.this$0
            ch.icoaching.wrio.language.d r0 = r0.f9290e
            java.lang.String r2 = ch.icoaching.wrio.Y.d(r14)
            kotlin.jvm.internal.o.d(r2, r3)
            r0.h(r2)
        L_0x038a:
            return r4
        L_0x038b:
            r8 = r5
            r7 = r13
            goto L_0x03b0
        L_0x038e:
            ch.icoaching.wrio.logging.Log r11 = ch.icoaching.wrio.logging.Log.f10572a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "onInputContentChange() :: Correction of "
            r0.append(r2)
            r0.append(r5)
            java.lang.String r2 = " already undone; not correcting it again."
            r0.append(r2)
            java.lang.String r13 = r0.toString()
            r15 = 4
            r16 = 0
            java.lang.String r12 = "DefaultAutocorrectController"
            r14 = 0
            ch.icoaching.wrio.logging.Log.d(r11, r12, r13, r14, r15, r16)
            r14 = r5
        L_0x03b0:
            if (r8 != 0) goto L_0x03d1
            ch.icoaching.wrio.logging.Log r22 = ch.icoaching.wrio.logging.Log.f10572a
            r26 = 4
            r27 = 0
            java.lang.String r23 = "DefaultAutocorrectController"
            java.lang.String r24 = "onInputContentChange() :: word not added previously"
            r25 = 0
            ch.icoaching.wrio.logging.Log.d(r22, r23, r24, r25, r26, r27)
            ch.icoaching.wrio.autocorrect.DefaultAutocorrectionController r0 = r1.this$0
            ch.icoaching.wrio.language.d r0 = r0.f9290e
            java.lang.String r2 = ch.icoaching.wrio.Y.d(r14)
            kotlin.jvm.internal.o.d(r2, r3)
            r0.h(r2)
        L_0x03d1:
            ch.icoaching.wrio.autocorrect.DefaultAutocorrectionController r0 = r1.this$0
            r0.f9300o = r10
            ch.icoaching.wrio.autocorrect.DefaultAutocorrectionController r0 = r1.this$0
            ch.icoaching.wrio.input.j r0 = r0.f9303r
            if (r0 == 0) goto L_0x03fe
            boolean r0 = r0.f()
            if (r0 != r10) goto L_0x03fe
            boolean r0 = c.C0490c.c()
            if (r0 == 0) goto L_0x03fe
            e2.a r0 = new e2.a
            r0.<init>()
            boolean r0 = r0.a(r14)
            if (r0 != 0) goto L_0x03fe
            ch.icoaching.wrio.autocorrect.DefaultAutocorrectionController r0 = r1.this$0     // Catch:{ Exception -> 0x0400 }
            ch.icoaching.wrio.input.i r0 = r0.f9292g     // Catch:{ Exception -> 0x0400 }
            r0.j(r7, r14)     // Catch:{ Exception -> 0x0400 }
        L_0x03fe:
            r2 = 0
            goto L_0x0425
        L_0x0400:
            r0 = move-exception
            ch.icoaching.wrio.logging.Log r2 = ch.icoaching.wrio.logging.Log.f10572a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "onInputContentChange() :: Error updating bi-grams typed for: '"
            r3.append(r5)
            r3.append(r7)
            java.lang.String r5 = "' and '"
            r3.append(r5)
            r3.append(r14)
            r5 = 39
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r2.e(r4, r3, r0)
            goto L_0x03fe
        L_0x0425:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.autocorrect.DefaultAutocorrectionController$onInputContentChange$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(D d4, c<? super t> cVar) {
        return ((DefaultAutocorrectionController$onInputContentChange$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
