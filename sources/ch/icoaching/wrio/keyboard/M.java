package ch.icoaching.wrio.keyboard;

public abstract class M {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        if (r1.equals("sr") != false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (r1.equals("sq") == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0041, code lost:
        if (r1.equals("sl") == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
        if (r1.equals("sk") == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0053, code lost:
        if (r1.equals("hu") == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        if (r1.equals("hr") == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0065, code lost:
        if (r1.equals("fr") == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0071, code lost:
        if (r1.equals("de") == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007a, code lost:
        if (r1.equals("cs") == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
        if (r1.equals("pl-qwertz") == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return ch.icoaching.wrio.keyboard.layout.Layout.AZERTY;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return ch.icoaching.wrio.keyboard.layout.Layout.QWERTZ;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        if (r1.equals("nl-be") == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (r1.equals("fr-ch") == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (r1.equals("de-ch") == false) goto L_0x0089;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final ch.icoaching.wrio.keyboard.layout.Layout a(java.lang.String r1) {
        /*
            if (r1 == 0) goto L_0x0089
            int r0 = r1.hashCode()
            switch(r0) {
                case -990373878: goto L_0x007d;
                case 3184: goto L_0x0074;
                case 3201: goto L_0x006b;
                case 3276: goto L_0x005f;
                case 3338: goto L_0x0056;
                case 3341: goto L_0x004d;
                case 3672: goto L_0x0044;
                case 3673: goto L_0x003b;
                case 3678: goto L_0x0032;
                case 3679: goto L_0x0029;
                case 95407409: goto L_0x001f;
                case 97641734: goto L_0x0015;
                case 104851122: goto L_0x000b;
                default: goto L_0x0009;
            }
        L_0x0009:
            goto L_0x0089
        L_0x000b:
            java.lang.String r0 = "nl-be"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0068
            goto L_0x0089
        L_0x0015:
            java.lang.String r0 = "fr-ch"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0086
            goto L_0x0089
        L_0x001f:
            java.lang.String r0 = "de-ch"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0086
            goto L_0x0089
        L_0x0029:
            java.lang.String r0 = "sr"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0089
            goto L_0x0086
        L_0x0032:
            java.lang.String r0 = "sq"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0086
            goto L_0x0089
        L_0x003b:
            java.lang.String r0 = "sl"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0086
            goto L_0x0089
        L_0x0044:
            java.lang.String r0 = "sk"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0086
            goto L_0x0089
        L_0x004d:
            java.lang.String r0 = "hu"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0086
            goto L_0x0089
        L_0x0056:
            java.lang.String r0 = "hr"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0086
            goto L_0x0089
        L_0x005f:
            java.lang.String r0 = "fr"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0068
            goto L_0x0089
        L_0x0068:
            ch.icoaching.wrio.keyboard.layout.Layout r1 = ch.icoaching.wrio.keyboard.layout.Layout.AZERTY
            goto L_0x008b
        L_0x006b:
            java.lang.String r0 = "de"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0086
            goto L_0x0089
        L_0x0074:
            java.lang.String r0 = "cs"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0086
            goto L_0x0089
        L_0x007d:
            java.lang.String r0 = "pl-qwertz"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0086
            goto L_0x0089
        L_0x0086:
            ch.icoaching.wrio.keyboard.layout.Layout r1 = ch.icoaching.wrio.keyboard.layout.Layout.QWERTZ
            goto L_0x008b
        L_0x0089:
            ch.icoaching.wrio.keyboard.layout.Layout r1 = ch.icoaching.wrio.keyboard.layout.Layout.QWERTY
        L_0x008b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.keyboard.M.a(java.lang.String):ch.icoaching.wrio.keyboard.layout.Layout");
    }
}
