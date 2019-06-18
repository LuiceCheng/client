package com.example.springcloud.client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * description:
 *
 * @author:cxs
 * @date: 2019/6/13 9:47
 */
@RestController
public class UserController {

  @RequestMapping("/getUser")
  public List<String> getUser() {
    List<String> list = new ArrayList<>();
    list.add("zhangsan");
    list.add("zhangsan1");
    list.add("zhangsan2");
    list.add("zhangsan3");
    return list;
  }
}
