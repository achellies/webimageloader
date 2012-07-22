package com.webimageloader;

import android.content.ContentResolver;
import android.content.Context;

public class URLUtil {
    public static String resourceUrl(Context c, int resId) {
        return createUrl(ContentResolver.SCHEME_ANDROID_RESOURCE, c.getPackageName(), String.valueOf(resId));
    }

    public static String assetUrl(String path) {
        return createUrl(ContentResolver.SCHEME_FILE, "/android_asset", path);
    }

    private static String createUrl(String scheme, String authority, String path) {
        return scheme + "://" + authority + "/" + path;
    }

    private URLUtil() {}
}