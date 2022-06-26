package com.service.impl;

import com.dao.ClothingInfoMapper;
import com.dao.ClothingMapper;
import com.dao.RecordDetailMapper;
import com.dao.WarehouseRecordMapper;
import com.entity.RecordDetail;
import com.entity.WarehouseRecord;
import com.service.WarehouseRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

/**
 * @author GokouRuri
 */

@Service("warehouseRecordService")
public class WarehouseRecordServiceImpl implements WarehouseRecordService {

    private WarehouseRecordMapper warehouseRecordMapper;
    private RecordDetailMapper recordDetailMapper;
    private ClothingInfoMapper clothingInfoMapper;

    @Autowired
    public void setMapper(WarehouseRecordMapper mapper) {
        this.warehouseRecordMapper = mapper;
    }

    @Autowired
    public void setRecordDetailMapper(RecordDetailMapper recordDetailMapper) {
        this.recordDetailMapper = recordDetailMapper;
    }

    @Autowired
    public void setClothingInfoMapper(ClothingInfoMapper clothingInfoMapper) {
        this.clothingInfoMapper = clothingInfoMapper;
    }

    @Override
    public List<WarehouseRecord> getAll(String type) {
        List<WarehouseRecord> result;

        switch (type) {
            case "all": {
                result = warehouseRecordMapper.selectAll();
                break;
            }
            case "in": {
                result = warehouseRecordMapper.selectAllOfInput();
                break;
            }
            case "out": {
                result = warehouseRecordMapper.selectAllOfOutput();
                break;
            }
            default: {
                result = new LinkedList<>();
            }
        }

        return result;
    }

    @Override
    public WarehouseRecord findBySerialNumber(String serialNumber) {
        return warehouseRecordMapper.selectOneBySerialNumber(serialNumber);
    }

    @Override
    public List<WarehouseRecord> findByUser(String type, String account) {
        List<WarehouseRecord> result;

        switch (type) {
            case "all": {
                result = warehouseRecordMapper.selectAllByAccount(account);
                break;
            }
            case "in": {
                result = warehouseRecordMapper.selectAllByAccountOfInput(account);
                break;
            }
            case "out": {
                result = warehouseRecordMapper.selectAllByAccountOfOutput(account);
                break;
            }
            default: {
                result = new LinkedList<>();
            }
        }

        return result;
    }

    @Override
    public void insert(WarehouseRecord warehouseRecord) {
        warehouseRecordMapper.insert(warehouseRecord);
        recordDetailMapper.insert(warehouseRecord.getSerialNumber(), warehouseRecord.getDetails());

        if(warehouseRecord.getSerialNumber().charAt(4) == 'I') {
            clothingInfoMapper.updateCountById(warehouseRecord.getDetails().getInfoId(), (int) warehouseRecord.getDetails().getCount());
        } else {
            clothingInfoMapper.updateCountById(warehouseRecord.getDetails().getInfoId(), -(int) warehouseRecord.getDetails().getCount());
        }
    }

    @Override
    public void update(WarehouseRecord warehouseRecord) {
        warehouseRecordMapper.insert(warehouseRecord);
    }

    @Override
    public void updateIsDelete(String serialNumber, Boolean isDelete) {
        warehouseRecordMapper.updateIsDeleteBySerialNumber(serialNumber, isDelete);
    }
}
