package io.roboscale.connection_hub.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"cloudInstance","connectionInterfaces","federation","federationHost","key","nodeInfo","phase","submariner"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ConnectionHubStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("cloudInstance")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.connection_hub.v1alpha1.connectionhubstatus.CloudInstance cloudInstance;

    public io.roboscale.connection_hub.v1alpha1.connectionhubstatus.CloudInstance getCloudInstance() {
        return cloudInstance;
    }

    public void setCloudInstance(io.roboscale.connection_hub.v1alpha1.connectionhubstatus.CloudInstance cloudInstance) {
        this.cloudInstance = cloudInstance;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("connectionInterfaces")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.connection_hub.v1alpha1.connectionhubstatus.ConnectionInterfaces connectionInterfaces;

    public io.roboscale.connection_hub.v1alpha1.connectionhubstatus.ConnectionInterfaces getConnectionInterfaces() {
        return connectionInterfaces;
    }

    public void setConnectionInterfaces(io.roboscale.connection_hub.v1alpha1.connectionhubstatus.ConnectionInterfaces connectionInterfaces) {
        this.connectionInterfaces = connectionInterfaces;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("federation")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.connection_hub.v1alpha1.connectionhubstatus.Federation federation;

    public io.roboscale.connection_hub.v1alpha1.connectionhubstatus.Federation getFederation() {
        return federation;
    }

    public void setFederation(io.roboscale.connection_hub.v1alpha1.connectionhubstatus.Federation federation) {
        this.federation = federation;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("federationHost")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.connection_hub.v1alpha1.connectionhubstatus.FederationHost federationHost;

    public io.roboscale.connection_hub.v1alpha1.connectionhubstatus.FederationHost getFederationHost() {
        return federationHost;
    }

    public void setFederationHost(io.roboscale.connection_hub.v1alpha1.connectionhubstatus.FederationHost federationHost) {
        this.federationHost = federationHost;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("key")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("nodeInfo")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.connection_hub.v1alpha1.connectionhubstatus.NodeInfo nodeInfo;

    public io.roboscale.connection_hub.v1alpha1.connectionhubstatus.NodeInfo getNodeInfo() {
        return nodeInfo;
    }

    public void setNodeInfo(io.roboscale.connection_hub.v1alpha1.connectionhubstatus.NodeInfo nodeInfo) {
        this.nodeInfo = nodeInfo;
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
    private io.roboscale.connection_hub.v1alpha1.connectionhubstatus.Submariner submariner;

    public io.roboscale.connection_hub.v1alpha1.connectionhubstatus.Submariner getSubmariner() {
        return submariner;
    }

    public void setSubmariner(io.roboscale.connection_hub.v1alpha1.connectionhubstatus.Submariner submariner) {
        this.submariner = submariner;
    }
}

