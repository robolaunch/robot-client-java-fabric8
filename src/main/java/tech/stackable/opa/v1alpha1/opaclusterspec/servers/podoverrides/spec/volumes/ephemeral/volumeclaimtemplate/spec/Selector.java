package tech.stackable.opa.v1alpha1.opaclusterspec.servers.podoverrides.spec.volumes.ephemeral.volumeclaimtemplate.spec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"matchExpressions","matchLabels"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Selector implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("matchExpressions")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<tech.stackable.opa.v1alpha1.opaclusterspec.servers.podoverrides.spec.volumes.ephemeral.volumeclaimtemplate.spec.selector.MatchExpressions> matchExpressions;

    public java.util.List<tech.stackable.opa.v1alpha1.opaclusterspec.servers.podoverrides.spec.volumes.ephemeral.volumeclaimtemplate.spec.selector.MatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(java.util.List<tech.stackable.opa.v1alpha1.opaclusterspec.servers.podoverrides.spec.volumes.ephemeral.volumeclaimtemplate.spec.selector.MatchExpressions> matchExpressions) {
        this.matchExpressions = matchExpressions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("matchLabels")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> matchLabels;

    public java.util.Map<java.lang.String, String> getMatchLabels() {
        return matchLabels;
    }

    public void setMatchLabels(java.util.Map<java.lang.String, String> matchLabels) {
        this.matchLabels = matchLabels;
    }
}
