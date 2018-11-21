package io.qala.javatraining;


import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class FailingTest {
    @Test public void strangeFailure() throws Exception {
//        String file = ClassLoader.getSystemResource("myresource.txt").getFile();
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("myresource.txt");
        assertEquals(inputStream.read(), 49);
    }
}
