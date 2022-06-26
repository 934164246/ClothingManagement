package com.controller;

import com.service.RecordDetailService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author GokouRuri
 */
@RestController("recordDetail")
@RequestMapping("/recordDetail")
public class RecordDetailController {

    @Resource(name = "recordDetailService")
    private RecordDetailService recordDetailService;
}
