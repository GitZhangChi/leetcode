package a.test.dto;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class HaiweiCommonDTO {

    private String sign;

    private Integer blackWhaleTag;

    private String userId;

    private Long timestamp;

    private String orderNo;

    private String orderStatus;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date orderTime;


}
