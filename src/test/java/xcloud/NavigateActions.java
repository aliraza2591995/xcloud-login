package xcloud;

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
}