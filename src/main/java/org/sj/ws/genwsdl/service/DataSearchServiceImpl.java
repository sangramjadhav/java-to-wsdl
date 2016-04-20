package org.sj.ws.genwsdl.service;

import org.sj.ws.genwsdl.model.Data;
import org.sj.ws.genwsdl.model.SearchFilter;
import org.sj.ws.genwsdl.model.SearchResult;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;

/**
 * Search Service Implementation
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public class DataSearchServiceImpl implements DataSearchService {

    private List<Data> dataList;

    public DataSearchServiceImpl(){
        initSampleData();
    }

    private void initSampleData(){
        dataList = new ArrayList<>();
        dataList.add(new Data("First"));
        dataList.add(new Data("Second"));
        dataList.add(new Data("Third"));
    }

    @WebMethod
    @Override
    public SearchResult search(SearchFilter searchFilter) {
        SearchResult result = new SearchResult();
        //TODO : Sort and search based on filter
        result.setDataList(dataList);
        return result;
    }
}
