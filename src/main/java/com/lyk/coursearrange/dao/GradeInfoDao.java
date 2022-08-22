package com.lyk.coursearrange.dao;

import com.lyk.coursearrange.entity.GradeInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lequal
 * @since 2020-03-20
 */
@Mapper
@Repository
public interface GradeInfoDao extends BaseMapper<GradeInfo> {

}
