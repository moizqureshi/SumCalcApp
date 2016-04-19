package com.example.moizqureshi.sumcalc.tests;
import android.test.ActivityInstrumentationTestCase2;

import com.example.moizqureshi.sumcalc.MainActivity;
/**
 * Created by moizqureshi on 4/18/16.
 */
public class JUnit_testSum extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity mainActivity;

    public JUnit_testSum() {
        super(MainActivity.class);
    }

    public void test_sumNums() {
        mainActivity = getActivity();

        double a, b, c, d;
        double x, w, y, z;

        a = 10.0;
        b = -1.0;
        c = 1.0;
        d = -10.0;

        w = mainActivity.sumNums(5.0, 5.0);
        assertEquals(a, w);

        x = mainActivity.sumNums(-0.5, -0.5);
        assertEquals(b, x);

        y = mainActivity.sumNums(3.0, -2.0);
        assertEquals(c, y);

        z = mainActivity.sumNums(-20.0, 10.0);
        assertEquals(d, z);

    }


}
