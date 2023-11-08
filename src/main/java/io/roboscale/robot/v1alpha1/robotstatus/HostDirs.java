package io.roboscale.robot.v1alpha1.robotstatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"hostPath","internalPath","name"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class HostDirs implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("hostPath")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String hostPath;

    public String getHostPath() {
        return hostPath;
    }

    public void setHostPath(String hostPath) {
        this.hostPath = hostPath;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("internalPath")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String internalPath;

    public String getInternalPath() {
        return internalPath;
    }

    public void setInternalPath(String internalPath) {
        this.internalPath = internalPath;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

