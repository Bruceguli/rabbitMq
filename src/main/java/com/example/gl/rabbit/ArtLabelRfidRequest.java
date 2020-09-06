package com.example.gl.rabbit;



public class ArtLabelRfidRequest {



    /**
     * 芯片id
     */
    private String chipId;

    /**
     * 画框状态
     */
    private String artLabelNo;

    public String getChipId() {
        return chipId;
    }

    public void setChipId(String chipId) {
        this.chipId = chipId;
    }

    public String getArtLabelNo() {
        return artLabelNo;
    }

    public void setArtLabelNo(String artLabelNo) {
        this.artLabelNo = artLabelNo;
    }
}
