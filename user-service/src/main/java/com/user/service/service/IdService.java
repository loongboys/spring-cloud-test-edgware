package com.user.service.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(value = "service-zuul")
public interface IdService {
    @RequestMapping(value = "/id/getNoSeqId",method = RequestMethod.GET)
    Long getNoSeqId();
}
