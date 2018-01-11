package com.example.sprinboot_mq.msg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/msg")
public class MsgController {
    @Autowired
    private Sender sender;

    @RequestMapping(value = "/send",method = RequestMethod.GET)
    public String send(){
        sender.send();
        return "success";
    }
}
