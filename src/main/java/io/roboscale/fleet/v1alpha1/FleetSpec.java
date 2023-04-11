package io.roboscale.fleet.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"discoveryServerTemplate","hybrid","instances"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class FleetSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * DiscoveryServerSpec defines the desired state of DiscoveryServer
     */
    @com.fasterxml.jackson.annotation.JsonProperty("discoveryServerTemplate")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DiscoveryServerSpec defines the desired state of DiscoveryServer")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.fleet.v1alpha1.fleetspec.DiscoveryServerTemplate discoveryServerTemplate;

    public io.roboscale.fleet.v1alpha1.fleetspec.DiscoveryServerTemplate getDiscoveryServerTemplate() {
        return discoveryServerTemplate;
    }

    public void setDiscoveryServerTemplate(io.roboscale.fleet.v1alpha1.fleetspec.DiscoveryServerTemplate discoveryServerTemplate) {
        this.discoveryServerTemplate = discoveryServerTemplate;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("hybrid")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean hybrid;

    public Boolean getHybrid() {
        return hybrid;
    }

    public void setHybrid(Boolean hybrid) {
        this.hybrid = hybrid;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("instances")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> instances;

    public java.util.List<String> getInstances() {
        return instances;
    }

    public void setInstances(java.util.List<String> instances) {
        this.instances = instances;
    }
}

