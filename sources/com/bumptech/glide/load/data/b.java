package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import java.io.IOException;

public abstract class b implements d {

    /* renamed from: a  reason: collision with root package name */
    private final String f10821a;

    /* renamed from: b  reason: collision with root package name */
    private final AssetManager f10822b;

    /* renamed from: c  reason: collision with root package name */
    private Object f10823c;

    public b(AssetManager assetManager, String str) {
        this.f10822b = assetManager;
        this.f10821a = str;
    }

    public void b() {
        Object obj = this.f10823c;
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
    public abstract Object d(AssetManager assetManager, String str);

    public DataSource e() {
        return DataSource.LOCAL;
    }

    public void f(Priority priority, d.a aVar) {
        try {
            Object d4 = d(this.f10822b, this.f10821a);
            this.f10823c = d4;
            aVar.d(d4);
        } catch (IOException e4) {
            Log.isLoggable("AssetPathFetcher", 3);
            aVar.c(e4);
        }
    }
}
