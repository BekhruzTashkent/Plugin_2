package ut.com.atlassian.tutorial.myPlugin;

import com.atlassian.tutorial.myPlugin.api.MyPluginComponent;
import com.atlassian.tutorial.myPlugin.impl.MyPluginComponentImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest {
    @Test
    public void testMyName() {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent", component.getName());
    }
}