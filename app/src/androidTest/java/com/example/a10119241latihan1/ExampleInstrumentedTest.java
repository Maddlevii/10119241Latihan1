package com.example.a10119241latihan1;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.a10119251latihan1", appContext.getPackageName());
    }
}
<!--Tanggal Pengerjaan : 17-18 April 2022-->
<!--NIM : 10119241-->
<!--Nama : Ahmad Fahmi Fahlevi-->
<!--Kelas : IF6-->
