package com.entity;

import java.util.Objects;

/**
 * 对于用户的权限类的管理
 * @author GokouRuri
 */
public class Authority {

    private String type;
    private Boolean select;
    private Boolean insert;
    private Boolean update;
    private Boolean delete;

    public Authority() {
        this.select = false;
        this.insert = false;
        this.update = false;
        this.delete = false;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getSelect() {
        return select;
    }

    public void setSelect(Boolean select) {
        this.select = select;
    }

    public Boolean getInsert() {
        return insert;
    }

    public void setInsert(Boolean insert) {
        this.insert = insert;
    }

    public Boolean getUpdate() {
        return update;
    }

    public void setUpdate(Boolean update) {
        this.update = update;
    }

    public Boolean getDelete() {
        return delete;
    }

    public void setDelete(Boolean delete) {
        this.delete = delete;
    }

    @Override
    public String toString() {
        return "Authority{" +
                "type='" + type + '\'' +
                ", select=" + select +
                ", add=" + insert +
                ", update=" + update +
                ", delete=" + delete +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Authority)) {
            return false;
        }
        Authority authority = (Authority) o;
        return getType().equals(authority.getType()) && getSelect().equals(authority.getSelect()) && getInsert().equals(authority.getInsert()) && getUpdate().equals(authority.getUpdate()) && getDelete().equals(authority.getDelete());
    }
}