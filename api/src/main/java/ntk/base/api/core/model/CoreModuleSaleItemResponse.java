package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.core.entity.CoreModuleSaleItem;
import ntk.base.api.baseModel.ErrorException;

public class CoreModuleSaleItemResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<CoreModuleSaleItem> ListItems;

    @SerializedName("Item")
    public CoreModuleSaleItem Item;
}
