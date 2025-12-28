package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class l implements d {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f10845a;

    /* renamed from: b  reason: collision with root package name */
    private final ContentResolver f10846b;

    /* renamed from: c  reason: collision with root package name */
    private Object f10847c;

    public l(ContentResolver contentResolver, Uri uri) {
        this.f10846b = contentResolver;
        this.f10845a = uri;
    }

    public void b() {
        Object obj = this.f10847c;
        if (obj != null) {
            try {
                c(obj);
            } catch (IOException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract void c(Object obj);

    public void cancel() {
    }

    /* access modifiers changed from: protected */
    public abstract Object d(Uri uri, ContentResolver contentResolver);

    public DataSource e() {
        return DataSource.LOCAL;
    }

    public final void f(Priority priority, d.a aVar) {
        try {
            Object d4 = d(this.f10845a, this.f10846b);
            this.f10847c = d4;
            aVar.d(d4);
        } catch (FileNotFoundException e4) {
            Log.isLoggable("LocalUriFetcher", 3);
            aVar.c(e4);
        }
    }
}
