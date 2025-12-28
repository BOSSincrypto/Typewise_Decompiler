package androidx.fragment.app;

import Q.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.strictmode.FragmentStrictMode;

class n implements LayoutInflater.Factory2 {

    /* renamed from: a  reason: collision with root package name */
    final q f5833a;

    class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w f5834a;

        a(w wVar) {
            this.f5834a = wVar;
        }

        public void onViewAttachedToWindow(View view) {
            Fragment k4 = this.f5834a.k();
            this.f5834a.m();
            SpecialEffectsController.n((ViewGroup) k4.mView.getParent(), n.this.f5833a).j();
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    n(q qVar) {
        this.f5833a = qVar;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        w wVar;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f5833a);
        }
        Fragment fragment = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue((String) null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f1206a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(c.f1207b);
        }
        int resourceId = obtainStyledAttributes.getResourceId(c.f1208c, -1);
        String string = obtainStyledAttributes.getString(c.f1209d);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !l.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        if (resourceId != -1) {
            fragment = this.f5833a.d0(resourceId);
        }
        if (fragment == null && string != null) {
            fragment = this.f5833a.e0(string);
        }
        if (fragment == null && id != -1) {
            fragment = this.f5833a.d0(id);
        }
        if (fragment == null) {
            fragment = this.f5833a.o0().a(context.getClassLoader(), attributeValue);
            fragment.mFromLayout = true;
            fragment.mFragmentId = resourceId != 0 ? resourceId : id;
            fragment.mContainerId = id;
            fragment.mTag = string;
            fragment.mInLayout = true;
            q qVar = this.f5833a;
            fragment.mFragmentManager = qVar;
            fragment.mHost = qVar.q0();
            fragment.onInflate(this.f5833a.q0().f(), attributeSet, fragment.mSavedFragmentState);
            wVar = this.f5833a.f(fragment);
            if (q.D0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Fragment ");
                sb.append(fragment);
                sb.append(" has been inflated via the <fragment> tag: id=0x");
                sb.append(Integer.toHexString(resourceId));
            }
        } else if (!fragment.mInLayout) {
            fragment.mInLayout = true;
            q qVar2 = this.f5833a;
            fragment.mFragmentManager = qVar2;
            fragment.mHost = qVar2.q0();
            fragment.onInflate(this.f5833a.q0().f(), attributeSet, fragment.mSavedFragmentState);
            wVar = this.f5833a.s(fragment);
            if (q.D0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Retained Fragment ");
                sb2.append(fragment);
                sb2.append(" has been re-attached via the <fragment> tag: id=0x");
                sb2.append(Integer.toHexString(resourceId));
            }
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        FragmentStrictMode.g(fragment, viewGroup);
        fragment.mContainer = viewGroup;
        wVar.m();
        wVar.j();
        View view2 = fragment.mView;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.mView.getTag() == null) {
                fragment.mView.setTag(string);
            }
            fragment.mView.addOnAttachStateChangeListener(new a(wVar));
            return fragment.mView;
        }
        throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
    }
}
