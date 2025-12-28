package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.i;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private final AssetManager f6108a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f6109b;

    /* renamed from: c  reason: collision with root package name */
    private final i.c f6110c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f6111d;

    /* renamed from: e  reason: collision with root package name */
    private final File f6112e;

    /* renamed from: f  reason: collision with root package name */
    private final String f6113f;

    /* renamed from: g  reason: collision with root package name */
    private final String f6114g;

    /* renamed from: h  reason: collision with root package name */
    private final String f6115h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f6116i = false;

    /* renamed from: j  reason: collision with root package name */
    private e[] f6117j;

    /* renamed from: k  reason: collision with root package name */
    private byte[] f6118k;

    public d(AssetManager assetManager, Executor executor, i.c cVar, String str, String str2, String str3, File file) {
        this.f6108a = assetManager;
        this.f6109b = executor;
        this.f6110c = cVar;
        this.f6113f = str;
        this.f6114g = str2;
        this.f6115h = str3;
        this.f6112e = file;
        this.f6111d = d();
    }

    private d b(e[] eVarArr, byte[] bArr) {
        InputStream h4;
        try {
            h4 = h(this.f6108a, this.f6115h);
            if (h4 != null) {
                this.f6117j = n.q(h4, n.o(h4, n.f6139b), bArr, eVarArr);
                h4.close();
                return this;
            }
            if (h4 != null) {
                h4.close();
            }
            return null;
        } catch (FileNotFoundException e4) {
            this.f6110c.b(9, e4);
        } catch (IOException e5) {
            this.f6110c.b(7, e5);
        } catch (IllegalStateException e6) {
            this.f6117j = null;
            this.f6110c.b(8, e6);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    private void c() {
        if (!this.f6116i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    private static byte[] d() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 24 || i4 > 33) {
            return null;
        }
        switch (i4) {
            case 24:
            case 25:
                return p.f6154e;
            case 26:
                return p.f6153d;
            case 27:
                return p.f6152c;
            case 28:
            case 29:
            case 30:
                return p.f6151b;
            case 31:
            case 32:
            case 33:
                return p.f6150a;
            default:
                return null;
        }
    }

    private InputStream f(AssetManager assetManager) {
        try {
            return h(assetManager, this.f6114g);
        } catch (FileNotFoundException e4) {
            this.f6110c.b(6, e4);
            return null;
        } catch (IOException e5) {
            this.f6110c.b(7, e5);
            return null;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g(int i4, Object obj) {
        this.f6110c.b(i4, obj);
    }

    private InputStream h(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e4) {
            String message = e4.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f6110c.a(5, (Object) null);
            }
            return null;
        }
    }

    private e[] j(InputStream inputStream) {
        try {
            e[] w3 = n.w(inputStream, n.o(inputStream, n.f6138a), this.f6113f);
            try {
                inputStream.close();
                return w3;
            } catch (IOException e4) {
                this.f6110c.b(7, e4);
                return w3;
            }
        } catch (IOException e5) {
            this.f6110c.b(7, e5);
            inputStream.close();
            return null;
        } catch (IllegalStateException e6) {
            this.f6110c.b(8, e6);
            try {
                inputStream.close();
            } catch (IOException e7) {
                this.f6110c.b(7, e7);
            }
            return null;
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e8) {
                this.f6110c.b(7, e8);
            }
            throw th;
        }
    }

    private static boolean k() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 24 || i4 > 33) {
            return false;
        }
        if (!(i4 == 24 || i4 == 25)) {
            switch (i4) {
                case 31:
                case 32:
                case 33:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    private void l(int i4, Object obj) {
        this.f6109b.execute(new c(this, i4, obj));
    }

    public boolean e() {
        if (this.f6111d == null) {
            l(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        } else if (!this.f6112e.canWrite()) {
            l(4, (Object) null);
            return false;
        } else {
            this.f6116i = true;
            return true;
        }
    }

    public d i() {
        d b4;
        c();
        if (this.f6111d == null) {
            return this;
        }
        InputStream f4 = f(this.f6108a);
        if (f4 != null) {
            this.f6117j = j(f4);
        }
        e[] eVarArr = this.f6117j;
        if (eVarArr == null || !k() || (b4 = b(eVarArr, this.f6111d)) == null) {
            return this;
        }
        return b4;
    }

    public d m() {
        ByteArrayOutputStream byteArrayOutputStream;
        e[] eVarArr = this.f6117j;
        byte[] bArr = this.f6111d;
        if (!(eVarArr == null || bArr == null)) {
            c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                n.E(byteArrayOutputStream, bArr);
                if (!n.B(byteArrayOutputStream, bArr, eVarArr)) {
                    this.f6110c.b(5, (Object) null);
                    this.f6117j = null;
                    byteArrayOutputStream.close();
                    return this;
                }
                this.f6118k = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                this.f6117j = null;
            } catch (IOException e4) {
                this.f6110c.b(7, e4);
            } catch (IllegalStateException e5) {
                this.f6110c.b(8, e5);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        return this;
        throw th;
    }

    public boolean n() {
        ByteArrayInputStream byteArrayInputStream;
        FileOutputStream fileOutputStream;
        byte[] bArr = this.f6118k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            fileOutputStream = new FileOutputStream(this.f6112e);
            f.l(byteArrayInputStream, fileOutputStream);
            l(1, (Object) null);
            fileOutputStream.close();
            byteArrayInputStream.close();
            this.f6118k = null;
            this.f6117j = null;
            return true;
        } catch (FileNotFoundException e4) {
            l(6, e4);
            this.f6118k = null;
            this.f6117j = null;
            return false;
        } catch (IOException e5) {
            l(7, e5);
            this.f6118k = null;
            this.f6117j = null;
            return false;
        } catch (Throwable th) {
            this.f6118k = null;
            this.f6117j = null;
            throw th;
        }
        throw th;
        throw th;
    }
}
