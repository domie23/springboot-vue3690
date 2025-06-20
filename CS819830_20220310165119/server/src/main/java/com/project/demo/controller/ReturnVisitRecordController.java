package com.project.demo.controller;

import com.project.demo.entity.ReturnVisitRecord;
import com.project.demo.service.ReturnVisitRecordService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 *回访记录：(ReturnVisitRecord)表控制层
 *
 */
@RestController
@RequestMapping("/return_visit_record")
public class ReturnVisitRecordController extends BaseController<ReturnVisitRecord,ReturnVisitRecordService> {

    /**
     *回访记录对象
     */
    @Autowired
    public ReturnVisitRecordController(ReturnVisitRecordService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}
