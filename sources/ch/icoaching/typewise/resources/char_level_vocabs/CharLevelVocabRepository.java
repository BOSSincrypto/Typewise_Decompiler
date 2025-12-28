package ch.icoaching.typewise.resources.char_level_vocabs;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.c;

public final class CharLevelVocabRepository {

    /* renamed from: a  reason: collision with root package name */
    private final Map f8862a = new LinkedHashMap();

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(ch.icoaching.typewise.resources.char_level_vocabs.a r6, java.lang.String r7, kotlin.coroutines.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof ch.icoaching.typewise.resources.char_level_vocabs.CharLevelVocabRepository$getCharLevelVocabByInfo$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            ch.icoaching.typewise.resources.char_level_vocabs.CharLevelVocabRepository$getCharLevelVocabByInfo$1 r0 = (ch.icoaching.typewise.resources.char_level_vocabs.CharLevelVocabRepository$getCharLevelVocabByInfo$1) r0
            int r1 = r0.f8869g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8869g = r1
            goto L_0x0018
        L_0x0013:
            ch.icoaching.typewise.resources.char_level_vocabs.CharLevelVocabRepository$getCharLevelVocabByInfo$1 r0 = new ch.icoaching.typewise.resources.char_level_vocabs.CharLevelVocabRepository$getCharLevelVocabByInfo$1
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f8867e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f8869g
            r3 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 != r3) goto L_0x0039
            java.lang.Object r6 = r0.f8866d
            ch.icoaching.typewise.resources.char_level_vocabs.a r6 = (ch.icoaching.typewise.resources.char_level_vocabs.a) r6
            java.lang.Object r7 = r0.f8865c
            java.util.Map r7 = (java.util.Map) r7
            java.lang.Object r1 = r0.f8864b
            ch.icoaching.typewise.resources.char_level_vocabs.a r1 = (ch.icoaching.typewise.resources.char_level_vocabs.a) r1
            java.lang.Object r0 = r0.f8863a
            ch.icoaching.typewise.resources.char_level_vocabs.CharLevelVocabRepository r0 = (ch.icoaching.typewise.resources.char_level_vocabs.CharLevelVocabRepository) r0
            kotlin.f.b(r8)
            goto L_0x0066
        L_0x0039:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0041:
            kotlin.f.b(r8)
            java.util.Map r8 = r5.f8862a
            boolean r8 = r8.containsKey(r6)
            if (r8 != 0) goto L_0x006b
            java.util.Map r8 = r5.f8862a
            ch.icoaching.typewise.resources.char_level_vocabs.CharLevelVocab$Companion r2 = ch.icoaching.typewise.resources.char_level_vocabs.CharLevelVocab.f8846d
            r0.f8863a = r5
            r0.f8864b = r6
            r0.f8865c = r8
            r0.f8866d = r6
            r0.f8869g = r3
            java.lang.Object r7 = r2.a(r6, r7, r0)
            if (r7 != r1) goto L_0x0061
            return r1
        L_0x0061:
            r0 = r5
            r1 = r6
            r4 = r8
            r8 = r7
            r7 = r4
        L_0x0066:
            r7.put(r6, r8)
            r6 = r1
            goto L_0x006c
        L_0x006b:
            r0 = r5
        L_0x006c:
            java.util.Map r7 = r0.f8862a
            java.lang.Object r6 = r7.get(r6)
            kotlin.jvm.internal.o.b(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.resources.char_level_vocabs.CharLevelVocabRepository.a(ch.icoaching.typewise.resources.char_level_vocabs.a, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    public final Object b(String str, String str2, c cVar) {
        return a(a.f8870e.a(str, str2), str2, cVar);
    }
}
