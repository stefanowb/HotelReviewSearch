package com.hotelReviewSearch.Controller;


import com.hotelReviewSearch.Entity.SearchRequest;
import com.hotelReviewSearch.Entity.SearchResult;
import com.hotelReviewSearch.Service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/searchResults")
public class SearchController {

    @Autowired
    private SearchService searchService;

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Collection<SearchResult> executeSearch(@RequestBody SearchRequest searchRequest){
        return this.searchService.executeSearch(searchRequest);
    }

}
