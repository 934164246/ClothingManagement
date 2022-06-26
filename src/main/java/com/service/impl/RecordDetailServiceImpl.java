package com.service.impl;

import com.dao.RecordDetailMapper;
import com.entity.RecordDetail;
import com.service.RecordDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author GokouRuri
 */

@Service("recordDetailService")
public class RecordDetailServiceImpl implements RecordDetailService {

    private RecordDetailMapper mapper;

    @Autowired
    public void setMapper(RecordDetailMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public RecordDetail findBySerialNumber(String serialNumber) {
        return mapper.selectAllBySerialNumber(serialNumber);
    }

    @Override
    public List<RecordDetail> findById(int clothingId) {
        return mapper.selectAllByClothingId(clothingId);
    }

    @Override
    public List<RecordDetail> findByInfoId(int infoId) {
        return mapper.selectAllByInfoId(infoId);
    }

    @Override
    public void insert(String serialNumber, RecordDetail recordDetail) {
        mapper.insert(serialNumber, recordDetail);
    }

    @Override
    public void update(String serialNumber, RecordDetail oldRecordDetail, RecordDetail newRecordDetail) {
        mapper.update(serialNumber, oldRecordDetail, newRecordDetail);
    }
}
