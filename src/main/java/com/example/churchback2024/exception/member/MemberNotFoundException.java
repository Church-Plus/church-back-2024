package com.example.churchback2024.exception.member;

public class MemberNotFoundException extends RuntimeException{
    public MemberNotFoundException() {
        super("존재하지 않는 회원입니다.");
    }
}