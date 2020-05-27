package com.xinheng.backfinish.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class BuildLayerFrameLayout extends FrameLayout{

    public BuildLayerFrameLayout(Context context) {
        super(context);
        if (KugouLayout.USE_TRANSLATIONS) {
            //提高动画性能，缓存
            setLayerType(LAYER_TYPE_HARDWARE, null);
        }
    }

    public BuildLayerFrameLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        if (KugouLayout.USE_TRANSLATIONS) {
            setLayerType(LAYER_TYPE_HARDWARE, null);
        }
    }

    public BuildLayerFrameLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        if (KugouLayout.USE_TRANSLATIONS) {
            setLayerType(LAYER_TYPE_HARDWARE, null);
        }
    }


}
