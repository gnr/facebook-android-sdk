package com.facebook.android;

import android.content.Context;
import android.webkit.WebView;

public class FacebookWebView extends WebView {

    public FacebookWebView(Context context) {
        super(context);
    }
    
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        // workaround for crash seen in android market
        try {
            super.onWindowFocusChanged(hasFocus);
        } catch (NullPointerException npe) {
            // swallow
        }
    }
}
