package ntk.base.api.article.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.article.entity.ArticleComment;
import ntk.base.api.baseModel.ErrorException;

public class ArticleCommentResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ArticleComment> ListItems;

    @SerializedName("Item")
    public ArticleComment Item;
}
