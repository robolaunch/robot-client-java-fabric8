package io.kubefed.types.v1beta1.federatedcodeeditorspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"clusterName","clusterOverrides"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Overrides implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("clusterName")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String clusterName;

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("clusterOverrides")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.kubefed.types.v1beta1.federatedcodeeditorspec.overrides.ClusterOverrides> clusterOverrides;

    public java.util.List<io.kubefed.types.v1beta1.federatedcodeeditorspec.overrides.ClusterOverrides> getClusterOverrides() {
        return clusterOverrides;
    }

    public void setClusterOverrides(java.util.List<io.kubefed.types.v1beta1.federatedcodeeditorspec.overrides.ClusterOverrides> clusterOverrides) {
        this.clusterOverrides = clusterOverrides;
    }
}

