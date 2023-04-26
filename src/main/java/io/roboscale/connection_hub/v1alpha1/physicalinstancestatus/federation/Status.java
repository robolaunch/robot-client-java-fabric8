package io.roboscale.connection_hub.v1alpha1.physicalinstancestatus.federation;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"host","joinAttempted","kubefedClusterStatus","phase"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Status implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("host")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.connection_hub.v1alpha1.physicalinstancestatus.federation.status.Host host;

    public io.roboscale.connection_hub.v1alpha1.physicalinstancestatus.federation.status.Host getHost() {
        return host;
    }

    public void setHost(io.roboscale.connection_hub.v1alpha1.physicalinstancestatus.federation.status.Host host) {
        this.host = host;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("joinAttempted")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean joinAttempted;

    public Boolean getJoinAttempted() {
        return joinAttempted;
    }

    public void setJoinAttempted(Boolean joinAttempted) {
        this.joinAttempted = joinAttempted;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("kubefedClusterStatus")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.connection_hub.v1alpha1.physicalinstancestatus.federation.status.KubefedClusterStatus kubefedClusterStatus;

    public io.roboscale.connection_hub.v1alpha1.physicalinstancestatus.federation.status.KubefedClusterStatus getKubefedClusterStatus() {
        return kubefedClusterStatus;
    }

    public void setKubefedClusterStatus(io.roboscale.connection_hub.v1alpha1.physicalinstancestatus.federation.status.KubefedClusterStatus kubefedClusterStatus) {
        this.kubefedClusterStatus = kubefedClusterStatus;
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
}

