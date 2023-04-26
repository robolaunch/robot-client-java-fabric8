package io.roboscale.connection_hub.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"federation","federationPhase","multicastPhase","phase","submariner","subnets"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class PhysicalInstanceStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("federation")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.connection_hub.v1alpha1.physicalinstancestatus.Federation federation;

    public io.roboscale.connection_hub.v1alpha1.physicalinstancestatus.Federation getFederation() {
        return federation;
    }

    public void setFederation(io.roboscale.connection_hub.v1alpha1.physicalinstancestatus.Federation federation) {
        this.federation = federation;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("federationPhase")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String federationPhase;

    public String getFederationPhase() {
        return federationPhase;
    }

    public void setFederationPhase(String federationPhase) {
        this.federationPhase = federationPhase;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("multicastPhase")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String multicastPhase;

    public String getMulticastPhase() {
        return multicastPhase;
    }

    public void setMulticastPhase(String multicastPhase) {
        this.multicastPhase = multicastPhase;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("phase")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String phase;

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("submariner")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.connection_hub.v1alpha1.physicalinstancestatus.Submariner submariner;

    public io.roboscale.connection_hub.v1alpha1.physicalinstancestatus.Submariner getSubmariner() {
        return submariner;
    }

    public void setSubmariner(io.roboscale.connection_hub.v1alpha1.physicalinstancestatus.Submariner submariner) {
        this.submariner = submariner;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("subnets")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.connection_hub.v1alpha1.physicalinstancestatus.Subnets subnets;

    public io.roboscale.connection_hub.v1alpha1.physicalinstancestatus.Subnets getSubnets() {
        return subnets;
    }

    public void setSubnets(io.roboscale.connection_hub.v1alpha1.physicalinstancestatus.Subnets subnets) {
        this.subnets = subnets;
    }
}

