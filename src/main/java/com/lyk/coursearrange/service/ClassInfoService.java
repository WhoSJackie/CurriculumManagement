package com.lyk.coursearrange.service;

import com.lyk.coursearrange.entity.ClassInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 *
 * @author lequal
 * @since 2020-03-06
 */
public interface ClassInfoService extends IService<ClassInfo> {

    List<ClassInfo>  getClassInfoList(String grade);

}
