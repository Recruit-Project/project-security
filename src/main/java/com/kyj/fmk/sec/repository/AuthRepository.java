package com.kyj.fmk.sec.repository;

import com.kyj.fmk.sec.mapper.AuthMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class AuthRepository {

    private final AuthMapper authMapper;
    public Boolean isExist(String usrId){
        return authMapper.isExist(usrId);
    }
}
