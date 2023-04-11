package io.kubefed.types.v1beta1.federatedbuildmanagerspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"clusterSelector","clusters"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Placement implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("clusterSelector")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.kubefed.types.v1beta1.federatedbuildmanagerspec.placement.ClusterSelector clusterSelector;

    public io.kubefed.types.v1beta1.federatedbuildmanagerspec.placement.ClusterSelector getClusterSelector() {
        return clusterSelector;
    }

    public void setClusterSelector(io.kubefed.types.v1beta1.federatedbuildmanagerspec.placement.ClusterSelector clusterSelector) {
        this.clusterSelector = clusterSelector;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("clusters")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.kubefed.types.v1beta1.federatedbuildmanagerspec.placement.Clusters> clusters;

    public java.util.List<io.kubefed.types.v1beta1.federatedbuildmanagerspec.placement.Clusters> getClusters() {
        return clusters;
    }

    public void setClusters(java.util.List<io.kubefed.types.v1beta1.federatedbuildmanagerspec.placement.Clusters> clusters) {
        this.clusters = clusters;
    }
}

