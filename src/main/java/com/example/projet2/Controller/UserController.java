package com.example.projet2.Controller;

import com.example.projet2.Model.User;
import com.example.projet2.Service.UserService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.awt.*;
import java.security.Principal;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/inscription")
public class UserController {

    private final UserService  userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public String showInscription(Model model) {

            User user = new User();
            model.addAttribute("user", user);
            return "pages/user/Inscription";

    }

    @PostMapping("/process_register")
    public String processRegister(User user) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        user.setRole("USER");
        userService.createUser(user);
        return "pages/user/Inscription";
    }
    @GetMapping("/userDetail/{username}")
    public String showDetail(@PathVariable String username, Model model, Principal principal) {

        Optional<User> user =
                userService.readOneUser(username);
        Optional<User> updateUser = userService.findById(user.get().getIdUser());
        model.addAttribute("user", updateUser.get());
        return "pages/user/user_edit";
    }

    @PostMapping("edituser")
    public RedirectView editUser(User user) {
        Optional<User> updatedUser = userService.readOneUser(user.getUsername());
        user.setIdUser(updatedUser.get().getIdUser());
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        user.setRole("USER");
        userService.createUser(user);
        return new RedirectView("/coach");

    }
}
