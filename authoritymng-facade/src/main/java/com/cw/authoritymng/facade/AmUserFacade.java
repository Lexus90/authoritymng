package com.cw.authoritymng.facade;

import com.cw.authoritymng.facade.model.AmUserDTO;
import com.cw.authoritymng.facade.page.Page;
import com.cw.authoritymng.facade.response.Response;

import java.util.List;

/**
 * @author caowei E-mail:18801796602@163.com on 2018/10/27
 * @version v1.0
 */
public interface AmUserFacade {

    public Response<Boolean> add(AmUserDTO amUserDTO);

    public Response<AmUserDTO> get(AmUserDTO amUserDTO);

    public Response<List<AmUserDTO>> listAmUser(AmUserDTO amUserDTO);

    public Response<Page<AmUserDTO>> listPage(AmUserDTO userDTO, int pageNum, int pageSize);

    public Response<AmUserDTO> update(AmUserDTO amUserDTO);


}
