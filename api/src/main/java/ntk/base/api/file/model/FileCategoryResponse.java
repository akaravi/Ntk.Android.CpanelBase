package ntk.base.api.file.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.file.entity.FileCategory;
import ntk.base.api.baseModel.ErrorException;

public class FileCategoryResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<FileCategory> ListItems;

    @SerializedName("Item")
    public FileCategory Item;
}
