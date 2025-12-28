package c3;

import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import okio.ByteString;

public interface d extends w, ReadableByteChannel {
    String C();

    boolean H();

    byte[] L(long j4);

    String T(long j4);

    int W(n nVar);

    void b(long j4);

    C0500b c();

    long c0(u uVar);

    void d0(long j4);

    long m0();

    ByteString n(long j4);

    String n0(Charset charset);

    byte readByte();

    int readInt();

    short readShort();

    boolean s(long j4);
}
