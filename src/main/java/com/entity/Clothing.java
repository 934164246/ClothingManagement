package com.entity;

import java.util.List;

/**
 * 服装映射
 * @author GokouRuri
 */
public class Clothing {

    private int id;
    private int typeId;
    private String typeName;
    private String name;
    private String url;
    private List<ClothingInfo> infos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<ClothingInfo> getInfos() {
        return infos;
    }

    public void setInfos(List<ClothingInfo> infos) {
        this.infos = infos;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "id=" + id +
                ", typeId=" + typeId +
                ", typeName='" + typeName + '\'' +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", infos=" + infos +
                '}';
    }
}
