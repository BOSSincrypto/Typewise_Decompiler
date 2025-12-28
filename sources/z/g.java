package Z;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;
import java.util.List;

public interface g extends Closeable {
    Cursor J(j jVar);

    String K();

    boolean M();

    boolean S();

    void V();

    void X(String str, Object[] objArr);

    void Y();

    int Z(String str, int i4, ContentValues contentValues, String str2, Object[] objArr);

    void i();

    boolean isOpen();

    void j();

    List l();

    Cursor l0(String str);

    void p(String str);

    k u(String str);

    Cursor x(j jVar, CancellationSignal cancellationSignal);
}
