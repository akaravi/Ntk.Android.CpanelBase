package ntk.base.api.news.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.BaseModuleEntity;

public class NewsCategory extends BaseModuleEntity {

    @SerializedName("Category")
    public NewsCategory Category;

    @SerializedName("virtual_Category")
    public NewsCategory virtual_Category;

    @SerializedName("ShareServerCategories")
    public NewsShareServerCategory ShareServerCategories;

    @SerializedName("ShareReciverCategories")
    public NewsShareReciverCategory ShareReciverCategories;

    @SerializedName("Children")
    public List<NewsCategory> Children;

    @SerializedName("Contents")
    public Long Contents;

    @SerializedName("Description")
    public String Description;

    @SerializedName("FontIcon")
    public String FontIcon;

    @SerializedName("LinkMainImageId")
    public Long LinkMainImageId;

    @SerializedName("LinkParentId")
    public Long LinkParentId;

    @SerializedName("LinkParentIdNode")
    public String LinkParentIdNode;

    @SerializedName("LinkMainImageSrc")
    public String LinkMainImageSrc;

    @SerializedName("Title")
    public String Title;
}
