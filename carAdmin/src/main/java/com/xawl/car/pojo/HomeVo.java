package com.xawl.car.pojo;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/1/2.
 */
public class HomeVo {
    private ArrayList<HomeImageBean> homeImage;

    private ArrayList<HomeImageBean> selectImage;

    private ArrayList<HeadLineBean> headLine;

    public HomeVo(ArrayList<HomeImageBean> homeImage, ArrayList<HomeImageBean> selectImage, ArrayList<HeadLineBean> headLine) {
        this.homeImage = homeImage;
        this.selectImage = selectImage;
        this.headLine = headLine;
    }

    public ArrayList<HomeImageBean> getHomeImage() {
        return homeImage;
    }

    public void setHomeImage(ArrayList<HomeImageBean> homeImage) {
        this.homeImage = homeImage;
    }

    public ArrayList<HomeImageBean> getSelectImage() {
        return selectImage;
    }

    public void setSelectImage(ArrayList<HomeImageBean> selectImage) {
        this.selectImage = selectImage;
    }

    public ArrayList<HeadLineBean> getHeadLine() {
        return headLine;
    }

    public void setHeadLine(ArrayList<HeadLineBean> headLine) {
        this.headLine = headLine;
    }

    public static class HomeImageBean{
        private String image;
        private String url;
        private Integer hid;

        public HomeImageBean(Integer hid, String image, String url) {
            this.hid = hid;
            this.image = image;
            this.url = url;
        }

        public Integer getHid() {
            return hid;
        }

        public void setHid(Integer hid) {
            this.hid = hid;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }

    public static class HeadLineBean{
        private Integer hid;
        private String title;
        private String url;

        public HeadLineBean(Integer hid, String title, String url) {
            this.hid = hid;
            this.title = title;
            this.url = url;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public Integer getHid() {
            return hid;
        }

        public void setHid(Integer hid) {
            this.hid = hid;
        }
    }

}
