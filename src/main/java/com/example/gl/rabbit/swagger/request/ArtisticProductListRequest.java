package com.example.gl.rabbit.swagger.request;

import com.example.gl.rabbit.lehuBase.BaseQueryForm;
import lombok.Data;

@Data
public class ArtisticProductListRequest extends BaseQueryForm {
    private String userId;
    private String artisticProductSize;
    private String artisticProductName;
    private String artisticProductEnglishName;
    private String artisticProductEnglishMaterial;
    private String artisticProductMaterial;
    private String artisticProductCreateTime;
    private String artisticProductVersion;
    private String artisticProductNo;

}
