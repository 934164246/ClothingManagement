package com.entity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 出入库记录
 * @author GokouRuri
 */
public class WarehouseRecord {

    private String serialNumber;
    private String account;
    private String time;
    private String location;
    private String isDelete;
    private RecordDetail details;

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.time = simpleDateFormat.format(new Date());
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    public RecordDetail getDetails() {
        return details;
    }

    public void setDetails(RecordDetail details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "WarehouseRecord{" +
                "serialNumber='" + serialNumber + '\'' +
                ", account='" + account + '\'' +
                ", time='" + time + '\'' +
                ", location='" + location + '\'' +
                ", isDelete='" + isDelete + '\'' +
                ", details=" + details +
                '}';
    }
}