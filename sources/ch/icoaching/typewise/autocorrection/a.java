package ch.icoaching.typewise.autocorrection;

import ch.icoaching.typewise.autocorrection.resources.IDictionaryRepository;
import ch.icoaching.typewise.word_lists.b;
import java.util.List;

public interface a extends IDictionaryRepository {
    b a(String str);

    b b(String str);

    List d(String str);
}
