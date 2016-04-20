package org.sj.ws.genwsdl.model;

import java.util.Date;
import java.util.List;

/**
 * Data
 */
public class Data {

    private String description;
    private Date createDate;

    public Data(String description){
        this.description = description;
        this.createDate = new Date();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

}
