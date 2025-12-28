package f;

import e3.c;
import f2.C0649a;

/* renamed from: f.a  reason: case insensitive filesystem */
public abstract class C0646a {
    public static String a(String str) {
        if (c.j(str)) {
            return "";
        }
        return C0649a.a(str.trim(), ",").replaceAll("[,]{2}", ",");
    }
}
