package ntk.base.api.MusicGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.MusicGallery.entity.MusicGalleryContentTag;
import ntk.base.api.model.ErrorException;

public class MusicGalleryContentTagResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<MusicGalleryContentTag> ListItems;

    @SerializedName("Item")
    public MusicGalleryContentTag Item;
}
