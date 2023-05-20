package com.tang.BoardStudy.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

import com.tang.BoardStudy.user.UserRole;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@Entity
public class SiteUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username; //id

    private String password; //패스워드

    @Column(unique = true)
    private String email; //이메일
    
    private LocalDateTime create_userTime = LocalDateTime.now(); //회원 생성 시간
    
    @Enumerated(EnumType.STRING)
    private UserRole role;
    
    private int partner = 0; // 파트너 여부 1: 파트너임 , 0: 파트너 아님 , 기본값은 0 으로 지정
    
    private int admin =0 ;  // 관리자 여부 1: 관리자임, 0:관리자 아님  , 기본값은 0으로 지정
   
}