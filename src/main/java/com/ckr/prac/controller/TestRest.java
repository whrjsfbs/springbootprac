package com.ckr.prac.controller;

import com.ckr.prac.entity.TestDTO;
import com.ckr.prac.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/apis")
public class TestRest {
    private static final Logger logger = LoggerFactory.getLogger(TestRest.class);

    @Autowired
    UserService userService;

    @GetMapping(path = "/user")
    public @ResponseBody String user(HttpSession session) {
        logger.info("/user");
        userService.getUsers();
        return "OK";
    }

    @GetMapping(path = "/exam")
    public @ResponseBody String test(HttpSession session) {
        logger.info(session.toString());
        logger.info("slf4j conglaturation");
        return "OK";
    }

    @PostMapping(path = "/exam2", params="list")
    public @ResponseBody String test2(@RequestBody List<TestDTO> a, HttpSession session) {
        logger.info(session.toString());
        a.stream().forEach(i -> System.out.println(i.getAge()));

        return "OK2";
    }

    @PostMapping(path = "/exam3")
    public @ResponseBody String test2(@Valid @RequestBody TestDTO a, BindingResult result, HttpSession session) {
        if(result.hasErrors())
            System.out.println("error age");
        logger.info(session.toString());
        System.out.println(a.getAge());

        return "OK2";
    }
}
