package io.roboscale.robot.v1alpha1;

@io.fabric8.kubernetes.model.annotation.Version(value = "v1alpha1" , storage = true , served = true)
@io.fabric8.kubernetes.model.annotation.Group("robot.roboscale.io")
@io.fabric8.kubernetes.model.annotation.Singular("robot")
@io.fabric8.kubernetes.model.annotation.Plural("robots")
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Robot extends io.fabric8.kubernetes.client.CustomResource<io.roboscale.robot.v1alpha1.RobotSpec, io.roboscale.robot.v1alpha1.RobotStatus> implements io.fabric8.kubernetes.api.model.Namespaced {
}

