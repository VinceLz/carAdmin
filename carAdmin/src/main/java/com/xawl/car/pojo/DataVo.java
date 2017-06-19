package com.xawl.car.pojo;

import java.util.List;

/**
 * Created by Administrator on 2016/12/24.
 */
public class DataVo {
    private List<ImageBean> bImage;

    public List<ImageBean> getbImage() {
        return bImage;
    }

    public void setbImage(List<ImageBean> bImage) {
        this.bImage = bImage;
    }

    public static class ImageBean{
        private int iid;
        private String image;

        public int getIid() {
            return iid;
        }

        public void setIid(int iid) {
            this.iid = iid;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    private Object data;
}
