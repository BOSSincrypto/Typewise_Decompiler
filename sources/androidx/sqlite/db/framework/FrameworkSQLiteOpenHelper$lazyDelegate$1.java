package androidx.sqlite.db.framework;

import Z.b;
import Z.d;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u2.C0906a;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
final class FrameworkSQLiteOpenHelper$lazyDelegate$1 extends Lambda implements C0906a {
    final /* synthetic */ FrameworkSQLiteOpenHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FrameworkSQLiteOpenHelper$lazyDelegate$1(FrameworkSQLiteOpenHelper frameworkSQLiteOpenHelper) {
        super(0);
        this.this$0 = frameworkSQLiteOpenHelper;
    }

    public final FrameworkSQLiteOpenHelper.OpenHelper invoke() {
        FrameworkSQLiteOpenHelper.OpenHelper openHelper;
        if (this.this$0.f6916b == null || !this.this$0.f6918d) {
            openHelper = new FrameworkSQLiteOpenHelper.OpenHelper(this.this$0.f6915a, this.this$0.f6916b, new FrameworkSQLiteOpenHelper.b((FrameworkSQLiteDatabase) null), this.this$0.f6917c, this.this$0.f6919e);
        } else {
            openHelper = new FrameworkSQLiteOpenHelper.OpenHelper(this.this$0.f6915a, new File(d.a(this.this$0.f6915a), this.this$0.f6916b).getAbsolutePath(), new FrameworkSQLiteOpenHelper.b((FrameworkSQLiteDatabase) null), this.this$0.f6917c, this.this$0.f6919e);
        }
        b.d(openHelper, this.this$0.f6921g);
        return openHelper;
    }
}
