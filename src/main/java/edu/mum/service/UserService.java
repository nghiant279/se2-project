package edu.mum.service;

import edu.mum.model.Message;
import edu.mum.model.User;

import java.util.List;

public interface UserService {

    Boolean validatePassword(String password, User user);

    User addUser(User user);

    User updateUser(User user);

    User changePassword(String newPassword, User user);

    User findByEmail(String email);

    List<Message> getLast5UnreadNotifyMessageByUserEmail(String email);
}
