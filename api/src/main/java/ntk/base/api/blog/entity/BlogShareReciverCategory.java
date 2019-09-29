package ntk.base.api.blog.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.BaseModuleEntity;

public class BlogShareReciverCategory extends BaseModuleEntity {

    @SerializedName("FromDate")
    public String FromDate;

    @SerializedName("LinkShareReciverCategoryId")
    public Long LinkShareReciverCategoryId;

    @SerializedName("LinkShareServerCategoryId")
    public Long LinkShareServerCategoryId;

    @SerializedName("ExpireDate")
    public String ExpireDate;
}
