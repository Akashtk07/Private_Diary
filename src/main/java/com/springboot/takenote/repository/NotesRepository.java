package com.springboot.takenote.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.takenote.entity.Notes;
import com.springboot.takenote.entity.User;

public interface NotesRepository extends JpaRepository<Notes, Integer> {
	
	
	List<Notes> findByUser(User user);

}
