package s2;

import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import kotlin.jvm.internal.o;

public abstract class c {
    public static final long a(Reader reader, Writer writer, int i4) {
        o.e(reader, "<this>");
        o.e(writer, "out");
        char[] cArr = new char[i4];
        int read = reader.read(cArr);
        long j4 = 0;
        while (read >= 0) {
            writer.write(cArr, 0, read);
            j4 += (long) read;
            read = reader.read(cArr);
        }
        return j4;
    }

    public static /* synthetic */ long b(Reader reader, Writer writer, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 8192;
        }
        return a(reader, writer, i4);
    }

    public static final String c(Reader reader) {
        o.e(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        b(reader, stringWriter, 0, 2, (Object) null);
        String stringWriter2 = stringWriter.toString();
        o.d(stringWriter2, "toString(...)");
        return stringWriter2;
    }
}
