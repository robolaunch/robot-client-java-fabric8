# <img src="https://raw.githubusercontent.com/robolaunch/trademark/main/logos/svg/rocket.svg" width="40" height="40" align="top"> Java Fabric8 Models for Fleet & Robot

<div align="center">
  <p align="center">
    <a href="https://github.com/robolaunch/robot-client-java-fabric8/releases">
      <img src="https://img.shields.io/badge/Java-11-blue" alt="release">
    </a>
    <a href="https://github.com/robolaunch/robot-client-java-fabric8/releases">
      <img src="https://img.shields.io/github/v/release/robolaunch/robot-client-java-fabric8" alt="release">
    </a>
    <a href="https://github.com/robolaunch/robot-client-java-fabric8/blob/main/LICENSE">
      <img src="https://img.shields.io/github/license/robolaunch/robot-client-java-fabric8" alt="license">
    </a>
    <a href="https://github.com/robolaunch/robot-client-java-fabric8/issues">
      <img src="https://img.shields.io/github/issues/robolaunch/robot-client-java-fabric8" alt="issues">
    </a>
    <!-- <a href="https://github.com/robolaunch/robot-client-java-fabric8/actions">
      <img src="https://github.com/robolaunch/robot-client-java-fabric8/actions/workflows/generate-client.yaml/badge.svg" alt="build">
    </a> -->
  </p>
</div>

Java Fabric8 models for custom resources
- Fleets (`fleets.fleet.roboscale.io`)
- Robots (`robots.robot.roboscale.io`)
- WorkspaceManagers (`workspacemanagers.robot.roboscale.io`)
- BuildManagers (`buildmanagers.robot.roboscale.io`)
- LaunchManagers (`launchmanagers.robot.roboscale.io`)
- ConnectionHubs (`connectionhubs.connection-hub.roboscale.io`)
- CloudInstances (`cloudinstances.connection-hub.roboscale.io`)
- PhysicalInstances (`physicalinstances.connection-hub.roboscale.io`)
- and **federated versions** of most of these resources.

Check out the [robolaunch Robot Operator](https://github.com/robolaunch/robot-operator) and [robolaunch Fleet Operator](https://github.com/robolaunch/fleet-operator) for more information about custom resources.

## Table of Contents

- [Quick Start](#quick-start)
  - [Importing](#importing)
  - [Usage](#usage)
- [Contributing](#contributing)

## Quick Start

### Importing

You can import Kubernetes Java client for Robot following [these instructions](./docs/importing-models.md).

### Usage

See [Java Quarkus examples](https://github.com/robolaunch/robot-fabric8-quarkus-examples).

## Contributing

Please see [this guide](./CONTRIBUTING.md) if you want to contribute.
