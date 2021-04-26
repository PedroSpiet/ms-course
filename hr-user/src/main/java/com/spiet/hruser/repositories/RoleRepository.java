package com.spiet.hruser.repositories;

import com.spiet.hruser.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
