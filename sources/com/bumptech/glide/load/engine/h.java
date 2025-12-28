package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f10946a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final h f10947b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final h f10948c = new c();

    /* renamed from: d  reason: collision with root package name */
    public static final h f10949d = new d();

    /* renamed from: e  reason: collision with root package name */
    public static final h f10950e = new e();

    class a extends h {
        a() {
        }

        public boolean a() {
            return true;
        }

        public boolean b() {
            return true;
        }

        public boolean c(DataSource dataSource) {
            if (dataSource == DataSource.REMOTE) {
                return true;
            }
            return false;
        }

        public boolean d(boolean z3, DataSource dataSource, EncodeStrategy encodeStrategy) {
            if (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) {
                return false;
            }
            return true;
        }
    }

    class b extends h {
        b() {
        }

        public boolean a() {
            return false;
        }

        public boolean b() {
            return false;
        }

        public boolean c(DataSource dataSource) {
            return false;
        }

        public boolean d(boolean z3, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    class c extends h {
        c() {
        }

        public boolean a() {
            return true;
        }

        public boolean b() {
            return false;
        }

        public boolean c(DataSource dataSource) {
            if (dataSource == DataSource.DATA_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) {
                return false;
            }
            return true;
        }

        public boolean d(boolean z3, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    class d extends h {
        d() {
        }

        public boolean a() {
            return false;
        }

        public boolean b() {
            return true;
        }

        public boolean c(DataSource dataSource) {
            return false;
        }

        public boolean d(boolean z3, DataSource dataSource, EncodeStrategy encodeStrategy) {
            if (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) {
                return false;
            }
            return true;
        }
    }

    class e extends h {
        e() {
        }

        public boolean a() {
            return true;
        }

        public boolean b() {
            return true;
        }

        public boolean c(DataSource dataSource) {
            if (dataSource == DataSource.REMOTE) {
                return true;
            }
            return false;
        }

        public boolean d(boolean z3, DataSource dataSource, EncodeStrategy encodeStrategy) {
            if (((!z3 || dataSource != DataSource.DATA_DISK_CACHE) && dataSource != DataSource.LOCAL) || encodeStrategy != EncodeStrategy.TRANSFORMED) {
                return false;
            }
            return true;
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(DataSource dataSource);

    public abstract boolean d(boolean z3, DataSource dataSource, EncodeStrategy encodeStrategy);
}
