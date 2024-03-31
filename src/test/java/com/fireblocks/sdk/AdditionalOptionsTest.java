
import com.fireblocks.sdk.AdditionalOptions;
import org.junit.Assert;
import org.junit.Test;

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
