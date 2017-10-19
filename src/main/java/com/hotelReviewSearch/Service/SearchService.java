package com.hotelReviewSearch.Service;

import com.hotelReviewSearch.Dao.SearchDao;
import com.hotelReviewSearch.Entity.SearchRequest;
import com.hotelReviewSearch.Entity.SearchResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class SearchService {

    @Autowired
    @Qualifier("fakeData")
    private SearchDao searchDao;

    public Collection<SearchResult> executeSearch(SearchRequest searchRequest) {

        return this.searchDao.getSearchResults();
    }
}
