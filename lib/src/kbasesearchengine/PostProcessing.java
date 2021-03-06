
package kbasesearchengine;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: PostProcessing</p>
 * <pre>
 * Rules for what to return about found objects.
 * skip_keys - do not include keyword values for object 
 *     ('key_props' field in ObjectData structure),
 * skip_data - do not include raw data for object ('data' and 
 *     'parent_data' fields in ObjectData structure),
 * include_highlight - include highlights of fields that
 *      matched query,
 * ids_only - shortcut to mark both skips as true and 
 *      include_highlight as false.
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "ids_only",
    "skip_keys",
    "skip_data",
    "include_highlight"
})
public class PostProcessing {

    @JsonProperty("ids_only")
    private Long idsOnly;
    @JsonProperty("skip_keys")
    private Long skipKeys;
    @JsonProperty("skip_data")
    private Long skipData;
    @JsonProperty("include_highlight")
    private Long includeHighlight;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ids_only")
    public Long getIdsOnly() {
        return idsOnly;
    }

    @JsonProperty("ids_only")
    public void setIdsOnly(Long idsOnly) {
        this.idsOnly = idsOnly;
    }

    public PostProcessing withIdsOnly(Long idsOnly) {
        this.idsOnly = idsOnly;
        return this;
    }

    @JsonProperty("skip_keys")
    public Long getSkipKeys() {
        return skipKeys;
    }

    @JsonProperty("skip_keys")
    public void setSkipKeys(Long skipKeys) {
        this.skipKeys = skipKeys;
    }

    public PostProcessing withSkipKeys(Long skipKeys) {
        this.skipKeys = skipKeys;
        return this;
    }

    @JsonProperty("skip_data")
    public Long getSkipData() {
        return skipData;
    }

    @JsonProperty("skip_data")
    public void setSkipData(Long skipData) {
        this.skipData = skipData;
    }

    public PostProcessing withSkipData(Long skipData) {
        this.skipData = skipData;
        return this;
    }

    @JsonProperty("include_highlight")
    public Long getIncludeHighlight() {
        return includeHighlight;
    }

    @JsonProperty("include_highlight")
    public void setIncludeHighlight(Long includeHighlight) {
        this.includeHighlight = includeHighlight;
    }

    public PostProcessing withIncludeHighlight(Long includeHighlight) {
        this.includeHighlight = includeHighlight;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return ((((((((((("PostProcessing"+" [idsOnly=")+ idsOnly)+", skipKeys=")+ skipKeys)+", skipData=")+ skipData)+", includeHighlight=")+ includeHighlight)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
