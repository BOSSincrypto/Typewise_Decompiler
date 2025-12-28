package ch.icoaching.typewise.language_modelling.modelling.sentence_completion;

import F2.b;
import F2.m;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.c;
import kotlin.jvm.internal.i;
import l2.f;

@m
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lch/icoaching/typewise/language_modelling/modelling/sentence_completion/PositionFilter;", "", "", "code", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "a", "BEGINNING_OF_EMAIL", "BEGINNING_OF_PARAGRAPH", "BEGINNING_OF_SENTENCE", "ANYWHERE", "typewise-autocorrect-library-predictions-3.0.19(161)_release"}, k = 1, mv = {2, 0, 0})
public enum PositionFilter {
    BEGINNING_OF_EMAIL("beginning_of_email"),
    BEGINNING_OF_PARAGRAPH("beginning_of_paragraph"),
    BEGINNING_OF_SENTENCE("beginning_of_sentence"),
    ANYWHERE("anywhere");
    
    public static final a Companion = null;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final f f8722a = null;
    private final String code;

    public static final class a {
        private a() {
        }

        private final /* synthetic */ b a() {
            return (b) PositionFilter.f8722a.getValue();
        }

        public final b serializer() {
            return a();
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    static {
        PositionFilter[] b4;
        f8724c = kotlin.enums.a.a(b4);
        Companion = new a((i) null);
        f8722a = c.a(LazyThreadSafetyMode.PUBLICATION, new a());
    }

    private PositionFilter(String str) {
        this.code = str;
    }
}
