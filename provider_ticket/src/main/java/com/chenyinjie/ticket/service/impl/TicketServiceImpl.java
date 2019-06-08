package com.chenyinjie.ticket.service.impl;

import com.chenyinjie.ticket.service.TicketService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Author chenyj
 * @Description
 * @Date create by 2019/6/8 9:45
 * 陈银杰专属测试
 */
@Component
@Service
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "《老子天下无敌》";
    }

}
