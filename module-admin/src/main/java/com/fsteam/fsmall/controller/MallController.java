package com.fsteam.fsmall.controller;

import com.fsteam.fsmall.constant.HttpCode;
import com.fsteam.fsmall.dto.ItemDetail;
import com.fsteam.fsmall.dto.MallDetail;
import com.fsteam.fsmall.dto.RespBody;
import com.fsteam.fsmall.model.ItemClass;
import com.fsteam.fsmall.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/mall")
public class MallController {
    @Autowired
    private MallService mallService;
    @Autowired
    private ItemService itemService;
    @Autowired
    private ItemClassService itemClassService;

    @GetMapping("/info")
    @ResponseBody
    public RespBody<MallDetail> getMalldetail(@RequestParam("id") String id) {
        MallDetail mallDetail = mallService.getMall(id);
        if (mallDetail != null) {
            return new RespBody<>(mallDetail, HttpCode.OK, "查询成功");
        } else return new RespBody<>(mallDetail, HttpCode.NO_RESULT, "查询没有结果");
    }

    @PostMapping("/info")
    public RespBody<Integer> createMall(@RequestBody MallDetail mallDetail) {
//        System.out.println(mallDetail);
        int rows = mallService.addMall(mallDetail);
        if (rows < 0) {
            return new RespBody<>(null, HttpCode.SQL_ERROR, "创建失败，请检查是否存在不合理字段");
        } else {
            return new RespBody<>(rows, HttpCode.OK, "创建成功");
        }
    }

    @PutMapping("/info")
    public RespBody<Integer>  updateMall(@RequestBody MallDetail mallDetail) {
        System.out.println(mallDetail);
        int rows = mallService.updateMall(mallDetail);
        if (rows < 0) {
            return new RespBody<>(null, HttpCode.SQL_ERROR, "更新失败，请检查是否存在不合理字段");
        } else {
            return new RespBody<>(rows, HttpCode.OK, "更新成功");
        }
    }

    @DeleteMapping("/info")
    public RespBody<Integer>  deleteMall(@RequestParam("id") String id) {
        int rows = mallService.deleteMall(id);
        if (rows < 0) {
            return new RespBody<>(null, HttpCode.SQL_ERROR, "创建失败，请检查是否存在不合理字段");
        } else {
            return new RespBody<>(rows, HttpCode.OK, "创建成功");
        }
    }

    @GetMapping("/itemClass")
    @ResponseBody
    public RespBody<List<ItemClass>> getItemClassList(@RequestParam("id") String id) {
        List<ItemClass> itemClassList = itemClassService.getAllItemClassByMallId(id);
        if (itemClassList == null) {
            return new RespBody<>(null, HttpCode.SQL_ERROR, "查询出现了错误，请联系管理员");
        } else {
            if (itemClassList.size() == 0) {
                return new RespBody<>(itemClassList, HttpCode.OK, "查询没有结果");
            }
            return new RespBody<>(itemClassList, HttpCode.NO_RESULT, "查询成功");
        }
    }

    @GetMapping("/item")
    @ResponseBody
    public RespBody<List<ItemDetail>> getItemList(@RequestParam("id") Integer id) {
        List<ItemDetail> itemDetailList = itemService.getAllItemByItemClassId(id);
        if (itemDetailList == null) {
            return new RespBody<>(null, HttpCode.SQL_ERROR, "查询出现了错误，请联系管理员");
        } else {
            if (itemDetailList.size() == 0) {
                return new RespBody<>(itemDetailList, HttpCode.NO_RESULT, "查询没有结果");
            }
            return new RespBody<>(itemDetailList, HttpCode.OK, "查询成功");
        }
    }




}
