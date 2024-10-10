package com.crio.stayEase.authServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.crio.stayEase.dto.UserDto;
import com.crio.stayEase.mapper.Mapper;
import com.crio.stayEase.repositoryServices.UserRepositoryService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private final UserRepositoryService userRepositoryService;

    @Override
    public UserDetails loadUserByUsername(String username) {
        UserDto userDto = userRepositoryService.findUserByEmail(username);
        return Mapper.mapToUser(userDto);
    }
    
}