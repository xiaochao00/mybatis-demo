package org.shch.mybatis.demos.demo01.dao;

import org.shch.mybatis.demos.demo01.model.UserPo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author shichao
 * @since 2022/06/05 17:13
 **/
@Mapper
public interface UserMapper {
    /**
     * 查询用户列表
     *
     * @return 用户列表
     */
    List<UserPo> queryList();
}
