package auth.pragyanvarshney.in.repository;

import auth.pragyanvarshney.in.models.Role;
import auth.pragyanvarshney.in.models.RolesEnums;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RolesEnums name);
}
