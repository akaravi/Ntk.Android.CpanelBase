package ntk.base.api.blog.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.blog.entity.BlogTag;
import ntk.base.api.baseModel.ErrorException;

public class BlogTagResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BlogTag> ListItems;

    @SerializedName("Item")
    public BlogTag Item;
}
