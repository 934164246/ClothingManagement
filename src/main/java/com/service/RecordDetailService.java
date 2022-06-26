package com.service;

import com.entity.RecordDetail;

import java.util.List;

/**
 * @author GokouRuri
 */
public interface RecordDetailService {

    public RecordDetail findBySerialNumber(String serialNumber);

    public List<RecordDetail> findById(int clothingId);

    public List<RecordDetail> findByInfoId(int infoId);

    public void insert(String serialNumber, RecordDetail recordDetail);

    public void update(String serialNumber, RecordDetail oldRecordDetail, RecordDetail newRecordDetail);
}
