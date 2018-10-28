package com.cw.authoritymng.biz;

import com.cw.authoritymng.biz.Converter.ConverterUtils;
import com.cw.authoritymng.dao.model.AmUser;
import com.cw.authoritymng.facade.AmUserFacade;
import com.cw.authoritymng.facade.ResultType.ResultType;
import com.cw.authoritymng.facade.model.AmUserDTO;
import com.cw.authoritymng.facade.page.Page;
import com.cw.authoritymng.facade.response.Response;
import com.cw.authoritymng.service.AmUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author caowei E-mail:18801796602@163.com on 2018/10/27
 * @version v1.0
 */

@Service(value = "amUserBiz")
public class AmUserBiz implements AmUserFacade {

    @Autowired
    AmUserService amUserService;

    public Response<Boolean> add(AmUserDTO amUserDTO) {
        Response<Boolean> resp = new Response<Boolean>();
        AmUser user = ConverterUtils.convert(amUserDTO, AmUser.class);
        try {
            amUserService.addUser(user);
            resp.setData(true);
        } catch (Exception e) {
            resp.setResult(ResultType.SYSTEM_ERROR);
            resp.setData(false);
        }
        return resp;
    }

    public Response<AmUserDTO> get(AmUserDTO amUserDTO) {
        return null;
    }

    public Response<List<AmUserDTO>> listAmUser(AmUserDTO amUserDTO) {
        return null;
    }

    public Response<Page<AmUserDTO>> listPage(AmUserDTO userDTO, int pageNum, int pageSize) {
        Response<Page<AmUserDTO>> resp = new Response<Page<AmUserDTO>>();
        try {
            AmUser user = ConverterUtils.convert(userDTO, AmUser.class);
            List<AmUserDTO> lit = ConverterUtils.convertList(amUserService.listPage(user, pageNum, pageSize), AmUserDTO.class);
            long tatol = amUserService.count(user);
            Page<AmUserDTO> page = new Page<AmUserDTO>(lit, tatol);
            page.setCurrent(pageNum);
            page.setPageSize(pageSize);
            resp.setData(page);
        } catch (Exception e) {
            resp.setResult(ResultType.SYSTEM_ERROR);
        }
        return resp;
    }

    public Response<AmUserDTO> update(AmUserDTO amUserDTO) {
        return null;
    }

}
