package com.backbone.core.user.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

//@MapperScan("com.backbone.core.user.mapper")
@Mapper
public interface UserMapper {
	List<Map<String, Object>> getAllUser();
	List<Map<String, Object>> getUsersByUsername(String username);
}
