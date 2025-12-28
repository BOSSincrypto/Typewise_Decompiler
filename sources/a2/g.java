package A2;

import A2.f;
import u2.C0906a;

public interface g extends f, C0906a {

    public interface a extends f.a, C0906a {
    }

    Object getDelegate();

    a getGetter();
}
