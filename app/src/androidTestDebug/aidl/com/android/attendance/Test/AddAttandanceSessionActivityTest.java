package com.android.attendance.Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.android.attendance.activity.Model.AddAttandanceSessionActivity;

import static org.junit.Assert.*;

public class AddAttandanceSessionActivityTest {
    AddAttandanceSessionActivity add;
    @Before
    public void setUp() throws Exception {
        add = new AddAttandanceSessionActivity();
    }

    @Test
    public void testSetId(){
        add.setId(5);
        assertEquals(5, add.getId());
    }

    @Test
    public void testGetId(){
        assertEquals(5, add.getId());
    }

}
