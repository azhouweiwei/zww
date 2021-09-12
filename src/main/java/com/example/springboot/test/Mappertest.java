package com.example.springboot.test;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface Mappertest{
    @Select("SELECT * FROM test.testa where a=1")
    List<Map<Object,String>> ss();
}
