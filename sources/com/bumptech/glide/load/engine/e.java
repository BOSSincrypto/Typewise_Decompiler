package com.bumptech.glide.load.engine;

import X0.b;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;

interface e {

    public interface a {
        void a();

        void c(b bVar, Object obj, d dVar, DataSource dataSource, b bVar2);

        void d(b bVar, Exception exc, d dVar, DataSource dataSource);
    }

    boolean b();

    void cancel();
}
