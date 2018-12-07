package com.zhangshuo.tservice.service.impl;

import com.zhangshuo.tservice.model.Student;
import com.zhangshuo.tservice.mapper.StudentMapper;
import com.zhangshuo.tservice.service.StudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhangshuo
 * @since 2018-12-07
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

}
