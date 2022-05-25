package com.example.projet2.Security;

import com.example.projet2.Model.User;
import com.example.projet2.Repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserPrincipalDetailService implements UserDetailsService {

    private final UserRepository userRepository;

    public UserPrincipalDetailService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws
            UsernameNotFoundException {
        final User user =
                this.userRepository.findByUsername(s).orElseThrow(() -> new
                        UsernameNotFoundException("User login not found"));
        return new UserPrincipal(user);
    }

}

