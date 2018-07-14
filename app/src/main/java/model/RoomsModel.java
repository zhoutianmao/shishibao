package model;

import java.util.Date;
import java.util.List;

public class RoomsModel {
    private String retCode;
    private String retMsg;
    private List<Room> results;

    public String getRetCode() {
        return retCode;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }

    public List<Room> getRoom() {
        return results;
    }

    public void setRoom(List<Room> results) {
        this.results = results;
    }
}
