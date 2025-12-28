package org.tensorflow.lite;

import h3.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class InterpreterApi$Options {

    /* renamed from: a  reason: collision with root package name */
    TfLiteRuntime f15705a = TfLiteRuntime.FROM_APPLICATION_ONLY;

    /* renamed from: b  reason: collision with root package name */
    int f15706b = -1;

    /* renamed from: c  reason: collision with root package name */
    Boolean f15707c;

    /* renamed from: d  reason: collision with root package name */
    Boolean f15708d;

    /* renamed from: e  reason: collision with root package name */
    Boolean f15709e;

    /* renamed from: f  reason: collision with root package name */
    final List f15710f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private final List f15711g = new ArrayList();

    public enum TfLiteRuntime {
        FROM_APPLICATION_ONLY,
        FROM_SYSTEM_ONLY,
        PREFER_SYSTEM_OVER_APPLICATION
    }

    public a a() {
        return null;
    }

    public List b() {
        return Collections.unmodifiableList(this.f15711g);
    }

    public List c() {
        return Collections.unmodifiableList(this.f15710f);
    }

    public int d() {
        return this.f15706b;
    }

    public TfLiteRuntime e() {
        return this.f15705a;
    }

    public boolean f() {
        Boolean bool = this.f15707c;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public boolean g() {
        Boolean bool = this.f15708d;
        if (bool == null || bool.booleanValue()) {
            return true;
        }
        return false;
    }

    public boolean h() {
        Boolean bool = this.f15709e;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }
}
