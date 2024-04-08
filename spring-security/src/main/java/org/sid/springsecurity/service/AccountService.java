package org.sid.springsecurity.service;

import org.sid.springsecurity.bean.AppRole;
import org.sid.springsecurity.bean.AppUser;

import java.util.List;

public interface AccountService {
    AppUser addNewUser(AppUser appUser);
    AppRole addNewRole(AppRole appRole);
    void addRoleToUser(String username ,String roleName);
    AppUser loadUserByUsername(String username);
    List<AppUser> listUsers();
}
