package com.fstbr.demo.Exception;

import com.alibaba.fastjson.JSONArray;
import com.fstbr.demo.Entity.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.context.MessageSource;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @Autowired
    private MessageSource messageSource;

    /**
     * 处理请求参数格式错误 @RequestBody上validate失败后抛出的异常是MethodArgumentNotValidException异常
     * @return Result<Object>
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public Result<Object> MethodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e) {
        String message = e.getBindingResult().getAllErrors().stream().map(DefaultMessageSourceResolvable::getDefaultMessage).collect(Collectors.joining());
        //下边ResultCodeEnum.PARAMS_BS_ERROR.getCode()就是你自己自定义的返回code码
        return Result.error(422,message);
    }

    /**
     * 处理Get请求中 使用@Valid 验证路径中请求实体校验失败后抛出的异常
     */
    @ExceptionHandler(BindException.class)
    @ResponseBody
    public Result<Object> BindExceptionHandler(BindException e) {
        String message = e.getBindingResult().getAllErrors().stream().map(DefaultMessageSourceResolvable::getDefaultMessage).collect(Collectors.joining());
        return Result.error(422, message);
    }

    /**
     * 处理请求参数格式错误 @RequestParam上validate失败后抛出的异常是ConstraintViolationException
     * @return Result<Object>
     */
    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseBody
    public Result<Object> ConstraintViolationExceptionHandler(ConstraintViolationException e) {
        String message = e.getConstraintViolations().stream().map(ConstraintViolation::getMessage).collect(Collectors.joining());
        return Result.error(422, message);
    }

    /**
     * 未知异常处理
     * @param request 请求
     * @param ex 异常对象
     * @return
     */
    @ExceptionHandler(value = {Exception.class})
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public Result<Object> handlerException(HttpServletRequest request, Exception ex){
        ex.printStackTrace();
        log.error(request.toString());
        if (ex instanceof BindException) {
            BindException e = (BindException) ex;
            List<ObjectError> allErrors = e.getAllErrors();
            ObjectError objectError = allErrors.get(0);
            String ms = objectError.getDefaultMessage();
            return Result.error(422, ms, "");
        } else {
            ex.printStackTrace();
            return Result.error(500, ex.getMessage());
        }
    }
}