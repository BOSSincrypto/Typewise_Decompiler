package E0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.jvm.internal.o;
import s2.C0896b;

public abstract class f {
    public static final String a(InputStream inputStream) {
        o.e(inputStream, "<this>");
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                        sb.append("\n");
                    } else {
                        String sb2 = sb.toString();
                        o.d(sb2, "toString(...)");
                        C0896b.a(bufferedReader, (Throwable) null);
                        return sb2;
                    }
                }
            } catch (Throwable th) {
                C0896b.a(bufferedReader, th);
                throw th;
            }
        } catch (IOException unused) {
            return "";
        }
    }
}
