package com.fsteam.fsmall.service;

import com.fsteam.fsmall.dto.MallDetail;

import java.util.List;

public interface MallService {
    List<MallDetail> getAllMall();
    MallDetail getMall(String id);
    int addMall(MallDetail mall);
    int updateMall(MallDetail mall);
    int deleteMall(String id);
}
