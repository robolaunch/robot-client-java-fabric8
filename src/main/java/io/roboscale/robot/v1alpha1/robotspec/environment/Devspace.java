package io.roboscale.robot.v1alpha1.robotspec.environment;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"desktop","ubuntuDistro","version"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Devspace implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Ubuntu desktop.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("desktop")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Ubuntu desktop.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String desktop;

    public String getDesktop() {
        return desktop;
    }

    public void setDesktop(String desktop) {
        this.desktop = desktop;
    }

    /**
     * Ubuntu distribution of the environment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ubuntuDistro")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Ubuntu distribution of the environment.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String ubuntuDistro;

    public String getUbuntuDistro() {
        return ubuntuDistro;
    }

    public void setUbuntuDistro(String ubuntuDistro) {
        this.ubuntuDistro = ubuntuDistro;
    }

    /**
     * DevSpace image version.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DevSpace image version.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}

