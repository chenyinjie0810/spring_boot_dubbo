package com.chenyinjie.user.service;

import com.chenyinjie.ticket.service.TicketService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.stereotype.Service;

/**
 * @Author chenyj
 * @Description
 * @Date create by 2019/6/8 11:01
 * 陈银杰专属测试
 */
@Service
public class UserService {

    @Reference
    private TicketService ticketService;

    public void getTicket(){
        String ticket=ticketService.getTicket();
        System.out.println(ticket);
    }
}
