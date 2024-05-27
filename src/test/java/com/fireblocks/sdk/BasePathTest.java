import org.junit.Test;
import org.junit.Assert;
import com.fireblocks.sdk.BasePath;

public class BasePathTest {

    @Test
    public void testSandboxUrl() {
        Assert.assertEquals("https://sandbox-api.fireblocks.io/v1", BasePath.Sandbox.getUrl());
    }

    @Test
    public void testUSUrl() {
        Assert.assertEquals("https://api.fireblocks.io/v1", BasePath.US.getUrl());
    }

    @Test
    public void testEUUrl() {
        Assert.assertEquals("https://eu-api.fireblocks.io/v1", BasePath.EU.getUrl());
    }

    @Test
    public void testEU2Url() {
        Assert.assertEquals("https://eu2-api.fireblocks.io/v1", BasePath.EU2.getUrl());
    }
}
