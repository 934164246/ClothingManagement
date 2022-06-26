package com.entity;

/**
 * 订单细节
 * @author GokouRuri
 */
public class RecordDetail {

    private int warehouseId;
    private int warehouseName;
    private int infoId;
    private long count;


    public int getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(int warehouseId) {
        this.warehouseId = warehouseId;
    }

    public int getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(int warehouseName) {
        this.warehouseName = warehouseName;
    }

    public int getInfoId() {
        return infoId;
    }

    public void setInfoId(int infoId) {
        this.infoId = infoId;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "RecordDetail{" +
                "warehouseId=" + warehouseId +
                ", warehouseName=" + warehouseName +
                ", infoId=" + infoId +
                ", count=" + count +
                '}';
    }
}
