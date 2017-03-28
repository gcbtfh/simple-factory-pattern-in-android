package demo.perfsoft.com.factorypatterndemo;

import android.util.Log;

/**
 * Created by Tong Hung on 28-Mar-17.
 */

public class Circle implements Shape {
    @Override
    public void draw() {
        Log.i("HUNG", "Drawing circle shape");
    }
}
