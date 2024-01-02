package io.roboscale.robot.v1alpha1.robotspec.robotdevsuitetemplate.notebooktemplate;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"cpu","gpuCore","gpuInstance","memory"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Resources implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * CPU resource limit.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cpu")
    @io.fabric8.generator.annotation.Pattern("^([0-9])+(m)$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CPU resource limit.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String cpu;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    /**
     * GPU core number that will be allocated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gpuCore")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("GPU core number that will be allocated.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long gpuCore;

    public Long getGpuCore() {
        return gpuCore;
    }

    public void setGpuCore(Long gpuCore) {
        this.gpuCore = gpuCore;
    }

    /**
     * GPU instance that will be allocated. eg. nvidia.com/mig-1g.5gb. Defaults to "nvidia.com/gpu".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gpuInstance")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("GPU instance that will be allocated. eg. nvidia.com/mig-1g.5gb. Defaults to \"nvidia.com/gpu\".")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String gpuInstance = "nvidia.com/gpu";

    public String getGpuInstance() {
        return gpuInstance;
    }

    public void setGpuInstance(String gpuInstance) {
        this.gpuInstance = gpuInstance;
    }

    /**
     * Memory resource limit.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("memory")
    @io.fabric8.generator.annotation.Pattern("^([0-9])+(Mi|Gi)$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Memory resource limit.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String memory;

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }
}

