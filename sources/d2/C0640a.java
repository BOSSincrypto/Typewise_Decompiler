package d2;

import e3.c;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: d2.a  reason: case insensitive filesystem */
public class C0640a {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f13557a = Pattern.compile("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])");

    public String a(String str) {
        if (c.j(str)) {
            return "";
        }
        Matcher matcher = f13557a.matcher(str);
        if (!matcher.find()) {
            return "";
        }
        return c.s(str, matcher.start(), matcher.end());
    }

    public boolean b(String str) {
        if (c.j(str)) {
            return false;
        }
        return f13557a.matcher(str).find();
    }
}
