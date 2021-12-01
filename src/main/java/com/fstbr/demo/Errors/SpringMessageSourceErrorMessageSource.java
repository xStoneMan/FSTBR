package com.fstbr.demo.Errors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Primary;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

/**
 * 国际化数据处理配置
 *
 */
@Component
@Primary
public class SpringMessageSourceErrorMessageSource implements ErrorMessageSource {

    @Autowired
    private MessageSource messageSource;

    @Override
    public String getMessage(String code, Object... params) {
        return messageSource.getMessage(code, params, LocaleContextHolder.getLocale());
    }

    @Override
    public String getMessage(String code, String defaultMessage, Object... params) {
        return messageSource.getMessage(code, params, defaultMessage, LocaleContextHolder.getLocale());
    }
}
