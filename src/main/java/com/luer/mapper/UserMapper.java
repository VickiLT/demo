package com.luer.mapper;

import com.luer.dto.param.LoginParam;

/**
 * Created by sunjiaxin on 2017/8/10.
 */
public interface UserMapper {

    boolean login(LoginParam loginParam);
}
