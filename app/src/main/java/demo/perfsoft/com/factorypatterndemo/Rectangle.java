package demo.perfsoft.com.factorypatterndemo;

import android.util.Log;

/**
 * Created by Tong Hung on 28-Mar-17.
 */

public class Rectangle implements Shape {
    @Override
    public void draw() {
        Log.i("HUNG", "Drawing rectangle shape");
    }
}
