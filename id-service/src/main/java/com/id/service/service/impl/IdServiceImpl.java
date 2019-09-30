package com.id.service.service.impl;

import com.id.service.component.IdWorker;
import com.id.spi.IdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service
public class IdServiceImpl implements IdService<Long,Integer> {

    @Autowired
    private IdWorker idWorker;

    @Override
    public Long getNoSeqId() {
        return idWorker.nextId();
    }

    Long[] ids;
    int index;

    @Override
    public Long[] getNoSeqIds(Integer num) {
        ids = new Long[num];
        for(index=0;index<num;index++) {
            new Runnable() {
                @Override
                public void run() {
                    ids[index]=idWorker.nextId();
                }
            }.run();
        }
        return ids;
    }

    @Override
    public Long getSeqId() {
        return null;
    }

    @Override
    public Long[] getSeqIds(Integer num) {
        return new Long[0];
    }
}

