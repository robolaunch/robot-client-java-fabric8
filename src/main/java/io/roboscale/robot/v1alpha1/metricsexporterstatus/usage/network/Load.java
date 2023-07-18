package io.roboscale.robot.v1alpha1.metricsexporterstatus.usage.network;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"in","out"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Load implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Average load of incoming packets.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("in")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Average load of incoming packets.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String in;

    public String getIn() {
        return in;
    }

    public void setIn(String in) {
        this.in = in;
    }

    /**
     * Average load of outgoing packets.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("out")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Average load of outgoing packets.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String out;

    public String getOut() {
        return out;
    }

    public void setOut(String out) {
        this.out = out;
    }
}

