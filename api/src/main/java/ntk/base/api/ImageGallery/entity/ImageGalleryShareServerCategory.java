package ntk.base.api.ImageGallery.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.BaseModuleEntity;

public class ImageGalleryShareServerCategory extends BaseModuleEntity {

    @SerializedName("Description")
    public String Description;

    @SerializedName("LinkShareMainAdminSettingId")
    public Long LinkShareMainAdminSettingId;

    @SerializedName("Title")
    public String Title;

    @SerializedName("LinkServerCategoryId")
    public Long LinkServerCategoryId;
}