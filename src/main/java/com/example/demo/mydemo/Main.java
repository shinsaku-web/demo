package com.example.demo.mydemo;

import java.util.ArrayList;

import com.example.demo.entity.Member;
import com.example.demo.service.MemberService;
import com.example.demo.service.MemberServiceImpl;

public class Main {
    public static void main(String[] args) {
        // MemberServiceImpl service = new MemberServiceImpl();
        MemberService service = MemberServiceImpl.getInstance();
        System.out.println(service.greet(0));
        System.out.println(service.greet(1));
        System.out.println(service.greet(2));
        System.out.println(service.getAll());
        ArrayList<Member> list = service.getAll();
        for (Member member : list) {
            System.out.println(member.getName());
        }
    }
}
