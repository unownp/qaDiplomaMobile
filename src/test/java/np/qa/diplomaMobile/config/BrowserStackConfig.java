package np.qa.diplomaMobile.config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config/browserstack.properties"})
public interface BrowserStackConfig extends Config {
    String user();
    String key();
    String app();
}