package com.example.mykeyboard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.widget.AppCompatButton;

public class AccessibleKeyboardButton extends AppCompatButton {

    public AccessibleKeyboardButton(Context context) {
        super(context);
        init();
    }

    public AccessibleKeyboardButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public AccessibleKeyboardButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        setClickable(true);
        setFocusable(true);
        setImportantForAccessibility(View.IMPORTANT_FOR_ACCESSIBILITY_YES);
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        super.onInitializeAccessibilityNodeInfo(info);
        // Customize accessibility information
        info.setClassName(AccessibleKeyboardButton.class.getName());
        info.setText(getText() + " button");
        info.setContentDescription(getText() + " keyboard key");
    }
}