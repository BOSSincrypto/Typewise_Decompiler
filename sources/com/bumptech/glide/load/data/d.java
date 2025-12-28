package com.bumptech.glide.load.data;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;

public interface d {

    public interface a {
        void c(Exception exc);

        void d(Object obj);
    }

    Class a();

    void b();

    void cancel();

    DataSource e();

    void f(Priority priority, a aVar);
}
