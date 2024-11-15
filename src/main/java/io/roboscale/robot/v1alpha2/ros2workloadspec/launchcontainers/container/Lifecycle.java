package io.roboscale.robot.v1alpha2.ros2workloadspec.launchcontainers.container;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"postStart","preStop"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Lifecycle implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * PostStart is called immediately after a container is created. If the handler fails,
     * the container is terminated and restarted according to its restart policy.
     * Other management of the container blocks until the hook completes.
     * More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
     */
    @com.fasterxml.jackson.annotation.JsonProperty("postStart")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PostStart is called immediately after a container is created. If the handler fails,\nthe container is terminated and restarted according to its restart policy.\nOther management of the container blocks until the hook completes.\nMore info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.ros2workloadspec.launchcontainers.container.lifecycle.PostStart postStart;

    public io.roboscale.robot.v1alpha2.ros2workloadspec.launchcontainers.container.lifecycle.PostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(io.roboscale.robot.v1alpha2.ros2workloadspec.launchcontainers.container.lifecycle.PostStart postStart) {
        this.postStart = postStart;
    }

    /**
     * PreStop is called immediately before a container is terminated due to an
     * API request or management event such as liveness/startup probe failure,
     * preemption, resource contention, etc. The handler is not called if the
     * container crashes or exits. The Pod's termination grace period countdown begins before the
     * PreStop hook is executed. Regardless of the outcome of the handler, the
     * container will eventually terminate within the Pod's termination grace
     * period (unless delayed by finalizers). Other management of the container blocks until the hook completes
     * or until the termination grace period is reached.
     * More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preStop")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PreStop is called immediately before a container is terminated due to an\nAPI request or management event such as liveness/startup probe failure,\npreemption, resource contention, etc. The handler is not called if the\ncontainer crashes or exits. The Pod's termination grace period countdown begins before the\nPreStop hook is executed. Regardless of the outcome of the handler, the\ncontainer will eventually terminate within the Pod's termination grace\nperiod (unless delayed by finalizers). Other management of the container blocks until the hook completes\nor until the termination grace period is reached.\nMore info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.ros2workloadspec.launchcontainers.container.lifecycle.PreStop preStop;

    public io.roboscale.robot.v1alpha2.ros2workloadspec.launchcontainers.container.lifecycle.PreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(io.roboscale.robot.v1alpha2.ros2workloadspec.launchcontainers.container.lifecycle.PreStop preStop) {
        this.preStop = preStop;
    }
}

