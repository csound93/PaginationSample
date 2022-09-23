package kr.co.netcom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.co.netcom.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}