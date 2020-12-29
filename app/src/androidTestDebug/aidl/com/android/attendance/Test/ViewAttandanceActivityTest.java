package com.android.attendance.Test;

import com.android.attendance.activity.Controller.ViewAttandanceActivity;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ViewAttandanceActivityTest {
    ViewAttandanceActivity v;

    @Before
    public void setUp() throws Exception {
        v=new ViewAttandanceActivity();
    }



    @Test
    public void testSetname() {
       v.setName("B");
       assertEquals("B",v.getName());
    }

    @Test
    public void testGetname() {
        assertEquals("B",v.getName());

    }
}