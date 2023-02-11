package com.example.demo.service;

import java.util.ArrayList;

import com.example.demo.entity.Member;

public class MemberServiceImpl implements MemberService {

    @Override
    public String greet(int i) {
        String[] greetings = { "Good Morning", "Hello", "Good Evening" };
        return greetings[i];
    }

    @Override
    public ArrayList<Member> getAll() {
        ArrayList<Member> list = new ArrayList<>();
        Member member1 = new Member(1, "Linda", "linda@example.com");
        Member member2 = new Member(2, "James", "james@example.com");
        list.add(member1);
        list.add(member2);
        return list;
    }

}
