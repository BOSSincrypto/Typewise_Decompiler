package kotlin.text;

import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.collections.C0707b;
import kotlin.jvm.internal.o;
import z2.c;

final class MatcherMatchResult implements l {

    /* renamed from: a  reason: collision with root package name */
    private final Matcher f13918a;

    /* renamed from: b  reason: collision with root package name */
    private final CharSequence f13919b;

    /* renamed from: c  reason: collision with root package name */
    private final k f13920c = new MatcherMatchResult$groups$1(this);

    /* renamed from: d  reason: collision with root package name */
    private List f13921d;

    public static final class a extends C0707b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MatcherMatchResult f13922a;

        a(MatcherMatchResult matcherMatchResult) {
            this.f13922a = matcherMatchResult;
        }

        public /* bridge */ boolean b(String str) {
            return super.contains(str);
        }

        /* renamed from: c */
        public String get(int i4) {
            String group = this.f13922a.d().group(i4);
            if (group == null) {
                return "";
            }
            return group;
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return b((String) obj);
        }

        public /* bridge */ int d(String str) {
            return super.indexOf(str);
        }

        public /* bridge */ int e(String str) {
            return super.lastIndexOf(str);
        }

        public int getSize() {
            return this.f13922a.d().groupCount() + 1;
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return d((String) obj);
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return e((String) obj);
        }
    }

    public MatcherMatchResult(Matcher matcher, CharSequence charSequence) {
        o.e(matcher, "matcher");
        o.e(charSequence, "input");
        this.f13918a = matcher;
        this.f13919b = charSequence;
    }

    /* access modifiers changed from: private */
    public final MatchResult d() {
        return this.f13918a;
    }

    public List a() {
        if (this.f13921d == null) {
            this.f13921d = new a(this);
        }
        List list = this.f13921d;
        o.b(list);
        return list;
    }

    public c b() {
        return m.h(d());
    }

    public String getValue() {
        String group = d().group();
        o.d(group, "group(...)");
        return group;
    }

    public l next() {
        int i4;
        int end = d().end();
        if (d().end() == d().start()) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        int i5 = end + i4;
        if (i5 > this.f13919b.length()) {
            return null;
        }
        Matcher matcher = this.f13918a.pattern().matcher(this.f13919b);
        o.d(matcher, "matcher(...)");
        return m.f(matcher, i5, this.f13919b);
    }
}
