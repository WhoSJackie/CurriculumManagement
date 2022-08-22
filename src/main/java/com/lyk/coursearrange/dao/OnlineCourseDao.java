package com.lyk.coursearrange.dao;

import com.lyk.coursearrange.entity.OnlineCourse;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lequal
 * @since 2020-06-04
 */
@Mapper
@Repository
public interface OnlineCourseDao extends BaseMapper<OnlineCourse> {

}
