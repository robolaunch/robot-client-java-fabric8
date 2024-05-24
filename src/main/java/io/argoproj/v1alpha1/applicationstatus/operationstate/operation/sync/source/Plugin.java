package io.argoproj.v1alpha1.applicationstatus.operationstate.operation.sync.source;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"env","name","parameters"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Plugin implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Env is a list of environment variable entries
     */
    @com.fasterxml.jackson.annotation.JsonProperty("env")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Env is a list of environment variable entries")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.argoproj.v1alpha1.applicationstatus.operationstate.operation.sync.source.plugin.Env> env;

    public java.util.List<io.argoproj.v1alpha1.applicationstatus.operationstate.operation.sync.source.plugin.Env> getEnv() {
        return env;
    }

    public void setEnv(java.util.List<io.argoproj.v1alpha1.applicationstatus.operationstate.operation.sync.source.plugin.Env> env) {
        this.env = env;
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

    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.argoproj.v1alpha1.applicationstatus.operationstate.operation.sync.source.plugin.Parameters> parameters;

    public java.util.List<io.argoproj.v1alpha1.applicationstatus.operationstate.operation.sync.source.plugin.Parameters> getParameters() {
        return parameters;
    }

    public void setParameters(java.util.List<io.argoproj.v1alpha1.applicationstatus.operationstate.operation.sync.source.plugin.Parameters> parameters) {
        this.parameters = parameters;
    }
}

