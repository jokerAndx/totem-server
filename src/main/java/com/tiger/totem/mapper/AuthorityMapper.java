package com.tiger.totem.mapper;

import com.tiger.totem.model.UserVO;
import org.apache.ibatis.annotations.Param;

/**
 * @Author tiger_xi
 * @Date 2020/1/4
 * @Description: ...
 **/
public interface AuthorityMapper {
    /**
     * 获取账号对应的用户信息
     * @param account
     * @param password
     * @return
     */
    UserVO qryUserByAccount(@Param("acc") String account, @Param("pwd") String password);
}
