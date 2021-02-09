package com.fsteam.fsmall.dto;

import com.fsteam.fsmall.model.Item;
import com.fsteam.fsmall.model.ItemLabel;
import com.fsteam.fsmall.model.Picture;

import java.util.List;


public class ItemDetail extends Item {
    // 表外信息
    private String iconUrl;
    private List<Picture> pictureList;
    private List<ItemLabel> labelList;

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public List<Picture> getPictureList() {
        return pictureList;
    }

    public void setPictureList(List<Picture> pictureList) {
        this.pictureList = pictureList;
    }

    public List<ItemLabel> getLabelList() {
        return labelList;
    }

    public void setLabelList(List<ItemLabel> labelList) {
        this.labelList = labelList;
    }
}
