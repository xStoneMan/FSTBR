package com.fstbr.demo.Domain.Dto;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
public class BaseListDto {
    @NotNull(message = "页数不能为空")
    @Min(value = 1, message = "页数不能小于1")
    private Integer page;

    @NotNull(message = "页数不能为空")
    @Max(value = 50, message = "当前页展示不能超过50")
    @Min(value = 1, message = "当前页展示不能小于1")
    private Integer pageSize;
}
