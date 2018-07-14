package model;

import java.util.Date;

public class Room {
    private String uRoomId;
    private String uTitle;
    private String uCover;
    private String uRoomHolder;
    private Date uCreateTime;
    private Date uLastUpdateTime;
    private String longitude;
    private String latitude;
    private long commentCount;
    private long approvalCount;

    public String getuRoomId() {
        return uRoomId;
    }

    public void setuRoomId(String uRoomId) {
        this.uRoomId = uRoomId;
    }

    public String getuTitle() {
        return uTitle;
    }

    public void setuTitle(String uTitle) {
        this.uTitle = uTitle;
    }

    public String getuCover() {
        return uCover;
    }

    public void setuCover(String uCover) {
        this.uCover = uCover;
    }

    public String getuRoomHolder() {
        return uRoomHolder;
    }

    public void setuRoomHolder(String uRoomHolder) {
        this.uRoomHolder = uRoomHolder;
    }

    public Date getuCreateTime() {
        return uCreateTime;
    }

    public void setuCreateTime(Date uCreateTime) {
        this.uCreateTime = uCreateTime;
    }

    public Date getuLastUpdateTime() {
        return uLastUpdateTime;
    }

    public void setuLastUpdateTime(Date uLastUpdateTime) {
        this.uLastUpdateTime = uLastUpdateTime;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public long getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(long commentCount) {
        this.commentCount = commentCount;
    }

    public long getApprovalCount() {
        return approvalCount;
    }

    public void setApprovalCount(long approvalCount) {
        this.approvalCount = approvalCount;
    }
}
