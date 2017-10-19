package com.hotelReviewSearch.Entity;

public class SearchResult {

    /**
     * Header of the search result
     */
    private String title;

    /**
     * preview text of the search result
     */
    private String snipped;

    public SearchResult(String title, String snipped) {
        this.title = title;
        this.snipped = snipped;
    }

    public SearchResult() {
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSnipped() {
        return snipped;
    }

    public void setSnipped(String snipped) {
        this.snipped = snipped;
    }
}
