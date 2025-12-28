package androidx.work;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public final class WorkInfo {

    /* renamed from: a  reason: collision with root package name */
    private UUID f7072a;

    /* renamed from: b  reason: collision with root package name */
    private State f7073b;

    /* renamed from: c  reason: collision with root package name */
    private e f7074c;

    /* renamed from: d  reason: collision with root package name */
    private Set f7075d;

    /* renamed from: e  reason: collision with root package name */
    private e f7076e;

    /* renamed from: f  reason: collision with root package name */
    private int f7077f;

    /* renamed from: g  reason: collision with root package name */
    private final int f7078g;

    public enum State {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public boolean isFinished() {
            if (this == SUCCEEDED || this == FAILED || this == CANCELLED) {
                return true;
            }
            return false;
        }
    }

    public WorkInfo(UUID uuid, State state, e eVar, List list, e eVar2, int i4, int i5) {
        this.f7072a = uuid;
        this.f7073b = state;
        this.f7074c = eVar;
        this.f7075d = new HashSet(list);
        this.f7076e = eVar2;
        this.f7077f = i4;
        this.f7078g = i5;
    }

    public State a() {
        return this.f7073b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WorkInfo.class != obj.getClass()) {
            return false;
        }
        WorkInfo workInfo = (WorkInfo) obj;
        if (this.f7077f == workInfo.f7077f && this.f7078g == workInfo.f7078g && this.f7072a.equals(workInfo.f7072a) && this.f7073b == workInfo.f7073b && this.f7074c.equals(workInfo.f7074c) && this.f7075d.equals(workInfo.f7075d)) {
            return this.f7076e.equals(workInfo.f7076e);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((this.f7072a.hashCode() * 31) + this.f7073b.hashCode()) * 31) + this.f7074c.hashCode()) * 31) + this.f7075d.hashCode()) * 31) + this.f7076e.hashCode()) * 31) + this.f7077f) * 31) + this.f7078g;
    }

    public String toString() {
        return "WorkInfo{mId='" + this.f7072a + '\'' + ", mState=" + this.f7073b + ", mOutputData=" + this.f7074c + ", mTags=" + this.f7075d + ", mProgress=" + this.f7076e + '}';
    }
}
