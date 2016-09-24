package es.upm.miw.iwvg.swc.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
    private User user;

    @Before
    public void init() {
        user = new User(666, "Javier", "Reyes");
    }

    @Test
    public void testUser() {
        assertEquals(666, user.getNumber());
        assertEquals("Javier", user.getName());
        assertEquals("Reyes", user.getFamilyName());
    }

    @Test
    public void testFullName() {
        assertEquals("Javier" + " " + "Reyes", user.fullName());
    }

    @Test
    public void testInitials() {
        assertEquals("J" + ".", user.initials());
    }

    @Test
    public void testGetNumber() {
        assertEquals(666, user.getNumber());
    }

    @Test
    public void testGetName() {
        assertEquals("Javier", user.getName());
    }

    @Test
    public void testGetFamilyName() {
        assertEquals("Reyes", user.getFamilyName());
    }
    
    @Test
    public void testNameToUpperCase() {
    	assertEquals("JAVIER", user.nameToUpperCase());
    }
}
