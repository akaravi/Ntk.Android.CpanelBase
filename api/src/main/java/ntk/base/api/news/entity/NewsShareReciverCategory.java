package ntk.base.api.news.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.BaseModuleEntity;

public class NewsShareReciverCategory extends BaseModuleEntity {

    @SerializedName("FromDate")
    public String FromDate;

    @SerializedName("LinkShareReciverCategoryId")
    public Long LinkShareReciverCategoryId;

    @SerializedName("LinkShareServerCategoryId")
    public Long LinkShareServerCategoryId;

    @SerializedName("ExpireDate")
    public String ExpireDate;
}
