package io.roboscale.robot.v1alpha1.robotspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"steps"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class BuildManagerTemplate implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("steps")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.roboscale.robot.v1alpha1.robotspec.buildmanagertemplate.Steps> steps;

    public java.util.List<io.roboscale.robot.v1alpha1.robotspec.buildmanagertemplate.Steps> getSteps() {
        return steps;
    }

    public void setSteps(java.util.List<io.roboscale.robot.v1alpha1.robotspec.buildmanagertemplate.Steps> steps) {
        this.steps = steps;
    }
}
