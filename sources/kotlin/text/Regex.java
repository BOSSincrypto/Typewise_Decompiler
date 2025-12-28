package kotlin.text;

import B2.e;
import B2.h;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.C0718m;
import kotlin.coroutines.c;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import u2.l;
import z2.d;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0011\u0018\u0000 =2\u00060\u0001j\u0002`\u0002:\u0002>?B\u0011\b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fB\u001f\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0004\b\u0005\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0017J!\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001e2\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b!\u0010\"J!\u0010$\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0019H\u0007¢\u0006\u0004\b$\u0010\u001dJ\u001f\u0010%\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0019H\u0007¢\u0006\u0004\b%\u0010&J\u001d\u0010(\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0007¢\u0006\u0004\b(\u0010)J)\u0010(\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00130*¢\u0006\u0004\b(\u0010,J\u001d\u0010-\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0007¢\u0006\u0004\b-\u0010)J%\u00100\u001a\b\u0012\u0004\u0012\u00020\u00070/2\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010.\u001a\u00020\u0019¢\u0006\u0004\b0\u00101J'\u00102\u001a\b\u0012\u0004\u0012\u00020\u00070\u001e2\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010.\u001a\u00020\u0019H\u0007¢\u0006\u0004\b2\u0010 J\u000f\u00103\u001a\u00020\u0007H\u0016¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\u0003¢\u0006\u0004\b5\u00106R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u00107R\u001e\u00108\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0011\u0010\b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b:\u00104R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r8F¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006@"}, d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Ljava/util/regex/Pattern;", "nativePattern", "<init>", "(Ljava/util/regex/Pattern;)V", "", "pattern", "(Ljava/lang/String;)V", "Lkotlin/text/RegexOption;", "option", "(Ljava/lang/String;Lkotlin/text/RegexOption;)V", "", "options", "(Ljava/lang/String;Ljava/util/Set;)V", "", "writeReplace", "()Ljava/lang/Object;", "", "input", "", "matches", "(Ljava/lang/CharSequence;)Z", "containsMatchIn", "", "startIndex", "Lkotlin/text/l;", "find", "(Ljava/lang/CharSequence;I)Lkotlin/text/l;", "LB2/e;", "findAll", "(Ljava/lang/CharSequence;I)LB2/e;", "matchEntire", "(Ljava/lang/CharSequence;)Lkotlin/text/l;", "index", "matchAt", "matchesAt", "(Ljava/lang/CharSequence;I)Z", "replacement", "replace", "(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;", "Lkotlin/Function1;", "transform", "(Ljava/lang/CharSequence;Lu2/l;)Ljava/lang/String;", "replaceFirst", "limit", "", "split", "(Ljava/lang/CharSequence;I)Ljava/util/List;", "splitToSequence", "toString", "()Ljava/lang/String;", "toPattern", "()Ljava/util/regex/Pattern;", "Ljava/util/regex/Pattern;", "_options", "Ljava/util/Set;", "getPattern", "getOptions", "()Ljava/util/Set;", "Companion", "a", "Serialized", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Regex implements Serializable {
    public static final a Companion = new a((i) null);
    private Set<? extends RegexOption> _options;
    /* access modifiers changed from: private */
    public final Pattern nativePattern;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0002\u0018\u0000 \u00122\u00060\u0001j\u0002`\u0002:\u0001\u0013B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lkotlin/text/Regex$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "pattern", "", "flags", "<init>", "(Ljava/lang/String;I)V", "", "readResolve", "()Ljava/lang/Object;", "Ljava/lang/String;", "getPattern", "()Ljava/lang/String;", "I", "getFlags", "()I", "Companion", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Serialized implements Serializable {
        public static final a Companion = new a((i) null);
        private static final long serialVersionUID = 0;
        private final int flags;
        private final String pattern;

        public static final class a {
            public /* synthetic */ a(i iVar) {
                this();
            }

            private a() {
            }
        }

        public Serialized(String str, int i4) {
            o.e(str, "pattern");
            this.pattern = str;
            this.flags = i4;
        }

        private final Object readResolve() {
            Pattern compile = Pattern.compile(this.pattern, this.flags);
            o.d(compile, "compile(...)");
            return new Regex(compile);
        }

        public final int getFlags() {
            return this.flags;
        }

        public final String getPattern() {
            return this.pattern;
        }
    }

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final int b(int i4) {
            return (i4 & 2) != 0 ? i4 | 64 : i4;
        }

        public final String c(String str) {
            o.e(str, "literal");
            String quote = Pattern.quote(str);
            o.d(quote, "quote(...)");
            return quote;
        }

        private a() {
        }
    }

    public Regex(Pattern pattern) {
        o.e(pattern, "nativePattern");
        this.nativePattern = pattern;
    }

    public static /* synthetic */ l find$default(Regex regex, CharSequence charSequence, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return regex.find(charSequence, i4);
    }

    public static /* synthetic */ e findAll$default(Regex regex, CharSequence charSequence, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return regex.findAll(charSequence, i4);
    }

    public static /* synthetic */ List split$default(Regex regex, CharSequence charSequence, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return regex.split(charSequence, i4);
    }

    public static /* synthetic */ e splitToSequence$default(Regex regex, CharSequence charSequence, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return regex.splitToSequence(charSequence, i4);
    }

    private final Object writeReplace() {
        String pattern = this.nativePattern.pattern();
        o.d(pattern, "pattern(...)");
        return new Serialized(pattern, this.nativePattern.flags());
    }

    public final boolean containsMatchIn(CharSequence charSequence) {
        o.e(charSequence, "input");
        return this.nativePattern.matcher(charSequence).find();
    }

    public final l find(CharSequence charSequence, int i4) {
        o.e(charSequence, "input");
        Matcher matcher = this.nativePattern.matcher(charSequence);
        o.d(matcher, "matcher(...)");
        return m.f(matcher, i4, charSequence);
    }

    public final e findAll(CharSequence charSequence, int i4) {
        o.e(charSequence, "input");
        if (i4 >= 0 && i4 <= charSequence.length()) {
            return h.e(new Regex$findAll$1(this, charSequence, i4), Regex$findAll$2.INSTANCE);
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: " + i4 + ", input length: " + charSequence.length());
    }

    public final Set<RegexOption> getOptions() {
        Set<? extends RegexOption> set = this._options;
        if (set != null) {
            return set;
        }
        int flags = this.nativePattern.flags();
        EnumSet<E> allOf = EnumSet.allOf(RegexOption.class);
        o.b(allOf);
        C0718m.G(allOf, new Regex$special$$inlined$fromInt$1(flags));
        Set<? extends RegexOption> unmodifiableSet = Collections.unmodifiableSet(allOf);
        o.d(unmodifiableSet, "unmodifiableSet(...)");
        this._options = unmodifiableSet;
        return unmodifiableSet;
    }

    public final String getPattern() {
        String pattern = this.nativePattern.pattern();
        o.d(pattern, "pattern(...)");
        return pattern;
    }

    public final l matchAt(CharSequence charSequence, int i4) {
        o.e(charSequence, "input");
        Matcher region = this.nativePattern.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(i4, charSequence.length());
        if (!region.lookingAt()) {
            return null;
        }
        o.b(region);
        return new MatcherMatchResult(region, charSequence);
    }

    public final l matchEntire(CharSequence charSequence) {
        o.e(charSequence, "input");
        Matcher matcher = this.nativePattern.matcher(charSequence);
        o.d(matcher, "matcher(...)");
        return m.g(matcher, charSequence);
    }

    public final boolean matches(CharSequence charSequence) {
        o.e(charSequence, "input");
        return this.nativePattern.matcher(charSequence).matches();
    }

    public final boolean matchesAt(CharSequence charSequence, int i4) {
        o.e(charSequence, "input");
        return this.nativePattern.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(i4, charSequence.length()).lookingAt();
    }

    public final String replace(CharSequence charSequence, String str) {
        o.e(charSequence, "input");
        o.e(str, "replacement");
        String replaceAll = this.nativePattern.matcher(charSequence).replaceAll(str);
        o.d(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public final String replaceFirst(CharSequence charSequence, String str) {
        o.e(charSequence, "input");
        o.e(str, "replacement");
        String replaceFirst = this.nativePattern.matcher(charSequence).replaceFirst(str);
        o.d(replaceFirst, "replaceFirst(...)");
        return replaceFirst;
    }

    public final List<String> split(CharSequence charSequence, int i4) {
        o.e(charSequence, "input");
        StringsKt__StringsKt.o0(i4);
        Matcher matcher = this.nativePattern.matcher(charSequence);
        if (i4 == 1 || !matcher.find()) {
            return C0718m.e(charSequence.toString());
        }
        int i5 = 10;
        if (i4 > 0) {
            i5 = d.d(i4, 10);
        }
        ArrayList arrayList = new ArrayList(i5);
        int i6 = i4 - 1;
        int i7 = 0;
        do {
            arrayList.add(charSequence.subSequence(i7, matcher.start()).toString());
            i7 = matcher.end();
            if ((i6 >= 0 && arrayList.size() == i6) || !matcher.find()) {
                arrayList.add(charSequence.subSequence(i7, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i7, matcher.start()).toString());
            i7 = matcher.end();
            break;
        } while (!matcher.find());
        arrayList.add(charSequence.subSequence(i7, charSequence.length()).toString());
        return arrayList;
    }

    public final e splitToSequence(CharSequence charSequence, int i4) {
        o.e(charSequence, "input");
        StringsKt__StringsKt.o0(i4);
        return h.b(new Regex$splitToSequence$1(this, charSequence, i4, (c<? super Regex$splitToSequence$1>) null));
    }

    public final Pattern toPattern() {
        return this.nativePattern;
    }

    public String toString() {
        String pattern = this.nativePattern.toString();
        o.d(pattern, "toString(...)");
        return pattern;
    }

    public final String replace(CharSequence charSequence, l lVar) {
        o.e(charSequence, "input");
        o.e(lVar, "transform");
        int i4 = 0;
        l find$default = find$default(this, charSequence, 0, 2, (Object) null);
        if (find$default == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append(charSequence, i4, find$default.b().h().intValue());
            sb.append((CharSequence) lVar.invoke(find$default));
            i4 = find$default.b().g().intValue() + 1;
            find$default = find$default.next();
            if (i4 >= length) {
                break;
            }
        } while (find$default != null);
        if (i4 < length) {
            sb.append(charSequence, i4, length);
        }
        String sb2 = sb.toString();
        o.d(sb2, "toString(...)");
        return sb2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Regex(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.o.e(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(...)"
            kotlin.jvm.internal.o.d(r2, r0)
            r1.<init>((java.util.regex.Pattern) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.<init>(java.lang.String):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Regex(java.lang.String r2, kotlin.text.RegexOption r3) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.o.e(r2, r0)
            java.lang.String r0 = "option"
            kotlin.jvm.internal.o.e(r3, r0)
            kotlin.text.Regex$a r0 = Companion
            int r3 = r3.getValue()
            int r3 = r0.b(r3)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            java.lang.String r3 = "compile(...)"
            kotlin.jvm.internal.o.d(r2, r3)
            r1.<init>((java.util.regex.Pattern) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.<init>(java.lang.String, kotlin.text.RegexOption):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Regex(java.lang.String r2, java.util.Set<? extends kotlin.text.RegexOption> r3) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.o.e(r2, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.o.e(r3, r0)
            kotlin.text.Regex$a r0 = Companion
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            int r3 = kotlin.text.m.j(r3)
            int r3 = r0.b(r3)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            java.lang.String r3 = "compile(...)"
            kotlin.jvm.internal.o.d(r2, r3)
            r1.<init>((java.util.regex.Pattern) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.<init>(java.lang.String, java.util.Set):void");
    }
}
