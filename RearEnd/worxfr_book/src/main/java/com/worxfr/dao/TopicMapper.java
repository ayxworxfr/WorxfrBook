package com.worxfr.dao;

import com.worxfr.pojo.Topic;

public interface TopicMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Topic record);

    int insertSelective(Topic record);

    Topic selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Topic record);

    int updateByPrimaryKey(Topic record);
}