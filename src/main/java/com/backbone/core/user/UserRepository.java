package com.backbone.core.user;
import java.util.List;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
//@EnableJpaRepositories(basePackages = "com.backbone.core.user")
@EntityScan(basePackages = "com.backbone.core.user")
public interface UserRepository extends JpaRepository<User, Long> {
	//쿼리 작성
	List<User> findByName(String name);
}
