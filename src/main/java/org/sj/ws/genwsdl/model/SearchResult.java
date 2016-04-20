package org.sj.ws.genwsdl.model;

import java.util.List;

/**
 * Search Result
 */
public class SearchResult {

    private List<Data> dataList;
    private int totalCount;

    public List<Data> getDataList() {
        return dataList;
    }

    public void setDataList(List<Data> dataList) {
        this.dataList = dataList;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }
}
