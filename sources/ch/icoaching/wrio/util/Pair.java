package ch.icoaching.wrio.util;

import java.io.Serializable;

public class Pair<F, S> implements Serializable {
    static final long serialVersionUID = 43000;
    public final F first;
    public final S second;

    public Pair(F f4, S s4) {
        this.first = f4;
        this.second = s4;
    }

    public static Pair<String[], String[]> lm(String str, String str2) {
        return new Pair<>(str.split(""), str2.split(""));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        if (!this.first.equals(pair.first) || !this.second.equals(pair.second)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i4;
        F f4 = this.first;
        int i5 = 0;
        if (f4 == null) {
            i4 = 0;
        } else {
            i4 = f4.hashCode();
        }
        int i6 = (i4 + 97601) * 73;
        S s4 = this.second;
        if (s4 != null) {
            i5 = s4.hashCode();
        }
        return i6 + i5;
    }

    public String toString() {
        return "<" + this.first.toString() + ", " + this.second.toString() + ">";
    }
}
