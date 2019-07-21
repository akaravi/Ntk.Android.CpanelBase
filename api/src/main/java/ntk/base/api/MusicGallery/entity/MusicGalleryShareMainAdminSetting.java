package ntk.base.api.MusicGallery.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.BaseModuleEntity;

public class MusicGalleryShareMainAdminSetting extends BaseModuleEntity {

    @SerializedName("AdminMainPriceFixed")
    public String AdminMainPriceFixed;

    @SerializedName("AdminMainPricePercent")
    public String AdminMainPricePercent;

    @SerializedName("Description")
    public String Description;

    @SerializedName("PaymentMethod")
    public int PaymentMethod;

    @SerializedName("ReciverPriceCost")
    public String ReciverPriceCost;

    @SerializedName("Title")
    public String Title;
}