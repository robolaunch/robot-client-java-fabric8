package io.roboscale.robot.v1alpha1.robotspec.launchmanagertemplates.launch;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"cpu","gpuCore","memory"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Resources implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("cpu")
    @io.fabric8.generator.annotation.Pattern("^([0-9])+(m)$")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String cpu;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("gpuCore")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long gpuCore;

    public Long getGpuCore() {
        return gpuCore;
    }

    public void setGpuCore(Long gpuCore) {
        this.gpuCore = gpuCore;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("memory")
    @io.fabric8.generator.annotation.Pattern("^([0-9])+(Mi|Gi)$")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String memory;

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }
}

