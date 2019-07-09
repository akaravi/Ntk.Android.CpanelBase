package ntk.base.api.file.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class FileContentResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<FileContent> ListItems;

    @SerializedName("Item")
    public FileContent Item;
}
