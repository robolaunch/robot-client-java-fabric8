package io.roboscale.robot.v1alpha1.launchmanagerstatus.launchpodstatus.launchstatus.containerstatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"running","terminated","waiting"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class State implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Details about a running container
     */
    @com.fasterxml.jackson.annotation.JsonProperty("running")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Details about a running container")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.launchmanagerstatus.launchpodstatus.launchstatus.containerstatus.state.Running running;

    public io.roboscale.robot.v1alpha1.launchmanagerstatus.launchpodstatus.launchstatus.containerstatus.state.Running getRunning() {
        return running;
    }

    public void setRunning(io.roboscale.robot.v1alpha1.launchmanagerstatus.launchpodstatus.launchstatus.containerstatus.state.Running running) {
        this.running = running;
    }

    /**
     * Details about a terminated container
     */
    @com.fasterxml.jackson.annotation.JsonProperty("terminated")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Details about a terminated container")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.launchmanagerstatus.launchpodstatus.launchstatus.containerstatus.state.Terminated terminated;

    public io.roboscale.robot.v1alpha1.launchmanagerstatus.launchpodstatus.launchstatus.containerstatus.state.Terminated getTerminated() {
        return terminated;
    }

    public void setTerminated(io.roboscale.robot.v1alpha1.launchmanagerstatus.launchpodstatus.launchstatus.containerstatus.state.Terminated terminated) {
        this.terminated = terminated;
    }

    /**
     * Details about a waiting container
     */
    @com.fasterxml.jackson.annotation.JsonProperty("waiting")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Details about a waiting container")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.launchmanagerstatus.launchpodstatus.launchstatus.containerstatus.state.Waiting waiting;

    public io.roboscale.robot.v1alpha1.launchmanagerstatus.launchpodstatus.launchstatus.containerstatus.state.Waiting getWaiting() {
        return waiting;
    }

    public void setWaiting(io.roboscale.robot.v1alpha1.launchmanagerstatus.launchpodstatus.launchstatus.containerstatus.state.Waiting waiting) {
        this.waiting = waiting;
    }
}

