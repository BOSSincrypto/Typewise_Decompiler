package C0;

import kotlin.jvm.internal.o;
import kotlin.text.Regex;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Regex f222a = new Regex("!|\\?|\\.|\\n|\\r|[\\u00a9\\u00ae\\u203c\\u2049\\u2122\\u2139\\u2194-↙\\u21a9-↪\\u231a-⌛\\u2328\\u23cf\\u23e9-⏳\\u23f8-⏺\\u24c2\\u25aa-▫\\u25b6\\u25c0\\u25fb-◾\\u2600-☄\\u260e\\u2611\\u2614-☕\\u2618\\u261d\\u2620\\u2622-☣\\u2626\\u262a\\u262e-☯\\u2638-☺\\u2648-♓\\u2660\\u2663\\u2665-♦\\u2668\\u267b\\u267f\\u2692-⚔\\u2696-⚗\\u2699\\u269b-⚜\\u26a0-⚡\\u26aa-⚫\\u26b0-⚱\\u26bd-⚾\\u26c4-⛅\\u26c8\\u26ce-⛏\\u26d1\\u26d3-⛔\\u26e9-⛪\\u26f0-⛵\\u26f7-⛺\\u26fd\\u2702\\u2705\\u2708-✍\\u270f\\u2712\\u2714\\u2716\\u271d\\u2721\\u2728\\u2733-✴\\u2744\\u2747\\u274c\\u274e\\u2753-❕\\u2757\\u2763-❤\\u2795-➗\\u27a1\\u27b0\\u27bf\\u2934-⤵\\u2b05-⬇\\u2b1b-⬜\\u2b50\\u2b55\\u3030\\u303d\\u3297\\u3299\\ud83c\\udc04\\ud83c\\udccf\\ud83c\\udd70-\\ud83c\\udd71\\ud83c\\udd7e-\\ud83c\\udd7f\\ud83c\\udd8e\\ud83c\\udd91-\\ud83c\\udd9a\\ud83c\\ude01-\\ud83c\\ude02\\ud83c\\ude1a\\ud83c\\ude2f\\ud83c\\ude32-\\ud83c\\ude3a\\ud83c\\ude50-\\ud83c\\ude51\\u200d\\ud83c\\udf00-\\ud83d\\uddff\\ud83d\\ude00-\\ud83d\\ude4f\\ud83d\\ude80-\\ud83d\\udeff\\ud83e\\udd00-\\ud83e\\uddff\\udb40\\udc20-\\udb40\\udc7f]|\\u200d[\\u2640\\u2642]|[\\ud83c\\udde6-\\ud83c\\uddff]{2}|.[\\u20e0\\u20e3\\ufe0f]+");

    /* renamed from: b  reason: collision with root package name */
    private final Regex f223b = new Regex(" |\\\\|\\/|\\+|=|&|-|\\n|\\r|[\\u00a9\\u00ae\\u203c\\u2049\\u2122\\u2139\\u2194-↙\\u21a9-↪\\u231a-⌛\\u2328\\u23cf\\u23e9-⏳\\u23f8-⏺\\u24c2\\u25aa-▫\\u25b6\\u25c0\\u25fb-◾\\u2600-☄\\u260e\\u2611\\u2614-☕\\u2618\\u261d\\u2620\\u2622-☣\\u2626\\u262a\\u262e-☯\\u2638-☺\\u2648-♓\\u2660\\u2663\\u2665-♦\\u2668\\u267b\\u267f\\u2692-⚔\\u2696-⚗\\u2699\\u269b-⚜\\u26a0-⚡\\u26aa-⚫\\u26b0-⚱\\u26bd-⚾\\u26c4-⛅\\u26c8\\u26ce-⛏\\u26d1\\u26d3-⛔\\u26e9-⛪\\u26f0-⛵\\u26f7-⛺\\u26fd\\u2702\\u2705\\u2708-✍\\u270f\\u2712\\u2714\\u2716\\u271d\\u2721\\u2728\\u2733-✴\\u2744\\u2747\\u274c\\u274e\\u2753-❕\\u2757\\u2763-❤\\u2795-➗\\u27a1\\u27b0\\u27bf\\u2934-⤵\\u2b05-⬇\\u2b1b-⬜\\u2b50\\u2b55\\u3030\\u303d\\u3297\\u3299\\ud83c\\udc04\\ud83c\\udccf\\ud83c\\udd70-\\ud83c\\udd71\\ud83c\\udd7e-\\ud83c\\udd7f\\ud83c\\udd8e\\ud83c\\udd91-\\ud83c\\udd9a\\ud83c\\ude01-\\ud83c\\ude02\\ud83c\\ude1a\\ud83c\\ude2f\\ud83c\\ude32-\\ud83c\\ude3a\\ud83c\\ude50-\\ud83c\\ude51\\u200d\\ud83c\\udf00-\\ud83d\\uddff\\ud83d\\ude00-\\ud83d\\ude4f\\ud83d\\ude80-\\ud83d\\udeff\\ud83e\\udd00-\\ud83e\\uddff\\udb40\\udc20-\\udb40\\udc7f]|\\u200d[\\u2640\\u2642]|[\\ud83c\\udde6-\\ud83c\\uddff]{2}|.[\\u20e0\\u20e3\\ufe0f]+");

    /* renamed from: c  reason: collision with root package name */
    private final Regex f224c = new Regex("[\\u00a9\\u00ae\\u203c\\u2049\\u2122\\u2139\\u2194-↙\\u21a9-↪\\u231a-⌛\\u2328\\u23cf\\u23e9-⏳\\u23f8-⏺\\u24c2\\u25aa-▫\\u25b6\\u25c0\\u25fb-◾\\u2600-☄\\u260e\\u2611\\u2614-☕\\u2618\\u261d\\u2620\\u2622-☣\\u2626\\u262a\\u262e-☯\\u2638-☺\\u2648-♓\\u2660\\u2663\\u2665-♦\\u2668\\u267b\\u267f\\u2692-⚔\\u2696-⚗\\u2699\\u269b-⚜\\u26a0-⚡\\u26aa-⚫\\u26b0-⚱\\u26bd-⚾\\u26c4-⛅\\u26c8\\u26ce-⛏\\u26d1\\u26d3-⛔\\u26e9-⛪\\u26f0-⛵\\u26f7-⛺\\u26fd\\u2702\\u2705\\u2708-✍\\u270f\\u2712\\u2714\\u2716\\u271d\\u2721\\u2728\\u2733-✴\\u2744\\u2747\\u274c\\u274e\\u2753-❕\\u2757\\u2763-❤\\u2795-➗\\u27a1\\u27b0\\u27bf\\u2934-⤵\\u2b05-⬇\\u2b1b-⬜\\u2b50\\u2b55\\u3030\\u303d\\u3297\\u3299\\ud83c\\udc04\\ud83c\\udccf\\ud83c\\udd70-\\ud83c\\udd71\\ud83c\\udd7e-\\ud83c\\udd7f\\ud83c\\udd8e\\ud83c\\udd91-\\ud83c\\udd9a\\ud83c\\ude01-\\ud83c\\ude02\\ud83c\\ude1a\\ud83c\\ude2f\\ud83c\\ude32-\\ud83c\\ude3a\\ud83c\\ude50-\\ud83c\\ude51\\u200d\\ud83c\\udf00-\\ud83d\\uddff\\ud83d\\ude00-\\ud83d\\ude4f\\ud83d\\ude80-\\ud83d\\udeff\\ud83e\\udd00-\\ud83e\\uddff\\udb40\\udc20-\\udb40\\udc7f]|\\u200d[\\u2640\\u2642]|[\\ud83c\\udde6-\\ud83c\\uddff]{2}|.[\\u20e0\\u20e3\\ufe0f]+");

    public final boolean a(String str) {
        o.e(str, "text");
        return this.f224c.matches(str);
    }

    public final boolean b(String str) {
        o.e(str, "context");
        String obj = kotlin.text.o.U0(str).toString();
        int length = obj.length();
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = obj.charAt(i4);
            if (this.f222a.matches(String.valueOf(charAt))) {
                return true;
            }
            if (Character.isLetter(charAt)) {
                return false;
            }
        }
        return false;
    }

    public final String c(String str) {
        o.e(str, "stringIn");
        return this.f224c.replace((CharSequence) str, " ");
    }

    public final String[] d(String str) {
        o.e(str, "text");
        return (String[]) this.f223b.split(str, 0).toArray(new String[0]);
    }
}
