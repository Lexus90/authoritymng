package com.cw.authoritymng.service.impl;

import com.cw.authoritymng.dao.mapper.AmUserMapper;
import com.cw.authoritymng.dao.model.AmUser;
import com.cw.authoritymng.dao.model.AmUserExample;
import com.cw.authoritymng.service.AmUserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "amUserService")
public class AmUserServiceImpl implements AmUserService {

    @Autowired
    private AmUserMapper amUserMapper;

    public int addUser(AmUser amUser) {
        return amUserMapper.insert(amUser);
    }

    public List<AmUser> listPage(AmUser amUser, int pageNum, int pageSize) {
        AmUserExample userExample = new AmUserExample();
        AmUserExample.Criteria criteria = userExample.createCriteria();

        if (StringUtils.isNoneBlank(amUser.getUserName())) {
            criteria.andUserNameLike("%" + amUser.getUserName() + "%");
        }

        if (StringUtils.isNoneBlank(amUser.getUserCode())) {
            criteria.andUserCodeLike("%" + amUser.getUserCode() + "%");
        }

        PageHelper.startPage(pageNum, pageSize);
        userExample.setOrderByClause("user_name asc");
        return amUserMapper.selectByExample(userExample);
    }

    public long count(AmUser amUser) {
        AmUserExample userExample = new AmUserExample();
        AmUserExample.Criteria criteria = userExample.createCriteria();
        if (StringUtils.isNoneBlank(amUser.getUserName())) {
            criteria.andUserNameLike("%" + amUser.getUserName() + "%");
        }

        if (StringUtils.isNoneBlank(amUser.getUserCode())) {
            criteria.andUserCodeLike("%" + amUser.getUserCode() + "%");
        }
        return amUserMapper.countByExample(userExample);
    }
}
