package com.fstbr.demo.Controller;

import com.fstbr.demo.Dao.NotifyMsgDao;
import com.fstbr.demo.Utils.Mongo.NotifyMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/mongo")
public class MongoRepositoryController {
    @Autowired
    NotifyMsgDao notifyMsgDao;

    @PostMapping("/add")
    public NotifyMsg add(NotifyMsg msg) {
        System.out.println("repository方式新增：" + msg);
        return notifyMsgDao.save(msg);
    }

    @GetMapping("/find/sql/{date}")
    public Page<NotifyMsg> queryBySql(@PathVariable String date){
        Pageable pageable = PageRequest.of(0, 10);
        System.out.println("repository方式分页sql查找日期：" + date);
        return notifyMsgDao.queryBySql(date, pageable);
    }

    @GetMapping("/find/{no}")
    public NotifyMsg findByNotifyNo(@PathVariable String no) {
        System.out.println("repository方式查找单号：" + no);
        return notifyMsgDao.findByNotifyNo(no);
    }
}
