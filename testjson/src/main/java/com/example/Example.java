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
@JsonPropertyOrder({ "record_count", "address", "name", "pageunit", "page", "results", "page_count", "status" })
@Generated("jsonschema2pojo")
public class Example {

	@JsonProperty("record_count")
	private Integer recordCount;
	@JsonProperty("address")
	private String address;
	@JsonProperty("name")
	private String name;
	@JsonProperty("pageunit")
	private Integer pageunit;
	@JsonProperty("page")
	private Integer page;
	@JsonProperty("results")
	private List<Result> results;
	@JsonProperty("page_count")
	private Integer pageCount;
	@JsonProperty("status")
	private String status;
	// 제이슨 형태로 가공할 때 무시하고싶은 항목
	@JsonIgnore
	private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Example() {
	}

	/**
	 *
	 * @param pageCount
	 * @param address
	 * @param recordCount
	 * @param name
	 * @param pageunit
	 * @param page
	 * @param results
	 * @param status
	 */
	public Example(Integer recordCount, String address, String name, Integer pageunit, Integer page,
			List<Result> results, Integer pageCount, String status) {
		super();
		this.recordCount = recordCount;
		this.address = address;
		this.name = name;
		this.pageunit = pageunit;
		this.page = page;
		this.results = results;
		this.pageCount = pageCount;
		this.status = status;
	}

	@JsonProperty("record_count")
	public Integer getRecordCount() {
		return recordCount;
	}

	@JsonProperty("record_count")
	public void setRecordCount(Integer recordCount) {
		this.recordCount = recordCount;
	}

	@JsonProperty("address")
	public String getAddress() {
		return address;
	}

	@JsonProperty("address")
	public void setAddress(String address) {
		this.address = address;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("pageunit")
	public Integer getPageunit() {
		return pageunit;
	}

	@JsonProperty("pageunit")
	public void setPageunit(Integer pageunit) {
		this.pageunit = pageunit;
	}

	@JsonProperty("page")
	public Integer getPage() {
		return page;
	}

	@JsonProperty("page")
	public void setPage(Integer page) {
		this.page = page;
	}

	@JsonProperty("results")
	public List<Result> getResults() {
		return results;
	}

	@JsonProperty("results")
	public void setResults(List<Result> results) {
		this.results = results;
	}

	@JsonProperty("page_count")
	public Integer getPageCount() {
		return pageCount;
	}

	@JsonProperty("page_count")
	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(String status) {
		this.status = status;
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
		sb.append(Example.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
				.append('[');
		sb.append("recordCount");
		sb.append('=');
		sb.append(((this.recordCount == null) ? "<null>" : this.recordCount));
		sb.append(',');
		sb.append("address");
		sb.append('=');
		sb.append(((this.address == null) ? "<null>" : this.address));
		sb.append(',');
		sb.append("name");
		sb.append('=');
		sb.append(((this.name == null) ? "<null>" : this.name));
		sb.append(',');
		sb.append("pageunit");
		sb.append('=');
		sb.append(((this.pageunit == null) ? "<null>" : this.pageunit));
		sb.append(',');
		sb.append("page");
		sb.append('=');
		sb.append(((this.page == null) ? "<null>" : this.page));
		sb.append(',');
		sb.append("results");
		sb.append('=');
		sb.append(((this.results == null) ? "<null>" : this.results));
		sb.append(',');
		sb.append("pageCount");
		sb.append('=');
		sb.append(((this.pageCount == null) ? "<null>" : this.pageCount));
		sb.append(',');
		sb.append("status");
		sb.append('=');
		sb.append(((this.status == null) ? "<null>" : this.status));
		sb.append(',');
		sb.append("additionalProperties");
		sb.append('=');
		sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
		sb.append(',');
		if (sb.charAt((sb.length() - 1)) == ',') {
			sb.setCharAt((sb.length() - 1), ']');
		} else {
			sb.append(']');
		}
		return sb.toString();
	}

	@Override
	public int hashCode() {
		int result = 1;
		result = ((result * 31) + ((this.pageCount == null) ? 0 : this.pageCount.hashCode()));
		result = ((result * 31) + ((this.address == null) ? 0 : this.address.hashCode()));
		result = ((result * 31) + ((this.recordCount == null) ? 0 : this.recordCount.hashCode()));
		result = ((result * 31) + ((this.name == null) ? 0 : this.name.hashCode()));
		result = ((result * 31) + ((this.pageunit == null) ? 0 : this.pageunit.hashCode()));
		result = ((result * 31) + ((this.page == null) ? 0 : this.page.hashCode()));
		result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
		result = ((result * 31) + ((this.results == null) ? 0 : this.results.hashCode()));
		result = ((result * 31) + ((this.status == null) ? 0 : this.status.hashCode()));
		return result;
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Example) == false) {
			return false;
		}
		Example rhs = ((Example) other);
		return ((((((((((this.pageCount == rhs.pageCount)
				|| ((this.pageCount != null) && this.pageCount.equals(rhs.pageCount)))
				&& ((this.address == rhs.address) || ((this.address != null) && this.address.equals(rhs.address))))
				&& ((this.recordCount == rhs.recordCount)
						|| ((this.recordCount != null) && this.recordCount.equals(rhs.recordCount))))
				&& ((this.name == rhs.name) || ((this.name != null) && this.name.equals(rhs.name))))
				&& ((this.pageunit == rhs.pageunit) || ((this.pageunit != null) && this.pageunit.equals(rhs.pageunit))))
				&& ((this.page == rhs.page) || ((this.page != null) && this.page.equals(rhs.page))))
				&& ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null)
						&& this.additionalProperties.equals(rhs.additionalProperties))))
				&& ((this.results == rhs.results) || ((this.results != null) && this.results.equals(rhs.results))))
				&& ((this.status == rhs.status) || ((this.status != null) && this.status.equals(rhs.status))));
	}

}