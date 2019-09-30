package com.id.service.controller;

import com.id.service.service.impl.IdServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 通用ID生成中心
 * 对于有特殊要求的ID类型 后续在做补充
 *
 */
@RestController
public class IdController  {

    @Autowired
    private IdServiceImpl idService;

    @RequestMapping(value = "/getNoSeqId",method = RequestMethod.GET)
    public Long getNoSeqId() {
        return idService.getNoSeqId();
    }

    @RequestMapping(value = "/getNoSeqIds/{num}",method = RequestMethod.GET)
    public Long[] getNoSeqIds(@PathVariable("num") Integer num) {

        return idService.getNoSeqIds(num);
    }

}
