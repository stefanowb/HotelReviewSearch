package com.hotelReviewSearch.Dao;

import com.hotelReviewSearch.Entity.SearchResult;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
@Qualifier("fakeData")
public class FakeSearchDaoImpl implements SearchDao {

    private static Map<Integer, SearchResult> searchResults;

    static {

        searchResults = new HashMap<Integer, SearchResult>(){
            {
                put(1, new SearchResult("Leipziger 5 Sterne Ressort", "Ein super schönes Hotel."));
                put(2, new SearchResult("Dresdener Kaschemme", "Nicht so toll."));
                put(3, new SearchResult("Berliner Bruchbude", "Nicht zu empfehlen."));
            }
        };
    }

    @Override
    public Collection<SearchResult> getSearchResults() {
        return this.searchResults.values();
    }
}
