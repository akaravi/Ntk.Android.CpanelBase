package ntk.base.api.product.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.FilterModel;

public class ProductContentListRequest extends FilterModel {

    @SerializedName("TagIds")
    public List<Long> TagIds;
}
