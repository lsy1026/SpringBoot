package com.backbone.core.user;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Item, Long> {
	//쿼리 작성
}
