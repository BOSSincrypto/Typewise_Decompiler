package com.getcapacitor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

public class JSArray extends JSONArray {
    public JSArray() {
    }

    public static JSArray from(Object obj) {
        try {
            return new JSArray(obj);
        } catch (JSONException unused) {
            return null;
        }
    }

    public <E> List<E> toList() {
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        while (i4 < length()) {
            get(i4);
            try {
                arrayList.add(get(i4));
                i4++;
            } catch (Exception unused) {
                throw new JSONException("Not all items are instances of the given type");
            }
        }
        return arrayList;
    }

    public JSArray(String str) {
        super(str);
    }

    public JSArray(Collection collection) {
        super(collection);
    }

    public JSArray(Object obj) {
        super(obj);
    }
}
