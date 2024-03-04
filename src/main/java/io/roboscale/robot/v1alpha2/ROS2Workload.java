package io.roboscale.robot.v1alpha2;

@io.fabric8.kubernetes.model.annotation.Version(value = "v1alpha2" , storage = true , served = true)
@io.fabric8.kubernetes.model.annotation.Group("robot.roboscale.io")
@io.fabric8.kubernetes.model.annotation.Singular("ros2workload")
@io.fabric8.kubernetes.model.annotation.Plural("ros2workloads")
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ROS2Workload extends io.fabric8.kubernetes.client.CustomResource<io.roboscale.robot.v1alpha2.ROS2WorkloadSpec, io.roboscale.robot.v1alpha2.ROS2WorkloadStatus> implements io.fabric8.kubernetes.api.model.Namespaced {
}

