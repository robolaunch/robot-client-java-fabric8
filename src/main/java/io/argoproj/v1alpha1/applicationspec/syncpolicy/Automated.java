package io.argoproj.v1alpha1.applicationspec.syncpolicy;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"allowEmpty","prune","selfHeal"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Automated implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * AllowEmpty allows apps have zero live resources (default: false)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("allowEmpty")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("AllowEmpty allows apps have zero live resources (default: false)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean allowEmpty;

    public Boolean getAllowEmpty() {
        return allowEmpty;
    }

    public void setAllowEmpty(Boolean allowEmpty) {
        this.allowEmpty = allowEmpty;
    }

    /**
     * Prune specifies whether to delete resources from the cluster that are not found in the sources anymore as part of automated sync (default: false)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("prune")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Prune specifies whether to delete resources from the cluster that are not found in the sources anymore as part of automated sync (default: false)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean prune;

    public Boolean getPrune() {
        return prune;
    }

    public void setPrune(Boolean prune) {
        this.prune = prune;
    }

    /**
     * SelfHeal specifies whether to revert resources back to their desired state upon modification in the cluster (default: false)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("selfHeal")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("SelfHeal specifies whether to revert resources back to their desired state upon modification in the cluster (default: false)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean selfHeal;

    public Boolean getSelfHeal() {
        return selfHeal;
    }

    public void setSelfHeal(Boolean selfHeal) {
        this.selfHeal = selfHeal;
    }
}

