package org.sj.ws.genwsdl.service;

import org.sj.ws.genwsdl.model.SearchFilter;
import org.sj.ws.genwsdl.model.SearchResult;

/**
 * Data Search Service
 */
public interface DataSearchService {

    SearchResult search(SearchFilter searchFilter);
}
