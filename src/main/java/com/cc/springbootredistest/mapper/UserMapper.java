package com.cc.springbootredistest.mapper;

import com.cc.springbootredistest.cache.RedisMybatisCache;
import com.cc.springbootredistest.entity.Account;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@CacheNamespace(implementation = RedisMybatisCache.class)
@Mapper
public interface UserMapper {
    @Select("select * from user where username = #{username}")
    Account getAccountByUsername(String username);
}
