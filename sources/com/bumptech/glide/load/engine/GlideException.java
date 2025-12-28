package com.bumptech.glide.load.engine;

import X0.b;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class GlideException extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private static final StackTraceElement[] f10894a = new StackTraceElement[0];
    private static final long serialVersionUID = 1;
    private final List<Throwable> causes;
    private Class<?> dataClass;
    private DataSource dataSource;
    private String detailMessage;
    private Exception exception;
    private b key;

    public GlideException(String str) {
        this(str, (List<Throwable>) Collections.emptyList());
    }

    private void a(Throwable th, List list) {
        if (th instanceof GlideException) {
            for (Throwable a4 : ((GlideException) th).getCauses()) {
                a(a4, list);
            }
            return;
        }
        list.add(th);
    }

    private static void b(List list, Appendable appendable) {
        try {
            c(list, appendable);
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        }
    }

    private static void c(List list, Appendable appendable) {
        int size = list.size();
        int i4 = 0;
        while (i4 < size) {
            int i5 = i4 + 1;
            appendable.append("Cause (").append(String.valueOf(i5)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = (Throwable) list.get(i4);
            if (th instanceof GlideException) {
                ((GlideException) th).e(appendable);
            } else {
                d(th, appendable);
            }
            i4 = i5;
        }
    }

    private static void d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append(10);
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    private void e(Appendable appendable) {
        d(this, appendable);
        b(getCauses(), new a(appendable));
    }

    public Throwable fillInStackTrace() {
        return this;
    }

    public List<Throwable> getCauses() {
        return this.causes;
    }

    public String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.detailMessage);
        String str3 = "";
        if (this.dataClass != null) {
            str = ", " + this.dataClass;
        } else {
            str = str3;
        }
        sb.append(str);
        if (this.dataSource != null) {
            str2 = ", " + this.dataSource;
        } else {
            str2 = str3;
        }
        sb.append(str2);
        if (this.key != null) {
            str3 = ", " + this.key;
        }
        sb.append(str3);
        List<Throwable> rootCauses = getRootCauses();
        if (rootCauses.isEmpty()) {
            return sb.toString();
        }
        if (rootCauses.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(rootCauses.size());
            sb.append(" root causes:");
        }
        for (Throwable next : rootCauses) {
            sb.append(10);
            sb.append(next.getClass().getName());
            sb.append('(');
            sb.append(next.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    public Exception getOrigin() {
        return this.exception;
    }

    public List<Throwable> getRootCauses() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        return arrayList;
    }

    public void logRootCauses(String str) {
        List<Throwable> rootCauses = getRootCauses();
        int size = rootCauses.size();
        int i4 = 0;
        while (i4 < size) {
            StringBuilder sb = new StringBuilder();
            sb.append("Root cause (");
            int i5 = i4 + 1;
            sb.append(i5);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Throwable th = rootCauses.get(i4);
            i4 = i5;
        }
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    /* access modifiers changed from: package-private */
    public void setLoggingDetails(b bVar, DataSource dataSource2) {
        setLoggingDetails(bVar, dataSource2, (Class<?>) null);
    }

    public void setOrigin(Exception exc) {
        this.exception = exc;
    }

    public GlideException(String str, Throwable th) {
        this(str, (List<Throwable>) Collections.singletonList(th));
    }

    public void printStackTrace(PrintStream printStream) {
        e(printStream);
    }

    /* access modifiers changed from: package-private */
    public void setLoggingDetails(b bVar, DataSource dataSource2, Class<?> cls) {
        this.key = bVar;
        this.dataSource = dataSource2;
        this.dataClass = cls;
    }

    public GlideException(String str, List<Throwable> list) {
        this.detailMessage = str;
        setStackTrace(f10894a);
        this.causes = list;
    }

    public void printStackTrace(PrintWriter printWriter) {
        e(printWriter);
    }

    private static final class a implements Appendable {

        /* renamed from: a  reason: collision with root package name */
        private final Appendable f10895a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f10896b = true;

        a(Appendable appendable) {
            this.f10895a = appendable;
        }

        private CharSequence a(CharSequence charSequence) {
            if (charSequence == null) {
                return "";
            }
            return charSequence;
        }

        public Appendable append(char c4) {
            boolean z3 = false;
            if (this.f10896b) {
                this.f10896b = false;
                this.f10895a.append("  ");
            }
            if (c4 == 10) {
                z3 = true;
            }
            this.f10896b = z3;
            this.f10895a.append(c4);
            return this;
        }

        public Appendable append(CharSequence charSequence) {
            CharSequence a4 = a(charSequence);
            return append(a4, 0, a4.length());
        }

        public Appendable append(CharSequence charSequence, int i4, int i5) {
            CharSequence a4 = a(charSequence);
            boolean z3 = false;
            if (this.f10896b) {
                this.f10896b = false;
                this.f10895a.append("  ");
            }
            if (a4.length() > 0 && a4.charAt(i5 - 1) == 10) {
                z3 = true;
            }
            this.f10896b = z3;
            this.f10895a.append(a4, i4, i5);
            return this;
        }
    }
}
