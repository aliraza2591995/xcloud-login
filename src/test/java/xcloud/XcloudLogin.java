package xcloud;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.io.IOException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class XcloudLogin {
    NavigateActions navigate;
    LoginAction login;
    GetTextForAssertions getText;

    @Test
    void successfulLogin() throws IOException {
        navigate.tmeExtremeCloudLoginPage();
        login.enterCredentials();
        Serenity.reportThat("The username should appear in the heading",
                () -> assertThat(getText.tmeUserName()).isEqualTo("Azfar Altaf")
        );
        navigate.ztaExtremeCloudPage();
        Serenity.reportThat("The username should appear in the heading",
                () -> assertThat(getText.ztaUserName()).isEqualTo("Azfar Altaf")
        );
    }
}