package com.lyk.coursearrange.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.lyk.coursearrange.entity.ClassInfo;
import com.lyk.coursearrange.dao.ClassInfoDao;
import com.lyk.coursearrange.service.ClassInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lequal
 * @since 2020-03-06
 */
@Service
public class ClassInfoServiceImpl extends ServiceImpl<ClassInfoDao, ClassInfo> implements ClassInfoService {

    @Autowired
    ClassInfoDao classInfoDao;

    @Override
    public List<ClassInfo> getClassInfoList(String grade) {
        List<ClassInfo> list = new ArrayList<>();
        if (StringUtils.isEmpty(grade)){
            return list;
        }

        LambdaQueryWrapper<ClassInfo> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(ClassInfo::getRemark,grade);
        list = classInfoDao.selectList(queryWrapper);
        return list;
    }
}
