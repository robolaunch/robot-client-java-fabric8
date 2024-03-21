package io.roboscale.robot.v1alpha2.codeeditorspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"securityContext","volumeMounts"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Container implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Security context of the code editor container.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("securityContext")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Security context of the code editor container.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.codeeditorspec.container.SecurityContext securityContext;

    public io.roboscale.robot.v1alpha2.codeeditorspec.container.SecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(io.roboscale.robot.v1alpha2.codeeditorspec.container.SecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    /**
     * Mounted volumes of the code editor container.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("volumeMounts")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Mounted volumes of the code editor container.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.roboscale.robot.v1alpha2.codeeditorspec.container.VolumeMounts> volumeMounts;

    public java.util.List<io.roboscale.robot.v1alpha2.codeeditorspec.container.VolumeMounts> getVolumeMounts() {
        return volumeMounts;
    }

    public void setVolumeMounts(java.util.List<io.roboscale.robot.v1alpha2.codeeditorspec.container.VolumeMounts> volumeMounts) {
        this.volumeMounts = volumeMounts;
    }
}

