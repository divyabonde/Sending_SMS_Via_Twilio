package com.sms.SMS_Send.repository;

import com.sms.SMS_Send.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
