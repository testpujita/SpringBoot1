package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springboot.model.users;
import net.javaguides.springboot.service.UsersService;

 
public interface UsersRepository extends JpaRepository<users, Long> {
 



}
