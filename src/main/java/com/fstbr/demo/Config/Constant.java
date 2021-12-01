package com.fstbr.demo.Config;

public class Constant {
    //演示系统账户
    public static String DEMO_ACCOUNT = "test";
    //自动去除表前缀
    public static String AUTO_REOMVE_PRE = "true";
    //停止计划任务
    public static String STATUS_RUNNING_STOP = "stop";
    //开启计划任务
    public static String STATUS_RUNNING_START = "start";
    //通知公告阅读状态-未读
    public static String OA_NOTIFY_READ_NO = "0";
    //通知公告阅读状态-已读
    public static int OA_NOTIFY_READ_YES = 1;
    //部门根节点id
    public static Long DEPT_ROOT_ID = 0l;
    //缓存方式
    public static String CACHE_TYPE_REDIS ="redis";

    public static String LOG_ERROR = "error";

    //用户状态常量
    public  static final  int USER_STATUS = 1;//有效

    //公司名称
    public static final String COMPANY_NAME = "FRScan";
    public static final String STATUS_CODE = "200";

    /*****
     * FR相关配置
     * ********/
    //check_in check_out
    public static final String REQUEST_SUCCESS = "0";//下发请求成功
    public static final int MANAGER_STAFF = 1;
    public static final int VISITORS = 2;
    //请求safeEntry接口地址
    public static final  String SAFEENTRY_URL = "http://localhost:9090/api/login/";
    //safeEntry请求失败,错误信息定义
    public static final String ERROR_CODE = "100";
    public static final String ERROR_MSG = "错误..";

    public static final String ISSUE_URL = "8090/basic/Employee/syncEmp";//人员下发
    public static final String DELETE_EMP_URL = "8090/basic/Employee/delEmp";//删除人员

    public static final Long maxSize = 10*1024l;//图片上传最大量
}
