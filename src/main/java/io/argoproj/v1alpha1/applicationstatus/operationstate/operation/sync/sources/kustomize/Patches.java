package io.argoproj.v1alpha1.applicationstatus.operationstate.operation.sync.sources.kustomize;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"options","patch","path","target"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Patches implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("options")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, Boolean> options;

    public java.util.Map<java.lang.String, Boolean> getOptions() {
        return options;
    }

    public void setOptions(java.util.Map<java.lang.String, Boolean> options) {
        this.options = options;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("patch")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String patch;

    public String getPatch() {
        return patch;
    }

    public void setPatch(String patch) {
        this.patch = patch;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("path")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("target")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.argoproj.v1alpha1.applicationstatus.operationstate.operation.sync.sources.kustomize.patches.Target target;

    public io.argoproj.v1alpha1.applicationstatus.operationstate.operation.sync.sources.kustomize.patches.Target getTarget() {
        return target;
    }

    public void setTarget(io.argoproj.v1alpha1.applicationstatus.operationstate.operation.sync.sources.kustomize.patches.Target target) {
        this.target = target;
    }
}

