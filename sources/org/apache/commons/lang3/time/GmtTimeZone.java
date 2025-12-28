package org.apache.commons.lang3.time;

import java.util.Date;
import java.util.TimeZone;

class GmtTimeZone extends TimeZone {
    static final long serialVersionUID = 1;
    private final int offset;
    private final String zoneId;

    GmtTimeZone(boolean z3, int i4, int i5) {
        char c4;
        if (i4 >= 24) {
            throw new IllegalArgumentException(i4 + " hours out of range");
        } else if (i5 < 60) {
            int i6 = ((i4 * 60) + i5) * 60000;
            this.offset = z3 ? -i6 : i6;
            StringBuilder sb = new StringBuilder(9);
            sb.append("GMT");
            if (z3) {
                c4 = '-';
            } else {
                c4 = '+';
            }
            sb.append(c4);
            StringBuilder b4 = b(sb, i4);
            b4.append(':');
            this.zoneId = b(b4, i5).toString();
        } else {
            throw new IllegalArgumentException(i5 + " minutes out of range");
        }
    }

    private static StringBuilder b(StringBuilder sb, int i4) {
        sb.append((char) ((i4 / 10) + 48));
        sb.append((char) ((i4 % 10) + 48));
        return sb;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof GmtTimeZone) && this.zoneId == ((GmtTimeZone) obj).zoneId) {
            return true;
        }
        return false;
    }

    public String getID() {
        return this.zoneId;
    }

    public int getOffset(int i4, int i5, int i6, int i7, int i8, int i9) {
        return this.offset;
    }

    public int getRawOffset() {
        return this.offset;
    }

    public int hashCode() {
        return this.offset;
    }

    public boolean inDaylightTime(Date date) {
        return false;
    }

    public void setRawOffset(int i4) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return "[GmtTimeZone id=\"" + this.zoneId + "\",offset=" + this.offset + ']';
    }

    public boolean useDaylightTime() {
        return false;
    }
}
