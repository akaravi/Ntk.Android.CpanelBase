package ntk.base.api.baseModel.theme;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Theme {

    @SerializedName("Toolbar")
    public Toolbar Toolbar;

    @SerializedName("ThemeConfigLayout")
    public List<ThemeChild> Childs;
}
