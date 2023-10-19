import com.fasterxml.jackson.databind.ObjectMapper;
import readData.User;
import readData.UserData;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<User> users;

        // Read JSON data and load it into the 'users' list
        ObjectMapper objectMapper = new ObjectMapper();
        UserData userData = objectMapper.readValue(new File("C:\\Users\\Emumba\\IdeaProjects\\xcloud-login\\src\\test\\resources\\testData\\credentials.json"), UserData.class);
        users = userData.getUsers();
        for (User user : users) {
            System.out.println(user.getEmail() + user.getPassword());
        }
    }
}