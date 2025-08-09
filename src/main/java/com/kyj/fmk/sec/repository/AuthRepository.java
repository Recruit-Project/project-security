package com.kyj.fmk.sec.repository;

import com.kyj.fmk.sec.mapper.AuthMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
/**
 *  * 2025-08-09
 *  * @author 김용준
 *  * 스프링 시큐리티에서 인증관련 repo
 *  */
@Repository
@RequiredArgsConstructor
public class AuthRepository {

    private final AuthMapper authMapper;

    /**
     * 해당 유저아이디에 해당하는 데이터베이스가 존재하는지 확인하는 repo
     * @param usrId
     * @return
     */
    public Boolean isExist(String usrId){
        return authMapper.isExist(usrId);
    }
}
