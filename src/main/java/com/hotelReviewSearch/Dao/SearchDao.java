package com.hotelReviewSearch.Dao;

import com.hotelReviewSearch.Entity.SearchResult;

import java.util.Collection;

public interface  SearchDao {

    Collection<SearchResult> getSearchResults();
}
