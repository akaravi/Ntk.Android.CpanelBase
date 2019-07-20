package ntk.base.api.Blog.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.Blog.entity.BlogContent;
import ntk.base.api.model.ErrorException;

public class BlogContentResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BlogContent> ListItems;

    @SerializedName("Item")
    public BlogContent Item;
}
