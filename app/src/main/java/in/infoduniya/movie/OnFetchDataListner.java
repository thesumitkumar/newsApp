package in.infoduniya.movie;

import java.util.List;

import in.infoduniya.movie.Models.NewsHeadlines;

public interface OnFetchDataListner<NewsApiResponse> {


    abstract void onFetchData(List<NewsHeadlines> list, String message);

    abstract void onError(String message);
}
