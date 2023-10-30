package io.roboscale.robot.v1alpha1.metricsexporterstatus.usage;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"allocated","capacity"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class GpuInstanceUsage implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Number of allocated virtual cores.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("allocated")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Number of allocated virtual cores.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String allocated;

    public String getAllocated() {
        return allocated;
    }

    public void setAllocated(String allocated) {
        this.allocated = allocated;
    }

    /**
     * Number of total virtual cores.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("capacity")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Number of total virtual cores.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String capacity;

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
}

