package com.cc.springbootredistest.mapper;

import com.cc.springbootredistest.cache.RedisMybatisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@CacheNamespace(implementation = RedisMybatisCache.class)
@Mapper
public interface CacheMapper {
    @Select("select name from student where id = 1")
    String getid();
}
