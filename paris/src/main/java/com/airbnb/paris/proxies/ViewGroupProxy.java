package com.airbnb.paris.proxies;

import android.animation.LayoutTransition;
import android.view.ViewGroup;

import com.airbnb.paris.R2;
import com.airbnb.paris.annotations.Attr;
import com.airbnb.paris.annotations.Styleable;

@Styleable(value = "Paris_ViewGroup")
public class ViewGroupProxy extends BaseProxy<ViewGroupProxy, ViewGroup> {

    public ViewGroupProxy(ViewGroup view) {
        super(view);
    }

    @Attr(R2.styleable.Paris_ViewGroup_android_animateLayoutChanges)
    public void setAnimateLayoutChanges(boolean animateLayoutChanges) {
        getView().setLayoutTransition(animateLayoutChanges ? new LayoutTransition() : null);
    }

    @Attr(R2.styleable.Paris_ViewGroup_android_clipChildren)
    public void setClipChildren(boolean clipChildren) {
        getView().setClipChildren(clipChildren);
    }

    @Attr(R2.styleable.Paris_ViewGroup_android_clipToPadding)
    public void setClipToPadding(boolean clipToPadding) {
        getView().setClipToPadding(clipToPadding);
    }
}
