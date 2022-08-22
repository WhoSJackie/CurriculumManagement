package com.lyk.coursearrange.dao;

import com.lyk.coursearrange.entity.Exercise;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lequal
 * @since 2020-05-21
 */
@Mapper
@Repository
public interface ExerciseDao extends BaseMapper<Exercise> {

}
