package com.tiger.totem.service;

import com.tiger.totem.mapper.AuthorityMapper;
import com.tiger.totem.model.UserVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author tiger_xi
 * @Date 2020/1/4
 * @Description: ...
 **/
@Service
public class AuthorityService {
    private Logger logger = LoggerFactory.getLogger(AuthorityService.class);
    @Autowired
    private AuthorityMapper authorityMapper;

    public UserVO qryUserByAccount(String account, String password) {
        try {
            UserVO userVOS = authorityMapper.qryUserByAccount(account, password);
            return userVOS;
        } catch (Exception ex) {
            logger.info("AuthorityService.qryUserByAccount", ex);
            return null;
        }
    }
}
