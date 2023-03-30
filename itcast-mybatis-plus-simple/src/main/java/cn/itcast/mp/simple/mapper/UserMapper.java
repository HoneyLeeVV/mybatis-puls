package cn.itcast.mp.simple.mapper;

import cn.itcast.mp.simple.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * @Description
 * @Author:星海
 * @CreateTime:2023/3/3016:10
 */
public interface UserMapper extends BaseMapper<User> {
    List<User> findAll();
}
