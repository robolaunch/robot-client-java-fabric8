package io.roboscale.robot.v1alpha1.robotspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"ideEnabled","robotIDETemplate","robotVDITemplate","vdiEnabled"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class RobotDevSuiteTemplate implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("ideEnabled")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean ideEnabled;

    public Boolean getIdeEnabled() {
        return ideEnabled;
    }

    public void setIdeEnabled(Boolean ideEnabled) {
        this.ideEnabled = ideEnabled;
    }

    /**
     * RobotIDESpec defines the desired state of RobotIDE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("robotIDETemplate")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("RobotIDESpec defines the desired state of RobotIDE")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotspec.robotdevsuitetemplate.RobotIDETemplate robotIDETemplate;

    public io.roboscale.robot.v1alpha1.robotspec.robotdevsuitetemplate.RobotIDETemplate getRobotIDETemplate() {
        return robotIDETemplate;
    }

    public void setRobotIDETemplate(io.roboscale.robot.v1alpha1.robotspec.robotdevsuitetemplate.RobotIDETemplate robotIDETemplate) {
        this.robotIDETemplate = robotIDETemplate;
    }

    /**
     * RobotVDISpec defines the desired state of RobotVDI
     */
    @com.fasterxml.jackson.annotation.JsonProperty("robotVDITemplate")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("RobotVDISpec defines the desired state of RobotVDI")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotspec.robotdevsuitetemplate.RobotVDITemplate robotVDITemplate;

    public io.roboscale.robot.v1alpha1.robotspec.robotdevsuitetemplate.RobotVDITemplate getRobotVDITemplate() {
        return robotVDITemplate;
    }

    public void setRobotVDITemplate(io.roboscale.robot.v1alpha1.robotspec.robotdevsuitetemplate.RobotVDITemplate robotVDITemplate) {
        this.robotVDITemplate = robotVDITemplate;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("vdiEnabled")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean vdiEnabled;

    public Boolean getVdiEnabled() {
        return vdiEnabled;
    }

    public void setVdiEnabled(Boolean vdiEnabled) {
        this.vdiEnabled = vdiEnabled;
    }
}

