package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import y.C0939a;

class b extends a {

    /* renamed from: d  reason: collision with root package name */
    private final SparseIntArray f7049d;

    /* renamed from: e  reason: collision with root package name */
    private final Parcel f7050e;

    /* renamed from: f  reason: collision with root package name */
    private final int f7051f;

    /* renamed from: g  reason: collision with root package name */
    private final int f7052g;

    /* renamed from: h  reason: collision with root package name */
    private final String f7053h;

    /* renamed from: i  reason: collision with root package name */
    private int f7054i;

    /* renamed from: j  reason: collision with root package name */
    private int f7055j;

    /* renamed from: k  reason: collision with root package name */
    private int f7056k;

    b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0939a(), new C0939a(), new C0939a());
    }

    public void A(byte[] bArr) {
        if (bArr != null) {
            this.f7050e.writeInt(bArr.length);
            this.f7050e.writeByteArray(bArr);
            return;
        }
        this.f7050e.writeInt(-1);
    }

    /* access modifiers changed from: protected */
    public void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f7050e, 0);
    }

    public void E(int i4) {
        this.f7050e.writeInt(i4);
    }

    public void G(Parcelable parcelable) {
        this.f7050e.writeParcelable(parcelable, 0);
    }

    public void I(String str) {
        this.f7050e.writeString(str);
    }

    public void a() {
        int i4 = this.f7054i;
        if (i4 >= 0) {
            int i5 = this.f7049d.get(i4);
            int dataPosition = this.f7050e.dataPosition();
            this.f7050e.setDataPosition(i5);
            this.f7050e.writeInt(dataPosition - i5);
            this.f7050e.setDataPosition(dataPosition);
        }
    }

    /* access modifiers changed from: protected */
    public a b() {
        Parcel parcel = this.f7050e;
        int dataPosition = parcel.dataPosition();
        int i4 = this.f7055j;
        if (i4 == this.f7051f) {
            i4 = this.f7052g;
        }
        int i5 = i4;
        return new b(parcel, dataPosition, i5, this.f7053h + "  ", this.f7046a, this.f7047b, this.f7048c);
    }

    public boolean g() {
        if (this.f7050e.readInt() != 0) {
            return true;
        }
        return false;
    }

    public byte[] i() {
        int readInt = this.f7050e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f7050e.readByteArray(bArr);
        return bArr;
    }

    /* access modifiers changed from: protected */
    public CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f7050e);
    }

    public boolean m(int i4) {
        while (this.f7055j < this.f7052g) {
            int i5 = this.f7056k;
            if (i5 == i4) {
                return true;
            }
            if (String.valueOf(i5).compareTo(String.valueOf(i4)) > 0) {
                return false;
            }
            this.f7050e.setDataPosition(this.f7055j);
            int readInt = this.f7050e.readInt();
            this.f7056k = this.f7050e.readInt();
            this.f7055j += readInt;
        }
        if (this.f7056k == i4) {
            return true;
        }
        return false;
    }

    public int o() {
        return this.f7050e.readInt();
    }

    public Parcelable q() {
        return this.f7050e.readParcelable(getClass().getClassLoader());
    }

    public String s() {
        return this.f7050e.readString();
    }

    public void w(int i4) {
        a();
        this.f7054i = i4;
        this.f7049d.put(i4, this.f7050e.dataPosition());
        E(0);
        E(i4);
    }

    public void y(boolean z3) {
        this.f7050e.writeInt(z3 ? 1 : 0);
    }

    private b(Parcel parcel, int i4, int i5, String str, C0939a aVar, C0939a aVar2, C0939a aVar3) {
        super(aVar, aVar2, aVar3);
        this.f7049d = new SparseIntArray();
        this.f7054i = -1;
        this.f7056k = -1;
        this.f7050e = parcel;
        this.f7051f = i4;
        this.f7052g = i5;
        this.f7055j = i4;
        this.f7053h = str;
    }
}
