package com.icolak.service;

import com.icolak.dto.RoleDTO;
import com.icolak.exception.UserServiceException;

import java.util.List;

public interface RoleService {

    List<RoleDTO> listAllRoles();
    RoleDTO findById(Long id) throws UserServiceException;
}
