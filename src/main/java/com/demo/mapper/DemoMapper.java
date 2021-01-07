package com.demo.mapper;

import com.demo.pojo.Demo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DemoMapper {

	boolean save(Demo demo);

	Demo getById(Long id);

	List<Demo> list();
}
