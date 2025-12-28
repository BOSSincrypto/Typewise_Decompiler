package com.google.android.flexbox;

import android.view.View;
import java.util.List;

interface a {
    View b(int i4);

    int c(View view, int i4, int i5);

    int e(int i4, int i5, int i6);

    void g(View view, int i4, int i5, c cVar);

    int getAlignContent();

    int getAlignItems();

    int getFlexDirection();

    int getFlexItemCount();

    List getFlexLinesInternal();

    int getFlexWrap();

    int getLargestMainSize();

    int getMaxLine();

    int getPaddingBottom();

    int getPaddingEnd();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingStart();

    int getPaddingTop();

    int getSumOfCrossSize();

    void h(c cVar);

    View i(int i4);

    int k(int i4, int i5, int i6);

    void l(int i4, View view);

    boolean m();

    int n(View view);

    void setFlexLines(List list);
}
