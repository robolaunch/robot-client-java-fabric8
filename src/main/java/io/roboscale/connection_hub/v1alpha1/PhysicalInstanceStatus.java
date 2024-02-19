package io.roboscale.connection_hub.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"bootID","connectionURL","federation","federationPhase","multicastPhase","phase","relayServerPodStatus","relayServerServiceStatus","submariner","subnets"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class PhysicalInstanceStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("bootID")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String bootID;

    public String getBootID() {
        return bootID;
    }

    public void setBootID(String bootID) {
        this.bootID = bootID;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("connectionURL")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String connectionURL;

    public String getConnectionURL() {
        return connectionURL;
    }

    public void setConnectionURL(String connectionURL) {
        this.connectionURL = connectionURL;
    }

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

    @com.fasterxml.jackson.annotation.JsonProperty("relayServerPodStatus")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.connection_hub.v1alpha1.physicalinstancestatus.RelayServerPodStatus relayServerPodStatus;

    public io.roboscale.connection_hub.v1alpha1.physicalinstancestatus.RelayServerPodStatus getRelayServerPodStatus() {
        return relayServerPodStatus;
    }

    public void setRelayServerPodStatus(io.roboscale.connection_hub.v1alpha1.physicalinstancestatus.RelayServerPodStatus relayServerPodStatus) {
        this.relayServerPodStatus = relayServerPodStatus;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("relayServerServiceStatus")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.connection_hub.v1alpha1.physicalinstancestatus.RelayServerServiceStatus relayServerServiceStatus;

    public io.roboscale.connection_hub.v1alpha1.physicalinstancestatus.RelayServerServiceStatus getRelayServerServiceStatus() {
        return relayServerServiceStatus;
    }

    public void setRelayServerServiceStatus(io.roboscale.connection_hub.v1alpha1.physicalinstancestatus.RelayServerServiceStatus relayServerServiceStatus) {
        this.relayServerServiceStatus = relayServerServiceStatus;
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

