package io.roboscale.robot.v1alpha2.ros2workloadspec.launchcontainers.container.lifecycle;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"exec","httpGet","tcpSocket"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class PreStop implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Exec specifies the action to take.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exec")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Exec specifies the action to take.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.ros2workloadspec.launchcontainers.container.lifecycle.prestop.Exec exec;

    public io.roboscale.robot.v1alpha2.ros2workloadspec.launchcontainers.container.lifecycle.prestop.Exec getExec() {
        return exec;
    }

    public void setExec(io.roboscale.robot.v1alpha2.ros2workloadspec.launchcontainers.container.lifecycle.prestop.Exec exec) {
        this.exec = exec;
    }

    /**
     * HTTPGet specifies the http request to perform.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("httpGet")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("HTTPGet specifies the http request to perform.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.ros2workloadspec.launchcontainers.container.lifecycle.prestop.HttpGet httpGet;

    public io.roboscale.robot.v1alpha2.ros2workloadspec.launchcontainers.container.lifecycle.prestop.HttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(io.roboscale.robot.v1alpha2.ros2workloadspec.launchcontainers.container.lifecycle.prestop.HttpGet httpGet) {
        this.httpGet = httpGet;
    }

    /**
     * Deprecated. TCPSocket is NOT supported as a LifecycleHandler and kept for the backward compatibility. There are no validation of this field and lifecycle hooks will fail in runtime when tcp handler is specified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tcpSocket")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Deprecated. TCPSocket is NOT supported as a LifecycleHandler and kept for the backward compatibility. There are no validation of this field and lifecycle hooks will fail in runtime when tcp handler is specified.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.ros2workloadspec.launchcontainers.container.lifecycle.prestop.TcpSocket tcpSocket;

    public io.roboscale.robot.v1alpha2.ros2workloadspec.launchcontainers.container.lifecycle.prestop.TcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(io.roboscale.robot.v1alpha2.ros2workloadspec.launchcontainers.container.lifecycle.prestop.TcpSocket tcpSocket) {
        this.tcpSocket = tcpSocket;
    }
}

