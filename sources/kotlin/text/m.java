package kotlin.text;

import java.util.Iterator;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import z2.c;
import z2.d;

public abstract class m {
    /* access modifiers changed from: private */
    public static final l f(Matcher matcher, int i4, CharSequence charSequence) {
        if (!matcher.find(i4)) {
            return null;
        }
        return new MatcherMatchResult(matcher, charSequence);
    }

    /* access modifiers changed from: private */
    public static final l g(Matcher matcher, CharSequence charSequence) {
        if (!matcher.matches()) {
            return null;
        }
        return new MatcherMatchResult(matcher, charSequence);
    }

    /* access modifiers changed from: private */
    public static final c h(MatchResult matchResult) {
        return d.j(matchResult.start(), matchResult.end());
    }

    /* access modifiers changed from: private */
    public static final c i(MatchResult matchResult, int i4) {
        return d.j(matchResult.start(i4), matchResult.end(i4));
    }

    /* access modifiers changed from: private */
    public static final int j(Iterable iterable) {
        Iterator it = iterable.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 |= ((f) it.next()).getValue();
        }
        return i4;
    }
}
