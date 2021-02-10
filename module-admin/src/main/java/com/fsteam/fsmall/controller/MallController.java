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

    @GetMapping("/item_class")
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

    @PostMapping("/item_class")
    public RespBody<Integer> createItemClass(@RequestBody ItemClass itemClass) {
        int rows = itemClassService.addItemClass(itemClass);
        if (rows < 0) {
            return new RespBody<>(null, HttpCode.SQL_ERROR, "创建失败，请检查是否存在不合理字段");
        } else {
            return new RespBody<>(rows, HttpCode.OK, "创建成功");
        }
    }

    @PutMapping("/item_class")
    public RespBody<Integer> deleteItemClass(@RequestBody ItemClass itemClass) {
        int rows = itemClassService.updateItemClass(itemClass);
        if (rows < 0) {
            return new RespBody<>(null, HttpCode.SQL_ERROR, "更新失败，请检查是否存在不合理字段");
        } else if (rows == 0){
            return new RespBody<>(rows, HttpCode.FAIL, "没有记录被更新");
        } else {
            return new RespBody<>(rows, HttpCode.OK, "更新成功");
        }
    }

    @DeleteMapping("/item_class")
    public RespBody<Integer> deleteItemClass(@RequestParam("id") Integer id) {
        int rows = itemClassService.deleteItemClass(id);
        if (rows < 0) {
            return new RespBody<>(null, HttpCode.SQL_ERROR, "删除失败，请检查是否存在不合理字段");
        } else if (rows == 0){
            return new RespBody<>(rows, HttpCode.FAIL, "没有记录被删除");
        } else {
            return new RespBody<>(rows, HttpCode.OK, "删除成功");
        }
    }

    @GetMapping("/item/list")
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

    @GetMapping("/item")
    @ResponseBody
    public RespBody<ItemDetail> getItemDetail(@RequestParam("id") Integer id) {
        ItemDetail item = itemService.getItem(id);
        if (item == null) {
            return new RespBody<>(null, HttpCode.FAIL, "查询失败");
        }
        return new RespBody<>(item, HttpCode.OK, "查询成功");
    }

    @PostMapping("item")
    public RespBody<Integer> createItem(@RequestBody ItemDetail itemDetail) {
        int rows = itemService.addItem(itemDetail);
        if (rows < 0) {
            return new RespBody<>(null, HttpCode.FAIL, "创建失败，请检查是否有不合理字段");
        }
        return new RespBody<>(rows, HttpCode.OK, "创建成功");
    }

    @PutMapping("item")
    public RespBody<Integer> updateItem(@RequestBody ItemDetail itemDetail) {
        int rows = itemService.updateItem(itemDetail);
        if (rows < 0) {
            return new RespBody<>(null, HttpCode.FAIL, "更新失败，请检查是否有不合理字段");
        }else if (rows == 0){
            return new RespBody<>(rows, HttpCode.FAIL, "没有记录被更新");
        } else {
            return new RespBody<>(rows, HttpCode.OK, "更新成功");
        }
    }

    @DeleteMapping("item")
    public RespBody<Integer> deleteItem(@RequestParam("id") Integer id) {
        int rows = itemService.deleteItem(id);
        if (rows < 0) {
            return new RespBody<>(null, HttpCode.SQL_ERROR, "删除失败，请联系管理员");
        } else if (rows == 0) {
            return new RespBody<>(rows, HttpCode.FAIL, "没有记录被删除");
        }else {
            return new RespBody<>(rows, HttpCode.OK, "创建成功");
        }
    }
}
