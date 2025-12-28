package d;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import ch.icoaching.wrio.Z;
import ch.icoaching.wrio.keyboard.DiacriticsStore;
import d2.b;
import e3.c;

/* renamed from: d.a  reason: case insensitive filesystem */
public class C0593a {

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteDatabase f13375a;

    public C0593a(SQLiteDatabase sQLiteDatabase) {
        this.f13375a = sQLiteDatabase;
    }

    private String a(int i4, String str, String str2) {
        String str3 = str;
        String str4 = str2;
        StringBuilder sb = new StringBuilder("UPDATE dictionary ");
        int m4 = c.m(str);
        int m5 = c.m(str2);
        sb.append("SET ");
        sb.append("length");
        sb.append("=");
        sb.append(m4);
        sb.append(", ");
        sb.append("firstLetterFilter");
        sb.append("=");
        sb.append(b.a(str3.charAt(0)));
        sb.append(", ");
        sb.append("secondLetterFilter");
        sb.append("=");
        sb.append(b.a(str3.charAt(1)));
        if (m4 >= 3) {
            sb.append(", ");
            sb.append("thirdLetterFilter");
            sb.append("=");
            sb.append(b.a(str3.charAt(2)));
        }
        if (m4 >= 4) {
            sb.append(", ");
            sb.append("fourthLetterFilter");
            sb.append("=");
            sb.append(b.a(str3.charAt(3)));
        }
        if (m4 >= 5) {
            sb.append(", ");
            sb.append("fifthLetterFilter");
            sb.append("=");
            sb.append(b.a(str3.charAt(4)));
        }
        if (m4 >= 6) {
            sb.append(", ");
            sb.append("sixthLetterFilter");
            sb.append("=");
            sb.append(b.a(str3.charAt(5)));
        }
        if (m4 > m5 && m5 >= 2) {
            sb.append(", ");
            sb.append("strippedWordLength");
            sb.append("=");
            sb.append(m5);
            sb.append(", ");
            sb.append("firstStrippedLetterFilter");
            sb.append("=");
            sb.append(b.a(str4.charAt(0)));
            sb.append(", ");
            sb.append("secondStrippedLetterFilter");
            sb.append("=");
            sb.append(b.a(str4.charAt(1)));
            if (m5 >= 3) {
                sb.append(", ");
                sb.append("thirdStrippedLetterFilter");
                sb.append("=");
                sb.append(b.a(str4.charAt(2)));
            }
            if (m5 >= 4) {
                sb.append(", ");
                sb.append("fourthStrippedLetterFilter");
                sb.append("=");
                sb.append(b.a(str4.charAt(3)));
            }
            if (m5 >= 5) {
                sb.append(", ");
                sb.append("fifthStrippedLetterFilter");
                sb.append("=");
                sb.append(b.a(str4.charAt(4)));
            }
            if (m5 >= 6) {
                sb.append(", ");
                sb.append("sixthStrippedLetterFilter");
                sb.append("=");
                sb.append(b.a(str4.charAt(5)));
            }
        }
        sb.append(" WHERE dict_id=");
        sb.append(i4);
        return sb.toString();
    }

    private void c() {
        try {
            Cursor rawQuery = this.f13375a.rawQuery("SELECT word, dict_id FROM dictionary", (String[]) null);
            if (rawQuery.moveToFirst()) {
                do {
                    String g4 = DiacriticsStore.g(rawQuery.getString(0));
                    String d4 = Z.d(g4);
                    int i4 = rawQuery.getInt(1);
                    if (c.m(g4) >= 2) {
                        this.f13375a.execSQL(a(i4, g4, d4));
                    }
                } while (rawQuery.moveToNext());
                rawQuery.close();
            }
        } catch (SQLException e4) {
            e4.printStackTrace();
        }
    }

    public void b() {
        this.f13375a.execSQL("create table if not exists bigrams_tmp(bg_first integer(8) not null, bg_second integer(8) not null, bg_timesTyped integer default 0 not null, bg_timesSuggested integer default 0 not null, bg_timesTapped integer default 0 not null, bg_lastTyped integer(8) default (cast(strftime('%s', 'now') as integer(8))) not null, primary key (bg_first, bg_second))");
        this.f13375a.execSQL("INSERT INTO bigrams_tmp SELECT * FROM bigrams");
        this.f13375a.execSQL("create table dictionary_tmp (dict_id integer primary key, word text unique not null, plainWord text not null, firstLetter text not null, secondLetter text not null, wordLength integer default 0 not null, timesTyped integer default 0 not null, timesCorrected integer default 0 not null, timesConsidered integer default 0 not null, timesUndone integer default 0 not null, lastTyped integer(8) default (cast(strftime('%s', 'now') as integer(8))) not null, source text default 'user' not null, consider integer(8) default 0 not null, typedLowerCase integer default 0 not null, typedTitleCase integer default 0 not null, typedMixedCase integer default 0 not null, wordMixedCase text default null)");
        this.f13375a.execSQL("INSERT INTO dictionary_tmp SELECT * FROM dictionary");
        this.f13375a.execSQL("DROP TABLE dictionary");
        this.f13375a.execSQL("create table if not exists dictionary (dict_id integer primary key, word text unique not null, firstLetterFilter INTEGER(1) DEFAULT 0 NOT NULL, secondLetterFilter INTEGER(1) DEFAULT 0 NOT NULL, thirdLetterFilter INTEGER(1) DEFAULT NULL, fourthLetterFilter INTEGER(1) DEFAULT NULL, fifthLetterFilter INTEGER(1) DEFAULT NULL, sixthLetterFilter INTEGER(1) DEFAULT NULL, firstStrippedLetterFilter INTEGER(1) DEFAULT NULL, secondStrippedLetterFilter INTEGER(1) DEFAULT NULL, thirdStrippedLetterFilter INTEGER(1) DEFAULT NULL, fourthStrippedLetterFilter INTEGER(1) DEFAULT NULL, fifthStrippedLetterFilter INTEGER(1) DEFAULT NULL, sixthStrippedLetterFilter INTEGER(1) DEFAULT NULL, length integer default 0 not null, strippedWordLength integer default 0 not null, timesTyped integer default 0 not null, timesCorrected integer default 0 not null, timesConsidered integer default 0 not null, timesUndone integer default 0 not null, lastTyped integer(8) default (cast(strftime('%s', 'now') as integer(8))) not null, source text default 'user' not null, consider integer(8) default 0 not null, typedLowerCase integer default 0 not null, typedTitleCase integer default 0 not null, typedMixedCase integer default 0 not null, mixedcaseWord text default null)");
        this.f13375a.execSQL("CREATE INDEX IF NOT EXISTS dictionary_word_index ON dictionary(word COLLATE NOCASE)");
        this.f13375a.execSQL(String.format("INSERT INTO dictionary (%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s) SELECT %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s FROM dictionary_tmp", new Object[]{"dict_id", "word", "timesTyped", "timesCorrected", "timesConsidered", "timesUndone", "lastTyped", "source", "consider", "typedLowerCase", "typedTitleCase", "typedMixedCase", "mixedcaseWord", "dict_id", "word", "timesTyped", "timesCorrected", "timesConsidered", "timesUndone", "lastTyped", "source", "consider", "typedLowerCase", "typedTitleCase", "typedMixedCase", "wordMixedCase"}));
        c();
        this.f13375a.execSQL("INSERT INTO bigrams SELECT * from bigrams_tmp");
    }
}
