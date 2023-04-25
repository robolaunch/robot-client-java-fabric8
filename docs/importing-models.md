# Importing Client Library to A Maven Project

## Authentication

You should authenticate GitHub with your [personal access token](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/creating-a-personal-access-token). Update your Maven settings (`~/.m2/settings.xml`) or add the file with the configuration below if not existed. Remember updating the credentials under `/servers/server`.

```xml
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0
                      http://maven.apache.org/xsd/settings-1.0.0.xsd">

  <activeProfiles>
    <activeProfile>github</activeProfile>
  </activeProfiles>

  <profiles>
    <profile>
      <id>github</id>
      <repositories>
        <repository>
          <id>central</id>
          <url>https://repo1.maven.org/maven2</url>
        </repository>
        <repository>
          <id>github</id>
          <url>https://maven.pkg.github.com/robolaunch/robot-client-java-fabric8</url>
          <snapshots>
            <enabled>true</enabled>
          </snapshots>
        </repository>
      </repositories>
    </profile>
  </profiles>

  <servers>
    <server>
      <id>github</id>
      <username>GITHUB_USERNAME</username>
      <password>PERSONAL_ACCESS_TOKEN</password>
    </server>
  </servers>
</settings>
```



## Importing

First you should check the latest version of the [client package](https://github.com/robolaunch/robot-client-java/packages).

Add Maven package reference to the repository to your `pom.xml`.

```xml
<repositories>
    <repository>
        <id>github</id>
        <url>https://maven.pkg.github.com/robolaunch/robot-client-java-fabric8</url>
    </repository>
</repositories>
```

Add the dependency to your `pom.xml`. Remember updating version.

```xml
<dependency>
    <groupId>io.roboscale.robot</groupId>
    <artifactId>robot-fabric8-client</artifactId>
    <version>0.2.5-0.1.6-alpha.6</version>
</dependency>
```

Then you can install client dependency.
```bash
mvn install
```