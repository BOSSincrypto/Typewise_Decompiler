package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.Lifecycle;
import kotlin.uuid.Uuid;

final class v implements Parcelable {
    public static final Parcelable.Creator<v> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    final String f5920a;

    /* renamed from: b  reason: collision with root package name */
    final String f5921b;

    /* renamed from: c  reason: collision with root package name */
    final boolean f5922c;

    /* renamed from: d  reason: collision with root package name */
    final int f5923d;

    /* renamed from: e  reason: collision with root package name */
    final int f5924e;

    /* renamed from: f  reason: collision with root package name */
    final String f5925f;

    /* renamed from: g  reason: collision with root package name */
    final boolean f5926g;

    /* renamed from: h  reason: collision with root package name */
    final boolean f5927h;

    /* renamed from: i  reason: collision with root package name */
    final boolean f5928i;

    /* renamed from: j  reason: collision with root package name */
    final Bundle f5929j;

    /* renamed from: k  reason: collision with root package name */
    final boolean f5930k;

    /* renamed from: l  reason: collision with root package name */
    final int f5931l;

    /* renamed from: m  reason: collision with root package name */
    Bundle f5932m;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public v createFromParcel(Parcel parcel) {
            return new v(parcel);
        }

        /* renamed from: b */
        public v[] newArray(int i4) {
            return new v[i4];
        }
    }

    v(Fragment fragment) {
        this.f5920a = fragment.getClass().getName();
        this.f5921b = fragment.mWho;
        this.f5922c = fragment.mFromLayout;
        this.f5923d = fragment.mFragmentId;
        this.f5924e = fragment.mContainerId;
        this.f5925f = fragment.mTag;
        this.f5926g = fragment.mRetainInstance;
        this.f5927h = fragment.mRemoving;
        this.f5928i = fragment.mDetached;
        this.f5929j = fragment.mArguments;
        this.f5930k = fragment.mHidden;
        this.f5931l = fragment.mMaxState.ordinal();
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public Fragment t(l lVar, ClassLoader classLoader) {
        Fragment a4 = lVar.a(classLoader, this.f5920a);
        Bundle bundle = this.f5929j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a4.setArguments(this.f5929j);
        a4.mWho = this.f5921b;
        a4.mFromLayout = this.f5922c;
        a4.mRestored = true;
        a4.mFragmentId = this.f5923d;
        a4.mContainerId = this.f5924e;
        a4.mTag = this.f5925f;
        a4.mRetainInstance = this.f5926g;
        a4.mRemoving = this.f5927h;
        a4.mDetached = this.f5928i;
        a4.mHidden = this.f5930k;
        a4.mMaxState = Lifecycle.State.values()[this.f5931l];
        Bundle bundle2 = this.f5932m;
        if (bundle2 != null) {
            a4.mSavedFragmentState = bundle2;
        } else {
            a4.mSavedFragmentState = new Bundle();
        }
        return a4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(Uuid.SIZE_BITS);
        sb.append("FragmentState{");
        sb.append(this.f5920a);
        sb.append(" (");
        sb.append(this.f5921b);
        sb.append(")}:");
        if (this.f5922c) {
            sb.append(" fromLayout");
        }
        if (this.f5924e != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f5924e));
        }
        String str = this.f5925f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f5925f);
        }
        if (this.f5926g) {
            sb.append(" retainInstance");
        }
        if (this.f5927h) {
            sb.append(" removing");
        }
        if (this.f5928i) {
            sb.append(" detached");
        }
        if (this.f5930k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f5920a);
        parcel.writeString(this.f5921b);
        parcel.writeInt(this.f5922c ? 1 : 0);
        parcel.writeInt(this.f5923d);
        parcel.writeInt(this.f5924e);
        parcel.writeString(this.f5925f);
        parcel.writeInt(this.f5926g ? 1 : 0);
        parcel.writeInt(this.f5927h ? 1 : 0);
        parcel.writeInt(this.f5928i ? 1 : 0);
        parcel.writeBundle(this.f5929j);
        parcel.writeInt(this.f5930k ? 1 : 0);
        parcel.writeBundle(this.f5932m);
        parcel.writeInt(this.f5931l);
    }

    v(Parcel parcel) {
        this.f5920a = parcel.readString();
        this.f5921b = parcel.readString();
        boolean z3 = false;
        this.f5922c = parcel.readInt() != 0;
        this.f5923d = parcel.readInt();
        this.f5924e = parcel.readInt();
        this.f5925f = parcel.readString();
        this.f5926g = parcel.readInt() != 0;
        this.f5927h = parcel.readInt() != 0;
        this.f5928i = parcel.readInt() != 0;
        this.f5929j = parcel.readBundle();
        this.f5930k = parcel.readInt() != 0 ? true : z3;
        this.f5932m = parcel.readBundle();
        this.f5931l = parcel.readInt();
    }
}
