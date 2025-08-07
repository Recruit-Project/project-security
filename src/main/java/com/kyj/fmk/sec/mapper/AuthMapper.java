package com.kyj.fmk.sec.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AuthMapper {
    public Boolean isExist(String usrId);
}
