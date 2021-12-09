package com.fstbr.demo.Controller;

import com.fstbr.demo.Utils.Mongo.NotifyMsg;
import com.fstbr.demo.Utils.Mongo.NotifyMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mongodb")
public class MongoController {

    @Autowired
    NotifyMsgService notifyMsgService;

    @PostMapping("/add")
    public NotifyMsg add(@RequestBody NotifyMsg msg) {
        System.out.println("mongoTemplate方式新增：" + msg.toString());
        return notifyMsgService.saveNotifyMsg(msg);
    }

    @PostMapping("del/{id}")
    public NotifyMsg del(@PathVariable String id) {
        System.out.println("mongoTemplate方式删除：" + id);
        return notifyMsgService.delNotifyMsgById(id);
    }

    @GetMapping("/find/{no}")
    public NotifyMsg findNotifyMsgByNo(@PathVariable String no){
        System.out.println("mongoTemplate方式查找：notifyNo-" + no);
        return notifyMsgService.findNotifyMsgByNo(no);
    }

    @GetMapping("/find/list/{date}")
    public List<NotifyMsg> findNotifyMsgByDate(@PathVariable String date){
        System.out.println("mongoTemplate方式查找：notifyDate-" + date);
        return notifyMsgService.findNotifyMsgByDate(date);
    }
}
