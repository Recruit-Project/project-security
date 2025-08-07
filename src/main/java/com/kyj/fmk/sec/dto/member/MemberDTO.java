package com.kyj.fmk.sec.dto.member;

import com.kyj.fmk.sec.jwt.JWTUtil;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class MemberDTO {
    private long usrSeqId;
    private String email;
    private String usrId;
    private String nickname;
    private String dtyCd;
    private int career;
    private String isDel;
    private String role;
    private List<String> skillCds;


}
