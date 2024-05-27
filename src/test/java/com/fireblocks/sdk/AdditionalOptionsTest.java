import org.junit.Test;
import org.junit.Assert;
import com.fireblocks.sdk.AdditionalOptions;

public class AdditionalOptionsTest {

    @Test
    public void testIsAnonymousPlatform() {
        AdditionalOptions options = new AdditionalOptions();
        options.isAnonymousPlatform(true);
        Assert.assertEquals(true, options.isAnonymousPlatform());
    }

    @Test
    public void testUserAgent() {
        AdditionalOptions options = new AdditionalOptions();
        options.userAgent("testUserAgent");
        Assert.assertEquals("testUserAgent", options.getUserAgent());
    }
}
