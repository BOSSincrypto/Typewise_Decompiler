package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import c1.h;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.data.d;
import com.silkimen.http.HttpRequest;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import p1.c;
import p1.g;

public class j implements d {

    /* renamed from: g  reason: collision with root package name */
    static final b f10836g = new a();

    /* renamed from: a  reason: collision with root package name */
    private final h f10837a;

    /* renamed from: b  reason: collision with root package name */
    private final int f10838b;

    /* renamed from: c  reason: collision with root package name */
    private final b f10839c;

    /* renamed from: d  reason: collision with root package name */
    private HttpURLConnection f10840d;

    /* renamed from: e  reason: collision with root package name */
    private InputStream f10841e;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f10842f;

    private static class a implements b {
        a() {
        }

        public HttpURLConnection a(URL url) {
            return (HttpURLConnection) url.openConnection();
        }
    }

    interface b {
        HttpURLConnection a(URL url);
    }

    public j(h hVar, int i4) {
        this(hVar, i4, f10836g);
    }

    private HttpURLConnection c(URL url, Map map) {
        try {
            HttpURLConnection a4 = this.f10839c.a(url);
            for (Map.Entry entry : map.entrySet()) {
                a4.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            a4.setConnectTimeout(this.f10838b);
            a4.setReadTimeout(this.f10838b);
            a4.setUseCaches(false);
            a4.setDoInput(true);
            a4.setInstanceFollowRedirects(false);
            return a4;
        } catch (IOException e4) {
            throw new HttpException("URL.openConnection threw", 0, e4);
        }
    }

    private static int d(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException unused) {
            Log.isLoggable("HttpUrlFetcher", 3);
            return -1;
        }
    }

    private InputStream g(HttpURLConnection httpURLConnection) {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f10841e = c.e(httpURLConnection.getInputStream(), (long) httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Got non empty content encoding: ");
                    sb.append(httpURLConnection.getContentEncoding());
                }
                this.f10841e = httpURLConnection.getInputStream();
            }
            return this.f10841e;
        } catch (IOException e4) {
            throw new HttpException("Failed to obtain InputStream", d(httpURLConnection), e4);
        }
    }

    private static boolean h(int i4) {
        if (i4 / 100 == 2) {
            return true;
        }
        return false;
    }

    private static boolean i(int i4) {
        if (i4 / 100 == 3) {
            return true;
        }
        return false;
    }

    private InputStream j(URL url, int i4, URL url2, Map map) {
        if (i4 < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new HttpException("In re-direct loop", -1);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            HttpURLConnection c4 = c(url, map);
            this.f10840d = c4;
            try {
                c4.connect();
                this.f10841e = this.f10840d.getInputStream();
                if (this.f10842f) {
                    return null;
                }
                int d4 = d(this.f10840d);
                if (h(d4)) {
                    return g(this.f10840d);
                }
                if (i(d4)) {
                    String headerField = this.f10840d.getHeaderField(HttpRequest.HEADER_LOCATION);
                    if (!TextUtils.isEmpty(headerField)) {
                        try {
                            URL url3 = new URL(url, headerField);
                            b();
                            return j(url3, i4 + 1, url, map);
                        } catch (MalformedURLException e4) {
                            throw new HttpException("Bad redirect url: " + headerField, d4, e4);
                        }
                    } else {
                        throw new HttpException("Received empty or null redirect url", d4);
                    }
                } else if (d4 == -1) {
                    throw new HttpException(d4);
                } else {
                    try {
                        throw new HttpException(this.f10840d.getResponseMessage(), d4);
                    } catch (IOException e5) {
                        throw new HttpException("Failed to get a response message", d4, e5);
                    }
                }
            } catch (IOException e6) {
                throw new HttpException("Failed to connect or obtain data", d(this.f10840d), e6);
            }
        } else {
            throw new HttpException("Too many (> 5) redirects!", -1);
        }
    }

    public Class a() {
        return InputStream.class;
    }

    public void b() {
        InputStream inputStream = this.f10841e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f10840d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f10840d = null;
    }

    public void cancel() {
        this.f10842f = true;
    }

    public DataSource e() {
        return DataSource.REMOTE;
    }

    public void f(Priority priority, d.a aVar) {
        StringBuilder sb;
        long b4 = g.b();
        try {
            aVar.d(j(this.f10837a.h(), 0, (URL) null, this.f10837a.e()));
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(g.a(b4));
            }
        } catch (IOException e4) {
            Log.isLoggable("HttpUrlFetcher", 3);
            aVar.c(e4);
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Finished http url fetcher fetch in ");
                sb2.append(g.a(b4));
            }
            throw th;
        }
    }

    j(h hVar, int i4, b bVar) {
        this.f10837a = hVar;
        this.f10838b = i4;
        this.f10839c = bVar;
    }
}
