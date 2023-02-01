package com.example;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"idx",
"name",
"category",
"area",
"phone",
"address",
"homepage",
"businesshour",
"holiday",
"content",
"menuprice",
"xposition",
"yposition",
"multifileId",
"images"
})
@Generated("jsonschema2pojo")
public class Result {

@JsonProperty("idx")
private Integer idx;
@JsonProperty("name")
private String name;
@JsonProperty("category")
private String category;
@JsonProperty("area")
private String area;
@JsonProperty("phone")
private String phone;
@JsonProperty("address")
private String address;
@JsonProperty("homepage")
private String homepage;
@JsonProperty("businesshour")
private String businesshour;
@JsonProperty("holiday")
private String holiday;
@JsonProperty("content")
private String content;
@JsonProperty("menuprice")
private String menuprice;
@JsonProperty("xposition")
private String xposition;
@JsonProperty("yposition")
private String yposition;
@JsonProperty("multifileId")
private String multifileId;
@JsonProperty("images")
private List<String> images;
@JsonIgnore
private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

/**
* No args constructor for use in serialization
*
*/
public Result() {
}

/**
*
* @param area
* @param images
* @param address
* @param menuprice
* @param xposition
* @param yposition
* @param businesshour
* @param holiday
* @param content
* @param phone
* @param name
* @param idx
* @param category
* @param multifileId
* @param homepage
*/
public Result(Integer idx, String name, String category, String area, String phone, String address, String homepage, String businesshour, String holiday, String content, String menuprice, String xposition, String yposition, String multifileId, List<String> images) {
super();
this.idx = idx;
this.name = name;
this.category = category;
this.area = area;
this.phone = phone;
this.address = address;
this.homepage = homepage;
this.businesshour = businesshour;
this.holiday = holiday;
this.content = content;
this.menuprice = menuprice;
this.xposition = xposition;
this.yposition = yposition;
this.multifileId = multifileId;
this.images = images;
}

@JsonProperty("idx")
public Integer getIdx() {
return idx;
}

@JsonProperty("idx")
public void setIdx(Integer idx) {
this.idx = idx;
}

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("category")
public String getCategory() {
return category;
}

@JsonProperty("category")
public void setCategory(String category) {
this.category = category;
}

@JsonProperty("area")
public String getArea() {
return area;
}

@JsonProperty("area")
public void setArea(String area) {
this.area = area;
}

@JsonProperty("phone")
public String getPhone() {
return phone;
}

@JsonProperty("phone")
public void setPhone(String phone) {
this.phone = phone;
}

@JsonProperty("address")
public String getAddress() {
return address;
}

@JsonProperty("address")
public void setAddress(String address) {
this.address = address;
}

@JsonProperty("homepage")
public String getHomepage() {
return homepage;
}

@JsonProperty("homepage")
public void setHomepage(String homepage) {
this.homepage = homepage;
}

@JsonProperty("businesshour")
public String getBusinesshour() {
return businesshour;
}

@JsonProperty("businesshour")
public void setBusinesshour(String businesshour) {
this.businesshour = businesshour;
}

@JsonProperty("holiday")
public String getHoliday() {
return holiday;
}

@JsonProperty("holiday")
public void setHoliday(String holiday) {
this.holiday = holiday;
}

@JsonProperty("content")
public String getContent() {
return content;
}

@JsonProperty("content")
public void setContent(String content) {
this.content = content;
}

@JsonProperty("menuprice")
public String getMenuprice() {
return menuprice;
}

@JsonProperty("menuprice")
public void setMenuprice(String menuprice) {
this.menuprice = menuprice;
}

@JsonProperty("xposition")
public String getXposition() {
return xposition;
}

@JsonProperty("xposition")
public void setXposition(String xposition) {
this.xposition = xposition;
}

@JsonProperty("yposition")
public String getYposition() {
return yposition;
}

@JsonProperty("yposition")
public void setYposition(String yposition) {
this.yposition = yposition;
}

@JsonProperty("multifileId")
public String getMultifileId() {
return multifileId;
}

@JsonProperty("multifileId")
public void setMultifileId(String multifileId) {
this.multifileId = multifileId;
}

@JsonProperty("images")
public List<String> getImages() {
return images;
}

@JsonProperty("images")
public void setImages(List<String> images) {
this.images = images;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append(Result.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
sb.append("idx");
sb.append('=');
sb.append(((this.idx == null)?"<null>":this.idx));
sb.append(',');
sb.append("name");
sb.append('=');
sb.append(((this.name == null)?"<null>":this.name));
sb.append(',');
sb.append("category");
sb.append('=');
sb.append(((this.category == null)?"<null>":this.category));
sb.append(',');
sb.append("area");
sb.append('=');
sb.append(((this.area == null)?"<null>":this.area));
sb.append(',');
sb.append("phone");
sb.append('=');
sb.append(((this.phone == null)?"<null>":this.phone));
sb.append(',');
sb.append("address");
sb.append('=');
sb.append(((this.address == null)?"<null>":this.address));
sb.append(',');
sb.append("homepage");
sb.append('=');
sb.append(((this.homepage == null)?"<null>":this.homepage));
sb.append(',');
sb.append("businesshour");
sb.append('=');
sb.append(((this.businesshour == null)?"<null>":this.businesshour));
sb.append(',');
sb.append("holiday");
sb.append('=');
sb.append(((this.holiday == null)?"<null>":this.holiday));
sb.append(',');
sb.append("content");
sb.append('=');
sb.append(((this.content == null)?"<null>":this.content));
sb.append(',');
sb.append("menuprice");
sb.append('=');
sb.append(((this.menuprice == null)?"<null>":this.menuprice));
sb.append(',');
sb.append("xposition");
sb.append('=');
sb.append(((this.xposition == null)?"<null>":this.xposition));
sb.append(',');
sb.append("yposition");
sb.append('=');
sb.append(((this.yposition == null)?"<null>":this.yposition));
sb.append(',');
sb.append("multifileId");
sb.append('=');
sb.append(((this.multifileId == null)?"<null>":this.multifileId));
sb.append(',');
sb.append("images");
sb.append('=');
sb.append(((this.images == null)?"<null>":this.images));
sb.append(',');
sb.append("additionalProperties");
sb.append('=');
sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
sb.append(',');
if (sb.charAt((sb.length()- 1)) == ',') {
sb.setCharAt((sb.length()- 1), ']');
} else {
sb.append(']');
}
return sb.toString();
}

@Override
public int hashCode() {
int result = 1;
result = ((result* 31)+((this.area == null)? 0 :this.area.hashCode()));
result = ((result* 31)+((this.images == null)? 0 :this.images.hashCode()));
result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
result = ((result* 31)+((this.menuprice == null)? 0 :this.menuprice.hashCode()));
result = ((result* 31)+((this.xposition == null)? 0 :this.xposition.hashCode()));
result = ((result* 31)+((this.yposition == null)? 0 :this.yposition.hashCode()));
result = ((result* 31)+((this.businesshour == null)? 0 :this.businesshour.hashCode()));
result = ((result* 31)+((this.holiday == null)? 0 :this.holiday.hashCode()));
result = ((result* 31)+((this.content == null)? 0 :this.content.hashCode()));
result = ((result* 31)+((this.phone == null)? 0 :this.phone.hashCode()));
result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
result = ((result* 31)+((this.idx == null)? 0 :this.idx.hashCode()));
result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
result = ((result* 31)+((this.multifileId == null)? 0 :this.multifileId.hashCode()));
result = ((result* 31)+((this.homepage == null)? 0 :this.homepage.hashCode()));
return result;
}

@Override
public boolean equals(Object other) {
if (other == this) {
return true;
}
if ((other instanceof Result) == false) {
return false;
}
Result rhs = ((Result) other);
return (((((((((((((((((this.area == rhs.area)||((this.area!= null)&&this.area.equals(rhs.area)))&&((this.images == rhs.images)||((this.images!= null)&&this.images.equals(rhs.images))))&&((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address))))&&((this.menuprice == rhs.menuprice)||((this.menuprice!= null)&&this.menuprice.equals(rhs.menuprice))))&&((this.xposition == rhs.xposition)||((this.xposition!= null)&&this.xposition.equals(rhs.xposition))))&&((this.yposition == rhs.yposition)||((this.yposition!= null)&&this.yposition.equals(rhs.yposition))))&&((this.businesshour == rhs.businesshour)||((this.businesshour!= null)&&this.businesshour.equals(rhs.businesshour))))&&((this.holiday == rhs.holiday)||((this.holiday!= null)&&this.holiday.equals(rhs.holiday))))&&((this.content == rhs.content)||((this.content!= null)&&this.content.equals(rhs.content))))&&((this.phone == rhs.phone)||((this.phone!= null)&&this.phone.equals(rhs.phone))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.idx == rhs.idx)||((this.idx!= null)&&this.idx.equals(rhs.idx))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.multifileId == rhs.multifileId)||((this.multifileId!= null)&&this.multifileId.equals(rhs.multifileId))))&&((this.homepage == rhs.homepage)||((this.homepage!= null)&&this.homepage.equals(rhs.homepage))));
}

}