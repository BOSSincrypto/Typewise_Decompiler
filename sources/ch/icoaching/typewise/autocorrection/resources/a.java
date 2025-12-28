package ch.icoaching.typewise.autocorrection.resources;

import com.ibm.icu.util.ULocale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.D;
import kotlin.jvm.internal.o;
import l2.g;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Map f7926a;

    static {
        Pair a4 = g.a('a', 'a');
        Pair a5 = g.a(228, 'a');
        Pair a6 = g.a(224, 'a');
        Pair a7 = g.a(225, 'a');
        Pair a8 = g.a(226, 'a');
        Pair a9 = g.a(230, 'a');
        Pair a10 = g.a(227, 'a');
        Pair a11 = g.a(229, 'a');
        Pair a12 = g.a(257, 'a');
        Pair a13 = g.a(261, 'a');
        Pair a14 = g.a(259, 'a');
        Pair a15 = g.a('b', 'b');
        Pair a16 = g.a(231, 'c');
        Pair a17 = g.a(263, 'c');
        Pair a18 = g.a(269, 'c');
        Pair a19 = g.a(265, 'c');
        Pair a20 = g.a(273, 'd');
        Pair a21 = g.a(271, 'd');
        Pair a22 = g.a(240, 'd');
        Pair a23 = g.a(275, 'e');
        Pair a24 = g.a(233, 'e');
        Pair a25 = g.a(232, 'e');
        Pair a26 = g.a(234, 'e');
        Pair a27 = g.a(235, 'e');
        Pair a28 = g.a(279, 'e');
        Pair a29 = g.a(283, 'e');
        Pair a30 = g.a(281, 'e');
        Pair a31 = g.a(285, 'g');
        Pair a32 = g.a(291, 'g');
        Pair a33 = g.a(287, 'g');
        Pair a34 = g.a(293, 'h');
        Pair a35 = g.a(238, 'i');
        Pair a36 = g.a(239, 'i');
        Pair a37 = g.a(237, 'i');
        Pair a38 = g.a(299, 'i');
        Pair a39 = g.a(236, 'i');
        Pair a40 = g.a(303, 'i');
        Pair a41 = g.a(305, 'i');
        Pair a42 = g.a(309, 'j');
        Pair a43 = g.a(311, 'k');
        Pair a44 = g.a(320, 'l');
        Pair a45 = g.a(619, 'l');
        Pair a46 = g.a(316, 'l');
        Pair a47 = g.a(314, 'l');
        Pair a48 = g.a(318, 'l');
        Pair a49 = g.a(322, 'l');
        Pair a50 = g.a(241, 'n');
        Pair a51 = g.a(324, 'n');
        Pair a52 = g.a(328, 'n');
        Pair a53 = g.a(326, 'n');
        Pair a54 = g.a(246, 'o');
        Pair a55 = g.a(244, 'o');
        Pair a56 = g.a(242, 'o');
        Pair a57 = g.a(243, 'o');
        Pair a58 = g.a(245, 'o');
        Pair a59 = g.a(339, 'o');
        Pair a60 = g.a(248, 'o');
        Pair a61 = g.a(333, 'o');
        Pair a62 = g.a(337, 'o');
        Pair a63 = g.a(417, 'o');
        Pair a64 = g.a(345, 'r');
        Pair a65 = g.a(341, 'r');
        Pair a66 = g.a(223, 's');
        Pair a67 = g.a(347, 's');
        Pair a68 = g.a(353, 's');
        Pair a69 = g.a(349, 's');
        Pair a70 = g.a(537, 's');
        Pair a71 = g.a(351, 's');
        Pair a72 = g.a(357, 't');
        Pair a73 = g.a(254, 't');
        Pair a74 = g.a(539, 't');
        Pair a75 = g.a(355, 't');
        Character valueOf = Character.valueOf(ULocale.UNICODE_LOCALE_EXTENSION);
        f7926a = D.j(a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27, a28, a29, a30, a31, a32, a33, a34, a35, a36, a37, a38, a39, a40, a41, a42, a43, a44, a45, a46, a47, a48, a49, a50, a51, a52, a53, a54, a55, a56, a57, a58, a59, a60, a61, a62, a63, a64, a65, a66, a67, a68, a69, a70, a71, a72, a73, a74, a75, g.a(252, valueOf), g.a(251, valueOf), g.a(249, valueOf), g.a(250, valueOf), g.a(369, valueOf), g.a(363, valueOf), g.a(371, valueOf), g.a(367, valueOf), g.a(432, valueOf), g.a(365, valueOf), g.a(255, 'y'), g.a(253, 'y'), g.a(382, 'z'), g.a(380, 'z'), g.a(378, 'z'));
    }

    public static final char a(char c4) {
        Character ch2 = (Character) f7926a.get(Character.valueOf(c4));
        return ch2 != null ? ch2.charValue() : c4;
    }

    public static final String b(String str) {
        o.e(str, "<this>");
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            sb.append(a(str.charAt(i4)));
        }
        String sb2 = sb.toString();
        o.d(sb2, "toString(...)");
        return sb2;
    }
}
