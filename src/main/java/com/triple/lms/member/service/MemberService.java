package com.triple.lms.member.service;

import com.triple.lms.member.model.MemberInput;

public interface MemberService {

    boolean register(MemberInput parameter);

    /**
     *  uuid에 해당하는 계정을 활성화
     */
    boolean emailAuth(String uuid);
}
