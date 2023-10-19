package starter.xcloud;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.Before;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import readData.User;
import readData.UserData;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class LoginAction extends UIInteractions {
    @Step("Enter credentials")
    public void enterCredentials() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        UserData userData = objectMapper.readValue(new File("C:\\Users\\Emumba\\IdeaProjects\\xcloud-login\\src\\test\\resources\\testData\\credentials.json"), UserData.class);
        List<User> users = userData.getUsers();
        for (User user : users){
            $("//input[@class='email-text']").sendKeys(user.getEmail());
            $("//input[@class='password-text']").sendKeys(user.getPassword());
        }
        $("//input[@type='submit']").click();
    }
}