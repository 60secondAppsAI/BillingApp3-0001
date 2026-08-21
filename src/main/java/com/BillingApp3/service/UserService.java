package com.BillingApp3.service;

import java.util.List;
import java.util.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.BillingApp3.domain.User;
import com.BillingApp3.dto.UserDTO;
import com.BillingApp3.dto.UserSearchDTO;
import com.BillingApp3.dto.UserPageDTO;
import com.BillingApp3.dto.UserConvertCriteriaDTO;
import com.BillingApp3.service.GenericService;
import com.BillingApp3.dto.common.RequestDTO;
import com.BillingApp3.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface UserService extends GenericService<User, Integer> {

	List<User> findAll();

	ResultDTO addUser(UserDTO userDTO, RequestDTO requestDTO);

	ResultDTO updateUser(UserDTO userDTO, RequestDTO requestDTO);

    Page<User> getAllUsers(Pageable pageable);

    Page<User> getAllUsers(Specification<User> spec, Pageable pageable);

	ResponseEntity<UserPageDTO> getUsers(UserSearchDTO userSearchDTO);
	
	List<UserDTO> convertUsersToUserDTOs(List<User> users, UserConvertCriteriaDTO convertCriteria);

	UserDTO getUserDTOById(Integer userId);



	
}
