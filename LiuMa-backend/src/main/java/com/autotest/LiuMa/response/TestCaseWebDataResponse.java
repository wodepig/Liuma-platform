package com.autotest.LiuMa.response;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TestCaseWebDataResponse {

    @JSONField(ordinal = 1)
    private String operationType;

    @JSONField(ordinal = 2)
    private String operationId;

    @JSONField(ordinal = 3)
    private String operationName;

    @JSONField(ordinal = 4)
    private String operationTrans;

    @JSONField(ordinal = 5)
    private String operationCode;

    @JSONField(ordinal = 6)
    private JSONObject operationElement;

    @JSONField(ordinal = 7)
    private JSONObject operationData;

}
