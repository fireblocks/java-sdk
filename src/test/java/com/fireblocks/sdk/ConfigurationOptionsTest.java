import org.junit.Test;
import org.junit.Assert;
import com.fireblocks.sdk.ConfigurationOptions;
import com.fireblocks.sdk.AdditionalOptions;

public class ConfigurationOptionsTest {

    @Test
    public void testApiKey() {
        ConfigurationOptions options = new ConfigurationOptions();
        options.apiKey("testApiKey");
        Assert.assertEquals("testApiKey", options.getApiKey());
    }

    @Test
    public void testSecretKey() {
        ConfigurationOptions options = new ConfigurationOptions();
        options.secretKey("testSecretKey");
        Assert.assertEquals("testSecretKey", options.getSecretKey());
    }

    @Test
    public void testBasePath() {
        ConfigurationOptions options = new ConfigurationOptions();
        options.basePath("testBasePath");
        Assert.assertEquals("testBasePath", options.getBasePath());
    }

    @Test
    public void testAdditionalOptions() {
        ConfigurationOptions options = new ConfigurationOptions();
        AdditionalOptions additionalOptions = new AdditionalOptions();
        options.additionalOptions(additionalOptions);
        Assert.assertEquals(additionalOptions, options.getAdditionalOptions());
    }
}
