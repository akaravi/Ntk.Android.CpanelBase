package ntk.base.api.MovieGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.MovieGallery.entity.MovieGalleryTag;
import ntk.base.api.baseModel.ErrorException;

public class MovieGalleryTagResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<MovieGalleryTag> ListItems;

    @SerializedName("Item")
    public MovieGalleryTag Item;
}
