package ntk.base.api.musicGallery.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.FilterModel;

public class MusicGalleryContentCategoryListRequest extends FilterModel {

    @SerializedName("LinkContentId")
    public Long LinkContentId;
}
