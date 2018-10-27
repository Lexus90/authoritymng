package com.cw.authoritymng.service.impl;

import com.cw.authoritymng.dao.mapper.AmUserMapper;
import com.cw.authoritymng.dao.model.AmUser;
import com.cw.authoritymng.service.AmUserService;
import com.github.pagehelper.PageHelper;
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

    public List<AmUser> listAllUser(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return amUserMapper.selectAllAmUser();
    }
}
