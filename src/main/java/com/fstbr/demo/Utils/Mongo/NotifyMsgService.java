package com.fstbr.demo.Utils.Mongo;

import java.util.List;

/**
 * 接口服务
 *
 */
public interface NotifyMsgService {

    /**
     * 保存数据
     */
    NotifyMsg saveNotifyMsg(NotifyMsg msg);

    /**
     * 根据消息号查找
     */
    NotifyMsg findNotifyMsgByNo(String notifyNo);

    /**
     * 根据消息日期查找
     */
    List<NotifyMsg> findNotifyMsgByDate(String notifyDate);

    /**
     * 根据id进行删除 返回删除的对象
     */
    NotifyMsg delNotifyMsgById(String id);

}
