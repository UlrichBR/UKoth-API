# UClans-API

The official integration API for the UltimateKoth ecosystem. Built to provide content creators and developers with complete control over clan management, internal hooks, and custom events.

[![Maven Central](https://img.shields.io/maven-central/v/io.github.ulrichbr/UltimateKoth?color=blue&label=Maven%20Central)](https://central.sonatype.com/artifact/io.github.ulrichbr/UltimateClans)
[![](https://jitpack.io/v/UlrichBR/UClans-API.svg)](https://jitpack.io/#UlrichBR/UKoth-API)
[![Java Version](https://img.shields.io/badge/Java-17%20%2F%2021-orange?logo=openjdk)](https://pom.xml)

---

## 🚀 How to Integrate into Your Project

Choose one of the repositories below to add the UltimateKoth API as a dependency in your build manager (Maven).

### Option 1: Maven Central (Recommended)
The official, fastest, and most stable method. It does not require adding any extra repository to your `pom.xml`, as the Maven ecosystem fetches the artifacts natively.

```xml
<dependencies>
    <dependency>
        <groupId>io.github.ulrichbr</groupId>
        <artifactId>UltimateKoth</artifactId>
        <version>VERSION</version> 
        <scope>provided</scope>
    </dependency>
</dependencies>
```

### Option 2: JitPack (Alternative)
Use this option if you need to compile specific commits from branches or legacy versions hosted directly on the GitHub repository.

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>[https://jitpack.io](https://jitpack.io)</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.github.UlrichBR</groupId>
        <artifactId>UKoth-API</artifactId>
        <version>VERSION</version> 
        <scope>provided</scope>
    </dependency>
</dependencies>
```


### 📄 License
This project is licensed under the MIT License. See the LICENSE file for more details.