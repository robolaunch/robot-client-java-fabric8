package io.roboscale.robot.v1alpha1.metricsexporterstatus.usage.storage;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"mountedOn","percentage","size","used"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Usage implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Directory that the filesystem mounted on.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mountedOn")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Directory that the filesystem mounted on.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String mountedOn;

    public String getMountedOn() {
        return mountedOn;
    }

    public void setMountedOn(String mountedOn) {
        this.mountedOn = mountedOn;
    }

    /**
     * Usage percentage of a filesystem.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("percentage")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Usage percentage of a filesystem.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String percentage;

    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }

    /**
     * Size of the filesystem.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("size")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Size of the filesystem.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String size;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    /**
     * Size of the used parts of a filesystem.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("used")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Size of the used parts of a filesystem.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String used;

    public String getUsed() {
        return used;
    }

    public void setUsed(String used) {
        this.used = used;
    }
}

