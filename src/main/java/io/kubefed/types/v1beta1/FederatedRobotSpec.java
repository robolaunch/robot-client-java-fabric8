package io.kubefed.types.v1beta1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"overrides","placement","template"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class FederatedRobotSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("overrides")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.kubefed.types.v1beta1.federatedrobotspec.Overrides> overrides;

    public java.util.List<io.kubefed.types.v1beta1.federatedrobotspec.Overrides> getOverrides() {
        return overrides;
    }

    public void setOverrides(java.util.List<io.kubefed.types.v1beta1.federatedrobotspec.Overrides> overrides) {
        this.overrides = overrides;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("placement")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.kubefed.types.v1beta1.federatedrobotspec.Placement placement;

    public io.kubefed.types.v1beta1.federatedrobotspec.Placement getPlacement() {
        return placement;
    }

    public void setPlacement(io.kubefed.types.v1beta1.federatedrobotspec.Placement placement) {
        this.placement = placement;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("template")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.kubefed.types.v1beta1.federatedrobotspec.Template template;

    public io.kubefed.types.v1beta1.federatedrobotspec.Template getTemplate() {
        return template;
    }

    public void setTemplate(io.kubefed.types.v1beta1.federatedrobotspec.Template template) {
        this.template = template;
    }
}

