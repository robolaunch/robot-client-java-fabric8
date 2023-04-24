package io.roboscale.robot.v1alpha1.robotspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"ideEnabled","robotIDETemplate","robotVDITemplate","vdiEnabled"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class RobotDevSuiteTemplate implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * If `true`, a Cloud IDE will be provisioned inside development suite.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ideEnabled")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If `true`, a Cloud IDE will be provisioned inside development suite.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean ideEnabled;

    public Boolean getIdeEnabled() {
        return ideEnabled;
    }

    public void setIdeEnabled(Boolean ideEnabled) {
        this.ideEnabled = ideEnabled;
    }

    /**
     * Configurational parameters of RobotIDE. Applied if `.spec.ideEnabled` is set to `true`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("robotIDETemplate")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configurational parameters of RobotIDE. Applied if `.spec.ideEnabled` is set to `true`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotspec.robotdevsuitetemplate.RobotIDETemplate robotIDETemplate;

    public io.roboscale.robot.v1alpha1.robotspec.robotdevsuitetemplate.RobotIDETemplate getRobotIDETemplate() {
        return robotIDETemplate;
    }

    public void setRobotIDETemplate(io.roboscale.robot.v1alpha1.robotspec.robotdevsuitetemplate.RobotIDETemplate robotIDETemplate) {
        this.robotIDETemplate = robotIDETemplate;
    }

    /**
     * Configurational parameters of RobotVDI. Applied if `.spec.vdiEnabled` is set to `true`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("robotVDITemplate")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configurational parameters of RobotVDI. Applied if `.spec.vdiEnabled` is set to `true`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotspec.robotdevsuitetemplate.RobotVDITemplate robotVDITemplate;

    public io.roboscale.robot.v1alpha1.robotspec.robotdevsuitetemplate.RobotVDITemplate getRobotVDITemplate() {
        return robotVDITemplate;
    }

    public void setRobotVDITemplate(io.roboscale.robot.v1alpha1.robotspec.robotdevsuitetemplate.RobotVDITemplate robotVDITemplate) {
        this.robotVDITemplate = robotVDITemplate;
    }

    /**
     * If `true`, a Cloud VDI will be provisioned inside development suite.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vdiEnabled")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If `true`, a Cloud VDI will be provisioned inside development suite.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean vdiEnabled;

    public Boolean getVdiEnabled() {
        return vdiEnabled;
    }

    public void setVdiEnabled(Boolean vdiEnabled) {
        this.vdiEnabled = vdiEnabled;
    }
}

