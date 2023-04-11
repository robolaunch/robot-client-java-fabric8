package io.roboscale.robot.v1alpha1.robotstatus.attachedbuildobject.status;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"resource","step"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Steps implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("resource")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotstatus.attachedbuildobject.status.steps.Resource resource;

    public io.roboscale.robot.v1alpha1.robotstatus.attachedbuildobject.status.steps.Resource getResource() {
        return resource;
    }

    public void setResource(io.roboscale.robot.v1alpha1.robotstatus.attachedbuildobject.status.steps.Resource resource) {
        this.resource = resource;
    }

    /**
     * Step is a command or script to execute when building a robot. Either `command` or `script` should be specified for each step.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("step")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Step is a command or script to execute when building a robot. Either `command` or `script` should be specified for each step.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotstatus.attachedbuildobject.status.steps.Step step;

    public io.roboscale.robot.v1alpha1.robotstatus.attachedbuildobject.status.steps.Step getStep() {
        return step;
    }

    public void setStep(io.roboscale.robot.v1alpha1.robotstatus.attachedbuildobject.status.steps.Step step) {
        this.step = step;
    }
}

