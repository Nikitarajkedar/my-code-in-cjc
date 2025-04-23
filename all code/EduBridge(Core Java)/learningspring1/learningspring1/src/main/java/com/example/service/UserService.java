
package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.repo.UserRepository;

@Service
public class UserService {
	@Autowired // getter /setter /constructor

	private UserRepository ar;

	public List<User> getUser() {

		return ar.findAll();
	}

	public User addUser(User a) {
		return ar.save(a);
	}

	public User updateUSer(User u) {
		User unew=ar.findById(u.getUserID()).get();
		unew.setFullName(u.getFullName());
		unew.setUserEmailID(u.getUserEmailID());
		unew.setUserPassword(u.getUserPassword());
		unew.setPhoneNumber(u.getPhoneNumber());
		unew.setRole(u.getRole());
		return ar.save(unew);
	}

	public void deleteUser(int id) {
		User u = ar.getById(id);
		ar.delete(u);
		
	}
	
	
	public long countUsers() {
	return ar.countUsers();
	}
	public List<User> findByOrderByFullNameAsc(){
	return ar.findByOrderByFullNameAsc();
	}

	public List<User> findByFullNameStartingWith(String a){
	return ar.findByFullNameStartingWith(a);
	}

	public Optional<User> getUserByID(int id) {
		return ar.findById(id);
	}
	
	


}
