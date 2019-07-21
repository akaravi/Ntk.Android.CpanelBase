package ntk.base.api.ImageGallery.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.BaseModuleEntity;

class ImageGalleryContentAndParameterValue extends BaseModuleEntity {

    @SerializedName("LinkContentId")
    public Long LinkContentId;

    @SerializedName("LinkContentParameterId")
    public Long LinkContentParameterId;

    @SerializedName("Value")
    public String Value;
}