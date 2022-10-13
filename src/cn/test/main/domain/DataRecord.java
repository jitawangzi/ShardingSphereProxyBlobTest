package cn.test.main.domain;

import java.io.Serializable;

public class DataRecord implements Serializable {
    /**
     * @mbg.generated
     */
    private String uuid;
    /**
     * @mbg.generated
     */
    private Integer type;
    /**
     * @mbg.generated
     */
    private byte[] bytedata;
    /**
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;
    /**
     * @mbg.generated
     */
    public String getUuid() {
        return uuid;
    }
    /**
     * @mbg.generated
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
    /**
     * @mbg.generated
     */
    public Integer getType() {
        return type;
    }
    /**
     * @mbg.generated
     */
    public void setType(Integer type) {
        this.type = type;
    }
    /**
     * @mbg.generated
     */
    public byte[] getBytedata() {
        return bytedata;
    }
    /**
     * @mbg.generated
     */
    public void setBytedata(byte[] bytedata) {
        this.bytedata = bytedata;
    }
}