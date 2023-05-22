package com.ydl.sms.dto;

import com.ydl.sms.entity.TemplateEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * 模板表
 *
 * @author gyh
 *
 */
@Data
@ApiModel(description = "模板表")
public class TemplateDTO extends TemplateEntity {

    @ApiModelProperty("是否选中")
    private boolean selected;

    @ApiModelProperty(value = "通道模板  可能为空")
    private String configTemplateCode;

    @ApiModelProperty(value = "通道id")
    private String configId;
}
