package io.roboscale.robot.v1alpha2.ros2workloadspec.containers.container.lifecycle;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"exec","httpGet","tcpSocket"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class PostStart implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Exec specifies the action to take.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exec")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Exec specifies the action to take.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.ros2workloadspec.containers.container.lifecycle.poststart.Exec exec;

    public io.roboscale.robot.v1alpha2.ros2workloadspec.containers.container.lifecycle.poststart.Exec getExec() {
        return exec;
    }

    public void setExec(io.roboscale.robot.v1alpha2.ros2workloadspec.containers.container.lifecycle.poststart.Exec exec) {
        this.exec = exec;
    }

    /**
     * HTTPGet specifies the http request to perform.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("httpGet")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("HTTPGet specifies the http request to perform.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.ros2workloadspec.containers.container.lifecycle.poststart.HttpGet httpGet;

    public io.roboscale.robot.v1alpha2.ros2workloadspec.containers.container.lifecycle.poststart.HttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(io.roboscale.robot.v1alpha2.ros2workloadspec.containers.container.lifecycle.poststart.HttpGet httpGet) {
        this.httpGet = httpGet;
    }

    /**
     * Deprecated. TCPSocket is NOT supported as a LifecycleHandler and kept for the backward compatibility. There are no validation of this field and lifecycle hooks will fail in runtime when tcp handler is specified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tcpSocket")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Deprecated. TCPSocket is NOT supported as a LifecycleHandler and kept for the backward compatibility. There are no validation of this field and lifecycle hooks will fail in runtime when tcp handler is specified.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.ros2workloadspec.containers.container.lifecycle.poststart.TcpSocket tcpSocket;

    public io.roboscale.robot.v1alpha2.ros2workloadspec.containers.container.lifecycle.poststart.TcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(io.roboscale.robot.v1alpha2.ros2workloadspec.containers.container.lifecycle.poststart.TcpSocket tcpSocket) {
        this.tcpSocket = tcpSocket;
    }
}

