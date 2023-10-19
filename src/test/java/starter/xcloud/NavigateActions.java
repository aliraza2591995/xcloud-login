package starter.xcloud;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.model.environment.ConfiguredEnvironment;
import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.thucydides.model.util.EnvironmentVariables;

public class NavigateActions extends UIInteractions {

    @Step("Navigate to the TME login page")
    public void tmeExtremeCloudLoginPage() {
        EnvironmentVariables environmentVariables = ConfiguredEnvironment.getConfiguration().getEnvironmentVariables();
        String baseUrl = EnvironmentSpecificConfiguration.from(environmentVariables)
                .getProperty("webdriver.base.url");

        String tmePrefix = EnvironmentSpecificConfiguration.from(environmentVariables)
                .getProperty("environment.prefix.tme");

        String loginUrl = tmePrefix + baseUrl + "/login";
        openUrl(loginUrl);
    }

    @Step("After logging in to TME, navigate to the ZTA page")
    public void ztaExtremeCloudPage() {
        EnvironmentVariables environmentVariables = ConfiguredEnvironment.getConfiguration().getEnvironmentVariables();
        String baseUrl = EnvironmentSpecificConfiguration.from(environmentVariables)
                .getProperty("webdriver.base.url");

        String ztaPrefix = EnvironmentSpecificConfiguration.from(environmentVariables)
                .getProperty("environment.prefix.zta");

        String ztaUrl = ztaPrefix + baseUrl + "/zta";
        openUrl(ztaUrl);
    }

//    @Step("Navigate to the tme login page")
//    public void tmeExtremeCloudLoginPage() {
//        String base = ConfiguredEnvironment.getEnvironmentVariables().getProperty("webdriver.base.url");
//        String prefix = ConfiguredEnvironment.getEnvironmentVariables().getProperty("environment.prefix.tme");
//        openUrl(prefix + base + "/login");
////        openUrl("https://tme.qa.xcloudiq.com/login");
//    }
//    @Step("After login to tme, navigate to the zta page")
//    public void ztaExtremeCloudPage() {
//        String base = ConfiguredEnvironment.getEnvironmentVariables().getProperty("webdriver.base.url");
//        String prefix = ConfiguredEnvironment.getEnvironmentVariables().getProperty("environment.prefix.zta");
//        openUrl(prefix + base + "/zta");
////        openUrl("https://zta-tme.qa.xcloudiq.com/zta");
//    }
}