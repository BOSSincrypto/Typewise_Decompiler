package E0;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.D;
import kotlin.jvm.internal.o;
import l2.g;

public abstract class d {
    public static final String a(String str) {
        o.e(str, "resourcesPath");
        return str;
    }

    public static final Map b(String str, String str2) {
        o.e(str, "name");
        o.e(str2, "resourcesPath");
        Pair a4 = g.a("model_dir", str2 + "/" + str);
        Pair a5 = g.a("checkpoint", str2 + "/" + str + "/checkpoint/model.tf_lite");
        Pair a6 = g.a("output_dir", str2 + "/" + str + "/output");
        Pair a7 = g.a("checkpoint_folder", str2 + "/" + str + "/checkpoint");
        Pair a8 = g.a("config", str2 + "/" + str + "/config.json");
        return D.j(a4, a5, a6, a7, a8, g.a("train_history", str2 + "/" + str + "/train_history.json"));
    }
}
