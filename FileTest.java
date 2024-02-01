import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class FileTest {
    @Test
    public void testGetFilesWithValidDirectory() throws IOException {
        File f = new File("lib/");
        FileExample.getFiles(f);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("lib\\hamcrest-core-1.3.jar");
        expected.add("lib\\junit-4.13.2.jar");
        assertEquals(expected.toString(),FileExample.getFiles(f).toString());

    }
}
