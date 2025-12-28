package e2;

import e3.c;
import java.util.regex.Pattern;

/* renamed from: e2.a  reason: case insensitive filesystem */
public class C0645a {

    /* renamed from: a  reason: collision with root package name */
    private static Pattern f13570a = Pattern.compile("(https?:\\/\\/(?:www\\.|(?!www))[a-zA-Z0-9][a-zA-Z0-9-]+[a-zA-Z0-9]\\.[^\\s]{2,}|www\\.[a-zA-Z0-9][a-zA-Z0-9-]+[a-zA-Z0-9]\\.[^\\s]{2,}|https?:\\/\\/(?:www\\.|(?!www))[a-zA-Z0-9]+\\.[^\\s]{2,}|www\\.[a-zA-Z0-9]+\\.[^\\s]{2,})");

    public boolean a(String str) {
        if (c.j(str)) {
            return false;
        }
        if (c.n(str).startsWith("http:/") || c.n(str).startsWith("https:/") || c.n(str).startsWith("www.")) {
            return true;
        }
        return f13570a.matcher(str).find();
    }
}
