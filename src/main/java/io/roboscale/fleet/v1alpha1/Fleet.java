package io.roboscale.fleet.v1alpha1;

@io.fabric8.kubernetes.model.annotation.Version(value = "v1alpha1" , storage = true , served = true)
@io.fabric8.kubernetes.model.annotation.Group("fleet.roboscale.io")
@io.fabric8.kubernetes.model.annotation.Singular("fleet")
@io.fabric8.kubernetes.model.annotation.Plural("fleets")
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Fleet extends io.fabric8.kubernetes.client.CustomResource<io.roboscale.fleet.v1alpha1.FleetSpec, io.roboscale.fleet.v1alpha1.FleetStatus> {
}

