package O;

import java.nio.ByteBuffer;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    protected int f1056a;

    /* renamed from: b  reason: collision with root package name */
    protected ByteBuffer f1057b;

    /* renamed from: c  reason: collision with root package name */
    private int f1058c;

    /* renamed from: d  reason: collision with root package name */
    private int f1059d;

    /* renamed from: e  reason: collision with root package name */
    d f1060e = d.a();

    /* access modifiers changed from: protected */
    public int a(int i4) {
        return i4 + this.f1057b.getInt(i4);
    }

    /* access modifiers changed from: protected */
    public int b(int i4) {
        if (i4 < this.f1059d) {
            return this.f1057b.getShort(this.f1058c + i4);
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void c(int i4, ByteBuffer byteBuffer) {
        this.f1057b = byteBuffer;
        if (byteBuffer != null) {
            this.f1056a = i4;
            int i5 = i4 - byteBuffer.getInt(i4);
            this.f1058c = i5;
            this.f1059d = this.f1057b.getShort(i5);
            return;
        }
        this.f1056a = 0;
        this.f1058c = 0;
        this.f1059d = 0;
    }

    /* access modifiers changed from: protected */
    public int d(int i4) {
        int i5 = i4 + this.f1056a;
        return i5 + this.f1057b.getInt(i5) + 4;
    }

    /* access modifiers changed from: protected */
    public int e(int i4) {
        int i5 = i4 + this.f1056a;
        return this.f1057b.getInt(i5 + this.f1057b.getInt(i5));
    }
}
