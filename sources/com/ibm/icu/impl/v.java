package com.ibm.icu.impl;

import Y1.h;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public abstract class v {

    /* renamed from: a  reason: collision with root package name */
    private static final Map f13047a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f13048b = h.a("URLHandler");

    private static class a extends v {

        /* renamed from: c  reason: collision with root package name */
        File f13049c;

        a(URL url) {
            try {
                this.f13049c = new File(url.toURI());
            } catch (URISyntaxException unused) {
            }
            File file = this.f13049c;
            if (file == null || !file.exists()) {
                if (v.f13048b) {
                    PrintStream printStream = System.err;
                    printStream.println("file does not exist - " + url.toString());
                }
                throw new IllegalArgumentException();
            }
        }

        private void f(c cVar, boolean z3, boolean z4, String str, File[] fileArr) {
            String str2;
            if (fileArr != null) {
                for (File file : fileArr) {
                    if (!file.isDirectory()) {
                        if (z4) {
                            str2 = file.getName();
                        } else {
                            str2 = str + file.getName();
                        }
                        cVar.a(str2);
                    } else if (z3) {
                        f(cVar, z3, z4, str + file.getName() + '/', file.listFiles());
                    }
                }
            }
        }

        public void e(c cVar, boolean z3, boolean z4) {
            if (this.f13049c.isDirectory()) {
                f(cVar, z3, z4, "/", this.f13049c.listFiles());
                return;
            }
            cVar.a(this.f13049c.getName());
        }
    }

    private static class b extends v {

        /* renamed from: c  reason: collision with root package name */
        JarFile f13050c;

        /* renamed from: d  reason: collision with root package name */
        String f13051d;

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
            r1 = r5.toString();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        b(java.net.URL r5) {
            /*
                r4 = this;
                java.lang.String r0 = "jar"
                r4.<init>()
                java.lang.String r1 = r5.getPath()     // Catch:{ Exception -> 0x001e }
                r4.f13051d = r1     // Catch:{ Exception -> 0x001e }
                java.lang.String r2 = "!/"
                int r1 = r1.lastIndexOf(r2)     // Catch:{ Exception -> 0x001e }
                if (r1 < 0) goto L_0x0020
                java.lang.String r2 = r4.f13051d     // Catch:{ Exception -> 0x001e }
                int r1 = r1 + 2
                java.lang.String r1 = r2.substring(r1)     // Catch:{ Exception -> 0x001e }
                r4.f13051d = r1     // Catch:{ Exception -> 0x001e }
                goto L_0x0020
            L_0x001e:
                r5 = move-exception
                goto L_0x005c
            L_0x0020:
                java.lang.String r1 = r5.getProtocol()     // Catch:{ Exception -> 0x001e }
                boolean r1 = r1.equals(r0)     // Catch:{ Exception -> 0x001e }
                if (r1 != 0) goto L_0x004f
                java.lang.String r1 = r5.toString()     // Catch:{ Exception -> 0x001e }
                java.lang.String r2 = ":"
                int r2 = r1.indexOf(r2)     // Catch:{ Exception -> 0x001e }
                r3 = -1
                if (r2 == r3) goto L_0x004f
                java.net.URL r5 = new java.net.URL     // Catch:{ Exception -> 0x001e }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x001e }
                r3.<init>()     // Catch:{ Exception -> 0x001e }
                r3.append(r0)     // Catch:{ Exception -> 0x001e }
                java.lang.String r0 = r1.substring(r2)     // Catch:{ Exception -> 0x001e }
                r3.append(r0)     // Catch:{ Exception -> 0x001e }
                java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x001e }
                r5.<init>(r0)     // Catch:{ Exception -> 0x001e }
            L_0x004f:
                java.net.URLConnection r5 = r5.openConnection()     // Catch:{ Exception -> 0x001e }
                java.net.JarURLConnection r5 = (java.net.JarURLConnection) r5     // Catch:{ Exception -> 0x001e }
                java.util.jar.JarFile r5 = r5.getJarFile()     // Catch:{ Exception -> 0x001e }
                r4.f13050c = r5     // Catch:{ Exception -> 0x001e }
                return
            L_0x005c:
                boolean r0 = com.ibm.icu.impl.v.f13048b
                if (r0 == 0) goto L_0x0078
                java.io.PrintStream r0 = java.lang.System.err
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "icurb jar error: "
                r1.append(r2)
                r1.append(r5)
                java.lang.String r1 = r1.toString()
                r0.println(r1)
            L_0x0078:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "jar error: "
                r1.append(r2)
                java.lang.String r5 = r5.getMessage()
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0.<init>(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.impl.v.b.<init>(java.net.URL):void");
        }

        public void e(c cVar, boolean z3, boolean z4) {
            try {
                Enumeration<JarEntry> entries = this.f13050c.entries();
                while (entries.hasMoreElements()) {
                    JarEntry nextElement = entries.nextElement();
                    if (!nextElement.isDirectory()) {
                        String name = nextElement.getName();
                        if (name.startsWith(this.f13051d)) {
                            String substring = name.substring(this.f13051d.length());
                            int lastIndexOf = substring.lastIndexOf(47);
                            if (lastIndexOf <= 0 || z3) {
                                if (z4 && lastIndexOf != -1) {
                                    substring = substring.substring(lastIndexOf + 1);
                                }
                                cVar.a(substring);
                            }
                        }
                    }
                }
            } catch (Exception e4) {
                if (v.f13048b) {
                    PrintStream printStream = System.err;
                    printStream.println("icurb jar error: " + e4);
                }
            }
        }
    }

    public interface c {
        void a(String str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.util.HashMap} */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.Map] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r2v9, types: [java.util.Map] */
    /* JADX WARNING: type inference failed for: r2v18 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d2 A[Catch:{ all -> 0x00d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00dc A[SYNTHETIC, Splitter:B:56:0x00dc] */
    /* JADX WARNING: Unknown variable types count: 1 */
    static {
        /*
            r0 = 0
            r1 = 1
            java.lang.String r2 = "URLHandler"
            boolean r2 = Y1.h.a(r2)
            f13048b = r2
            r2 = 0
            java.lang.Class<com.ibm.icu.impl.v> r3 = com.ibm.icu.impl.v.class
            java.lang.ClassLoader r3 = Y1.f.c(r3)     // Catch:{ all -> 0x00c4 }
            java.lang.String r4 = "urlhandler.props"
            java.io.InputStream r3 = r3.getResourceAsStream(r4)     // Catch:{ all -> 0x00c4 }
            if (r3 == 0) goto L_0x00c7
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch:{ all -> 0x00c4 }
            java.lang.Class<java.net.URL> r5 = java.net.URL.class
            r4[r0] = r5     // Catch:{ all -> 0x00c4 }
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ all -> 0x00c4 }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ all -> 0x00c4 }
            r6.<init>(r3)     // Catch:{ all -> 0x00c4 }
            r5.<init>(r6)     // Catch:{ all -> 0x00c4 }
        L_0x0029:
            java.lang.String r3 = r5.readLine()     // Catch:{ all -> 0x006b }
            if (r3 == 0) goto L_0x00be
            java.lang.String r3 = r3.trim()     // Catch:{ all -> 0x006b }
            int r6 = r3.length()     // Catch:{ all -> 0x006b }
            if (r6 == 0) goto L_0x0029
            char r6 = r3.charAt(r0)     // Catch:{ all -> 0x006b }
            r7 = 35
            if (r6 != r7) goto L_0x0042
            goto L_0x0029
        L_0x0042:
            r6 = 61
            int r6 = r3.indexOf(r6)     // Catch:{ all -> 0x006b }
            r7 = -1
            if (r6 != r7) goto L_0x0070
            boolean r0 = f13048b     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x00be
            java.io.PrintStream r0 = java.lang.System.err     // Catch:{ all -> 0x006b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x006b }
            r1.<init>()     // Catch:{ all -> 0x006b }
            java.lang.String r4 = "bad urlhandler line: '"
            r1.append(r4)     // Catch:{ all -> 0x006b }
            r1.append(r3)     // Catch:{ all -> 0x006b }
            java.lang.String r3 = "'"
            r1.append(r3)     // Catch:{ all -> 0x006b }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x006b }
            r0.println(r1)     // Catch:{ all -> 0x006b }
            goto L_0x00be
        L_0x006b:
            r0 = move-exception
            r1 = r2
            r2 = r5
            goto L_0x00ce
        L_0x0070:
            java.lang.String r7 = r3.substring(r0, r6)     // Catch:{ all -> 0x006b }
            java.lang.String r7 = r7.trim()     // Catch:{ all -> 0x006b }
            int r6 = r6 + r1
            java.lang.String r3 = r3.substring(r6)     // Catch:{ all -> 0x006b }
            java.lang.String r3 = r3.trim()     // Catch:{ all -> 0x006b }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException -> 0x0098, NoSuchMethodException -> 0x0096, SecurityException -> 0x0094 }
            java.lang.String r6 = "get"
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r6, r4)     // Catch:{ ClassNotFoundException -> 0x0098, NoSuchMethodException -> 0x0096, SecurityException -> 0x0094 }
            if (r2 != 0) goto L_0x009a
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ ClassNotFoundException -> 0x0098, NoSuchMethodException -> 0x0096, SecurityException -> 0x0094 }
            r6.<init>()     // Catch:{ ClassNotFoundException -> 0x0098, NoSuchMethodException -> 0x0096, SecurityException -> 0x0094 }
            r2 = r6
            goto L_0x009a
        L_0x0094:
            r3 = move-exception
            goto L_0x009e
        L_0x0096:
            r3 = move-exception
            goto L_0x00a8
        L_0x0098:
            r3 = move-exception
            goto L_0x00b3
        L_0x009a:
            r2.put(r7, r3)     // Catch:{ ClassNotFoundException -> 0x0098, NoSuchMethodException -> 0x0096, SecurityException -> 0x0094 }
            goto L_0x0029
        L_0x009e:
            boolean r6 = f13048b     // Catch:{ all -> 0x006b }
            if (r6 == 0) goto L_0x0029
            java.io.PrintStream r6 = java.lang.System.err     // Catch:{ all -> 0x006b }
            r6.println(r3)     // Catch:{ all -> 0x006b }
            goto L_0x0029
        L_0x00a8:
            boolean r6 = f13048b     // Catch:{ all -> 0x006b }
            if (r6 == 0) goto L_0x0029
            java.io.PrintStream r6 = java.lang.System.err     // Catch:{ all -> 0x006b }
            r6.println(r3)     // Catch:{ all -> 0x006b }
            goto L_0x0029
        L_0x00b3:
            boolean r6 = f13048b     // Catch:{ all -> 0x006b }
            if (r6 == 0) goto L_0x0029
            java.io.PrintStream r6 = java.lang.System.err     // Catch:{ all -> 0x006b }
            r6.println(r3)     // Catch:{ all -> 0x006b }
            goto L_0x0029
        L_0x00be:
            r5.close()     // Catch:{ all -> 0x006b }
            r0 = r2
            r2 = r5
            goto L_0x00c8
        L_0x00c4:
            r0 = move-exception
            r1 = r2
            goto L_0x00ce
        L_0x00c7:
            r0 = r2
        L_0x00c8:
            if (r2 == 0) goto L_0x00e0
            r2.close()     // Catch:{ IOException -> 0x00e0 }
            goto L_0x00e0
        L_0x00ce:
            boolean r3 = f13048b     // Catch:{ all -> 0x00d8 }
            if (r3 == 0) goto L_0x00da
            java.io.PrintStream r3 = java.lang.System.err     // Catch:{ all -> 0x00d8 }
            r3.println(r0)     // Catch:{ all -> 0x00d8 }
            goto L_0x00da
        L_0x00d8:
            r0 = move-exception
            goto L_0x00e3
        L_0x00da:
            if (r2 == 0) goto L_0x00df
            r2.close()     // Catch:{ IOException -> 0x00df }
        L_0x00df:
            r0 = r1
        L_0x00e0:
            f13047a = r0
            return
        L_0x00e3:
            if (r2 == 0) goto L_0x00e8
            r2.close()     // Catch:{ IOException -> 0x00e8 }
        L_0x00e8:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.impl.v.<clinit>():void");
    }

    public static v b(URL url) {
        Method method;
        if (url == null) {
            return null;
        }
        String protocol = url.getProtocol();
        Map map = f13047a;
        if (!(map == null || (method = (Method) map.get(protocol)) == null)) {
            try {
                v vVar = (v) method.invoke((Object) null, new Object[]{url});
                if (vVar != null) {
                    return vVar;
                }
            } catch (IllegalAccessException e4) {
                if (f13048b) {
                    System.err.println(e4);
                }
            } catch (IllegalArgumentException e5) {
                if (f13048b) {
                    System.err.println(e5);
                }
            } catch (InvocationTargetException e6) {
                if (f13048b) {
                    System.err.println(e6);
                }
            }
        }
        return c(url);
    }

    protected static v c(URL url) {
        v bVar;
        String protocol = url.getProtocol();
        try {
            if (protocol.equals("file")) {
                bVar = new a(url);
            } else if (!protocol.equals("jar") && !protocol.equals("wsjar")) {
                return null;
            } else {
                bVar = new b(url);
            }
            return bVar;
        } catch (Exception unused) {
            return null;
        }
    }

    public void d(c cVar, boolean z3) {
        e(cVar, z3, true);
    }

    public abstract void e(c cVar, boolean z3, boolean z4);
}
