package com.ibm.icu.impl;

import java.io.InputStream;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.MissingResourceException;

public abstract class e {

    static class a implements PrivilegedAction {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Class f12680a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f12681b;

        a(Class cls, String str) {
            this.f12680a = cls;
            this.f12681b = str;
        }

        /* renamed from: a */
        public InputStream run() {
            return this.f12680a.getResourceAsStream(this.f12681b);
        }
    }

    static class b implements PrivilegedAction {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ClassLoader f12682a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f12683b;

        b(ClassLoader classLoader, String str) {
            this.f12682a = classLoader;
            this.f12683b = str;
        }

        /* renamed from: a */
        public InputStream run() {
            return this.f12682a.getResourceAsStream(this.f12683b);
        }
    }

    private static void a(InputStream inputStream, String str) {
    }

    private static InputStream b(Class cls, String str, boolean z3) {
        InputStream inputStream;
        if (System.getSecurityManager() != null) {
            inputStream = (InputStream) AccessController.doPrivileged(new a(cls, str));
        } else {
            inputStream = cls.getResourceAsStream(str);
        }
        if (inputStream != null || !z3) {
            a(inputStream, str);
            return inputStream;
        }
        throw new MissingResourceException("could not locate data " + str, cls.getPackage().getName(), str);
    }

    public static InputStream c(ClassLoader classLoader, String str) {
        return d(classLoader, str, false);
    }

    static InputStream d(ClassLoader classLoader, String str, boolean z3) {
        InputStream inputStream;
        if (System.getSecurityManager() != null) {
            inputStream = (InputStream) AccessController.doPrivileged(new b(classLoader, str));
        } else {
            inputStream = classLoader.getResourceAsStream(str);
        }
        if (inputStream != null || !z3) {
            a(inputStream, str);
            return inputStream;
        }
        throw new MissingResourceException("could not locate data", classLoader.toString(), str);
    }

    public static InputStream e(String str) {
        return b(e.class, str, false);
    }
}
