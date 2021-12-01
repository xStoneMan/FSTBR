package com.fstbr.demo.Errors;

/**
 * 国际化数据处理
 */
public interface ErrorMessageSource {

    /**
     * 数据处理
     * @param code 错误码
     * @param params 参数
     * @return
     */
    String getMessage(String code, Object... params);

    /**
     * 数据处理
     * @param code 错误码
     * @param defaultMessage 默认错误信息
     * @param params 配置文件中错误信息
     * @return
     */
    String getMessage(String code, String defaultMessage, Object... params);

}
