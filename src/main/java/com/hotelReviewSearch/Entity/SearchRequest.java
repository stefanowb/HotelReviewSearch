package com.hotelReviewSearch.Entity;

public class SearchRequest {

    private String searchString;

    public SearchRequest(String searchString) {

        this.searchString = searchString;
    }

    public SearchRequest() {
    }

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }
}
