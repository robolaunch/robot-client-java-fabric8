package io.kubefed.types.v1beta1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"clusters","conditions","observedGeneration"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class FederatedLaunchManagerStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("clusters")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.kubefed.types.v1beta1.federatedlaunchmanagerstatus.Clusters> clusters;

    public java.util.List<io.kubefed.types.v1beta1.federatedlaunchmanagerstatus.Clusters> getClusters() {
        return clusters;
    }

    public void setClusters(java.util.List<io.kubefed.types.v1beta1.federatedlaunchmanagerstatus.Clusters> clusters) {
        this.clusters = clusters;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("conditions")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.kubefed.types.v1beta1.federatedlaunchmanagerstatus.Conditions> conditions;

    public java.util.List<io.kubefed.types.v1beta1.federatedlaunchmanagerstatus.Conditions> getConditions() {
        return conditions;
    }

    public void setConditions(java.util.List<io.kubefed.types.v1beta1.federatedlaunchmanagerstatus.Conditions> conditions) {
        this.conditions = conditions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("observedGeneration")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long observedGeneration;

    public Long getObservedGeneration() {
        return observedGeneration;
    }

    public void setObservedGeneration(Long observedGeneration) {
        this.observedGeneration = observedGeneration;
    }
}

