package ntk.base.api.Blog.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.BaseModuleEntity;

public class BlogContentTag extends BaseModuleEntity {

    @SerializedName("LinkContentId")
    public Long LinkContentId;

    @SerializedName("LinkTagId")
    public Long LinkTagId;

    @SerializedName("virtual_ModuleContent")
    public BlogContent virtual_ModuleContent;

    @SerializedName("ModuleContent")
    public BlogContent ModuleContent;

    @SerializedName("virtual_ModuleTag")
    public BlogTag virtual_ModuleTag;

    @SerializedName("ModuleTag")
    public BlogTag ModuleTag;
}