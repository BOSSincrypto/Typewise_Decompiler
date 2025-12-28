package Y2;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.o;

public final class f extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public static final f f2105a = new f();

    private f() {
    }

    public void close() {
    }

    public void flush() {
    }

    public void publish(LogRecord logRecord) {
        o.e(logRecord, "record");
        e eVar = e.f2102a;
        String loggerName = logRecord.getLoggerName();
        o.d(loggerName, "record.loggerName");
        int a4 = g.b(logRecord);
        String message = logRecord.getMessage();
        o.d(message, "record.message");
        eVar.a(loggerName, a4, message, logRecord.getThrown());
    }
}
