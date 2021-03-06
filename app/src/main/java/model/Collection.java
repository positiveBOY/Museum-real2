package model;

import java.io.Serializable;

import cn.bmob.v3.BmobObject;
import cn.bmob.v3.datatype.BmobFile;
import cn.bmob.v3.datatype.BmobRelation;

/**
 * 藏品的实体类
 * Created by wjc on 2017/2/21.
 */

public class Collection extends BmobObject implements Serializable {

    public static final int TYPE_BRONSE = 1; //青铜器
    public static final int TYPE_CHINA = 2; //瓷器
    public static final int TYPE_JADE = 3; //玉石器
    public static final int TYPE_LACQUER = 4; //漆器
    public static final int TYPE_PAINT = 5; //书画类
    public static final int TYPE_OTHERS = 6; //其他类

//    private int coltID; //藏品Id

    private String coltName;  //藏品名称

    private String coltSize; // 藏品尺寸说明

    private String coltDynasty; // 藏品朝代

    private String coltIntru; //藏品介绍

    private Integer coltSort; // 藏品分类

//    private String coltToMuseumName; //藏品所在博物馆名称

    private Integer coltLikeNum; //藏品的点赞数量   new

//    private int coltCommentBolongID; //评论的ID

    private Integer coltCommentNum; //评论的数量

//    private List<String> coltImageURLs; //藏品图片URL


    private BmobFile image1;
    private String image1Url; //图片的url 只要第一张，主要用于数据库的存取

    private BmobFile image2;
    private BmobFile image3;
    private BmobFile image4;
    private BmobFile image5;




    private ExhibitRoom coltShowRoom; // 藏品所在展厅

    private Museum coltToMuseum; // 藏品所在博物馆

    private Exhibition toExhibition; //参加的主体展览

    private BmobRelation likedUser; //喜欢的用户

    private Integer hotValue; //热力值



    public Collection() {

    }

    public String getImage1Url() {
        return image1Url;
    }

    public void setImage1Url(String image1Url) {
        this.image1Url = image1Url;
    }

    public String getColtName() {
        return coltName;
    }

    public void setColtName(String coltName) {
        this.coltName = coltName;
    }

    public String getColtSize() {
        return coltSize;
    }

    public void setColtSize(String coltSize) {
        this.coltSize = coltSize;
    }

    public String getColtDynasty() {
        return coltDynasty;
    }

    public void setColtDynasty(String coltDynasty) {
        this.coltDynasty = coltDynasty;
    }

    public String getColtIntru() {
        return coltIntru;
    }

    public void setColtIntru(String coltIntru) {
        this.coltIntru = coltIntru;
    }

    public Integer getColtSort() {
        return coltSort;
    }

    public void setColtSort(Integer coltSort) {
        this.coltSort = coltSort;
    }

    public Integer getColtLikeNum() {
        return coltLikeNum;
    }

    public void setColtLikeNum(Integer coltLikeNum) {
        this.coltLikeNum = coltLikeNum;
    }

    public Integer getColtCommentNum() {
        return coltCommentNum;
    }

    public void setColtCommentNum(Integer coltCommentNum) {
        this.coltCommentNum = coltCommentNum;
    }

//    public List<String> getColtImageURLs() {
//        return coltImageURLs;
////    }
//
//    public void setColtImageURLs(List<String> coltImageURLs) {
//        this.coltImageURLs = coltImageURLs;
//    }


    public BmobFile getImage1() {
        return image1;
    }

    public void setImage1(BmobFile image1) {
        this.image1 = image1;
    }

    public BmobFile getImage2() {
        return image2;
    }

    public void setImage2(BmobFile image2) {
        this.image2 = image2;
    }

    public BmobFile getImage3() {
        return image3;
    }

    public void setImage3(BmobFile image3) {
        this.image3 = image3;
    }

    public BmobFile getImage4() {
        return image4;
    }

    public void setImage4(BmobFile image4) {
        this.image4 = image4;
    }

    public BmobFile getImage5() {
        return image5;
    }

    public void setImage5(BmobFile image5) {
        this.image5 = image5;
    }

    public ExhibitRoom getColtShowRoom() {
        return coltShowRoom;
    }

    public void setColtShowRoom(ExhibitRoom coltShowRoom) {
        this.coltShowRoom = coltShowRoom;
    }

    public Museum getColtToMuseum() {
        return coltToMuseum;
    }

    public void setColtToMuseum(Museum coltToMuseum) {
        this.coltToMuseum = coltToMuseum;
    }

    public Exhibition getToExhibition() {
        return toExhibition;
    }

    public void setToExhibition(Exhibition toExhibition) {
        this.toExhibition = toExhibition;
    }

    public Integer getHotValue() {
        return hotValue;
    }

    public void setHotValue(Integer hotValue) {
        this.hotValue = hotValue;
    }

    public BmobRelation getLikedUser() {
        return likedUser;
    }

    public void setLikedUser(BmobRelation likedUser) {
        this.likedUser = likedUser;
    }


}
