package com.android.attendance.Test;

import com.android.attendance.activity.Model.AddAttendanceActivity;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddAttendanceActivityTest {
    AddAttendanceActivity ad2;

    @Before
    public void setUp() throws Exception {
        ad2 = new AddAttendanceActivity();
    }

    @Test
    public void testSetId(){
        ad2.setattendanceId(10,"M");
        assertEquals(10, ad2.getattendanceId());
    }

    @Test
    public void testGetId(){
        assertEquals(10, ad2.getattendanceId());
    }

}