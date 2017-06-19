package com.xawl.car.pojo;

import java.util.Set;

/**
 * Created by Administrator on 2017/4/4.
 */
public class Param {
    private String condition;
    private Set<Integer> rids;

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public Set<Integer> getRids() {
        return rids;
    }

    public void setRids(Set<Integer> rids) {
        this.rids = rids;
    }
}
